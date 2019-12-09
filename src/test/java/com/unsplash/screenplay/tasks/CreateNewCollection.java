package com.unsplash.screenplay.tasks;

import com.unsplash.screenplay.user_interfaces.NewCollectionForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateNewCollection implements Task {

    private String name;
    //Optional Field
    private String description = null;
    private boolean privacy;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(NewCollectionForm.TITLE),
                Check.whether(description != null)
                        .andIfSo(Enter.theValue(description).into(NewCollectionForm.DESCRIPTION)),
                Check.whether(privacy)
                        .andIfSo(Click.on(NewCollectionForm.PRIVACY)),
                Click.on(NewCollectionForm.CREATE_COLLECTION)
        );
    }

    public static CreateNewCollection withName(String name) {
        return instrumented(CreateNewCollection.class, name);
    }

    public CreateNewCollection(String name) {
        this.name = name;
        this.description = name;
        this.privacy = false;
    }

    public CreateNewCollection(String name, String description, boolean privacy) {
        this.name = name;
        this.description = description;
        this.privacy = privacy;
    }
}
