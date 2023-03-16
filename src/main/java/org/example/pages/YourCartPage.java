package org.example.pages;

import org.openqa.selenium.By;

public class YourCartPage extends CorePage {

    private By inventoryItemName = By.cssSelector("div[class='inventory_item_name']");
    private By checkoutButton = By.xpath("//*[@id=\"checkout\"]");

}
