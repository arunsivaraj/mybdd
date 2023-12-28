package com.bdd_practise.PageObjects;

import com.bdd_practise.BaseClass;
import com.bdd_practise.Utils.BrowserUtils;

public class HomePage extends BaseClass {

    private static String myAccountText ="(//div[@id='content']/h2)[1]";

    public static void validateLogin(String expectedText) {

        BrowserUtils.validateText(myAccountText, expectedText);

    }
}
