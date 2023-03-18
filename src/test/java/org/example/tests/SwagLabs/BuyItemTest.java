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
        mainPage.addToCartFirstItem();
    }
}
