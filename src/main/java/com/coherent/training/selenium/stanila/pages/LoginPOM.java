package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import com.coherent.training.selenium.stanila.waits.Waits;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM extends BasePOM {
    @FindBy (xpath = "//button[starts-with(@class,'Button2')]")
    private WebElement loginFirst;
    @FindBy (xpath ="//input[@id='passp-field-login']")
    private WebElement usernameInput;
    @FindBy (xpath = "//button[@id='passp:sign-in']")
    private WebElement loginUsername;
    @FindBy(xpath = "//input[@id='passp-field-passwd']")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[@id='passp:sign-in']")
    private WebElement loginPassword;
    @FindBy(xpath = "//div[@data-key='view=react-main-buttons']//div//a[@role='button']")
    private WebElement compose;
    public static final short TIMEOUT = 5;

    public LoginPOM(WebDriver driver) {
       super(driver);
    }

    @SneakyThrows
    public void login(String userName, String password){
        driver.get("https://mail.yandex.com/");

        loginFirst.click();

        Waits.getFluentWait(driver,TIMEOUT).
                until(e->e.findElement(Waits.getWebElementBy(usernameInput)).isDisplayed());
        usernameInput.sendKeys(userName);

        Waits.getFluentWait(driver,TIMEOUT).
                until(e->e.findElement(Waits.getWebElementBy(loginUsername)).isDisplayed());
        loginUsername.click();

        Waits.getFluentWait(driver,TIMEOUT).
                until(e->e.findElement(Waits.getWebElementBy(passwordInput)).isDisplayed());
        passwordInput.sendKeys(password);

        Waits.getFluentWait(driver,TIMEOUT).
                until(e->e.findElement(Waits.getWebElementBy(loginPassword)).isDisplayed());
        loginPassword.click();

        Waits.getFluentWait(driver,TIMEOUT).
                until(e->e.findElement(Waits.getWebElementBy(compose)).isDisplayed());
    }

    public WebElement getCompose() {
        return compose;
    }
}
