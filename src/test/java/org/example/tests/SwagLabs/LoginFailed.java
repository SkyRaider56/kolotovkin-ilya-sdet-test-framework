package org.example.tests.SwagLabs;

import io.qameta.allure.Feature;
import io.qameta.allure.testng.Tag;
import org.example.tests.CoreTest;
import org.example.tests.Utils.Listener;
import org.junit.Test;
import org.testng.annotations.Listeners;

@Listeners({Listener.class})
@Feature("authTest")
public class LoginFailed extends CoreTest {
    @Test
    public void authFailed() {
        loginPage.enterCredetials("test", "test");
        loginPage.clickLogin();
        loginPage.checkErrorAuthMessage("Epic sadface: Username and password do not match any user in this service");
    }
}
