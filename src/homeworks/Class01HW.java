package homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01HW {
    public static void main(String[] args) throws InterruptedException {
     /*
     1. launch the browser
     2. navigate to amazon web site
     3. print out the title and the url in the console
     4. close the browser
     */
        // connect to WebDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        String title=driver.getTitle();
        System.out.println(title);

        String URL= driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();
    }
}
