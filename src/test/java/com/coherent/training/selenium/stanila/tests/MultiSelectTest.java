package com.coherent.training.selenium.stanila.tests;

import com.coherent.training.selenium.stanila.pages.MultiSelectPOM;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class MultiSelectTest extends BaseTest {
    MultiSelectPOM multiSelectPOM;

    @SneakyThrows
    @Test
    public void multiSelectTest(){
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        multiSelectPOM = new MultiSelectPOM(driver);
        Random random = new Random();
        SoftAssert softAssert = new SoftAssert();

        int cityIndex1 = random.nextInt(7);
        int cityIndex2 = random.nextInt(7);
        int cityIndex3 = random.nextInt(7);

        softAssert.assertTrue(multiSelectPOM.multiSelect(cityIndex1, cityIndex2, cityIndex3));
        softAssert.assertAll();
    }
}
