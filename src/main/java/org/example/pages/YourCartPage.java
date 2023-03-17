package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends CorePage {
    public YourCartPage(WebDriver driver) {
        super(driver);
    }
    private By inventoryItemName = By.cssSelector("div[class='inventory_item_name']");
    private By checkoutButton = By.xpath("//*[@id=\"checkout\"]");
}
