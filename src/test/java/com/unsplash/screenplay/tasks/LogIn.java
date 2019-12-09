package com.unsplash.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import com.unsplash.screenplay.abilities.Authenticate;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.unsplash.screenplay.user_interfaces.LoginPage.*;

public class LogIn implements Task {

    @Step("Logs in loaded {0}")
    public static LogIn withCredentials(){
        return instrumented(LogIn.class);
    }

    @Step
    public <T extends Actor> void performAs(T user) {
        try {
            user.attemptsTo(
                    Enter.theValue(authenticated(user).username())
                        .into(USER_EMAIL),
                    Enter.theValue(authenticated(user).password())
                        .into(USER_PASSWORD),
                    Click.on(LOGIN_BTN)
            );
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private Authenticate authenticated(Actor actor) throws Throwable {
       return Authenticate.as(actor);
    }

}
