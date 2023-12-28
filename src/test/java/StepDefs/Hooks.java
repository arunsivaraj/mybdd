package StepDefs;

import com.bdd_practise.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {

    WebDriver driver;

    @Before
    public void setup(){
        initializeDriver();
    }

    @After
    public void close(){
        closeDriver();
    }
}
