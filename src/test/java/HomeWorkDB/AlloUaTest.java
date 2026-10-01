package HomeWorkDB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlloUaTest {

    private WebDriver driver;
    private AlloUaPage alloUaPage;
    private DBTest dbTest;


    @BeforeSuite
    public void beforeSuite() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        alloUaPage = new AlloUaPage(driver);
        dbTest = new DBTest();
        dbTest.connectDB();


    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(1000);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }


    @Test
    public void AlloUaTest1() {
        alloUaPage.loadPage();
        alloUaPage.declineCookies();

        String goodsId = alloUaPage.getProductId();
        String goodsPrice = alloUaPage.getProductPrice();
        String goodsName = alloUaPage.getProductName();

        PhoneDto phone  = new PhoneDto();
        phone.setGoodsId(goodsId);
        phone.setGoodsPrice(goodsPrice);
        phone.setGoodsName(goodsName);

        dbTest.savePhone(phone);

    }
}
