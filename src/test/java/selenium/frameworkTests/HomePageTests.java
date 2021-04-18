package selenium.frameworkTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.HomePage;

public class HomePageTests extends  BaseTest {

    @Test
    public void verifyHomePageLogo() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isLogoPresent(), "HomePage Logo is not Present");
    }

}

