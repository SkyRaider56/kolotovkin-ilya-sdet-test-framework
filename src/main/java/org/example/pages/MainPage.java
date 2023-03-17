package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends CorePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private By addToCartSauceLabsBackpack = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    // TODO сделать проверку добавления в корзину (красная иконка), и колличество товаров и тд.
    private By shoppingCartLink = By.xpath("//*[@id=\"shopping_cart_link\"]");
    private By shoppingCartBadge = By.xpath("//*[@id=\"shopping_cart_badge\"]");
}
