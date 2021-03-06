/*
 * Copyright 2018 www.muvi.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.webelements;

import org.openqa.selenium.By;

import com.seleniumtests.core.TestLogging;

public class RadioButtonElement extends HtmlElement {

    public RadioButtonElement(final String label, final By by) {
        super(label, by);
    }

    public void check() {
        TestLogging.logWebStep("check " + toHTML(), false);
        super.click();
    }

    @Override
    public void click() {
        TestLogging.logWebStep("click on " + toHTML(), false);
        super.click();
    }

    public boolean isSelected() {
        findElement();
        return element.isSelected();
    }
}
