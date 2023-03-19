package org.example.configClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.configClasses.Config.BROWSER;
import static org.example.configClasses.Config.TimeOutVariable.IMPLICIT_WAIT;

public class Common {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver111.exe"); // TODO Допилить
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe"); // TODO Допилить
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail("Incorrect browser name: " + BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
