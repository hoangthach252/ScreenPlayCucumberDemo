package com.unsplash.screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://unsplash.com/")
public class MainPage extends PageObject {

    public static final Target GET_LOGIN_SCREEN = Target.the("Sign In Button")
            .locatedBy("//a[text()='Login'][@rel]");


}
