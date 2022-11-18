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

    public JsAlertBoxPOM(WebDriver driver) {
      super(driver);
    }

    @SneakyThrows
    public String alertConfirmBoxOK(){
        alertConfirmBox.click();
        driver.switchTo().alert().accept();
        return pressedTextLocator.getText();
    }

    public String alertConfirmBoxCancel(){
        alertConfirmBox.click();
        driver.switchTo().alert().accept();
        return pressedTextLocator.getText();
    }

    public String alertBox() {
        alertBox.click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;
    }
}
