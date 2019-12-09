package com.unsplash.screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://unsplash.com/@hoangthach252/collections")
public class MyCollectionPage extends PageObject {

    public static Target COLLECTION_NAMES = Target.the("Collection Names")
            .locatedBy("//div[@data-test='collection-feed-card']//a//div[text()]");

}
