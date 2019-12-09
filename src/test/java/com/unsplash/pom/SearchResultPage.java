package com.unsplash.pom;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{

    private By FIRST_MATCHED_ITEM = By.cssSelector("div[data-test='masonry-grid-count-three'] > div:nth-of-type(1) div figure>div>div");
    private By FIRST_MATCHED_ADD_COLLECTION = By.cssSelector("div[data-test='masonry-grid-count-three'] > div:nth-of-type(1) div figure>div>div button[title='Add to collection']");
    private By NEW_COLLECTION_NAME = By.xpath("//button[text()='Create a new collection']");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void addFirstPicToCollection() {
        hoverOnElement(FIRST_MATCHED_ITEM);
        clickElement(FIRST_MATCHED_ADD_COLLECTION);
    }

    public void addToNewCollection() {
        clickElement(NEW_COLLECTION_NAME);
    }
}

