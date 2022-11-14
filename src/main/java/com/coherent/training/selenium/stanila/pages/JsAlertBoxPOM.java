package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import lombok.SneakyThrows;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JsAlertBoxPOM extends BasePOM {
    @FindBy(css = "[onclick='myConfirmFunction()']")
    private WebElement alertConfirmBox;
    @FindBy(id = "confirm-demo")
    private WebElement pressedTextLocator;
    @FindBy(css = "[onclick='myAlertFunction()']")
    private WebElement alertBox;
    private String alertText;
    private String pressedTextConfirmBox;

    public JsAlertBoxPOM(WebDriver driver) {
      super(driver);
    }

    @SneakyThrows
    public void alertConfirmBoxOKMeth(){
        alertConfirmBox.click();
        driver.switchTo().alert().accept();
        pressedTextConfirmBox = pressedTextLocator.getText();
    }

    public void alertConfirmBoxCancelMeth(){
        alertConfirmBox.click();
        driver.switchTo().alert().accept();
        pressedTextConfirmBox = pressedTextLocator.getText();
    }

    public void alertBoxMeth() {
        alertBox.click();
        Alert alert = driver.switchTo().alert();
        alertText = alert.getText();
        alert.accept();
    }

    public String getAlertText() {
        return alertText;
    }

    public String getPressedTextConfirmBox() {
         return pressedTextConfirmBox;
    }
}
