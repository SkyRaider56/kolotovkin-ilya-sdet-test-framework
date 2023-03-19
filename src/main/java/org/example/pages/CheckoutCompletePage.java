package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutCompletePage extends CorePage {
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
    private By thanksForOrderText = By.cssSelector("h2[class='complete-header']");
    static public String thanksForOrderActualText;

    // TODO вытащить из контстант
    public void checkThanksForOrderText() {
        thanksForOrderActualText = driver.findElement(thanksForOrderText).getText();
        Assert.assertEquals(thanksForOrderActualText, "Thank you for your order!");
    }
    public void checkRedirect() {
       Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html");
    }
}
