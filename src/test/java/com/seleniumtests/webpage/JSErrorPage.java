/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.webpage;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.User;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.TextFieldElement;

import static com.seleniumtests.core.Locator.locateByCSSSelector;
import static com.seleniumtests.core.Locator.locateByName;

/**
 * Provides services offered by Registration Page.
 *
 * <p/>Date: 10/2/13 Time: 6:26 PM
 */
public class JSErrorPage extends PageObject {

    public JSErrorPage(final boolean openPageURL) throws Exception {
        super(null, openPageURL ? SeleniumTestsContextManager.getThreadContext().getAppURL() :
                null);
    }
}
