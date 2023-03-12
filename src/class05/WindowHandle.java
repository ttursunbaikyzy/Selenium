package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        // open the Website
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-385171774%3A1678243164713847&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AWnogHc_STnSg3MEKNs3i5tq6T0ngEaHkrR5JcsJIVA2d5u-kzVA7qPhktCvFrQMt0YigZsBqRRrVg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        // click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        // click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        // get the window handle of the parent class
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        // get window handles of all the windows that have been opened up
        Set<String> windowHandles=driver.getWindowHandles();

        // print all the window handles
        for(String wh:windowHandles){
            // switch the focus of the driver to help window
            driver.switchTo().window(wh);
            // check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }

        // to verify we switch to the right window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);

    }
}
