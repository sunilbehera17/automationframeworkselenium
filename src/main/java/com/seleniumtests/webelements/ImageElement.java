/*
 * Copyright 2018 www.muvi.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.webelements;

import org.openqa.selenium.By;

public class ImageElement extends HtmlElement {

    public ImageElement(final String label, final By by) {
        super(label, by);
    }

    public int getHeight() {
        return super.getSize().getHeight();
    }

    public int getWidth() {
        return super.getSize().getWidth();
    }

    public String getUrl() {
        return super.getAttribute("src");
    }
}
