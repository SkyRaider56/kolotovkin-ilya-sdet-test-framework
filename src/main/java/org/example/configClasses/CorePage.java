package org.example.configClasses;

import org.openqa.selenium.WebDriver;

public class CorePage {
    protected WebDriver driver;
    public CorePage(WebDriver driver) {
        this.driver=driver;
    }
}
