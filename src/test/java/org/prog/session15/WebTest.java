package org.prog.session15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

//TODO: load allo.ua print goods id and goods price

public class WebTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
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
        driver.get("http://www.google.com");

        List<WebElement> cookiesLink = driver.findElements(
                By.xpath("//a[contains(@href, 'technologies')]"));
        if (!cookiesLink.isEmpty()) {
            List<WebElement> cookieFormButtons = driver.findElements(
                    By.xpath("//a[contains(@href, 'technologies')]/../../../..//button"));
            cookieFormButtons.get(3).click();
        }

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("hello selenium!");
        Assert.assertTrue(search.getAttribute("value").equals("hello selenium!"));
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

    @Test
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
        driver.get("https://www.w3schools.com/");

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement cookiesFrame = webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("fast-cmp-iframe")));

        driver.switchTo().frame(cookiesFrame);
        WebElement cookiesBtn = driver.findElement(By.className("fast-cmp-button-primary"));
        cookiesBtn.click();
        driver.switchTo().defaultContent();

        WebElement exercises = driver.findElement(By.id("navbtn_exercises"));

        Actions actions = new Actions(driver);
        actions.moveToElement(exercises);
        actions.perform();

        Thread.sleep(5000);
    }
}
