package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        // got to website
        driver.get("https://the-internet.herokuapp.com/upload");

        // finding the choose file element
        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
        // uploading the desired file
        chooseFile.sendKeys("C:\\Users\\tamik\\OneDrive\\Desktop\\test.txt");


    }
}
