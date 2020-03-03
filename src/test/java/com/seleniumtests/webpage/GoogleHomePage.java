/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */


package com.seleniumtests.webpage;

import com.seleniumtests.core.Locator;

import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.TextFieldElement;


public class GoogleHomePage extends PageObject {

    private static final TextFieldElement searchTextBox = new TextFieldElement("search Text Box",
            Locator.locateByName("q"));

    public GoogleHomePage() throws Exception {
        super(searchTextBox);
    }

    public boolean isSearchBoxDisplayed() {
        return searchTextBox.isDisplayed();
    }
}
