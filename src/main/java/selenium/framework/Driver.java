package selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {


    private WebDriver driver;


    public WebDriver createDriver(String browserName) {

        switch (browserName.toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }

        return driver;
    }


    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
