package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.example.pages.MainPage.itemForChoosingNameText;

public class YourCartPage extends CorePage {
    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    private By inventoryItemName = By.cssSelector("div[class='inventory_item_name']");
    private By checkoutButton = By.xpath("//*[@id=\"checkout\"]");


    public void chosenItemInCartName(String itemName) {
        itemName = driver.findElement(inventoryItemName).getText();
        Assert.assertEquals(itemName, itemForChoosingNameText);
    }

    public void checkoutClick() {
        driver.findElement(checkoutButton).click();
    }

}
