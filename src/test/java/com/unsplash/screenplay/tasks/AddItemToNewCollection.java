package com.unsplash.screenplay.tasks;

import com.unsplash.screenplay.user_interfaces.NewCollectionForm;
import com.unsplash.screenplay.user_interfaces.SearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

public class AddItemToNewCollection implements Task{

    private String collectionName;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(SearchResultsPage.FIRST_MATCHED_ITEM),
                Check.whether(
                        valueOf(SearchResultsPage.FIRST_MATCHED_ADD_COLLECTION), isCurrentlyVisible())
                        .andIfSo(MoveMouse.to(SearchResultsPage.FIRST_MATCHED_ADD_COLLECTION)),
                Click.on(SearchResultsPage.FIRST_MATCHED_ADD_COLLECTION),
                Click.on(SearchResultsPage.NEW_COLLECTION_NAME),
                CreateNewCollection.withName(collectionName),
                WaitUntil.the(NewCollectionForm.getAddedCollectionTarget(collectionName), containsText(collectionName))
        );
    }

    public static AddItemToNewCollection withName(String collectionName) {
        return instrumented(AddItemToNewCollection.class, collectionName);
    }

    public AddItemToNewCollection(String name) {
        this.collectionName = name;
    }
}
