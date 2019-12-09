package com.unsplash.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


import static com.unsplash.screenplay.user_interfaces.MainPage.GET_LOGIN_SCREEN;

public class GoToLogin {

     public static Task called () {
       return Task.where("Go To Login screen",
               WaitUntil.the(GET_LOGIN_SCREEN, isClickable()),
               Click.on(GET_LOGIN_SCREEN));
    }
}
