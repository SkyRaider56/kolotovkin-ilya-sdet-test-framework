package org.example.tests;

import org.example.configClasses.Common;
import org.example.configClasses.Config;
import org.example.configClasses.CorePage;
import org.example.pages.LoginPage;
import org.example.pages.MainPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static org.example.configClasses.Config.CLEAR_COOKIES;

public class CoreTest {
    protected WebDriver driver = Common.createDriver();
    protected CorePage corePage = new CorePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected MainPage mainPage = new MainPage(driver);

    @AfterTest
    public void clearCookies() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    @AfterSuite(alwaysRun = true)
    public void close() {
        driver.quit();
    }
}
