package org.prog.session14.web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.List;

public class AlloUaTest {

    private WebDriver driver;

    @BeforeSuite
        public void BeforeSuite() {driver = new ChromeDriver();
    }

    @AfterSuite
    public void AfterSuite() {driver.quit();}

    @Test
    public void AllouaTest1(){
        driver.manage().window().fullscreen();
        driver.get("http://www.allo.ua");
        List<WebElement> cookies = driver.findElements(By.id("W0wltc"));
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys("Iphone");
        search.sendKeys(Keys.ENTER);
        Assert.assertTrue(search.getAttribute("value").equals("Iphone"));
    }

}
