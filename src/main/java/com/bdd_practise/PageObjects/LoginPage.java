package com.bdd_practise.PageObjects;

import com.bdd_practise.BaseClass;
import com.bdd_practise.Utils.BrowserUtils;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    private static String txtEmail = "//input[@id='input-email']";
    private static String textPassoword ="//input[@id='input-password']";
    private static String btnLogin="//input[@value='Login']";
    private static String linkForgottenPassword="(//a[text()='Forgotten Password'])[1]";


    public static void enterUserName(String email){
        BrowserUtils.enterText(txtEmail, email);
    }

    public static void enterPassword(String password){
        BrowserUtils.enterText(textPassoword, password);
    }

    public static void clickLogin() {
       BrowserUtils.clickElement(btnLogin);
    }

    public static void clickForgottonPassword() {
        driver.findElement(By.xpath(linkForgottenPassword)).click();
    }


}
