package com.coherent.training.selenium.stanila;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

        public WebElement explicitWait(WebDriver driver, WebElement element , int timeout){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
               return wait.until(ExpectedConditions.visibilityOf(element));
        }
}
