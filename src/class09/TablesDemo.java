package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDemo {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        // got to syntax HRMS application and login and go to the pim option
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewEmployeeList/reset/1");
        // enter username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        // enter password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //click on login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        // find the PIM button
        WebElement pimBtn=driver.findElement(By.xpath("//b[text()='PIM']"));
        // click on it
        pimBtn.click();
        // find the Employee List
        WebElement employeeListBtn=driver.findElement(By.xpath("//a[text()='Employee List']"));
        // click on it
        employeeListBtn.click();


        //in order to find the desired id
        boolean idFound = false;
        while(!idFound) {
            // get the employee id 52097A and click on the checkbox associated with it
            // as DOM is refreshed after the click on next page so we find elements in the loop
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < ids.size(); i++) {
                String id = ids.get(i).getText();

                if (id.equalsIgnoreCase("52097A")) {
                    System.out.println(id);
                    System.out.println("id is on the row " + i);
                    System.out.println("check the box");
                    // click on the particular checkbox
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkbox.click();
                    idFound=true;
                    break;
                }
            }
            // click on the next page
            if(!idFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }


    }
}
