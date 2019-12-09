package com.unsplash.screenplay.tasks;

import com.unsplash.screenplay.user_interfaces.MyCollectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCollection implements Task{

    private MyCollectionPage myCollectionPage;

    @Step("{0} starts going to the Collection Page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(myCollectionPage));
    }

    public static GoToCollection called() {
        return instrumented(GoToCollection.class, "Go to Collection Page", null);
    }

}
