package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultiSelectPOM extends BasePOM {
    @FindBy(xpath = "//select[@id='multi-select']")
    private WebElement multiSelectDropdown;
    @FindBy(xpath = "//*[@id='printAll']")
    private WebElement multiSelectButton;

    public MultiSelectPOM(WebDriver driver) {
        super(driver);
    }

    public WebElement getMultiSelectDropdown() {
        return multiSelectDropdown;
    }

    public WebElement getMultiSelectButton() {
        return multiSelectButton;
    }
}
