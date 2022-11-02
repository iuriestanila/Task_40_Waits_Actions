package com.coherent.training.selenium.stanila.pages;

import com.coherent.training.selenium.stanila.base.BaseClass;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynDataLoadingPOM extends BaseClass {
    @FindBy(xpath = "//button[@id='save']")
    private WebElement newUser;
    @FindBy(xpath = "//div[@id='loading']")
    private WebElement response;
    public DynDataLoadingPOM(){
        PageFactory.initElements(driver, this);
    }

    @SneakyThrows
    public void getNewUserMeth(){
        newUser.click();
        Thread.sleep(2000);
    }

    public WebElement getResponse() {
        return response;
    }
}

