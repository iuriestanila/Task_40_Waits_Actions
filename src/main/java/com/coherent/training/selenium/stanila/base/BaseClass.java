package com.coherent.training.selenium.stanila.base;

import com.coherent.training.selenium.stanila.pages.LoginPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public LoginPOM loginPOM;
    public SoftAssert softAssert;


    @BeforeMethod
    public void initialize(){
            System.setProperty("webdriver.chrome.driver","C:\\Descarcate de mine\\" +
                    "chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            loginPOM = new LoginPOM();
            softAssert = new SoftAssert();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://mail.yandex.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
