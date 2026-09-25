package org.prog.session15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

//TODO: load allo.ua print goods id and goods price

public class AlloUaTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void WebTest1() {
        driver.get("https://allo.ua/ua/catalogsearch/result/?q=iphone");
        WebElement GoodsId = driver.findElement(By.className("product-sku__value"));
        WebElement GoodsPrice = driver.findElement(By.className("sum"));
        System.out.println("Goods ID: " + GoodsId.getAttribute("textContent"));
        System.out.println("GoodsPrice: " + GoodsPrice.getAttribute("textContent"));
    }
}
