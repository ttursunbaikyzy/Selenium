package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02HW2 {
    public static void main(String[] args) throws InterruptedException {

        /*
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser

        TIP for HW2: just fill in text boxes or button, no need to deal with other webElements
        also u will need a Thread.sleep after clicking on create new account 🙂 (we will discuss "WHY" in future)
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Basbou");
        driver.findElement(By.name("lastname")).sendKeys("Sah");
        driver.findElement(By.name("reg_email__")).sendKeys("6183035193");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123454321");
        driver.findElement(By.id("month")).sendKeys("Mar");
        driver.findElement(By.id("day")).sendKeys("22");
        driver.findElement(By.id("year")).sendKeys("1965");
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.id("u_q_9_9L")).click();
        Thread.sleep(2000);
        driver.quit();



    }
}
