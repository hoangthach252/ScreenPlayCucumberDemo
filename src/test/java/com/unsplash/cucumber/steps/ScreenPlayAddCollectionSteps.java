package com.unsplash.cucumber.steps;

import com.unsplash.helper.CommonData;
import com.unsplash.screenplay.abilities.Authenticate;
import com.unsplash.screenplay.questions.NewAddedCollections;
import com.unsplash.screenplay.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class ScreenPlayAddCollectionSteps {
    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) is a registered (?:member|admin)$")
    public void user_is_a_registered_member(String actor){
        theActorCalled(actor)
                .attemptsTo(
                        Start.prepareToSignIn(),
                        GoToLogin.called());
    }

    @Given("^(.*) logged in valid credential$")
    public void userLoggedInUnsplash(String actor) {
        String[] accountInfo = CommonData.accountInfo.get(actor);
        theActorInTheSpotlight()
                .whoCan(Authenticate.with(accountInfo[0], accountInfo[1]))
                .attemptsTo(LogIn.withCredentials());
    }

    @When("^(?:he|she) searches pics with keyword \"(.*)\"$")
    public void userSearchesPicsWithKeyword(String keyword) throws Throwable {
        theActorInTheSpotlight().attemptsTo(SearchAnItem.with(keyword));
    }

    @When("^(?:he|she) adds the first image into new collection name \"(.*)\"$")
    public void userAddTheFirstImageIntoNewCollectionName(String collectionName) throws Throwable {
        String randomNum = CommonData.getRandomNumber();
        String randomName = collectionName.concat(randomNum);
        theActorInTheSpotlight().attemptsTo(AddItemToNewCollection.withName(randomName));
        Serenity.setSessionVariable("Collection Name").to(randomName);
    }


    @When("^he navigates to his collection page$")
    public void heNavigatesToHisCollectionPage() {
        theActorInTheSpotlight().attemptsTo(GoToCollection.called());
    }

    @Then("^(?:he|she) can see the new collection is added in (?:his|her) collection$")
    public void userCanSeeTheNewCollectionWithCorrectNumberOfPhoto() {
        String collectionName = Serenity.sessionVariableCalled("Collection Name");
        theActorInTheSpotlight().should(
                seeThat(NewAddedCollections.collectionList(), hasItem(collectionName))
        );
    }

}
