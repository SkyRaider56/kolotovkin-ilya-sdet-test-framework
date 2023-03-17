package org.example.configClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.configClasses.Config.BROWSER;
import static org.example.configClasses.Config.TimeOutVariable.IMPLICIT_WAIT;

public class Common {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src"); // Допилить
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect browser name: " + BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS); // Хардкод убрать, вынести в константу
        return driver;
    }
}
