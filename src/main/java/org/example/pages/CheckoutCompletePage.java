package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends CorePage {
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
    private By thanksForOrderText = By.cssSelector("h2[class='complete-header']");
}
