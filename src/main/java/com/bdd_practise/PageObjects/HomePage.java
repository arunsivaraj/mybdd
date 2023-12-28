package com.bdd_practise.PageObjects;

import com.bdd_practise.BaseClass;
import com.bdd_practise.Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {

    private static String myAccountLocator = "//div[@id='content']/h2)[1]";

    public static void validateLogin(String expectedText) {
        WebElement myAccountElement = BrowserUtils.findAndWaitForElement(myAccountLocator);

        // Check if the element is not null before invoking getText()
        if (myAccountElement != null) {
            BrowserUtils.validateText(String.valueOf(myAccountElement), expectedText);
        } else {
            // Handle the case where the element is not found
            System.out.println("Element not found on the page.");
        }
    }
}
