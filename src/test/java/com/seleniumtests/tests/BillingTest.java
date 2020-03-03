package com.seleniumtests.tests;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniumtests.core.Filter;
import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.dataobject.BillingData;
import com.seleniumtests.util.SpreadSheetHelper;
import com.seleniumtests.util.internal.entity.TestEntity;
import com.seleniumtests.webpage.BillingPage;

public class BillingTest extends SeleniumTestPlan{
	
	@DataProvider(
	        name = "BillingData",
	        parallel = false
	    )
	    public static Iterator<Object[]> getUserInfo(final Method m)
	        throws Exception {
	        Filter filter = Filter.equalsIgnoreCase(TestEntity.TEST_METHOD,
	                m.getName());

	        LinkedHashMap<String, Class<?>> classMap =
	            new LinkedHashMap<String, Class<?>>();
	        classMap.put("TestEntity", TestEntity.class);
	        classMap.put("BillingData", BillingData.class);

	        return SpreadSheetHelper.getEntitiesFromSpreadsheet(
	                BillingTest.class, classMap, "billing.csv", filter);
	    }
	    
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "BillingData",
	            description = "Verify the All content subscription plan in CMS"
	        )
	    
	        public void TC_SubscriptionReg_01(final TestEntity testEntity,final BillingData BillingData) throws Exception {

	            new BillingPage(true).TC_SubscriptionReg_01(BillingData);
	            
	            
	        }
	    
	    @Test(
	    		
	            groups = { "sanity", "regression" },
	            dataProvider = "BillingData",
	            description = "Verify that an End User is able to register by taking up an All content subscription plan."
	        )
	    
	        public void TC_SubscriptionReg_02(final TestEntity testEntity,final BillingData BillingData) throws Exception {

	            new BillingPage(true).TC_SubscriptionReg_02(BillingData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "BillingData",
	            description = "Verify the User Subscription purchase details displaying in the Purchase History page"
	        )
	    
	        public void TC_SubscriptionReg_03(final TestEntity testEntity,final BillingData BillingData) throws Exception {

	            new BillingPage(true).TC_SubscriptionReg_03(BillingData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "BillingData",
	            description = "Verify the User Subscription purchase details in pdf format in the View Invoice page"
	        )
	    
	        public void TC_SubscriptionReg_04(final TestEntity testEntity,final BillingData BillingData) throws Exception {

	            new BillingPage(true).TC_SubscriptionReg_04(BillingData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "BillingData",
	            description = "Verify the My Plans page"
	        )
	    
	        public void TC_SubscriptionReg_05(final TestEntity testEntity,final BillingData BillingData) throws Exception {

	            new BillingPage(true).TC_SubscriptionReg_05(BillingData);
	            
	            
	        }
//	    @Test(
//	            groups = { "sanity", "regression" },
//	            dataProvider = "BillingData",
//	            description = "Verify the My Plans page"
//	        )
//	    
//	        public void TC_SubscriptionReg_06(final TestEntity testEntity,final BillingData BillingData) throws Exception {
//
//	            new BillingPage(true).TC_SubscriptionReg_06(BillingData);
//	            
//	            
//	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "BillingData",
	            description = "Verify the Subscription is disabled in CMS"
	        )
	    
	        public void TC_SubscriptionReg_07(final TestEntity testEntity,final BillingData BillingData) throws Exception {

	            new BillingPage(true).TC_SubscriptionReg_07(BillingData);
	            
	            
	        }
	  
}


