package com.coherent.training.selenium.stanila.tests;

import com.coherent.training.selenium.stanila.pages.MultiSelectPOM;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class MultiSelectTest extends BaseTest {
    MultiSelectPOM multiSelectPOM;
    Random random;

    @SneakyThrows
    @Test
    public void multiSelectTest(){
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        multiSelectPOM = new MultiSelectPOM(driver);
        Select select = new Select(multiSelectPOM.getMultiSelectDropdown());
        random = new Random();

        if(select.isMultiple()){
            select.selectByIndex(random.nextInt(7));
            select.selectByIndex(random.nextInt(7));
            select.selectByIndex(random.nextInt(7));
            Thread.sleep(2000);
            multiSelectPOM.getMultiSelectButton().click();
            Thread.sleep(1000);

            List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
            for(WebElement selectedOption:allSelectedOptions){
                System.out.println(selectedOption.getText());
            }
        }
        else{
            System.out.println("It's not a multiselect dropdown.");
            softAssert.fail();
            softAssert.assertAll();
        }
    }
}
