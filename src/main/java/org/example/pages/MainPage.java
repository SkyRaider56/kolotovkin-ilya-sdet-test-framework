package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MainPage extends CorePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    static public String itemForChoosingNameText;
    private By addToCartSauceLabsBackpack = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    private By itemForChoosingName = By.xpath("//*[@id=\"item_4_title_link\"]/div[@class=\"inventory_item_name\"]");

    public void addToCartFirstItem() {
        driver.findElement(addToCartSauceLabsBackpack).click();
    }

    public void safeItemNameForBuying() {
        itemForChoosingNameText = driver.findElement(itemForChoosingName).getText();
    }
}
