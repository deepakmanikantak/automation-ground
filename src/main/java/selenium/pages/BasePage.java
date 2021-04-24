package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    @FindBy(id = "header_logo")
    public WebElement homePageLogo;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoPresent() {
        return homePageLogo.isDisplayed();
    }

}
