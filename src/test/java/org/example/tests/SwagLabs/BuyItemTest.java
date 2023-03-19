package org.example.tests.SwagLabs;

import org.example.tests.CoreTest;
import org.junit.Test;

public class BuyItemTest extends CoreTest {
    @Test
    public void itemBoughtCase() {
        corePage.openUrl("https://www.saucedemo.com/");
        loginPage.enterCredetials();
        loginPage.clickLogin();
        primaryHeader.shoppingCartLinkIsVisible();
        mainPage.addToCartFirstItem();
        primaryHeader.shoppingCartBadgeIsVisible(true);
        primaryHeader.setShoppingCartHasItems(1);
        primaryHeader.goToCart();
        // Преходим в саму корзину
        // TODO вытащить данные из constants.json
        yourCartPage.chosenItemInCartName("Sauce Labs Backpack");
        primaryHeader.shoppingCartBadgeIsVisible(true);
        primaryHeader.setShoppingCartHasItems(1);
        yourCartPage.checkoutClick();
        // Вводим данные
        checkoutYourInfoPage.typeMyInfo();
        checkoutYourInfoPage.clickContinue();
        // CheckoutOverview
        // TODO вытащить данные из constants.json
        checkoutOverviewPage.chosenItemInOverviewName("Sauce Labs Backpack");
        primaryHeader.shoppingCartBadgeIsVisible(true);
        primaryHeader.setShoppingCartHasItems(1);
        checkoutOverviewPage.clickFinish();
        // Thanks for order
        checkoutCompletePage.checkThanksForOrderText();
        // Красного кружка нету
        primaryHeader.shoppingCartBadgeIsVisible(false);
        checkoutCompletePage.checkRedirect();
    }
}
