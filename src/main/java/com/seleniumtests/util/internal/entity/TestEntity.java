/*
 * Copyright 2018 www.muvi.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.util.internal.entity;

public class TestEntity {
    public static final String TEST_METHOD = "TestEntity.TestMethod";
    public static final String TEST_DP_TAGS = "TestEntity.TestTags";

    private String testCaseId = "";
    private String testMethod = "";

    public String getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(final String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String getTestMethod() {
        return testMethod;
    }

    public void setTestMethod(final String testMethod) {
        this.testMethod = testMethod;
    }

    public String toString() {
        return ("Test Attributes: [ TestCaseId: " + testCaseId) + " ]";
    }
}
