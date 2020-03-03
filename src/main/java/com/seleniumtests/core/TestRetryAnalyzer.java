/*
 * Copyright 2018 www.muvi.com
 */

package com.seleniumtests.core;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRetryAnalyzer implements IRetryAnalyzer {

    public int getCount() {
        return count;
    }

    public static final int MAX_RETRY_COUNT = 0;

    private int count = MAX_RETRY_COUNT;

    private boolean isRetryAvailable() {
        return (count > 0);
    }

    public void resetCount() {
        count = MAX_RETRY_COUNT;
    }

    @Override
    public boolean retry(final ITestResult result) {
        boolean retry = false;
        if (isRetryAvailable()) {
            TestLogging.log("<br> Going to retry test case: " + result.getMethod() + ", " + (MAX_RETRY_COUNT - count + 1) + " out of " + MAX_RETRY_COUNT + "</br>");
            retry = true;
            count = count-1;
        }
        return retry;
    }
}
