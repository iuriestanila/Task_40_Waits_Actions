package com.coherent.training.selenium.stanila.base;
import com.coherent.training.selenium.stanila.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
public class BaseClass {
    public static WebDriver driver;
    public LoginPOM loginPOM;
    public MultiSelectPOM multiSelectPOM;
    public JsAlertBoxPOM jsAlertBoxPOM;
    public DynDataLoadingPOM dynamicDataLoadingPOM;
    public ProgressBarPOM progressBarPOM;
    public WebTablePOM webTablePOM;
    public SoftAssert softAssert;

    @BeforeMethod
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "C:\\Descarcate de mine\\" +
                "chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPOM = new LoginPOM();
        multiSelectPOM = new MultiSelectPOM();
        jsAlertBoxPOM = new JsAlertBoxPOM();
        dynamicDataLoadingPOM = new DynDataLoadingPOM();
        progressBarPOM = new ProgressBarPOM();
        webTablePOM = new WebTablePOM();
        softAssert = new SoftAssert();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
