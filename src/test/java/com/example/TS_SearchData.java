package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_SearchData {

    private WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");
        return new ChromeDriver(options);
    }

    @Test
    void tc_101_search_by_keyword() {
        WebDriver driver = getDriver();
        driver.get("https://www.google.com");

        WebElement search_box = driver.findElement(By.id("APjFqb"));
        search_box.sendKeys("NPRU");  
        search_box.sendKeys(Keys.ENTER);

        driver.close();
    }

    @Disabled
    @Test
    void tc_102_search_by_keyword() {
        WebDriver driver = getDriver();
        driver.get("https://www.google.com");

        WebElement search_box = driver.findElement(By.id("APjFqb"));
        search_box.sendKeys("Software");  
        search_box.sendKeys(Keys.ENTER);

        driver.close();
    }
}
