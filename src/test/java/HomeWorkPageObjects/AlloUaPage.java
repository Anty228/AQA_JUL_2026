package HomeWorkPageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloUaPage {

    private WebDriver driver;

    public AlloUaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get("https://allo.ua/ua/catalogsearch/result/?q=iphone");
    }

    public void declineCookies() {
    }

    public void setSearchFieldValue(String value) {
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys(value);
    }

    public String getSearchFieldValue() {
        WebElement search = driver.findElement(By.name("search"));
        return search.getAttribute("value");
    }

    public String getProductId() {
        WebElement goodsId = driver.findElement(By.className("product-sku__value"));
        return goodsId.getText();
    }

    public String getProductPrice() {
        WebElement goodsPrice = driver.findElement(By.className("sum"));
        return goodsPrice.getText();
    }
}

