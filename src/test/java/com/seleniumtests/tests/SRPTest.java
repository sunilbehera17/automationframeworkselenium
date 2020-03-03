package com.seleniumtests.tests;
import static com.seleniumtests.core.CustomAssertion.assertThat;
import com.seleniumtests.core.Filter;
import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.dataobject.SRPData;
import com.seleniumtests.dataobject.User;

import com.seleniumtests.util.SpreadSheetHelper;
import com.seleniumtests.util.internal.entity.TestEntity;

import com.seleniumtests.webpage.GoogleHomePage;

import com.seleniumtests.webpage.RegistrationPage;
import com.seleniumtests.webpage.SRPPage;
import com.seleniumtests.webpage.searchPage;

import static org.hamcrest.CoreMatchers.is;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class SRPTest extends SeleniumTestPlan{

	@DataProvider(
	        name = "srpData",
	        parallel = false
	    )
	    public static Iterator<Object[]> getUserInfo(final Method m)
	        throws Exception {
	        Filter filter = Filter.equalsIgnoreCase(TestEntity.TEST_METHOD,
	                m.getName());

	        LinkedHashMap<String, Class<?>> classMap =
	            new LinkedHashMap<String, Class<?>>();
	        classMap.put("TestEntity", TestEntity.class);
	        classMap.put("SRPData", SRPData.class);

	        return SpreadSheetHelper.getEntitiesFromSpreadsheet(
	                SRPTest.class, classMap, "srp.csv", filter);
	    }
	    
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "srpData",
	            description = "search with valid keyword"
	        )
	    
	        public void SRPFilter(final TestEntity testEntity,
	            final SRPData SRPData) throws Exception {

	            new SRPPage(true).searchPropertyType(SRPData);
	            assertThat("Properties tab is missing on SRP page!!!",
	                SRPPage.isBuyTabDisplayed(), is(true));

	        }

	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "srpData",
	            description = "search with valid keyword ,filter validation and srp textbox verification "
	        )
	    
	        public void SRPFilterPostedBy(final TestEntity testEntity,
	            final SRPData SRPData) throws Exception {

	            new SRPPage(true).searchBhk(SRPData);
	            assertThat("Properties tab is missing on SRP page!!!",
	                SRPPage.isBuyTabDisplayed(), is(true));

	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "srpData",
	            description = "search with valid keyword buy and rent both in SRP page"
	        )
	    
	        public void SRPFilterPostedByRent(final TestEntity testEntity,
	            final SRPData SRPData) throws Exception {

	            new SRPPage(true).searchPropertyTypeRent(SRPData);
	            assertThat("BUY tab is missing on SRP page!!!",
	                SRPPage.isBuyTabDisplayed(), is(true));

	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "srpData",
	            description = "SRP property list verification"
	        )
	    
	        public void SRPProperty(final TestEntity testEntity,
	            final SRPData SRPData) throws Exception {

	            new SRPPage(true).searchPropertyTypeVerifySeeOtherCharge(SRPData);
	            assertThat("Property tab is missing on Detail page!!!",
	                SRPPage.isPropertyDetailPageTabDisplayed(), is(true));

	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "srpData",
	            description = "SRP property type filter testing"
	        )
	    
	        public void SRPPropertyTypetest(final TestEntity testEntity,
	            final SRPData SRPData) throws Exception {

	            new SRPPage(true).searchPropertyTypeInSRP(SRPData);
	            assertThat("BUY tab is missing on SRP page!!!",
		            SRPPage.isBuyTabDisplayed(), is(true));
	        }
}
