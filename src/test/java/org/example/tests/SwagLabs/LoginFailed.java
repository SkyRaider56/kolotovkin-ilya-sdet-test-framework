package org.example.tests.SwagLabs;

import org.example.tests.CoreTest;
import org.junit.Test;

public class LoginFailed extends CoreTest {

    @Test
    public void authFailed() {
        corePage.openUrl("https://www.saucedemo.com/");
        loginPage.enterCredetials("test", "test");
        loginPage.clickLogin();
        loginPage.checkErrorAuthMessage("Epic sadface: Username and password do not match any user in this service");
    }
}