package com.unsplash.screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultsPage extends PageObject {

    public static Target FIRST_MATCHED_ITEM = Target.the("First Item Grid")
            .located(By.cssSelector("div[data-test='masonry-grid-count-three'] > div:nth-of-type(1) div figure>div>div"));

    public static Target FIRST_MATCHED_ADD_COLLECTION = Target.the("First Item Grid")
            .located(By.cssSelector("div[data-test='masonry-grid-count-three'] > div:nth-of-type(1) div figure>div>div button[title='Add to collection']"));

    public static Target NEW_COLLECTION_NAME = Target.the("Create a new collection")
            .locatedBy("//button[text()='Create a new collection']");

}
