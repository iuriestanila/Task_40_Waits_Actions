package com.coherent.training.selenium.stanila.tests;
import com.coherent.training.selenium.stanila.base.BaseClass;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class WebTableTest extends BaseClass {
    public static final int NUMBER_OF_EMPLOYEES = 3;

    @SneakyThrows
    @Test
    public void webTableTest(){
        driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
        webTablePOM.chooseValue();
        softAssert.assertEquals(webTablePOM.getEmployee().size(), NUMBER_OF_EMPLOYEES);
        softAssert.assertAll();
    }
}
