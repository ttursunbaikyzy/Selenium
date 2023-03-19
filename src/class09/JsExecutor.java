package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        // got to website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        // find the WebElement username
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        // using js Executor
        // to highlight the username box
        // 1. declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        // 2. execute script
        // arguments[0].style.border='10px dotted pink'   draw a box
        // js.executeScript("arguments[0].style.border='10px dotted pink' ",username);
        //js.executeScript("arguments[0].style.border='3px solid blue' ",username);
        js.executeScript("arguments[0].style.border='5px dotted blue' ",username);

        // find the WebElement
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        // click on the login button
        js.executeScript("arguments[0].click();",loginBtn);



    }
}
