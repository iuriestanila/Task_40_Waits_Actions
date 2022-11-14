package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynDataLoadingPOM extends BasePOM {
    @FindBy(id = "save")
    private WebElement newUser;
    @FindBy(id = "loading")
    private WebElement response;

    public DynDataLoadingPOM(WebDriver driver){
        super(driver);
    }

    @SneakyThrows
    public void clickOnNewUser(){
        newUser.click();
        Thread.sleep(2000);
    }

    public WebElement getResponse() {
        return response;
    }
}

