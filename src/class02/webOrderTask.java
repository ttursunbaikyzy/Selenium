package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
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

    }
}
