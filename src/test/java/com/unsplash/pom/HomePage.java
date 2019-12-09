package com.unsplash.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By SEARCH_BAR = By.cssSelector("form[data-test='nav-bar-search-form-form'] input");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterSearch(String keyword) {
        setValue(SEARCH_BAR, keyword);
        sendKeys(SEARCH_BAR, Keys.ENTER);
    }

}

