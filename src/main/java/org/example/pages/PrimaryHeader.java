package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PrimaryHeader extends CorePage {
    public PrimaryHeader(WebDriver driver) {
        super(driver);
    }

    private By shoppingCartLink = By.xpath("//*[@class='shopping_cart_link']");
    private By shoppingCartBadge = By.xpath("//*[@class='shopping_cart_badge']");

    // TODO видимость элементов в одельный метод
    public void shoppingCartBadgeIsVisible(Boolean expected) {
        Boolean visible;
        try {
        driver.findElement(shoppingCartBadge).isDisplayed();
            visible = true;
        } catch (NoSuchElementException e) {
            visible = false;
        }
        Assert.assertEquals(visible, expected);
    }

    public void goToCart() {
        driver.findElement(shoppingCartLink).click();
    }

    public void shoppingCartLinkIsVisible() {
        driver.findElement(shoppingCartLink).isDisplayed();
    }


    // TODO убрать хардкод колличества товаров
    public void setShoppingCartHasItems(int count) {
        count = Integer.valueOf(driver.findElement(shoppingCartBadge).getText());
        Assert.assertEquals(count, 1);
    }

}
