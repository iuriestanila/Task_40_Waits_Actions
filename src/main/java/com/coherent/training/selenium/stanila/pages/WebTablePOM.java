package com.coherent.training.selenium.stanila.pages;
import com.coherent.training.selenium.stanila.base.BasePOM;
import com.coherent.training.selenium.stanila.employee.Employee;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;

public class WebTablePOM extends BasePOM {
    @FindBy(xpath = "//select[@name='example_length']")
    private WebElement webTableDropdown;
    @FindBy(xpath = "//table[@id='example']//tbody//tr")
    private List<WebElement> rows;
    @FindBy(xpath = "//a[@id='example_next']")
    private WebElement nextButton;
    List<Employee> employees;
    public static final int ALLOWED_AGE = 23;
    public static final int ALLOWED_SALARY = 95000;
    public static final int NAME_TITLE = 1;
    public static final int POSITION_TITLE = 2;
    public static final int OFFICE_TITLE = 3;
    public static final int AGE_TITLE = 4;
    public static final int SALARY_TITLE = 6;

    public WebTablePOM(WebDriver driver) {
        super(driver);
    }

    public void chooseValue() {
        Select select = new Select(webTableDropdown);
        select.selectByVisibleText("10");
    }

    @SneakyThrows
    public List<Employee> getEmployee() {
        employees = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            for (int i = 1; i <= rows.size(); i++) {
                String name = driver.findElement(By.xpath(
                        "//table[@id='example']//tbody//tr[" + i + "]//td[" + NAME_TITLE + "]")).getText();
                String position = driver.findElement(By.xpath(
                        "//table[@id='example']//tbody//tr[" + i + "]//td[" + POSITION_TITLE + "]")).getText();
                String office = driver.findElement(By.xpath(
                        "//table[@id='example']//tbody//tr[" + i + "]//td[" + OFFICE_TITLE + "]")).getText();
                int age = Integer.parseInt(driver.findElement(By.xpath(
                        "//table[@id='example']//tbody//tr[" + i + "]//td[" + AGE_TITLE + "]")).getText());
                int salary = Integer.parseInt(driver.findElement(By.xpath(
                                "//table[@id='example']//tbody//tr[" + i + "]//td[" + SALARY_TITLE + "]")).getText().
                        replaceAll("[$,/y]", ""));

                if (age > ALLOWED_AGE && salary <= ALLOWED_SALARY) {
                    employees.add(new Employee(name, position, office));
                }
            }

            String nextBtnClass = nextButton.getAttribute("class");
            if (!nextBtnClass.contains("disabled")) {
                nextButton.click();
            } else {
                flag = false;
            }
        }

        System.out.println(employees);
        return employees;
    }
}