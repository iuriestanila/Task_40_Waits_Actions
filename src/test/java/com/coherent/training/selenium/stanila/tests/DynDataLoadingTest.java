package com.coherent.training.selenium.stanila.tests;

import com.coherent.training.selenium.stanila.base.BaseClass;
import com.coherent.training.selenium.stanila.pages.DynDataLoadingPOM;
import org.testng.annotations.Test;

public class DynDataLoadingTest extends BaseClass {

    @Test
    public void dynDataLoadingTest() {
        driver.get("https://demo.seleniumeasy.com/dynamic-data-loading-demo.html");
        dynamicDataLoadingPOM.getNewUserMeth();
        boolean displayed = dynamicDataLoadingPOM.getResponse().isDisplayed();

        softAssert.assertTrue(displayed);
        softAssert.assertAll();
    }
}

