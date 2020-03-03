/*
 * Copyright 2018 www.muvi.com
 */

package com.seleniumtests.browserfactory;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.seleniumtests.driver.DriverConfig;

public interface ICapabilitiesFactory {

    DesiredCapabilities createCapabilities(DriverConfig cfg);

}
