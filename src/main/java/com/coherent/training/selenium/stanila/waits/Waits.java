package com.coherent.training.selenium.stanila.waits;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.Objects;

public class Waits {
    public static WebElement waitToBeClickable(WebDriver driver, WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static By getWebElementBy(WebElement element) {
        try {
            Object proxyOrigin = FieldUtils.readField(element, "h", true);
            Object locator = FieldUtils.readField(proxyOrigin, "locator", true);
            Object findBy = FieldUtils.readField(locator, "by", true);
            if (findBy != null) {
                return (By) findBy;
            }
        } catch (IllegalAccessException ignored) {
            ignored.printStackTrace();}
        return null;
    }
    public static Wait<WebDriver> getFluentWait(WebDriver driver, short timeout) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }
    public static boolean waitForElementToBePresent(WebDriver driver, WebElement element, short timeout) {
        By elementBy = getWebElementBy(element);
        Objects.requireNonNull(elementBy);
        Wait<WebDriver> wait = getFluentWait(driver, timeout);
        return wait.until(webDriver -> webDriver.findElement(elementBy).isDisplayed());
    }
}





