package org.example.pages;

import org.apache.tools.ant.util.regexp.Jdk14RegexpRegexp;
import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInfoPage extends CorePage {
    public CheckoutYourInfoPage(WebDriver driver) {
        super(driver);
    }
    private By firstNameInputField = By.xpath("//*[@placeholder=\"First Name\"]");

    private By lastNameInputField = By.xpath("//*[@placeholder=\"Last Name\"]");

    private By zipCodeInputField = By.xpath("//*[@placeholder=\"Zip/Postal Code\"]");

    private By continueButton = By.xpath("//*[@id=\"continue\"]");

    // TODO достать инфу из USERS
    public void typeMyInfo() {
        driver.findElement(firstNameInputField).sendKeys("");
        driver.findElement(lastNameInputField).sendKeys("");
        driver.findElement(zipCodeInputField).sendKeys("");
    }
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
}
