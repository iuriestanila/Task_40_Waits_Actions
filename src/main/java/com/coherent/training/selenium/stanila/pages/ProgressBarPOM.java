package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProgressBarPOM extends BaseClass {
    @FindBy(xpath = "//button[@data-size='20480']")
    private WebElement buttonProgressBar;
    public static final By percentText = By.xpath("//div[@class='percenttext']");

    public ProgressBarPOM() {
        PageFactory.initElements(driver, this);
    }
    public void clickButtonProgressBar(){
        buttonProgressBar.click();
    }
}
