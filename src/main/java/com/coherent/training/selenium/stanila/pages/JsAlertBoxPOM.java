package com.coherent.training.selenium.stanila.pages;

import com.coherent.training.selenium.stanila.base.BaseClass;
import lombok.SneakyThrows;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class JsAlertBoxPOM extends BaseClass {
    @FindBy(xpath = "//button[@onclick='myConfirmFunction()']")
    private WebElement alertConfirmBox;
    @FindBy(xpath = "//p[@id='confirm-demo']")
    private WebElement pressedTextLocator;
    @FindBy(xpath = "//button[@onclick='myAlertFunction()']")
    private WebElement alertBox;
    private String alertText;
    private String pressedTextConfirmBox;

    public JsAlertBoxPOM() {
        PageFactory.initElements(driver, this);
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
