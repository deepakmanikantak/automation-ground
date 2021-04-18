package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentTest {

    static final String signInXpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";



    @Test
    public void addItemToCart() throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.automationpractice.com");
        WebDriverWait wait = new WebDriverWait(browser, 20);
        WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signInXpath)));
        signIn.click();
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("Saikrishnak@gmail.com");
        WebElement pswrd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
        pswrd.sendKeys("12345");
        WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin")));
        signInButton.click();
        WebElement clickOnDress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")));
        clickOnDress.click();

        Thread.sleep(5000);
        Actions actions = new Actions(browser);
        actions.moveToElement(browser.findElement(By.xpath("//a[@class='product_img_link']/img"))).
                build().perform();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[@title='Add to cart']")).click();


       /* WebElement cickOnItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")));
        cickOnItem.click();
        browser.switchTo().frame(browser.findElement(By.xpath("//iframe")));
        WebElement addCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add_to_cart")));
        addCart.click();
        browser.switchTo().defaultContent();
        String expectedmessage = "Product successfully added to your shopping cart";
        WebElement productAddedmessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='clearfix']//h2")));
        Assert.assertTrue(productAddedmessage.getText().contains(expectedmessage));*/

//        WebElement proceedToCheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/div[2]/div[4]/a")));
//        proceedToCheckout.click();

    }

    @Test
    public void singInandNAvigateToCheckout() throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.automationpractice.com");
        WebDriverWait wait = new WebDriverWait(browser, 20);
        WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
        signIn.click();
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("Saikrishnak@gmail.com");
        WebElement pswrd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
        pswrd.sendKeys("12345");
        WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin")));
        signInButton.click();
        WebElement clickOnDress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")));
        clickOnDress.click();

        Thread.sleep(5000);
        Actions actions = new Actions(browser);
        actions.moveToElement(browser.findElement(By.xpath("//a[@class='product_img_link']/img"))).
                build().perform();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[@title='Add to cart']")).click();


       /* WebElement cickOnItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")));
        cickOnItem.click();
        browser.switchTo().frame(browser.findElement(By.xpath("//iframe")));
        WebElement addCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add_to_cart")));
        addCart.click();
        browser.switchTo().defaultContent();
        String expectedmessage = "Product successfully added to your shopping cart";
        WebElement productAddedmessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='clearfix']//h2")));
        Assert.assertTrue(productAddedmessage.getText().contains(expectedmessage));*/

//        WebElement proceedToCheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/div[2]/div[4]/a")));
//        proceedToCheckout.click();

    }
}
