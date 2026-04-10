package com.demoqa.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

 
    public void setUp() {

        WebDriverManager.chromedriver().clearDriverCache().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu");
    }
    

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}