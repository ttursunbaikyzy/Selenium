package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        // open amazon
        driver.get("https://www.amazon.com/");

        // print all the links in the amazon.com
        // we know that all links are in tag <a> which is also called anchor tag
        // lets use the locator by tagName for this purpose
        List<WebElement> tags=driver.findElements(By.tagName("a"));

        // in order to print we need to iterator
        for(WebElement tag:tags){
            String link=tag.getAttribute("href");
            System.out.println(link);
        }




    }
}
