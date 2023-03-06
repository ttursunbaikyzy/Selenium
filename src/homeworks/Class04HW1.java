package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class04HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        checboxes and radio buttons are same to deal with
        the only difference is that u can check more options when it comes to check boxes
        so i encourage u all to do this homework and see for yourself , how much you are able to use the tool that u learned
        HW1:
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the check box    "click on this check box" is Selected
        if no  Select the check box
        check gain if the checkbox is Selected or not
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement checkbox =driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean checkboxSelected = checkbox.isSelected();
        System.out.println("The checkbox is selected: "+checkboxSelected);
        if(!checkboxSelected){
            checkbox.click();
            checkboxSelected = checkbox.isSelected();
            System.out.println("The checkbox is selected: "+checkboxSelected);
        }
        Thread.sleep(3000);
        driver.close();

    }
}
