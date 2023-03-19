package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        // go to the website
        driver.get("https://www.delta.com/");

        // click on the calendar
        WebElement calendar=driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();

        // get the month from the calendar
        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        // get the next button
        WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));

        // click on next button until you find the right month
        boolean isFound=false;

        while(!isFound){
            String monthName=month.getText();
            if(monthName.equalsIgnoreCase("August")){
                // select the day
                List<WebElement> days= driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for (WebElement day:days){
                    String dayText=day.getText();
                    if(dayText.equalsIgnoreCase("7")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }
            } else {
                next.click();
            }
        }

    }
}
