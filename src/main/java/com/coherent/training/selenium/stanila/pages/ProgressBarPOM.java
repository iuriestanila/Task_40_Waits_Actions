package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ProgressBarPOM extends BasePOM {
    public WebDriver driver;
    @FindBy(xpath = "//button[@data-size='20480']")
    private WebElement buttonProgressBar;

    public static final By PERCENT_TEXT = By.xpath("//div[@class='percenttext']");

    public ProgressBarPOM(WebDriver driver) {
        super(driver);
    }
    public void clickButtonProgressBar(){
        buttonProgressBar.click();
    }
}
