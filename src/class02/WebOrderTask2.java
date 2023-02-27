package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {
        /*
        Task
        Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        Login
        Get title and verify it is correct
        logout
        close the browser
         */

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // open the Website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //maximize the screen
        driver.manage().window().maximize();

        // send username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        // send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        // click on the login button
        driver.findElement(By.className("button")).click();

        // Get title and verify it is correct "Web Orders"
        String title=driver.getTitle();

        if(title.equals("Web Orders")){
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect");
        }

        //logout
        driver.findElement(By.linkText("Logout")).click();

        // close the browser
        driver.quit();

    }
}
