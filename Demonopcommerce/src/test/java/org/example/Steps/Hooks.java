package org.example.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

public static WebDriver driver;
    @Before
    public static void openBrowser()
    {

//String key = "webdriver.chrome.driver";
//String value =System.getProperty("user.dir") + "\\Browsers\\chromedriver.exe";
//        System.setProperty(key,value);
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://demo.nopcommerce.com/");

    }





    @After
    public static void quiteBrowser() throws InterruptedException {
    Thread.sleep(2000);
    driver.quit();
    }
    }



