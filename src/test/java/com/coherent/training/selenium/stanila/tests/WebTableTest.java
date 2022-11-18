package com.coherent.training.selenium.stanila.tests;

import com.coherent.training.selenium.stanila.pages.WebTablePOM;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTableTest extends BaseTest {
    public static final int NUMBER_OF_EMPLOYEES = 3;
    WebTablePOM webTablePOM;

    @SneakyThrows
    @Test
    public void webTableTest(){
        driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
        webTablePOM = new WebTablePOM(driver);
        SoftAssert softAssert = new SoftAssert();
        webTablePOM.chooseValue();
        softAssert.assertEquals(webTablePOM.getEmployee().size(), NUMBER_OF_EMPLOYEES);
        softAssert.assertAll();
    }
}
