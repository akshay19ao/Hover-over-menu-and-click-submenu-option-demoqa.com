package com.demoqa.automation.tests;

import com.demoqa.automation.base.BaseTest;
import com.demoqa.automation.pages.MenuPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

    MenuPage menuPage;

    @BeforeMethod
    public void setupTest() {
        setUp();
        menuPage = new MenuPage(driver);
    }

    @Test
    public void verifyHoverAndClickSubMenu() {

        menuPage.hoverAndClickSubMenu();

        Assert.assertTrue(menuPage.isSubMenuVisible(),
                "Submenu is NOT visible!");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}