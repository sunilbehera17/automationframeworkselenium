/*
 * Copyright 2018 www.muvi.com
 */

package com.seleniumtests.customexception;

public class DriverExceptions extends RuntimeException {

    public DriverExceptions(final String message, final Throwable throwable) {
        super(message, throwable);
    }

}
