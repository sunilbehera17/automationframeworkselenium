/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.tests;

import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.webpage.CalculatorScreen;
import com.seleniumtests.webpage.UICatalogScreen;
import org.testng.annotations.Test;

import static com.seleniumtests.core.CustomAssertion.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

/**
 * iOS app test suite.
 */
public class IOSAppTest extends SeleniumTestPlan {

    @Test(groups = {"verifyUICatalogScreen"}, description = "Verifies UI Catalog screen")
    public void verifyUICatalogScreen() throws Exception {

        UICatalogScreen uiCatalogScree = new UICatalogScreen(true);

        uiCatalogScree.clickSymbol("TextFields");
        assertThat("UI Text Field is missing", UICatalogScreen.isUITextFieldDisplayed(), is(equalTo(true)));
    
    }
}
