/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.tests;

import static org.hamcrest.CoreMatchers.is;

import static com.seleniumtests.core.CustomAssertion.assertThat;

import org.testng.annotations.Test;

import com.seleniumtests.core.SeleniumTestPlan;

import com.seleniumtests.webpage.CalculatorScreen;

/**
 * Android app test suite.
 */
public class AndroidAppTest extends SeleniumTestPlan {

    /**
     * Adds two numbers using calculator program.
     */
    @Test(groups = {"addTwoNumbers"}, description = "Adds two numbers using calculator program")
    public void addTwoNumbers() throws Exception {

        CalculatorScreen calculatorScreen = new CalculatorScreen(true);
        String result = calculatorScreen.clickSymbol("2").clickSymbol("+").clickSymbol("4").clickSymbol("=")
                                        .getResultText();
        assertThat(result, is("6"));
    }
}
