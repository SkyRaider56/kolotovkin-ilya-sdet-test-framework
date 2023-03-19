package org.example.tests;

import org.example.configClasses.Common;
import org.example.configClasses.Config;
import org.example.configClasses.CorePage;
import org.example.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static org.example.configClasses.Config.CLEAR_COOKIES;

public class CoreTest {
    protected WebDriver driver = Common.createDriver();
    protected CorePage corePage = new CorePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected YourCartPage yourCartPage = new YourCartPage(driver);
    protected CheckoutYourInfoPage checkoutYourInfoPage = new CheckoutYourInfoPage(driver);
    protected CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
   protected CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

   protected PrimaryHeader primaryHeader = new PrimaryHeader(driver);

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
