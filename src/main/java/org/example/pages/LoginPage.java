package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
    public LoginPage enterCredetials(String login, String password) {
        driver.findElement(userNameInputField).sendKeys(login);
        driver.findElement(userPasswordInputField).sendKeys(password);
        return this;
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void authErrorMessage() {
        driver.findElement(wrongCredentialsButton).getText();
    }

    public void checkErrorAuthMessage(String message) {
       String actualMessage = driver.findElement(wrongCredentialsButton).getText();
        Assert.assertEquals(actualMessage, message);
    }
}
