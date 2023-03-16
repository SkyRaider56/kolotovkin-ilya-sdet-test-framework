package org.example.pages;

import org.openqa.selenium.By;

public class CheckoutYourInfoPage extends CorePage {

    private By firstNameInputField = By.xpath("//*[@placeholder=\"First Name\"]");

    private By lastNameInputField = By.xpath("//*[@placeholder=\"Last Name\"]");

    private By zipCodeInputField = By.xpath("//*[@placeholder=\"Zip/Postal Code\"]");

    private By continueButton = By.xpath("//*[@id=\"continue\"]");

}
