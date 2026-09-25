package org.prog.session16.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class W3SchoolsPage {

    private WebDriver driver;

    public W3SchoolsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        loadPage("");
    }

    public void loadPage(String path) {
        driver.get("https://www.w3schools.com/" + path);
    }

    public void acceptCookies() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement cookiesFrame = webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("fast-cmp-iframe")));

        driver.switchTo().frame(cookiesFrame);
        WebElement cookiesBtn = driver.findElement(By.className("fast-cmp-button-primary"));
        cookiesBtn.click();
        driver.switchTo().defaultContent();
    }

    public void hoverOverElement(By locator) {
        WebElement exercises = driver.findElement(locator);

        Actions actions = new Actions(driver);
        actions.moveToElement(exercises);
        actions.perform();
    }
}
