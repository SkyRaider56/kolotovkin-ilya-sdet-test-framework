package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends CorePage {
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }
    private By finishButton = By.xpath("//*[@id=\"finish\"]");
}
