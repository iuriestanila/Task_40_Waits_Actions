package com.coherent.training.selenium.stanila.tests;
import com.coherent.training.selenium.stanila.dataProvider.DataProviders;
import com.coherent.training.selenium.stanila.base.BaseClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test(dataProvider = "credentials",dataProviderClass = DataProviders.class)
    public void testLogInSuccessful(String username,String password) {
        loginPOM.login(username,password);

        softAssert.assertTrue(loginPOM.getCOMPOSE().isEnabled());
        softAssert.assertAll();
    }
}
