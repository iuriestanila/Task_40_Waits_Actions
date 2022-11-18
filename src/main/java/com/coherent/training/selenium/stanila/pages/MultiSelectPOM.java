package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class MultiSelectPOM extends BasePOM {
    @FindBy(xpath = "//select[@id='multi-select']")
    private WebElement multiSelectDropdown;
    @FindBy(xpath = "//*[@id='printAll']")
    private WebElement multiSelectButton;

    public MultiSelectPOM(WebDriver driver) {
        super(driver);
    }


    @SneakyThrows
    public boolean multiSelect(int... args){
        Select select = new Select(multiSelectDropdown);

        if(select.isMultiple()){
            for (int i=0; i< args.length;i++){
                select.selectByIndex(args[i]);
            }
            Thread.sleep(2000);

            clickMultiSelectButton();
            Thread.sleep(1000);

            List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
            for(WebElement selectedOption:allSelectedOptions){
                System.out.println(selectedOption.getText());
            }
            return true;
        }
        else{
            System.out.println("It's not a multiselect dropdown.");
            return  false;
        }
    }

    public void clickMultiSelectButton(){
        multiSelectButton.click();
    }
}
