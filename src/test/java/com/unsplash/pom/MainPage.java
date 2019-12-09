package com.unsplash.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    private By LOGIN_BTN = By.xpath("//a[text()='Login'][@rel]");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginBtn() {
        clickElement(LOGIN_BTN);
    }

}
