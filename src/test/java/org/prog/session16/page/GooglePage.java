package org.prog.session16.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GooglePage {

    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get("http://www.google.com");
    }

    public void acceptCookies() {
        List<WebElement> cookiesLink = driver.findElements(
                By.xpath("//a[contains(@href, 'technologies')]"));
        if (!cookiesLink.isEmpty()) {
            List<WebElement> cookieFormButtons = driver.findElements(
                    By.xpath("//a[contains(@href, 'technologies')]/../../../..//button"));
            cookieFormButtons.get(3).click();
        }
    }

    public void declineCookies() {
    }

    public void setSearchFieldValue(String value) {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(value);
    }

    public String getSearchFieldValue() {
        WebElement search = driver.findElement(By.name("q"));
        return search.getAttribute("value");
    }
}
