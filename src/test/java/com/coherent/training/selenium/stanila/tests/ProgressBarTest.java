package com.coherent.training.selenium.stanila.tests;
import com.coherent.training.selenium.stanila.base.BaseClass;
import com.coherent.training.selenium.stanila.pages.ProgressBarPOM;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseClass {

    @SneakyThrows
    @Test
    public void progressBarTest(){
        driver.get("https://demo.seleniumeasy.com/bootstrap-download-progress-demo.html");
        progressBarPOM.clickButtonProgressBar();

        while(Integer.parseInt(driver.findElement(ProgressBarPOM.percentText)
                .getText().replace("%", "")) < 50){

        }

        driver.navigate().refresh();

        softAssert.assertEquals(driver.findElement(ProgressBarPOM.percentText).getText(),"0%");
        softAssert.assertAll();
    }
}
