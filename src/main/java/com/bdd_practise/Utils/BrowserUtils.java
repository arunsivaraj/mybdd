package com.bdd_practise.Utils;

import com.bdd_practise.BaseClass;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.util.Properties;

public class BrowserUtils extends BaseClass {

    static Properties properties = PropertiesUtil.loadFrameworkProperties();

    public static void clickElement(String element){
        findAndWaitForElement(element).click();
    }

    public static void enterText(String element, String text){
        findAndWaitForElement(element).clear();
        findAndWaitForElement(element).sendKeys(text);
    }

    public static WebElement findAndWaitForElement(String xpath){

        String timeout = properties.getProperty("timeout.maximum");
        WebElement element = null;
        try {
            // WebDriverWait wait = new WebDriverWait(driver,Long.parseLong(timeout));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(Long.parseLong(timeout)));
            element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
        } catch (Exception e) {
            System.out.println("Element not found");;
        }
        return element;

    }


    public static void validateText(String element, String expectedText) {
        String actualText = findAndWaitForElement(element).getText();
        Assert.assertTrue("Expected Text : " + expectedText + "is not matching with Actual Text : " + actualText,
                expectedText.equals(actualText));

    }
}
