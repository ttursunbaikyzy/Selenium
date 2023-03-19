package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //for selenium 4 only
        //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        //maximize the screen
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // open the Website
        driver.get("https://www.facebook.com");

        // click on the create new account
        driver.findElement(By.linkText("Create new account")).click();

        // send your first name
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");



    }
}
