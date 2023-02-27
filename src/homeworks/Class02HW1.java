package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Tami");
        driver.findElement(By.id("customer.lastName")).sendKeys("E");
        driver.findElement(By.name("customer.address.street")).sendKeys("123 Street");
        driver.findElement(By.name("customer.address.city")).sendKeys("H Town");
        driver.findElement(By.name("customer.address.state")).sendKeys("TX");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("1234567890");
        driver.findElement(By.name("customer.ssn")).sendKeys("000000000");
        driver.findElement(By.id("customer.username")).sendKeys("tamie123");
        driver.findElement(By.id("customer.password")).sendKeys("123454321");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123454321");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
