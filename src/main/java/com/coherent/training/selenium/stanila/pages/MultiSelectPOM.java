package com.coherent.training.selenium.stanila.pages;

import com.coherent.training.selenium.stanila.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MultiSelectPOM extends BaseClass {
    @FindBy(xpath = "//select[@id='multi-select']")
    private WebElement multiSelectDropdown;
    @FindBy(xpath = "//*[@id='printAll']")
    private WebElement MultiSelectButton;

    public MultiSelectPOM() {
        PageFactory.initElements(driver,this);
    }

    public WebElement getMultiSelectDropdown() {
        return multiSelectDropdown;
    }

    public WebElement getMultiSelectButton() {
        return MultiSelectButton;
    }
}
