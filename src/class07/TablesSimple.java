package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesSimple {
    public static void main(String[] args) {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        // got to syntaxprojects.com
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        // task 1: access level 1 -- table based access
        // get the whole table accessed and print it on the console
        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String tableData=table.getText();
        // System.out.println(tableData);

        // task 2: access level 2 -- row based access
        // get the rows of the table and print them
        // modification: print the row that contains Company google
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        // print the rows
        for(WebElement row:rows){
            // extract text from each row
            String rowText=row.getText();
            //System.out.println(rowText);
            if(row.getText().contains("Google")){
                // System.out.println(rowText);
            }
        }

        // task 3: access level 3 -- column based access
        // get the columns of the table and print them
        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            // System.out.println(column.getText());
        }

        // task 4: just print the first column of every row
        List<WebElement> firstColumns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for(WebElement firstCol:firstColumns){
            System.out.println(firstCol.getText());
        }


    }
}
