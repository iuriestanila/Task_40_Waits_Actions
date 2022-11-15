package com.coherent.training.selenium.stanila.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    public WebDriver driver;
    public SoftAssert softAssert;

    @BeforeMethod
    public void initialize() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\IurieStanila\\IdeaProjects\\Task_40_Waits_Actions\\src" +
                "\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        softAssert = new SoftAssert();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
