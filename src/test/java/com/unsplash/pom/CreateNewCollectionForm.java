package com.unsplash.pom;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewCollectionForm extends BasePage{

    private By TITLE = By.id("collection_title");
    private By DESCRIPTION = By.id("collection_description");
    private By PRIVACY = By.xpath("//button[text()='Create collection']");
    private By CREATE_COLLECTION = By.xpath("//button[text()='Create collection']");

    public CreateNewCollectionForm(WebDriver driver) {
        super(driver);
    }

    public void enterTitle(String title) {
        setValue(TITLE, title);
    }

    public void enterDescription(String desc) {
        setValue(DESCRIPTION, desc);
    }

    public void createNewCollection(String title, String desc, boolean privacy) {
        enterTitle(title);
        if (desc.isEmpty()) {
            enterDescription(desc);
        }
        if (privacy) {
            clickElement(PRIVACY);
        }
        clickElement(CREATE_COLLECTION);
    }
}


