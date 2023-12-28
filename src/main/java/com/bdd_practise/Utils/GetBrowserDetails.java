package com.bdd_practise.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetBrowserDetails {
    public static WebDriver driver;

    public static WebDriver getBrowserDriver(String browser){
        if(browser!=null){
            if(browser.equalsIgnoreCase("chrome")){
                driver = setChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = setFirefoxDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                driver = setIEDriver();
            }
        }
        return driver;
    }

    private static WebDriver setIEDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }

    private static WebDriver setFirefoxDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        return driver;

    }

    private static WebDriver setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
}
