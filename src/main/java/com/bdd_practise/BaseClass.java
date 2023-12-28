package com.bdd_practise;

import com.bdd_practise.Utils.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import java.util.Properties;
import static com.bdd_practise.Utils.GetBrowserDetails.getBrowserDriver;

public class BaseClass {

    public static WebDriver driver;
    static Properties properties = PropertiesUtil.loadApplicationProperties();
    static Properties props = PropertiesUtil.loadFrameworkProperties();

    public static void initializeDriver(){

        String url = properties.getProperty("application.url");
        String browser = properties.getProperty("browser.driver");
        driver = getBrowserDriver(browser);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeDriver(){

        driver.quit();
    }
}
