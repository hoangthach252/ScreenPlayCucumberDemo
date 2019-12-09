package com.unsplash.screenplay.questions;

import com.unsplash.screenplay.user_interfaces.MyCollectionPage;
import net.serenitybdd.screenplay.questions.targets.TargetTextValues;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

public class NewAddedCollections {
    public static TargetTextValues collectionList() {
        return TheTarget.textValuesOf(MyCollectionPage.COLLECTION_NAMES).withNoSurroundingWhiteSpace();
    }
}
