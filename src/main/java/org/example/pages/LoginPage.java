package org.example.pages;

import org.openqa.selenium.By;

public class LoginPage extends CorePage {

    private By loginPage = By.cssSelector("div[class='login_container']");
    private By userNameInputField = By.xpath("//input[@id='user-name']");
    private By userPasswordInputField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("input[type='submit']");
    private By wrongCredentialsButton = By.cssSelector("h3[data-test='error']");
}
