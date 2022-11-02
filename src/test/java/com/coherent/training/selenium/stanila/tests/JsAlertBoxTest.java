package com.coherent.training.selenium.stanila.tests;

import com.coherent.training.selenium.stanila.base.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JsAlertBoxTest extends BaseClass {

    @BeforeMethod
    public void initializeAlerts(){
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    @Test
    public void alertConfirmBoxOKTest(){
        jsAlertBoxPOM.alertConfirmBoxOKMeth();
        softAssert.assertEquals("You pressed OK!",jsAlertBoxPOM.getPressedTextConfirmBox());
        softAssert.assertAll();
    }

    @Test
    public void alertConfirmBoxCancelTest(){
        jsAlertBoxPOM.alertConfirmBoxCancelMeth();
        softAssert.assertEquals("You pressed OK!",jsAlertBoxPOM.getPressedTextConfirmBox());
        softAssert.assertAll();
    }

    @Test
    public void alertBoxTest(){
        jsAlertBoxPOM.alertBoxMeth();
        softAssert.assertEquals("I am an alert box!",jsAlertBoxPOM.getAlertText());
        softAssert.assertAll();
    }
}
