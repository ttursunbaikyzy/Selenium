package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class03HW {
    public static void main(String[] args) {
        /* use xpath to complete this
        enter the message in the text box
        click on show message
        Enter value of a
        Enter value of B
        click on the button get total
        also please print the value of the attribute type of the button GET TOTAL
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@placeholder, 'Please enter')]")).sendKeys("This is awesome!");
        driver.findElement(By.xpath("//button[contains(@onclick,'showInput')]")).click();

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        WebElement total=driver.findElement(By.xpath("//button[text()='Get Total']"));
        total.click();

        WebElement display=driver.findElement(By.xpath("//span[@id='displayvalue']"));
        String value= display.getText();
        System.out.println("Total a+b= "+value);

    }
}
