package com.unsplash.screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GlobalHeader {

    public static final Target SEARCH_BAR = Target.the("Top Search bar field")
            .locatedBy("form[data-test='nav-bar-search-form-form'] input");

}
