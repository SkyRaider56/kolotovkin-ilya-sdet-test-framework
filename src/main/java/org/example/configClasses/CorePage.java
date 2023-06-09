package org.example.configClasses;

import org.apache.tools.ant.types.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.configClasses.Config.EXPLICIT_WAIT;


public class CorePage {
    private static final Pages pages = Pages.getInstance();
    protected WebDriver driver;

    public CorePage(WebDriver driver) {
        this.driver=driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public WebElement waitElementVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
