package org.example.pages;

import org.example.configClasses.CorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.example.pages.MainPage.itemForChoosingNameText;

public class CheckoutOverviewPage extends CorePage {
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }
    private By finishButton = By.xpath("//*[@id=\"finish\"]");

    private By chosenItemInOverviewName = By.xpath("//*[@id=\"item_4_title_link\"]/div[@class=\"inventory_item_name\"]");

    public void chosenItemInOverviewName(String itemName) {
        itemName = driver.findElement(chosenItemInOverviewName).getText();
        Assert.assertEquals(itemName, itemForChoosingNameText);
    }

    public void clickFinish() {
        driver.findElement(finishButton).click();
    }
}
