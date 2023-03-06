package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        // open the Website
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        // click on the radio button Male
        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));

        // check if the radio button is enabled
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("The radio button male is enabled "+isEnabledMale);

        // check if the radio button is displayed
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("The radio button male is displayed "+isDisplayedMale);

        // check if the radio button is selected
        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("The radio button male is selected "+isSelectedMale);

        // if the radio button is not selected click on it
        if(!isSelectedMale){
            maleBtn.click();
        }

        // check if the radio button is selected after the click
        isSelectedMale=maleBtn.isSelected();
        System.out.println("The status of selection is "+isSelectedMale);



    }
    }
