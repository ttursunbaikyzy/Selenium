package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class04HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        1. u need to write down the code that can select  1 check box out of 4 mentioned,
        e.g option1 , option2 , option 3, option 4
        Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List<WebElement> checkboxes =driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for(WebElement checkbox:checkboxes){
            String option=checkbox.getAttribute("value");
            if(option.equalsIgnoreCase("Option-1")){
                checkbox.click();
            }
        }
        Thread.sleep(3000);
        driver.close();

    }
}
