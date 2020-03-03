/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.webpage;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.TextFieldElement;
import org.openqa.selenium.By;

public class UICatalogScreen extends PageObject {

    public UICatalogScreen() throws Exception { }

    /**
     * Opens log in page.
     *
     * @param   openAPP
     *
     * @throws  Exception
     */
    public UICatalogScreen(final boolean openAPP) throws Exception {
        super(null, openAPP ? SeleniumTestsContextManager.getThreadContext().getApp() : null);
    }

    // appium does not support locating element with name hence xpath is used
    private static TextFieldElement uiTextField = new TextFieldElement("UI Text Field", By.xpath("//*[@name='Normal']"));

    public TextFieldElement getTextFields(final String symbol) {
        return new TextFieldElement("Text Element", By.xpath("//*[@name='"+symbol+"']"));
    }

    public UICatalogScreen clickSymbol(final String symbol) {
        getTextFields(symbol).click();
        return this;
    }

    public static boolean isUITextFieldDisplayed() {
        return uiTextField.isDisplayed();
    }


}
