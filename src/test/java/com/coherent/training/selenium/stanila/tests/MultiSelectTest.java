package com.coherent.training.selenium.stanila.tests;

import com.coherent.training.selenium.stanila.pages.MultiSelectPOM;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import java.util.Random;

public class MultiSelectTest extends BaseTest {
    MultiSelectPOM multiSelectPOM;
    Random random;

    @SneakyThrows
    @Test
    public void multiSelectTest(){
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        multiSelectPOM = new MultiSelectPOM(driver);
        Random random = new Random();

        int randomNumber1 = random.nextInt(7);
        int randomNumber2 = random.nextInt(7);
        int randomNumber3 = random.nextInt(7);

        softAssert.assertTrue(multiSelectPOM.multiSelect(randomNumber1,randomNumber2,randomNumber3));
        softAssert.assertAll();
    }
}
