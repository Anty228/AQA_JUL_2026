package org.prog.session16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.session16.page.GooglePage;
import org.prog.session16.page.W3SchoolsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

//TODO: re-write your test with page object

public class WebTest {

    private WebDriver driver;
    private GooglePage googlePage;
    private W3SchoolsPage w3SchoolsPage;

    @BeforeSuite
    public void beforeSuite() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

        googlePage = new GooglePage(driver);
        w3SchoolsPage = new W3SchoolsPage(driver);
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
    public void webTest1() {
        googlePage.loadPage();
        googlePage.acceptCookies();
        googlePage.setSearchFieldValue("hello selenium!");
        String searchValue = googlePage.getSearchFieldValue();
        Assert.assertEquals(searchValue, "hello selenium!");
    }

    @Test
    public void webTest2() {
        driver.get("https://www.cloudflare.com/");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement cookiesButton = webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler")));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cookiesButton));
        cookiesButton.click();
    }

    @Test(enabled = false)
    public void webTest3() {
        driver.get("https://www.w3schools.com/TAGs/tryit.asp?filename=tryhtml_button_test");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement cookiesFrame = webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("fast-cmp-iframe")));

        driver.switchTo().frame(cookiesFrame);
        WebElement cookiesBtn = driver.findElement(By.className("fast-cmp-button-primary"));
        cookiesBtn.click();

        driver.switchTo().defaultContent();

        WebElement runBtn = driver.findElement(By.id("runbtn"));
        runBtn.click();
        System.out.println("done");
    }

    @Test
    public void webTest4() throws InterruptedException {
        w3SchoolsPage.loadPage();
        w3SchoolsPage.acceptCookies();
        w3SchoolsPage.hoverOverElement(By.id("navbtn_exercises"));
        Thread.sleep(5000);
    }
}
