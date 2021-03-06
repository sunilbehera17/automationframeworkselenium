/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.tests;

import static org.hamcrest.CoreMatchers.is;

import static com.seleniumtests.core.CustomAssertion.assertEquals;
import static com.seleniumtests.core.CustomAssertion.assertThat;
import static com.seleniumtests.core.CustomAssertion.assertTrue;

import org.testng.annotations.Test;

import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.core.TestLogging;

/**
 * Demonstrate test execution continues even though assertions fail.
 *
 * <p/>Date: 10/2/17 Time: 4:59 PM
 */
public class SoftAssertionTest extends SeleniumTestPlan {

    /**
     * Continues with test execution even though assertions fail.
     */
    @Test(groups = "softAssertionTest", description = "Continues with test execution even though assertions fail")
    public void softAssertionTest() {
        assertThat("selenium", is("selenium"));
        assertEquals(true, false, "boolean test failure");
        assertTrue(false, "another boolean test failure");
        assertEquals("selenium", "qtp", "universal test failure :)");
        assertTrue(1 == 1, "never fails");
        TestLogging.log(
            "This message is logged after initial assertion failures. Hence test execution continues even in the wake of test failures");
    }
}
