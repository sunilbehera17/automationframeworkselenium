/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.tests;

import com.seleniumtests.core.Filter;
import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.dataobject.User;
import com.seleniumtests.util.SpreadSheetHelper;
import com.seleniumtests.util.internal.entity.TestEntity;
import com.seleniumtests.webpage.GoogleHomePage;
import com.seleniumtests.webpage.JSErrorPage;
import com.seleniumtests.webpage.LoginPage;
import com.seleniumtests.webpage.RegistrationPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

import static com.seleniumtests.core.CustomAssertion.assertThat;
import static org.hamcrest.CoreMatchers.is;


public class JSErrorTest extends SeleniumTestPlan {

    @Test(groups = {"jsErrorTest"},
            description = "jsErrorTest")
    public void jsErrorTest() throws Exception {

        new JSErrorPage(true);
    }

}
