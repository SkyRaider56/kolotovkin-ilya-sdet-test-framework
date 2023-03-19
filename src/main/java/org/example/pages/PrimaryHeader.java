package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PrimaryHeader extends CorePage {
    public PrimaryHeader(WebDriver driver) {
        super(driver);
    }

    private By shoppingCartLink = By.xpath("//*[@id=\"shopping_cart_link\"]");
    private By shoppingCartBadge = By.xpath("//*[@id=\"shopping_cart_badge\"]");

    // TODO видимость элементов в одельный метод
    public void shoppingCartBadgeIsVisible(Boolean vivible) {
        if (driver.findElement(shoppingCartBadge).isDisplayed()) {
            vivible = true;
        } else {
            vivible = false;
        }
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
