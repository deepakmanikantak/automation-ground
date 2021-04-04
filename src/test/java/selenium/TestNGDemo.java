package selenium;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class TestNGDemo {

    WebDriver driver;

//    @BeforeMethod
//    public void beforeMethod() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    }



    @Test(groups = "smoke")
    public void verifyCartButton() {
        System.out.println("Verifying Cart Button");
        Assert.fail();
    }

    @Test(groups = {"smoke","unstable"})
    public void verifyCartButtonB() {
        System.out.println("Verifying Cart Button");
        Assert.fail();
    }

    @Test(dataProvider = "loginData")
    public void loginWithDifferentUsernames(String username, String password) throws Exception{
        System.out.println("Username is: "+username +". Password is :"+password);
        Thread.sleep(2000);
    }


    @Test
    public void readExcel(){
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/Data.xlsx");

            // File Identify  > HSSF WORKBOKK (LOAD) > Sheet > ROw > Coloumn
            XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);

            XSSFRow hssfRow = hssfSheet.getRow(0);
            XSSFCell hssfCell = hssfRow.getCell(1);
            System.out.println(hssfCell.getStringCellValue());
            System.out.println(hssfRow.getCell(0));



        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @DataProvider(name = "loginData", parallel = false)
    public Object[][] supplyUsernames() {



        String [][]data = new String[2][2];

        data[0][0] = "deepak";
        data[0][1] = "password";
        data[1][0] = "krishna";
        data[1][1] = "password";

        return data;


//        return new Object[][] {
//                {"deepak","password"},
//                {"krishna","password"}
//        };
    }

    @Test(groups = "regression")
    public void verifyPageTitle() {
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        System.out.println(expectedTitle);
        String actualTile = driver.getTitle();
        System.out.println(actualTile);
        Assert.assertEquals(actualTile, expectedTitle, "Page Title Verification Failed");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
