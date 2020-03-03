package com.seleniumtests.tests;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniumtests.core.Filter;
import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.dataobject.MuviData;
import com.seleniumtests.util.SpreadSheetHelper;
import com.seleniumtests.util.internal.entity.TestEntity;
import com.seleniumtests.webpage.MuviPage;

public class MuviTest extends SeleniumTestPlan{
	
	@DataProvider(
	        name = "MuviData",
	        parallel = false
	    )
	    public static Iterator<Object[]> getUserInfo(final Method m)
	        throws Exception {
	        Filter filter = Filter.equalsIgnoreCase(TestEntity.TEST_METHOD,
	                m.getName());

	        LinkedHashMap<String, Class<?>> classMap =
	            new LinkedHashMap<String, Class<?>>();
	        classMap.put("TestEntity", TestEntity.class);
	        classMap.put("MuviData", MuviData.class);

	        return SpreadSheetHelper.getEntitiesFromSpreadsheet(
	                MuviTest.class, classMap, "muvi.csv", filter);
	    }
	    
//	    @Test(
//	            groups = { "sanity", "regression" },
//	            dataProvider = "MuviData",
//	            description = "Login in Muvi Admin"
//	        )
//	    
//	        public void LoginInMuviAdmin(final TestEntity testEntity,
//	            final MuviData MuviData) throws Exception {
//
//	            new MuviPage(true).LoginInMuviAdmin(MuviData);
//	            
//	            
//	        }
	    @Test(
	            groups = { "sanity ", "regression" },
	            dataProvider = "MuviData",
	            description = "TC_PPV_001 Verify that an End User is able to register by taking up an All content subscription plan."
	        )
	    
	        public void Register_Taking_Up_All_Content_Subscription_Plan(final TestEntity testEntity,
	            final MuviData MuviData) throws Exception {

	            new MuviPage(true).Register_Taking_Up_All_Content_Subscription_Plan(MuviData);
	            
	            
	        }
	    
	   @Test(
	            groups = { "sanity ", "regression" },
	            dataProvider = "MuviData",
	            description = "TC_PPV_002 Verify that an End User is able to register when subscription is not enabled for the customer store."
	        )
	    
	        public void Register_Subscription_Notenabled(final TestEntity testEntity,
	            final MuviData MuviData) throws Exception {

	            new MuviPage(true).Register_Subscription_Notenabled(MuviData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity ", "regression" },
	            dataProvider = "MuviData",
	            description = "TC_PPV_003 Purchase a Single Part content.(From Category listing Page)"
	        )
	    
	        public void Purchase_Single_Part_Content(final TestEntity testEntity,
	            final MuviData MuviData) throws Exception {

	            new MuviPage(true).Purchase_Single_Part_Content(MuviData);
	            
	            
	        }
	  
}


