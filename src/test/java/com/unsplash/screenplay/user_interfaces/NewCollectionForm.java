package com.unsplash.screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewCollectionForm extends PageObject {

    public static final Target TITLE = Target.the("New Collection Title")
            .located(By.id("collection_title"));

    public static final Target DESCRIPTION = Target.the("New Collection Description")
            .located(By.id("collection_description"));

    public static final Target PRIVACY = Target.the("Create New Collection")
            .locatedBy("//button[text()='Create collection']");

    public static final Target CREATE_COLLECTION = Target.the("Create New Collection")
            .located(By.xpath("//button[text()='Create collection']"));

    public static Target getAddedCollectionTarget(String collectionName) {
        String by = String.format("//div//ul/li//h4[text()='%s']", collectionName);
        return Target.the("New Added Collection")
                    .located(By.xpath(by));
    }
}
