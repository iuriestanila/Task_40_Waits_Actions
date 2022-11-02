package com.coherent.training.selenium.stanila.dataProvider;
import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name= "credentials")
    public static Object[][] loginCredentials(){
        return new Object[][] {{"cornilescu","5CalinCornilescu%"}, {"moraru.andy","RootRoot5?"}};
    }
}
