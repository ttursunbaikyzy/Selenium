package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        // open the Website
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        // locate the WebElement
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));

        // use select class because this drop down has a select tag
        Select sel=new Select(dropDown);

        // using select class we have different methods to select the desired option
        // Select by index
        sel.selectByIndex(2);
        Thread.sleep(2000);

        // select by value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);

        // select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);


    }
}
