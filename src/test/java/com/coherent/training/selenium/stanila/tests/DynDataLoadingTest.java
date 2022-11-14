package com.coherent.training.selenium.stanila.tests;
import com.coherent.training.selenium.stanila.pages.DynDataLoadingPOM;
import org.testng.annotations.Test;

public class DynDataLoadingTest extends BaseTest {
    DynDataLoadingPOM dynDataLoadingPOM;
    @Test
    public void dynDataLoadingTest() {
        driver.get("https://demo.seleniumeasy.com/dynamic-data-loading-demo.html");
        dynDataLoadingPOM = new DynDataLoadingPOM(driver);

        dynDataLoadingPOM.clickOnNewUser();
        boolean displayed  = dynDataLoadingPOM.getResponse().isDisplayed();

        softAssert.assertTrue(displayed);
        softAssert.assertAll();
    }
}

