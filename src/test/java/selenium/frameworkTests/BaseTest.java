package selenium.frameworkTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import selenium.framework.Driver;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    protected  WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        Driver driverFramework = new Driver();
        driver =  driverFramework.createDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.automationpractice.com");
    }
}
