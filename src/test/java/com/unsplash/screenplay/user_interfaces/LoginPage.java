package com.unsplash.screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USER_EMAIL = Target.the("User Email field")
            .located(By.id("user_email"));

    public static final Target USER_PASSWORD = Target.the("User Password field")
            .located(By.id("user_password"));

    public static final Target LOGIN_BTN = Target.the("Submit login")
            .located(By.cssSelector("input[name='commit']"));

}
