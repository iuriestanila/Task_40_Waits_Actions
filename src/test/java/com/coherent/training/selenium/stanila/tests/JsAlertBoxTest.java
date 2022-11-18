package com.coherent.training.selenium.stanila.tests;
import com.coherent.training.selenium.stanila.pages.JsAlertBoxPOM;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class JsAlertBoxTest extends BaseTest {
    JsAlertBoxPOM jsAlertBoxPOM;
    @BeforeMethod
    public void initializeAlerts(){
        jsAlertBoxPOM = new JsAlertBoxPOM(driver);
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    @Test
    public void alertConfirmBoxOKTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("You pressed OK!",jsAlertBoxPOM.alertConfirmBoxOK());
        softAssert.assertAll();
    }

    @Test
    public void alertConfirmBoxCancelTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("You pressed OK!",jsAlertBoxPOM.alertConfirmBoxCancel());
        softAssert.assertAll();
    }

    @Test
    public void alertBoxTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("I am an alert box!",jsAlertBoxPOM.alertBox());
        softAssert.assertAll();
    }
}
