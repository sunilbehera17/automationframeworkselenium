package com.seleniumtests.tests;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniumtests.core.Filter;
import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.dataobject.AdviceData;
import com.seleniumtests.dataobject.WebCRMData;
import com.seleniumtests.util.SpreadSheetHelper;
import com.seleniumtests.util.internal.entity.TestEntity;
import com.seleniumtests.webpage.AdvicePage;
import com.seleniumtests.webpage.WebCRMPage;

public class WebCRMTest extends SeleniumTestPlan{
	
	@DataProvider(
	        name = "WebCRMData",
	        parallel = false
	    )
	    public static Iterator<Object[]> getUserInfo(final Method m)
	        throws Exception {
	        Filter filter = Filter.equalsIgnoreCase(TestEntity.TEST_METHOD,
	                m.getName());

	        LinkedHashMap<String, Class<?>> classMap =
	            new LinkedHashMap<String, Class<?>>();
	        classMap.put("TestEntity", TestEntity.class);
	        classMap.put("WebCRMData", WebCRMData.class);

	        return SpreadSheetHelper.getEntitiesFromSpreadsheet(
	                WebCRMTest.class, classMap, "webcrm.csv", filter);
	    }
	    
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "WebCRMData",
	            description = "Login in WebCRM "
	        )
	    
	        public void LoginInWebCRM(final TestEntity testEntity,
	            final WebCRMData WebCRMData) throws Exception {

	            new WebCRMPage(true).LoginInWebCRM(WebCRMData);
	            
	            
	        }

}
