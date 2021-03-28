package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNGDemo {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void verifyPageTitle() {
        String expectedTitle = "Online Sh   opping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        System.out.println(expectedTitle);
        String actualTile = driver.getTitle();
        System.out.println(actualTile);
        Assert.assertEquals(actualTile, expectedTitle, "Page Title Verification Failed");
    }

    @Test
    public void verifyCartButton() {

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        driver.quit();
    }

}
