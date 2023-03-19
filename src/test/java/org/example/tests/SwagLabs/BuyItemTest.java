package org.example.tests.SwagLabs;

import org.example.tests.CoreTest;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class BuyItemTest extends CoreTest {

    @BeforeTest
    public void openAndLogin() {
        corePage.openUrl("{baseURI}");
        loginPage.enterCredetials();
        loginPage.clickLogin();
    }

    @Test
    public void itemBoughtCase() {
        primaryHeader.shoppingCartLinkIsVisible();
        mainPage.addToCartFirstItem();
        primaryHeader.shoppingCartBadgeIsVisible();
        primaryHeader.setShoppingCartHasItems(1);
        primaryHeader.goToCart();
        // Преходим в саму корзину
        // TODO вытащить данные из constants.json
        yourCartPage.chosenItemInCartName("{constantsFile}");
        primaryHeader.shoppingCartBadgeIsVisible();
        primaryHeader.setShoppingCartHasItems(1);
        yourCartPage.checkoutClick();
        // Вводим данные
        checkoutYourInfoPage.typeMyInfo();
        checkoutYourInfoPage.clickContinue();
        // CheckoutOverview
        checkoutOverviewPage.chosenItemInOverviewName("{constantsFile}");
        primaryHeader.shoppingCartBadgeIsVisible();
        primaryHeader.setShoppingCartHasItems(1);
        checkoutOverviewPage.clickFinish();
        // Thanks for order
        checkoutCompletePage.checkThanksForOrderText();
        // добавить проверки, что нет красного кружка
    }
}
