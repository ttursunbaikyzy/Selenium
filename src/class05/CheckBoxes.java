package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        // open the Website
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        // get all the checkboxes
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        // iterate through the list
        /* for(WebElement checkbox:checkboxes){
            String value=checkbox.getAttribute("value");
            if(value.equalsIgnoreCase("Option-2")){
                checkbox.click();
            }
        } */

        for (int i = 0; i < checkboxes.size(); i++) {
            String value=checkboxes.get(i).getAttribute("value");
            // check if this is rhe desired one
            // if yes click it
            // if no continue to iterate
            if(value.equalsIgnoreCase("Option-2")){
                checkboxes.get(i).click();
            }
        }


    }
}
