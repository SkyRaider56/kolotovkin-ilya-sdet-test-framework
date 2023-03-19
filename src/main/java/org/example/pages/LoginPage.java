package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CorePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By loginPage = By.cssSelector("div[class='login_container']");
    private By userNameInputField = By.xpath("//input[@id='user-name']");
    private By userPasswordInputField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//input[@id='login-button']");
    private By wrongCredentialsButton = By.cssSelector("h3[data-test='error']");

    // TODO эксепшены на методы
    public LoginPage enterCredetials () {
        driver.findElement(userNameInputField).sendKeys("standard_user");
        driver.findElement(userPasswordInputField).sendKeys("secret_sauce");
        return this;
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
