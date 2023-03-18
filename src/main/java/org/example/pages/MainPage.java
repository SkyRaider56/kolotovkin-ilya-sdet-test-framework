package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends CorePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private By addToCartSauceLabsBackpack = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    // TODO сделать проверку добавления в корзину (красная иконка), и колличество товаров и тд.
    private By shoppingCartLink = By.xpath("//*[@id=\"shopping_cart_link\"]");
    private By shoppingCartBadge = By.xpath("//*[@id=\"shopping_cart_badge\"]");

    public void addToCartFirstItem() {
        driver.findElement(addToCartSauceLabsBackpack).click();
    }
    public void goToCart() {
        driver.findElement(shoppingCartLink).click();
    }
    // TODO видимость элементов в одельный метод
    public void shoppingCartBadgeIsVisible() {
        driver.findElement(shoppingCartBadge).isDisplayed();
    }
    public void shoppingCartLinkIsVisible() {
        driver.findElement(shoppingCartLink).isDisplayed();
    }
    public void setShoppingCartHasItems(Integer count) {
       driver.findElement(shoppingCartBadge).getText();

    }
}
