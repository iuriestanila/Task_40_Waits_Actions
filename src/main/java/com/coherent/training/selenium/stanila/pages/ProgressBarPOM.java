package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import com.coherent.training.selenium.stanila.waits.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBarPOM extends BasePOM {
    public WebDriver driver;
    @FindBy(xpath = "//button[@data-size='20480']")
    private WebElement buttonProgressBar;

    @FindBy(xpath = "//div[@class='percenttext']")
    private WebElement percentText;

    public ProgressBarPOM(WebDriver driver) {
        super(driver);
    }
    public void clickButtonProgressBar(){
        buttonProgressBar.click();
    }
    public String refreshAtCondition(WebDriver driver) {

        while (Integer.parseInt(driver.findElement(Waits.getWebElementBy(percentText)).
                getText().replaceAll("%","")) < 50){

        }
        driver.navigate().refresh();
        return driver.findElement(Waits.getWebElementBy(percentText)).getText();
    }
}
