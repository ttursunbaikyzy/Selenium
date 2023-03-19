package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        // got to website
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        // get the element which you want to drag
        WebElement dragable=driver.findElement(By.id("draggable"));
        // get the droppable
        WebElement droppable=driver.findElement(By.id("droppable"));

        // action class
        Actions action=new Actions(driver);
        action.dragAndDrop(dragable,droppable).perform();

    }
}
