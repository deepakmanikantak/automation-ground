package selenium.frameworkTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.DressesCategoryPage;
import selenium.pages.HomePage;

public class HomePageTests extends BaseTest {


    @Test(groups = {"smoke"})
    public void verifyHomePageLogo() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isLogoPresent(), "HomePage Logo is not Present");
    }
}
