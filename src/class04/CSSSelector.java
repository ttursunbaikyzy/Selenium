package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        // open the Website facebook.com
        driver.get("https://www.facebook.com/");

        // click on the button create account using css selector
        WebElement createNewBtn=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        // click on the button
        createNewBtn.click();

        // put a sleep statement so that the browser can open up the window which contains the element
        Thread.sleep(2000);

        // fill in the first name
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("abracadabra");




    }
}
