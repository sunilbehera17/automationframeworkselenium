/*
 * Copyright 2018 www.muvi.com
 */

package com.seleniumtests.driver;


/**
 * @author  Srikanta Kumar Sahoo <srikanta@muvi.com>
 */
public enum TestType {

    WEB("web"),
    APP("app"),
    NON_GUI("NonGUI"),
    APPIUM_WEB_ANDROID("appium_web_android"),
    APPIUM_WEB_IOS("appium_web_ios");

    String testType;

    TestType(final String testType) {
        this.testType = testType;
    }

    public String getTestType() {
        return testType;
    }

}
