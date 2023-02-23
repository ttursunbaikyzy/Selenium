import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); // launch the browser
        driver.get("https://www.google.com/"); // navigate to the specified url

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        String path="https://www.google.com/";
        driver.get(path);

        String URL= driver.getCurrentUrl();
        System.out.println(path);
        System.out.println(URL);
        String title=driver.getTitle();

        if(path.equalsIgnoreCase(URL)){
            System.out.println("Match");
        }else {
            System.out.println("No Match");
        }

        if(title.equalsIgnoreCase("Google")){
            System.out.println("Match");
        }else {
            System.out.println("No Match");
        }

        driver.quit();

    }
}