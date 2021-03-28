package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        // locators
        // 1. ID ->
        // 2. Classname
        // 3. Tag
        // 4. Xpath
        // 5. Css selector
        // Linktext

        String title = driver.getTitle();
        System.out.println(title);

        WebElement signin = driver.findElement(By.id("nav-link-accountList"));
        signin.click();

//        WebElement signina = driver.findElement(By.xpath("nav-link-accountList"));
//        WebElement signinb = driver.findElement(By.cssSelector("nav-link-accountList"));

        // xpath // css


        //Absolute xpath /
        // Relative xpath

        //











    }
}
