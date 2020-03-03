package com.seleniumtests.tests;

import static com.seleniumtests.core.CustomAssertion.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniumtests.core.Filter;
import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.dataobject.AdviceData;
import com.seleniumtests.dataobject.SRPData;
import com.seleniumtests.util.SpreadSheetHelper;
import com.seleniumtests.util.internal.entity.TestEntity;
import com.seleniumtests.webpage.AdvicePage;
import com.seleniumtests.webpage.SRPPage;

public class AdviceTest extends SeleniumTestPlan{
	

	@DataProvider(
	        name = "AdviceData",
	        parallel = false
	    )
	    public static Iterator<Object[]> getUserInfo(final Method m)
	        throws Exception {
	        Filter filter = Filter.equalsIgnoreCase(TestEntity.TEST_METHOD,
	                m.getName());

	        LinkedHashMap<String, Class<?>> classMap =
	            new LinkedHashMap<String, Class<?>>();
	        classMap.put("TestEntity", TestEntity.class);
	        classMap.put("AdviceData", AdviceData.class);

	        return SpreadSheetHelper.getEntitiesFromSpreadsheet(
	                AdviceTest.class, classMap, "advice.csv", filter);
	    }
	    
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "AdviceData",
	            description = "search with valid keyword in Explore a locality"
	        )
	    
	        public void AdviceExploreAlocality(final TestEntity testEntity,
	            final AdviceData AdviceData) throws Exception {

	            new AdvicePage(true).ExploreAlocalityInAdvice(AdviceData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "AdviceData",
	            description = "search with valid keyword in Compare  locality"
	        )
	    
	        public void ComparelocalityInAdvice(final TestEntity testEntity,
	            final AdviceData AdviceData) throws Exception {

	            new AdvicePage(true).ComparelocalityInAdvice(AdviceData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "AdviceData",
	            description = "search with valid keyword in Compare  Project"
	        )
	    
	        public void CompareProjectInAdvice(final TestEntity testEntity,
	            final AdviceData AdviceData) throws Exception {

	            new AdvicePage(true).CompareProjectInAdvice(AdviceData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "AdviceData",
	            description = "search with valid keyword in Smart Search"
	        )
	    
	        public void SmartSearchInAdvice(final TestEntity testEntity,
	            final AdviceData AdviceData) throws Exception {

	            new AdvicePage(true).SmartSearchInAdvice(AdviceData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "AdviceData",
	            description = "search with valid keyword in Smart Search with select invest checkbox"
	        )
	    
	        public void SmartSearchInvestInAdvice(final TestEntity testEntity,
	            final AdviceData AdviceData) throws Exception {

	            new AdvicePage(true).SmartSearchInvestInAdvice(AdviceData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "AdviceData",
	            description = "search with valid keyword in invest smart"
	        )
	    
	        public void InvestSmartInAdvice(final TestEntity testEntity,
	            final AdviceData AdviceData) throws Exception {

	            new AdvicePage(true).InvestSmartInAdvice(AdviceData);
	            
	            
	        }
	    @Test(
	            groups = { "sanity", "regression" },
	            dataProvider = "AdviceData",
	            description = "search with valid keyword in Loan Calculator"
	        )
	    
	        public void LoanCalculatorInAdvice(final TestEntity testEntity,
	            final AdviceData AdviceData) throws Exception {

	            new AdvicePage(true).LoanCalculatorInAdvice(AdviceData);
	            
	            
	        }

   @Test(
           groups = { "sanity", "regression" },
           dataProvider = "AdviceData",
           description = "search with valid keyword in Loan Calculator EMI"
       )
   
       public void LoanCalculatorEMIInAdvice(final TestEntity testEntity,
           final AdviceData AdviceData) throws Exception {

           new AdvicePage(true).LoanCalculatorEMIInAdvice(AdviceData);
           
           
       }

   @Test(
           groups = { "sanity", "regression" },
           dataProvider = "AdviceData",
           description = "search with valid keyword in Loan Calculator Pre Payment"
       )
   
       public void LoanCalculatorPrePaymentInAdvice(final TestEntity testEntity,
           final AdviceData AdviceData) throws Exception {

           new AdvicePage(true).LoanCalculatorPrePaymentInAdvice(AdviceData);
           
           
       }
   @Test(
           groups = { "sanity", "regression" },
           dataProvider = "AdviceData",
           description = "search with valid keyword in Loan Calculator RateChange"
       )
   
       public void LoanCalculatorRateChangeInAdvice(final TestEntity testEntity,
           final AdviceData AdviceData) throws Exception {

           new AdvicePage(true).LoanCalculatorRateChangeInAdvice(AdviceData);
           
           
       }

   @Test(
           groups = { "sanity", "regression" },
           dataProvider = "AdviceData",
           description = "Verify rate&trends visible in advice page"
       )
   
       public void RateandTrendsSectionInAdvice(final TestEntity testEntity,
           final AdviceData AdviceData) throws Exception {

           new AdvicePage(true).RateandTrendsSectionInAdvice(AdviceData);
           
           
       }
   @Test(
           groups = { "sanity", "regression" },
           dataProvider = "AdviceData",
           description = "Verify forum functionality in advice page"
       )
   
       public void ForumSectionInAdvice(final TestEntity testEntity,
           final AdviceData AdviceData) throws Exception {

           new AdvicePage(true).ForumSectionInAdvice(AdviceData);
           
           
       }
   @Test(
           groups = { "sanity", "regression" },
           dataProvider = "AdviceData",
           description = "Verify  finance in advice page"
       )
   
       public void FinanceSectionInAdvice(final TestEntity testEntity,
           final AdviceData AdviceData) throws Exception {

           new AdvicePage(true).FinanceSectionInAdvice(AdviceData);
           
           
       }
   @Test(
           groups = { "sanity", "regression" },
           dataProvider = "AdviceData",
           description = "Verify  Home Buying Guide in advice page"
       )
   
       public void HomeBuyingGuideInAdvice(final TestEntity testEntity,
           final AdviceData AdviceData) throws Exception {

           new AdvicePage(true).HomeBuyingGuideInAdvice(AdviceData);
           
           
       }
   @Test(
           groups = { "sanity", "regression" },
           dataProvider = "AdviceData",
           description = "Verify  Research Report in advice page"
       )
   
       public void ResearchReportInAdvice(final TestEntity testEntity,
           final AdviceData AdviceData) throws Exception {

           new AdvicePage(true).ResearchReportInAdvice(AdviceData);
           
           
       }

}
