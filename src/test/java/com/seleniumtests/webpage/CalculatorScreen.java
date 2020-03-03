/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.webpage;

import org.openqa.selenium.By;

import com.seleniumtests.core.SeleniumTestsContextManager;

import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.LabelElement;
import com.seleniumtests.webelements.PageObject;

/**
 * Defines service for Calculator screen.
 */
public class CalculatorScreen extends PageObject {

    public CalculatorScreen() throws Exception { }

    /**
     * Opens log in page.
     *
     * @param   openAPP
     *
     * @throws  Exception
     */
    public CalculatorScreen(final boolean openAPP) throws Exception {
        super(null, openAPP ? SeleniumTestsContextManager.getThreadContext().getApp() : null);
    }

    public ButtonElement getSymbolElement(final String symbol) {
        return new ButtonElement("Button Element", By.name(symbol));
    }

    public CalculatorScreen clickSymbol(final String symbol) {
        getSymbolElement(symbol).click();
        return this;
    }

    public String getResultText() {

        // You can also locate this element using class name - By.className("android.widget.EditText"))
        return new LabelElement("Result Text", By.id("com.android.calculator2:id/formula")).getText();
    }
}
