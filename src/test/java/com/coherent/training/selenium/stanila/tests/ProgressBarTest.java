package com.coherent.training.selenium.stanila.tests;
import com.coherent.training.selenium.stanila.pages.ProgressBarPOM;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProgressBarTest extends BaseTest {
   ProgressBarPOM progressBarPOM;
    @SneakyThrows
    @Test
    public void progressBarTest(){
        driver.get("https://demo.seleniumeasy.com/bootstrap-download-progress-demo.html");
        progressBarPOM = new ProgressBarPOM(driver);
        SoftAssert softAssert = new SoftAssert();
        progressBarPOM.clickButtonProgressBar();

        softAssert.assertEquals(progressBarPOM.refreshAtCondition(driver),"0%");
        softAssert.assertAll();
    }
}
