package com.unsplash.pom;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private By USER_EMAIL = By.id("user_email");
    private By USER_PASSWORD = By.id("user_password");
    private By LOGIN_BTN = By.cssSelector("input[name='commit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        setValue(USER_EMAIL, email);
    }

    public void enterPassword(String pwd) {
        setValue(USER_PASSWORD, pwd);
    }

    public void clickLogin() {
        clickElement(LOGIN_BTN);
    }

    public void loginCredential(String email, String pwd) {
        enterEmail(email);
        enterPassword(pwd);
        clickLogin();
    }


}
