package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;


    String yourLogoId = "header_logo";


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoPresent() {
       return driver.findElement(By.id(yourLogoId)).isDisplayed();
    }
}
