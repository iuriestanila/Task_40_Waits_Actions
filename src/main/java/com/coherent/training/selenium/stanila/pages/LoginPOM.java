package com.coherent.training.selenium.stanila.pages;

import com.coherent.training.selenium.stanila.Waits;
import com.coherent.training.selenium.stanila.base.BaseClass;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    private Waits waits;

    public LoginPOM() {
        PageFactory.initElements(driver,this);
    }

    @SneakyThrows
    public void login(String userName, String password){
        waits = new Waits();

        LOGIN_CENTRAL_PAGE.click();
        //Thread.sleep(4000);
        waits.explicitWait(driver, USERNAME_INPUT,15);

        USERNAME_INPUT.sendKeys(userName);
        waits.explicitWait(driver, LOGIN_USERNAME,15);

        LOGIN_USERNAME.click();
        //Thread.sleep(3000);
        waits.explicitWait(driver, PASSWORD_INPUT,15);

        PASSWORD_INPUT.sendKeys(password);
        //Thread.sleep(2000);
        waits.explicitWait(driver, LOGIN_PASSWORD,15);

        LOGIN_PASSWORD.click();
        //Thread.sleep(6000);
    }
}
