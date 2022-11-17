package com.coherent.training.selenium.stanila.tests;
import com.coherent.training.selenium.stanila.dataProvider.DataProviders;
import com.coherent.training.selenium.stanila.pages.LoginPOM;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
   LoginPOM loginPOM;

   @SneakyThrows
    @Test(dataProvider = "credentials",dataProviderClass = DataProviders.class)
    public void testLogInSuccessful(String username,String password) {
        loginPOM = new LoginPOM(driver);
        loginPOM.login(username,password);

        softAssert.assertTrue(loginPOM.composeIsDisplayed());
        softAssert.assertAll();
    }
}
