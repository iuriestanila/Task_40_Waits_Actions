package com.coherent.training.selenium.stanila.tests;
import com.coherent.training.selenium.stanila.pages.ProgressBarPOM;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {
   ProgressBarPOM progressBarPOM;
    @SneakyThrows
    @Test
    public void progressBarTest(){
        driver.get("https://demo.seleniumeasy.com/bootstrap-download-progress-demo.html");
        progressBarPOM = new ProgressBarPOM(driver);
        progressBarPOM.clickButtonProgressBar();

        while(Integer.parseInt(driver.findElement(ProgressBarPOM.PERCENT_TEXT)
                .getText().replace("%", "")) < 50){

        }

        driver.navigate().refresh();

        softAssert.assertEquals(driver.findElement(ProgressBarPOM.PERCENT_TEXT).getText(),"0%");
        softAssert.assertAll();
    }
}
