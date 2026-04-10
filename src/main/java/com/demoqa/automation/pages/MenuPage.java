package com.demoqa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class MenuPage {

    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By mainItem2 = By.xpath("//a[text()='Main Item 2']");
    private By subSubList = By.xpath("//a[text()='SUB SUB LIST']");

    public void hoverAndClickSubMenu() {

        // Step 1: Hover on Main Item 2
        WebElement main = wait.until(
                ExpectedConditions.visibilityOfElementLocated(mainItem2));
        actions.moveToElement(main).perform();

        // Step 2: Wait for submenu to appear
        WebElement subMenu = wait.until(
                ExpectedConditions.visibilityOfElementLocated(subSubList));

        // Step 3: Click submenu
        actions.moveToElement(subMenu).click().perform();
    }

    public boolean isSubMenuVisible() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(subSubList))
                .isDisplayed();
    }
}