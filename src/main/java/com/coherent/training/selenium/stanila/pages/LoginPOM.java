package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import com.coherent.training.selenium.stanila.waits.Waits;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM extends BasePOM {
    @FindBy (xpath = "//button[starts-with(@class,'Button2')]")
    private WebElement login_first;
    @FindBy (xpath ="//input[@id='passp-field-login']")
    private WebElement username_input;
    @FindBy (xpath = "//button[@id='passp:sign-in']")
    private WebElement login_username;
    @FindBy(xpath = "//input[@id='passp-field-passwd']")
    private WebElement password_input;
    @FindBy(xpath = "//button[@id='passp:sign-in']")
    private WebElement login_password;
    @FindBy(xpath = "//div[@data-key='view=react-main-buttons']//div//a[@role='button']")
    private WebElement compose;
    public static final short TIMEOUT = 5;
    private Waits waits;

    public LoginPOM(WebDriver driver) {
       super(driver);
    }

    @SneakyThrows
    public void login(String userName, String password){
        waits = new Waits();
        driver.get("https://mail.yandex.com/");

        login_first.click();

        waits.getFluentWait(driver,TIMEOUT).until(e->e.findElement(waits.getWebElementBy(username_input)).isDisplayed());
        username_input.sendKeys(userName);

        waits.getFluentWait(driver,TIMEOUT).until(e->e.findElement(waits.getWebElementBy(login_username)).isDisplayed());
        login_username.click();

        waits.getFluentWait(driver,TIMEOUT).until(e->e.findElement(waits.getWebElementBy(password_input)).isDisplayed());
        password_input.sendKeys(password);

        waits.getFluentWait(driver,TIMEOUT).until(e->e.findElement(waits.getWebElementBy(login_password)).isDisplayed());
        login_password.click();

        waits.getFluentWait(driver,TIMEOUT).until(e->e.findElement(waits.getWebElementBy(compose)).isDisplayed());
    }

    public WebElement getCompose() {
        return compose;
    }
}

