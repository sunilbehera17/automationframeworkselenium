/*
 * Copyright 2018 www.muvi.com
 */

package com.seleniumtests.core;

import org.testng.ITestContext;

public interface IContextAttributeListener {
    void load(ITestContext testNGCtx, SeleniumTestsContext seleniumTestsCtx);
}
