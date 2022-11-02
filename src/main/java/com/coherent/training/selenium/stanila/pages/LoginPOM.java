package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.waits.Waits;
import com.coherent.training.selenium.stanila.base.BaseClass;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPOM extends BaseClass{
    @FindBy (xpath = "//button[starts-with(@class,'Button2')]")
    private WebElement LOGIN_CENTRAL_PAGE;
    @FindBy (xpath ="//input[@id='passp-field-login']")
    private WebElement USERNAME_INPUT;
    @FindBy (xpath = "//button[@id='passp:sign-in']")
    private WebElement LOGIN_USERNAME;
    @FindBy(className = "Textinput-Control")
    private WebElement PASSWORD_INPUT;
    @FindBy(xpath = "//button[@id='passp:sign-in']")
    private WebElement LOGIN_PASSWORD;

    @FindBy(xpath = "//div[@data-key='view=react-main-buttons']//div//a[@role='button']")
    private WebElement COMPOSE;
    public Waits waits;

    public LoginPOM() {
        PageFactory.initElements(driver,this);
    }


    @SneakyThrows
    public void login(String userName, String password){
        waits = new Waits();
        driver.get("https://mail.yandex.com/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        LOGIN_CENTRAL_PAGE.click();
        //Thread.sleep(2000);
        //waits.waitToBeClickable(driver,USERNAME_INPUT,10);
        waits.fluentWait(driver,USERNAME_INPUT);

        USERNAME_INPUT.sendKeys(userName);
        //Thread.sleep(2000);
        //waits.waitToBeClickable(driver,LOGIN_USERNAME,10);
        waits.fluentWait(driver,LOGIN_USERNAME);

        LOGIN_USERNAME.click();
        //Thread.sleep(2000);
        //waits.waitToBeClickable(driver,PASSWORD_INPUT,10);
        waits.fluentWait(driver,PASSWORD_INPUT);

        PASSWORD_INPUT.sendKeys(password);
        //Thread.sleep(2000);
        //waits.waitToBeClickable(driver,LOGIN_PASSWORD,10);
        //Thread.sleep(2000);
        waits.fluentWait(driver,LOGIN_PASSWORD);

        LOGIN_PASSWORD.click();
        //Thread.sleep(4000);
    }

    public WebElement getCOMPOSE() {
        return COMPOSE;
    }
}

