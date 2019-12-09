package com.unsplash.cucumber.steps;

import com.unsplash.helper.CommonData;
import com.unsplash.pom.*;
import static org.assertj.core.api.Assertions.assertThat;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class POMAddCollectionSteps {

    private WebDriver driver;

//    @Before
//    public void initWebDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

    @Given("^the user is on the main page pom$")
    public void openMainPage(){
        driver.get(CommonData.BASE_URL);
    }

    @Given("^the user goes to Login Page$")
    public void goToLoginPage(){
        new MainPage(driver).clickLoginBtn();
    }

    @Given("^the user logs in \"([^\"]*)\" credential pom$")
    public void theUserLogsInCredentialPom(String profileName) throws Throwable {
        String[] accountInfo = CommonData.accountInfo.get(profileName);
        new LoginPage(driver).loginCredential(accountInfo[0], accountInfo[1]);
    }

    @When("^(?:he|she) searches pics with keyword \"(.*)\" pom$")
    public void userSearchesPicsWithKeyword(String keyword) throws Throwable {
        new HomePage(driver).enterSearch(keyword);
    }

    @And("^(?:he|she) adds the first image into new collection name \"(.*)\" pom$")
    public void userAddTheFirstImageIntoNewCollectionName(String collectionName) throws Throwable {
        new SearchResultPage(driver).addFirstPicToCollection();
        new SearchResultPage(driver).addToNewCollection();
        new CreateNewCollectionForm(driver).createNewCollection(collectionName, "", false);
        Serenity.setSessionVariable("Collection Name").to(collectionName);

    }

    @Then("^(?:he|she) can see the new collection is added in his collection pom$")
    public void userCanSeeTheNewCollectionWithCorrectNumberOfPhoto() {
        String collectionName = Serenity.sessionVariableCalled("Collection Name");
        assertThat(new CollectionPage(driver).getCollectionNameList()).contains(collectionName);
    }


    @When("^And he navigates to his collection page$")
    public void andHeNavigatesToHisCollectionPage() {
        driver.get(CommonData.COLLECTION_PAGE_URL);
    }
}
