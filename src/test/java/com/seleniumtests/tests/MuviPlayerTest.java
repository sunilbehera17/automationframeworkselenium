/**
 * 
 */
package com.seleniumtests.tests;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniumtests.core.Filter;
import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.dataobject.MuviPlayerData;
import com.seleniumtests.util.SpreadSheetHelper;
import com.seleniumtests.util.internal.entity.TestEntity;
import com.seleniumtests.webpage.MuviPlayerPage;

/*

 * Copyright 2018 www.muvi.com

 */

/**

 * @author  Srikanta Kumar Sahoo <srikanta@muvi.com> 

seleniumtestsframework com.seleniumtests.tests 25-Jul-2018
 */
public class MuviPlayerTest extends SeleniumTestPlan{

	@DataProvider(
	        name = "MuviPlayerData",
	        parallel = false
	    )
	    public static Iterator<Object[]> getUserInfo(final Method m)
	        throws Exception {
	        Filter filter = Filter.equalsIgnoreCase(TestEntity.TEST_METHOD,
	                m.getName());

	        LinkedHashMap<String, Class<?>> classMap =
	            new LinkedHashMap<String, Class<?>>();
	        classMap.put("TestEntity", TestEntity.class);
	        classMap.put("MuviPlayerData", MuviPlayerData.class);

	        return SpreadSheetHelper.getEntitiesFromSpreadsheet(
	                MuviPlayerTest.class, classMap, "player_muvi.csv", filter);
	    }
	    
	    @Test(
	            groups = { "sanity ", "regression" },
	            dataProvider = "MuviPlayerData",
	            description = "Player Testcase"
	        )
	    
	        public void Player(final TestEntity testEntity,
	            final MuviPlayerData MuviPlayerData) throws Exception {

	            new MuviPlayerPage(true).player(MuviPlayerData);
	            
	            
	        }

}
