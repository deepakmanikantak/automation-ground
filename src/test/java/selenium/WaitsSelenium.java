package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitsSelenium {

    /**
     * Sign In Test Case
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        // implicit wait -> Explicit wait -> Fluent wait

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");

        driver.findElement(By.xpath("////Signin")); //NoSuchElement Exception

        // Once filter -> Loader Appearead (60 seconds to disappear) -> After 60 secondds products display

        WebDriverWait wait = new WebDriverWait(driver, 120);
        // Identify element for spinner
        WebElement loader = driver.findElement(By.xpath("////spinner"));
        wait.until(ExpectedConditions.invisibilityOf(loader));

        // Page > We are uploading excel  > Success message

        WebDriverWait wait2 = new WebDriverWait(driver, 600);
        WebElement success = driver.findElement(By.xpath("////success"));
        wait.until(ExpectedConditions.visibilityOf(success));


        // Fluent wait
        // We can define our own polling time
        // We can ignore Exceptions

        FluentWait wait3 = new FluentWait(driver).withTimeout(Duration.ofSeconds(300)).pollingEvery(Duration.ofSeconds(10))
                .ignoring(Exception.class);


        // There is a web page , and there is a table , upload

     /*
     This table accept 20 rows - > Uploaded a excel which has the data of 30 rows ->
     Sceanrio is to check table in the web page is displayed with 20 rows after the upload is being processes
     Verify number of rows in a table are 20
      */

        wait3.until(new Function() {
            @Override
            public Object apply(Object o) {

             List<WebElement> rows  =  driver.findElements(By.xpath("//table[@id='userdata']//tr"));
             return  rows.size()==20;

                /*

                table
                  thead - > Coloums title
                    tr
                      td
                      td
                      td
                      td
                    tr
                      td
                      td
                      td
                      td

               //table[@id='userdata']//tr
                 */
            }
        });
    }
}
