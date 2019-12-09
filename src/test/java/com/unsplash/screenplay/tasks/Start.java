package com.unsplash.screenplay.tasks;

import com.unsplash.pom.BasePage;
import com.unsplash.screenplay.user_interfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {

    private MainPage mainPage;

    @Step("{0} starts going to the Main Page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(mainPage));
    }

    public static Start prepareToSignIn() {
        return instrumented(Start.class, "Go to Login Screen", null);
    }

}
