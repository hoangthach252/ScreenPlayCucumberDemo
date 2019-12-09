package com.unsplash.pom;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CollectionPage extends BasePage{

    private By COLLECTION_NAMES = By.xpath("//div[@data-test='collection-feed-card']//a//div[text()]");

    public CollectionPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getCollectionNameList() {
        return getTexts(COLLECTION_NAMES);
    }

}
