package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class07HW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        WebDriverWait wait2=new WebDriverWait(driver,15);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        WebElement text=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        String displayedText=text.getText();
        System.out.println(displayedText);

        driver.findElement(By.xpath("//button[contains(@id,'display')]")).click();
        WebDriverWait wait3=new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
        WebElement btn=driver.findElement(By.xpath("//button[text()='Enabled']"));
        String displayBtn=btn.getText();
        System.out.println(displayBtn);

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        WebDriverWait wait4=new WebDriverWait(driver,15);
        wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
        WebElement enabledBtn=driver.findElement(By.xpath("//button[@id='disable']"));
        System.out.println("The button is enabled "+enabledBtn.isEnabled());

        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        WebDriverWait wait5=new WebDriverWait(driver,15);
        wait5.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='ch']"));
        System.out.println("The checkbox is selected "+checkBox.isSelected());

    }
}
