package com.seleniumtests.webpage;

import static com.seleniumtests.core.CustomAssertion.assertThat;
import static com.seleniumtests.core.Locator.*;
import static org.hamcrest.CoreMatchers.is;

import org.openqa.selenium.By;

import static com.seleniumtests.core.CustomAssertion.*;

import org.testng.Assert;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.AdviceData;
import com.seleniumtests.dataobject.SRPData;
import com.seleniumtests.webelements.*;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;

public class AdvicePage extends PageObject{
	
	public static String getTextElement = "";
	public static String getTextElement1 = "";
	public static String url = "";
	
	public static boolean booleanvalue = false;
	
	
	private static final TextFieldElement ExploreAlocalityTextbox = new TextFieldElement("Explore a locality ",
			locateByCSSSelector("#locExplore"));
	private static final ButtonElement ClickText = new ButtonElement("Select location",
    		locateByXPath("//*[@id='locality_suggest']/div[2]"));
	private static final ButtonElement ClickTextSuggestionBox = new ButtonElement("Select location",
    		locateByXPath("//*[@id='locality_suggest']"));
	private static final ButtonElement ClickTextLocalityCompareOne = new ButtonElement("Select location",
    		locateByXPath("//*[@id='keyword_suggestOne']/div[2]"));
	private static final ButtonElement LocalityCompareOneSuggesionBox = new ButtonElement("Select location",
    		locateByXPath("//*[@id='keyword_suggestOne']"));
	private static final ButtonElement GetTextLocalityCompareOne = new ButtonElement("Get Text location one",
    		locateByXPath("//*[@id='compareHeadSec1']"));
	private static final ButtonElement GetTextLocalityCompareTwo = new ButtonElement("Get Text location one",
    		locateByXPath("//*[@id='compareHeadSec2']"));
	private static final ButtonElement GetTextLocalityCompareThree = new ButtonElement("Get Text location one",
    		locateByXPath("//*[@id='compareHeadSec3']"));
	private static final ButtonElement GetTextAddLocalityCompareThree = new ButtonElement("Get Text location one",
    		locateByXPath("//*[@id='project_3']/a"));
	
	private static final ButtonElement AddToCompare = new ButtonElement("Get Text location one",
    		locateByXPath("(//a[@class='addToComBtn'])[3]"));
	private static final ButtonElement DeleteFromCompare = new ButtonElement("Get Text location one",
    		locateByXPath("//*[@id='compareCol_3_1']/div[2]/a"));
	
	private static final ButtonElement GetTextProjectCompareOne = new ButtonElement("Get Text location one",
    		locateByXPath("//*[@id='compareHeadSec1']"));
	private static final ButtonElement LoanCalculatorEMI = new ButtonElement("Loan calculator emi button",
    		locateByXPath("//*[@id='emiCalcId']/div[1]"));
	private static final ButtonElement LoanCalculatorPrePayment = new ButtonElement("Loan calculator pre payment button",
    		locateByXPath("//*[@id='prepayId']/div[1]"));
	private static final ButtonElement LoanCalculatorRateChange = new ButtonElement("Loan calculator rate change button",
    		locateByXPath("//*[@id='rtChangeId']/div[1]"));
	
	
	private static final ButtonElement GetTextProjectCompareTwo = new ButtonElement("Get Text location one",
    		locateByXPath("//*[@id='compareHeadSec2']"));
	private static final ButtonElement GetTextProjectCompareThree = new ButtonElement("Get Text location one",
    		locateByXPath("//*[@id='compareHeadSec3']"));

	private static final ButtonElement ClickTextLocalityCompareTwo = new ButtonElement("Select location",
    		locateByXPath("//*[@id='keyword_suggestTwo']/div[2]"));
	private static final ButtonElement LocalityCompareTwoSuggesionBox = new ButtonElement("Get Text location two",
    		locateByXPath("//*[@id='keyword_suggestTwo']"));
	private static final ButtonElement LocalityCompareBetweenOneAndTwo = new ButtonElement("Click compare Button",
    		locateByXPath("(//*[@class='propertyType searchBtn'])[2]"));
	private static final ButtonElement ProjectCompareBetweenOneAndTwo = new ButtonElement("Click compare Button",
    		locateByXPath("(//*[@class='propertyType searchBtn'])[3]"));
	private static final ButtonElement FindOptionInsmartSearch = new ButtonElement("Click compare Button",
    		locateByXPath("(//*[@class='propertyType searchBtn'])[4]"));
	private static final ButtonElement ClickOnExplore = new ButtonElement("Click Explore Button",
    		locateByXPath("//*[@id='exploreSection']/div/div[2]/div[1]/div[2]/input"));
	private static final ButtonElement LoanCalculatorApplyForLoan = new ButtonElement("Click apply for loan button",
    		locateByXPath("(//*[@id='loanApplyDiv']/a)[1]"));
	private static final ButtonElement LoanCalculatorForum = new ButtonElement("Click apply for loan button",
    		locateByXPath("//*[@class='loanForumDisBannWrap']/a"));
	private static final ButtonElement LoanCalculatorApplyForLoanEMI = new ButtonElement("Click apply for loan button in emi section",
    		locateByXPath("//*[@id='emiResultSection']/div[3]/a"));
	private static final ButtonElement LoanCalculatorNewPageHomeLOanHeader = new ButtonElement("Home loan header",
    		locateByXPath("//*[@id='hlForm']/div[2]/div/div[1]"));
	private static final ButtonElement LoanCalculatorForumHeader = new ButtonElement("Home loan header",
    		locateByXPath("//*[@class='logoCont']/a"));
	private static final ButtonElement LoanCalculatorClickResetAll = new ButtonElement("Home loan calculator  resetall",
    		locateByXPath("//*[@id='loanEligibilityCalc']/div/div[1]/div[6]/div[2]/span/a"));
	private static final ButtonElement LoanCalculatorClickResetAllEMI = new ButtonElement("Home loan calculator  resetall",
    		locateByXPath("//*[@id='emiCalculator']/div/div[1]/div[4]/div[2]/span/a"));
	private static final ButtonElement LoanCalculatorClickResetAllPrePayment = new ButtonElement("Home loan Pre Payment  resetall",
    		locateByXPath("//*[@id='prepaymentCalculator']/div/div[1]/div[6]/div[2]/span/a"));
	private static final ButtonElement LoanCalculatorClickResetAllRateChange = new ButtonElement("Home loan Rate Change  resetall",
    		locateByXPath("//*[@id='rateChangeCalculator']/div/div[1]/div[7]/div[2]/span/a"));
	private static final HtmlElement LoanCalculatorScrollTo = new HtmlElement("Home loan Pre Payment  resetall",
    		locateByXPath("(//*[@class='formRow'])[6]"));
	
	private static final ButtonElement GetTextExplore = new ButtonElement("Click Explore Button",
			locateByCSSSelector(".locAddress"));

	private static final ButtonElement ExploreAlocality = new ButtonElement("Explore a locality",
			locateByCSSSelector(".navigationBlock [href=\"#exploreSection\"]"));
	private static final ButtonElement Comparelocality = new ButtonElement("Compare locality",
			locateByCSSSelector(".navigationBlock [href=\"#compareSectionWrapper\"]"));
	private static final ButtonElement SmartSearch = new ButtonElement("SmartSearch",
			locateByCSSSelector(".navigationBlock [href=\"#smartSearchSection\"]"));
	private static final ButtonElement InvestSmart = new ButtonElement("Invest Smart",
			locateByCSSSelector(".navigationBlock [href=\"#investSmart\"]"));
	private static final ButtonElement LoanCalculators = new ButtonElement("LoanCalculators",
			locateByCSSSelector(".navigationBlock [href=\"#homeLoanSection\"]"));
	private static final ButtonElement RateAndTrends = new ButtonElement("RateAndTrends",
			locateByCSSSelector(".navigationBlock [href=\"#ratesTrendsLinkSec\"]"));
	private static final ButtonElement Forum = new ButtonElement("Forum",
			locateByCSSSelector(".navigationBlock [href=\"#qnaSection\"]"));
	private static final ButtonElement More = new ButtonElement("More",
			locateByCSSSelector("#moreDDLi"));
	private static final ButtonElement Finance = new ButtonElement("More Finance",
			locateByCSSSelector("#financialAdviceSectionLi"));
	private static final ButtonElement Legal = new ButtonElement("More Legal",
			locateByCSSSelector("#legalAdviceSectionLi"));
	private static final ButtonElement HomeBuyingGuide = new ButtonElement("More HomeBuyingGuide",
			locateByCSSSelector("#homeBuyingSectionLi"));
	private static final ButtonElement ResearchReport = new ButtonElement("More Research Report",
			locateByCSSSelector("#researchSectionLi"));
	private static final ButtonElement GuruTalk = new ButtonElement("More GuruTalk",
			locateByCSSSelector("#expOnlineSliderTopLi"));
	private static final ButtonElement PropertyNews = new ButtonElement("More Property News",
			locateByCSSSelector("#propertyNewsSectionLi"));
	private static final TextFieldElement LocalityOneTextbox = new TextFieldElement(" Enter locality one",
			locateByCSSSelector("#locOne"));
	private static final TextFieldElement LocalityTwoTextbox = new TextFieldElement("Enter locality two ",
			locateByCSSSelector("#locTwo"));
	private static final TextFieldElement ProjectOneTextbox = new TextFieldElement(" Enter locality one",
			locateByCSSSelector("#prjOne"));
	private static final TextFieldElement ProjectTwoTextbox = new TextFieldElement("Enter locality two ",
			locateByCSSSelector("#prjTwo"));
	private static final HtmlElement projectCheckBox = new HtmlElement("Select project check box",
    		locateByXPath("//input[@id='projectsRD']"));
	private static final HtmlElement investCheckBox = new HtmlElement("Select project check box",
    		locateByXPath("//*[@id='investmentRD']"));
	private static final HtmlElement investSmartScreen = new HtmlElement("Select project check box",
    		locateByXPath("//*[@id='snapshotSlider']/li/img"));
	
	private static final SelectList SmartSearchList = new SelectList("Select FromList",
    		locateByXPath("//*[@id='smartSearchCityLbl']"));
	private static final SelectList RateAndTrendsList = new SelectList("Select FromList",
    		locateByXPath("html/body/div[1]/div[2]/div/span"));
	private static final ButtonElement RateAndTrendsButton = new ButtonElement("Select FromList",
    		locateByXPath("html/body/div[1]/div[2]/div/span"));
	private static final ButtonElement ExploreMoreTrendButton = new ButtonElement("Select FromList",
    		locateByXPath("//*[@id='ratesTrendsAvgId']/div[4]/a"));
	private static final ButtonElement NextPageExploreMoreTrendButton = new ButtonElement("Select FromList",
    		locateByXPath("//*[@id='citylocalityTrends']"));
	
	
	
	
	private static final ButtonElement SmartSearchBudgetPerSQft = new ButtonElement("Click budget per square feet",
    		locateByXPath("//*[@id='rent_budget_lbl']"));
	private static final ButtonElement RateAndTrendsImage = new ButtonElement("Click budget per square feet",
    		locateByXPath("//*[@class='ratesTrendsAvgHeading']"));
	
	private static final ButtonElement ForumSearch = new ButtonElement("Forum Search",
    		locateByXPath("//*[@id='popularCitiesSearchWrap']/div[1]/div[2]/input"));
	private static final ButtonElement ForumSearchNextPage = new ButtonElement("Forum search next page",
    		locateByXPath("//*[@id='searchInput']"));
	private static final ButtonElement FirstPopularCityForum = new ButtonElement("Forum first popular city",
    		locateByXPath("//*[@id='popularCitiesWrap']/div[1]/ul/li[1]/a"));
	private static final ButtonElement FirstPopularCityForumNextPageHeader = new ButtonElement("Forum first popular city next page header",
    		locateByXPath("//*[@id='headerDiv']/div[1]/div/div[2]/div[2]/div/span"));
	private static final ButtonElement SeeAllInHomeLoanHelp = new ButtonElement("See All In HomeLoan Help",
    		locateByXPath("//*[@id='financialAdviceSection']/div/div[2]/div[1]/a/div"));
	private static final ButtonElement SeeAllInHomeLoanHelpNextPage = new ButtonElement("See All In HomeLoan Help Next Page",
    		locateByXPath("//*[@id='homeLoanCalcSection']/div"));
	private static final ButtonElement FinanceBuyinghelp = new ButtonElement(" Finance Buying help",
    		locateByXPath("//*[@id='financialAdviceSection']/div/div[2]/div[2]/ul/li[1]/a/div[3]"));
	private static final ButtonElement FinanceBuyinghelpNextPage = new ButtonElement(" Finance Buying help next page",
    		locateByXPath("//*[@id='manageFinanceSection']/div[2]"));
	
	private static final ButtonElement BuyVsRent = new ButtonElement(" Buy Vs Rent",
    		locateByXPath("//*[@id='financialAdviceSection']/div/div[2]/div[2]/ul/li[2]/a/div[3]"));
	private static final ButtonElement BuyVsRentNextPage = new ButtonElement(" Buy Vs Rent next page",
    		locateByXPath("//*[@id='buyVsRentCalcSection']/div/div"));
	private static final ButtonElement ReturnOnInvestMent = new ButtonElement(" Return On InvestMent",
    		locateByXPath("//*[@id='financialAdviceSection']/div/div[2]/div[2]/ul/li[3]/a/div[3]"));
	private static final ButtonElement ReturnOnInvestMentNextPage = new ButtonElement(" Return On InvestMent next page",
    		locateByXPath("//*[@id='roiSection']/div[1]"));
	private static final ButtonElement PropWorth = new ButtonElement("PropWorth",
    		locateByXPath("//*[@id='financialAdviceSection']/div/div[2]/div[2]/ul/li[4]/a/div[3]"));
	private static final ButtonElement PropWorthNextPage = new ButtonElement(" PropWorth next page",
    		locateByXPath("//*[@id='wrapper']/div[1]/div[3]/div/div[2]"));
	private static final ButtonElement HomeBuyingGuideReadMore = new ButtonElement(" Home Buying Guide Read More ",
    		locateByXPath("//*[@id='chapter1']/div[4]/a"));
	private static final ButtonElement HomeBuyingGuideReadNextPage = new ButtonElement(" Home Buying Guide Read next page ",
    		locateByXPath("html/body/div[1]/div[3]"));
	private static final ButtonElement HomeBuyingGuideReadFullGuide = new ButtonElement(" Home Buying Guide Read Full Guide ",
    		locateByXPath("//*[@id='homeBuyingSection']/div/div[2]/div[2]/a"));
	private static final ButtonElement HomeBuyingGuideReadFullGuideNextPage = new ButtonElement(" Home Buying Guide Read Full Guide next page",
    		locateByXPath("html/body/header[2]/div/div/h1"));
	private static final ButtonElement HouseIndexingSentiment = new ButtonElement(" HouseIndexingSentiment",
    		locateByXPath("//*[@id='researchData']/div/ul/li[1]/a/div[2]/div[2]"));
	private static final ButtonElement HouseIndexingSentimentNextPage = new ButtonElement(" HouseIndexingSentiment next Page",
    		locateByXPath("//*[@id='jquery-demo']"));
	
	private static final ButtonElement PropIndex = new ButtonElement(" PropIndex",
    		locateByXPath("//*[@id='researchData']/div/ul/li[2]/a/div[2]/div[2]"));
	private static final ButtonElement PropIndexNextPage = new ButtonElement(" PropIndex NextPage",
    		locateByXPath("html/body/header[2]/div/div/h1"));
	
	private static final TextFieldElement MinBudgetSearchList = new TextFieldElement("Select FromList",
    		locateByXPath("//*[@id='rangeMinLinkbudgetPerSqftinput']"));
	private static final TextFieldElement MaxBudgetSearchList = new TextFieldElement("Select FromList",
    		locateByXPath("//*[@id='rangeMaxLinkbudgetPerSqftinput']"));
	private static final ButtonElement SmartSearchInputSearchLocation = new ButtonElement("Click budget per square feet",
    		locateByXPath("//*[@id='inputsearchLoc']"));
	private static final ButtonElement SmartSearchInputTypeSearchLocation = new ButtonElement("Click budget per square feet",
    		locateByXPath("//*[@id='inputuseType']"));
	private static final TextFieldElement LoanCalculatorLoanAmountTextbox = new TextFieldElement("Explore a locality ",
			locateByCSSSelector("#lalec"));
	private static final TextFieldElement ForumTextbox = new TextFieldElement("Explore a locality ",
			locateByCSSSelector("#qnaSearchId"));

	private static final TextFieldElement LoanCalculatorLoanAmountTextboxEMI = new TextFieldElement("Explore a locality ",
			locateByCSSSelector("#amountRequired"));
	
	private static final TextFieldElement LoanCalculatorPrePaymentTextbox = new TextFieldElement("Explore a locality ",
			locateByCSSSelector("#lalpc"));
	private static final TextFieldElement LoanCalculatorRateChangeTextbox = new TextFieldElement("Explore a locality ",
			locateByCSSSelector("#larcc"));

	private static final ButtonElement SmartSearchInputTypeSearchTypeLocation = new ButtonElement("Click budget per square feet",
    		locateByXPath("(//*[@class='radioBtnWrap']/label[1])[2]"));
	private static final ButtonElement SmartSearchInputTypeSearchTypeInvestLocation = new ButtonElement("Click budget per square feet",
    		locateByXPath("(//*[@class='radioBtnWrap']/label[2])[2]"));
	private static final ButtonElement SmartSearchInputBudgetPerSQft = new ButtonElement("Click budget per square feet",
    		locateByXPath("//*[@id='inputbudgetPerSqft']"));
	private static final ButtonElement LoanCalculatorCheckEligibilityButton = new ButtonElement("Loan eligibility button",
			locateByCSSSelector(".btnAdvFinance"));
	private static final ButtonElement LoanCalculatorCalculateEMIButton = new ButtonElement("calculate emi button",
			locateByXPath("//*[@id='emiCalculator']/div/div[1]/div[4]/div[2]/input"));
	private static final ButtonElement LoanCalculatorLoanAmountResult = new ButtonElement("More",
			locateByCSSSelector("#loanAmtResultDiv"));
	
	 public AdvicePage SelectprojectCheckBox() throws Exception {
		    projectCheckBox.simulateClick();
	    	
	        return this;
	    }
	 public AdvicePage ClickApplyForLoan() throws Exception {
		 LoanCalculatorApplyForLoan.simulateClick();
	    	
	        return this;
	    }
	 public AdvicePage ClickForumButton() throws Exception {
		 LoanCalculatorForum.simulateClick();
	    	
	        return this;
	    }
	 
	 public AdvicePage ClickApplyForLoanEMI() throws Exception {
		 wait(2);
		 LoanCalculatorApplyForLoanEMI.simulateClick();
	    	
	        return this;
	    }
	
	 public AdvicePage SelectinvestCheckBox() throws Exception {
		    investCheckBox.simulateClick();
		    //investCheckBox.click();
	    	
	        return this;
	    }
	 public AdvicePage ClickLoanCalculatorCheckEligibilityButton() throws Exception {
		 LoanCalculatorCheckEligibilityButton.simulateClick();
		    
	    	
	        return this;
	    }
	 public AdvicePage ClickLoanCalculatorCalculateEMIButton() throws Exception {
		 LoanCalculatorCalculateEMIButton.click();
		    
	    	
	        return this;
	    }
	 public AdvicePage IsDisplayinvestSmartScreen() throws Exception {
		 wait(3);
		 booleanvalue = investSmartScreen.isDisplayed();
		 return this;
	    }
	 public AdvicePage selectSmartSearchList() throws Exception {
		 
		 SmartSearchList.click();
	    	
	        return this;
	    }
 public AdvicePage ClickLoanCalculatorEMI() throws Exception {
		 
	 LoanCalculatorEMI.simulateClick();
	    	
	        return this;
	    }
 public AdvicePage ClickLoanCalculatorPrePayment() throws Exception {
	 
	 LoanCalculatorPrePayment.simulateClick();
	    	
	        return this;
	    }
 public AdvicePage ClickLoanCalculatorRateChange() throws Exception {
	 
	 LoanCalculatorRateChange.simulateClick();
	    	
	        return this;
	    }
	 
 public AdvicePage ClickResetAllLoanCalculator() throws Exception {
		 
	 LoanCalculatorClickResetAll.simulateClick();
	    	
	        return this;
	    }
 public AdvicePage ClickResetAllLoanCalculatorEMI() throws Exception {
	 
	 LoanCalculatorClickResetAllEMI.click();
	    	
	        return this;
	    }
public AdvicePage ClickResetAllLoanCalculatorPrePayment() throws Exception {
	 
	LoanCalculatorClickResetAllPrePayment.simulateClick();
	    	
	        return this;
	    }
public AdvicePage ClickResetAllLoanCalculatorRateChange() throws Exception {
	 
	LoanCalculatorClickResetAllRateChange.simulateClick();
	    	
	        return this;
	    }
	 
	 
     public AdvicePage selectList(SelectList list,String string) throws Exception {
		 
	 list.selectByText(string);
	 
	    	
	 return this;
	    }
     public AdvicePage selectListBudgetMin(String string) throws Exception {
    	   
    		wait(2);
    	    SmartSearchBudgetPerSQft.click();	 
    	    wait(2);
    	    MinBudgetSearchList.clearAndType(string);
    	   	
    	return this;
    	   }
     public AdvicePage selectLoanAmount(String string) throws Exception {
  	   
 		
 	    wait(2);
 	   LoanCalculatorLoanAmountTextbox.clearAndType(string);
 	   	
 	return this;
 	
 	   }
     public AdvicePage selectLoanAmountEMI(String string) throws Exception {
    	   
  		
  	    wait(2);
  	   LoanCalculatorLoanAmountTextboxEMI.clearAndType(string);
  	   	
  	return this;
  	
  	   }
   

public AdvicePage selectCityRateAndTrends(String string) throws Exception {
	   
		
	    wait(2);
	   driver.findElement(By.xpath("//*[@class='ratesCityDrop']/ul/li[text()='"+string+"']")).click();
	   	
	return this;
	
	   }
     public AdvicePage selectLoanAmountPrePayment(String string) throws Exception {
  	   
   		
   	    wait(2);
   	 LoanCalculatorPrePaymentTextbox.clearAndType(string);
   	   	
   	return this;
   	
   	   }
     public AdvicePage EnterTextFieldElement(TextFieldElement element,String string) throws Exception {
    	   
    		
    	    wait(2);
    	 element.clearAndType(string);
    	   	
    	return this;
    	
    	   }
     
     public AdvicePage selectLoanAmountRateChange(String string) throws Exception {
  	   
   		
   	    wait(2);
   	 LoanCalculatorRateChangeTextbox.clearAndType(string);
   	   	
   	return this;
   	
   	   }
     public AdvicePage selectListBudgetMax(String string) throws Exception {
 		
 	    try {
 	    wait(2);
 	    MaxBudgetSearchList.clearAndType(string);
 	    }catch(Exception e) {
 	    	
 	    }
 	   	
 	return this;
 	   }
 
     
	public AdvicePage(final boolean openPageURL) throws Exception {
	        super(ExploreAlocalityTextbox, openPageURL ? SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
	    }

	
	public AdvicePage ExploreAlocalityTextbox(final String explorealocalityText) throws Exception {
		ExploreAlocalityTextbox.clearAndType(explorealocalityText);
	    return this;
    }  
	public AdvicePage localityOneTextbox(final String localityOneTextbox) throws Exception {
		wait(2);
		LocalityOneTextbox.clearAndType(localityOneTextbox);
	    return this;
    }  
	public AdvicePage localityTwoTextbox(final String localityTwoTextbox) throws Exception {
		wait(5);
		LocalityTwoTextbox.clearAndType(localityTwoTextbox);
	    return this;
    }  
	public AdvicePage projectOneTextbox(final String localityOneTextbox) throws Exception {
		wait(2);
		ProjectOneTextbox.clearAndType(localityOneTextbox);
	    return this;
    }  
	public AdvicePage projectTwoTextbox(final String localityTwoTextbox) throws Exception {
		wait(5);
		ProjectTwoTextbox.clearAndType(localityTwoTextbox);
	    return this;
    }  
	
	 public AdvicePage clickText(final String string) throws Exception {
	    	wait(2);
	    	int count =0;
	    	if(isSuggesionBoxExplore()) {
	        ClickText.click();
	    	}else if(count <= 2){
	    		 ExploreAlocalityTextbox(string);
	    		wait(2);
	    		count++;	
	    		
	    	}
	        return this;
	    }
	
	
	 public AdvicePage clickOnExplore() throws Exception {
	    	wait(2);
	    	ClickOnExplore.click();
	        return this;
	    }
	 public AdvicePage CompareLocalityButton() throws Exception {
	    	
	    	Comparelocality.click();
	        return this;
	    }
	 public AdvicePage SmartSearchButton() throws Exception {
	    	
		    SmartSearch.click();
	        return this;
	    }
	 public AdvicePage Click(ButtonElement element) throws Exception {
	    	wait(2);
		    element.click();
	        return this;
	    }
	 public AdvicePage GoBack() throws Exception {
	    	
		    goBack();
	        return this;
	    }
	 public AdvicePage GetUrl() throws Exception {
	    	
		    url = driver.getCurrentUrl();
	        return this;
	    }
	 
	 
	 public AdvicePage MouseHover(ButtonElement element) throws Exception {
		    element.mouseOver();
		    
	        return this;
	    }
	 public AdvicePage SimulateClick(ButtonElement element) throws Exception {
	    	wait(2);
		    element.simulateClick();;
	        return this;
	    }
	 public AdvicePage InvestSmartSearchButton() throws Exception {
	    	
		    InvestSmart.click();
	        return this;
	    }
	 
	 
	 
	 public AdvicePage LoanCalculatorsSearchButton() throws Exception {
	    	
		 LoanCalculators.click();
	        return this;
	    }
	 public AdvicePage localityCompareBetweenOneAndTwo() throws Exception {
	    	wait(5);
	    	LocalityCompareBetweenOneAndTwo.click();
	        return this;
	    }
	 public AdvicePage projectCompareBetweenOneAndTwo() throws Exception {
	    	wait(5);
	    	ProjectCompareBetweenOneAndTwo.click();
	        return this;
	    }
	 public AdvicePage ClickfindOptionInsmartSearch() throws Exception {
	    	wait(5);
	    	FindOptionInsmartSearch.click();
	        return this;
	    }
	 
	 public AdvicePage SelectNewWindow() throws Exception {
		    wait(2);
	    	selectNewWindow();
	    	return this;
	    }
	 public AdvicePage SelectNewWindow(int count) throws Exception {
		    wait(2);
		    selectWindow(count);
	    	return this;
	    }
	 public AdvicePage SelectWindow(int windowindex) throws Exception {
		     selectWindow(windowindex);
	        return this;
	    }
	 public AdvicePage SwitchToDefaultContent() throws Exception {
		   switchToDefaultContent();
	       return this;
	    }
	 public AdvicePage GetWindowHandel() throws Exception {
		   getWindowHandle();
	       return this;
	    }
	 public AdvicePage SelectFrame( int count) throws Exception {
		   selectFrame(count);
	       return this;
	    }
	 public AdvicePage SelectFrame( By by) throws Exception {
		   selectFrame(by);
	       return this;
	    }

	 
	 private static final ButtonElement SelectExploreAlocalityFromPopularSearch = new ButtonElement("Click onfirst popular locality",
	    		locateByXPath("//*[@id='exploreSection']/div/div[2]/div[2]/ul/li[1]/a"));
	 
	 
	 public AdvicePage getTextElementSelectExploreAlocalityFromPopularSearch() throws Exception {
		    
	    	getTextElement = SelectExploreAlocalityFromPopularSearch.getText();
	        return this;
	    }
	 public AdvicePage getTextSelectComparelocalityFromPopularSearch() throws Exception {
		    
	    	getTextElement = SelectComparelocalityFromPopularSearch.getText();
	    	return this;
	    }
	 public AdvicePage getTextSelectCompareprojectFromPopularSearch() throws Exception {
		    
	    	getTextElement = SelectCompareprojectFromPopularSearch.getText();
	    	
	    	return this;
	    }
	 public AdvicePage SelectExploreAlocalityFromPopularSearch() throws Exception {
		    wait(2);
		    getTextElementSelectExploreAlocalityFromPopularSearch();
	    	SelectExploreAlocalityFromPopularSearch.click();
	        return this;
	    }
	 public AdvicePage ScrollToElement(HtmlElement element) throws Exception {
		   
		    element.scroll();
		    wait(2);
	        return this;
	    }
	 public AdvicePage SelectComparelocalityFromPopularSearch() throws Exception {
		    wait(2);
		    getTextSelectComparelocalityFromPopularSearch();
		    SelectComparelocalityFromPopularSearch.click();
	        return this;
	    }
	 public AdvicePage ClickAddToCompare() throws Exception {
		    wait(2);
		    AddToCompare.click();
	        return this;
	    }
	 public AdvicePage ClickDeleteFromCompare() throws Exception {
		    wait(2);
		    DeleteFromCompare.click();
	        return this;
	    }
	 
	 
	 public AdvicePage SelectCompareprojectFromPopularSearch() throws Exception {
		    wait(2);
		    getTextSelectCompareprojectFromPopularSearch();
		    SelectCompareprojectFromPopularSearch.click();
	        return this;
	    }
	 private static final ButtonElement SelectComparelocalityFromPopularSearch = new ButtonElement("Click onfirst popular locality",
	    		locateByXPath("//*[@id='localitiesResult']/ul/li[1]"));
	 private static final ButtonElement SelectCompareprojectFromPopularSearch = new ButtonElement("Click onfirst popular locality",
	    		locateByXPath("//*[@id='projectsResult']/ul/li[1]"));
	 
	
	 public static boolean isSuggesionBoxOneLocality() {
	        return LocalityCompareOneSuggesionBox.isDisplayed();
	    }
	 public static boolean isSuggesionBoxExplore() {
	        return ClickTextSuggestionBox.isDisplayed();
	    }
	 
	 public AdvicePage GetTextSmartSearch(ButtonElement Element) throws InterruptedException {
		 wait(2);
		 getTextElement = Element.getText().trim();
		 return this;
	 }
	
	 public String firstElement(String gettextString) {
		   String[] expectedCopairs = gettextString.split(",(?<!\\G\\w+)\\s");
			String expectedCon = expectedCopairs[0];
			
			return expectedCon;
	 }
	 public String SelectSecondElement(String gettextString) {
		//String  expectedCon = new String(gettextString.substring(gettextString.indexOf(" ") )).trim() ;
		 String[] parts  = gettextString.toLowerCase().split("vs");
			
			String expectedCon1 = parts[1].trim();
			String[] expectedCopairs = expectedCon1.split(",(?<!\\G\\w+)\\s");
			String expectedCon = expectedCopairs[0];
			
	        return expectedCon;
	 }
	 public String SelectSecondElement1(String gettextString) {
			
			 String[] parts  = gettextString.toLowerCase().split("in");
				
				String expectedCon1 = parts[0].trim();
				String[] expectedCopairs = expectedCon1.split(",(?<!\\G\\w+)\\s");
				String expectedCon = expectedCopairs[0];
				return expectedCon;
		 }
	 public String SelectSecondElement2(String gettextString) {
			
		 String[] parts  = gettextString.toLowerCase().split("-");
			
			String expectedCon1 = parts[0].trim();
			String[] expectedCopairs = expectedCon1.split(",(?<!\\G\\w+)\\s");
			String expectedCon = expectedCopairs[0];
			return expectedCon;
	 }
	 public String SelectSecondElement3(String gettextString) {
			
		 String[] parts  = gettextString.toLowerCase().split("-");
			
			String expectedCon1 = parts[1].trim();
			String[] expectedCopairs = expectedCon1.split(",(?<!\\G\\w+)\\s");
			String expectedCon = expectedCopairs[0];
			return expectedCon;
	 }
	 public AdvicePage SplitElement(String gettextString,String split) {
			
		 String[] parts  = gettextString.toLowerCase().split(split);
			
			String expectedCon1 = parts[0].trim();
			String[] expectedCopairs = expectedCon1.split(",(?<!\\G\\w+)\\s");
			getTextElement = expectedCopairs[0];
			return this;
	 }
	    public String SplitElement1(String gettextString,String split) {
			
		 String[] parts  = gettextString.toLowerCase().split(split);
		 String expectedCon1 = parts[0]+" "+parts[1];
		 String[] expectedCopairs1 = expectedCon1.split("\\s*,\\s*");
			String getTextElement2 = expectedCopairs1[0];
			//System.out.println(getTextElement2);
			String[] expectedCopairs = getTextElement2.split("\\.");
			String getTextElement1 = expectedCopairs[0];
			
			/*String[] expectedCopairs = expectedCon1.split("(?<!\\G\\w+)\\s,");
			getTextElement1 = expectedCopairs[0];*/
			return getTextElement1;
	 }
	    public String SplitElement2(String gettextString,String split) {
			
			 String[] parts  = gettextString.toLowerCase().split(split);
			 String expectedCon1 = parts[0];
			 String[] expectedCopairs1 = expectedCon1.split("\\s*,\\s*");
				String getTextElement2 = expectedCopairs1[0];
				//System.out.println(getTextElement2);
				String[] expectedCopairs = getTextElement2.split("\\.");
				String getTextElement1 = expectedCopairs[0];
				
				/*String[] expectedCopairs = expectedCon1.split("(?<!\\G\\w+)\\s,");
				getTextElement1 = expectedCopairs[0];*/
				return getTextElement1;
		 }
	 public String ConvertToLac(String gettextString) {
			
		    int convertToLac = (Integer.parseInt(gettextString)*100000);
		    getTextElement = Integer.toString(convertToLac);
			return getTextElement;
	 }



	
	 public AdvicePage AssertEquals(final String actualText,final String expectedText) throws Exception {
		 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
	     return this;
	    }
	 public AdvicePage AssertFalse(final Boolean actualText) throws Exception {
		 assertFalse(actualText,"Element should not be visible but now its visible");
	     return this;
	    }
	 public AdvicePage AssertTrue(final Boolean actualText) throws Exception {
		 assertTrue(actualText,"Element should  be visible but now its not visible");
	     return this;
	    }
	 
	 
	 public AdvicePage ExploreAlocalityInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   ExploreAlocalityTextbox(AdviceData.getExplorealocalityText())
	    			.clickText(AdviceData.getExplorealocalityText())
	    			.GetWindowHandel()
	    			.clickOnExplore()
	    			.SelectNewWindow()
	    			.AssertEquals(GetTextExplore.getText(),AdviceData.getExplorealocalityText())
	    			.SwitchToDefaultContent()
	    	        .SelectExploreAlocalityFromPopularSearch()
	    	        .SelectWindow(2)
	    	        .AssertEquals(GetTextExplore.getText(),firstElement(getTextElement));
	    }
	 public AdvicePage ComparelocalityInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   CompareLocalityButton()
	    			.GetWindowHandel()
	    			.localityOneTextbox(AdviceData.getLocalityOne())
	    			.localityTwoTextbox(AdviceData.getLocalityTwo())
	    			.localityCompareBetweenOneAndTwo()
	    	        .SelectNewWindow()
	    	        .AssertEquals(GetTextLocalityCompareOne.getText(),firstElement(AdviceData.getLocalityOne()))
	    	        .AssertEquals(SelectSecondElement(GetTextLocalityCompareTwo.getText()),firstElement(AdviceData.getLocalityTwo()))
	    	        .ClickAddToCompare()
	    	        .AssertEquals(GetTextAddLocalityCompareThree.getText(),SplitElement2(GetTextLocalityCompareThree.getText(),"vs"))
	    	        .ClickDeleteFromCompare()
	    	        .AssertEquals(GetTextLocalityCompareOne.getText(),firstElement(AdviceData.getLocalityOne()))
	    	        .AssertEquals(SelectSecondElement(GetTextLocalityCompareTwo.getText()),firstElement(AdviceData.getLocalityTwo()))
	    	        .AssertFalse(GetTextLocalityCompareThree.isDisplayed())
	    	        .SwitchToDefaultContent()
	    	        .SelectComparelocalityFromPopularSearch()
	    	        .SelectWindow(2)
	    	        .AssertEquals(GetTextLocalityCompareOne.getText(),firstElement(getTextElement))
	    	        .AssertEquals(SelectSecondElement(GetTextLocalityCompareTwo.getText()),SelectSecondElement(getTextElement))
	    	        .ClickAddToCompare()
	    	        .AssertEquals(GetTextAddLocalityCompareThree.getText(),SplitElement2(GetTextLocalityCompareThree.getText(),"vs"))
	    	        .ClickDeleteFromCompare()
	    	        .AssertEquals(GetTextLocalityCompareOne.getText(),firstElement(getTextElement))
	    	        .AssertEquals(SelectSecondElement(GetTextLocalityCompareTwo.getText()),SelectSecondElement(getTextElement))
	    	        .AssertFalse(GetTextLocalityCompareThree.isDisplayed());
	    	
	 }
	 public AdvicePage CompareProjectInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   CompareLocalityButton()
	    			 .GetWindowHandel()
	    			 .SelectprojectCheckBox()
	    			 .projectOneTextbox(AdviceData.getProjectOne())
		    		 .projectTwoTextbox(AdviceData.getProjectTwo())
	    	         .projectCompareBetweenOneAndTwo()
	                 .SelectNewWindow()
	                 .AssertEquals(SelectSecondElement1(GetTextProjectCompareOne.getText()),firstElement(AdviceData.getProjectOne()))
		    	     .AssertEquals(SelectSecondElement(SelectSecondElement1(GetTextProjectCompareTwo.getText())),firstElement(AdviceData.getProjectTwo()))
		    	     .ClickAddToCompare()
		    	     .AssertEquals(GetTextAddLocalityCompareThree.getText(),SplitElement2(GetTextProjectCompareThree.getText(),"vs"))
		    	     .ClickDeleteFromCompare()
		    	     .AssertEquals(SelectSecondElement1(GetTextProjectCompareOne.getText()),firstElement(AdviceData.getProjectOne()))
		    	     .AssertEquals(SelectSecondElement(SelectSecondElement1(GetTextProjectCompareTwo.getText())),firstElement(AdviceData.getProjectTwo()))
		    	     .AssertFalse(GetTextProjectCompareThree.isDisplayed())
		    	     .SwitchToDefaultContent()
		    	     .SelectCompareprojectFromPopularSearch()
		    	     .SelectWindow(2)
		    	     .AssertEquals(SplitElement1(SelectSecondElement1(GetTextProjectCompareOne.getText())," "),SplitElement1(getTextElement," "))
		    	     .AssertEquals(SplitElement1(SelectSecondElement(SelectSecondElement1(GetTextProjectCompareTwo.getText()))," "),SplitElement1(SelectSecondElement(getTextElement)," "))
		    	     .ClickAddToCompare()
		    	     .AssertEquals(GetTextAddLocalityCompareThree.getText(),SplitElement2(GetTextProjectCompareThree.getText(),"vs"))
		    	     .ClickDeleteFromCompare()
		    	     .AssertEquals(SplitElement1(SelectSecondElement1(GetTextProjectCompareOne.getText())," "),SplitElement1(getTextElement," "))
		    	     .AssertEquals(SplitElement1(SelectSecondElement(SelectSecondElement1(GetTextProjectCompareTwo.getText()))," "),SplitElement1(SelectSecondElement(getTextElement)," "))
	    	         .AssertFalse(GetTextProjectCompareThree.isDisplayed());
	    	
	 }
	 public AdvicePage SmartSearchInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   SmartSearchButton()
	    			 .GetWindowHandel()
	    			 .GetTextSmartSearch(SmartSearchInputTypeSearchTypeLocation)
	    			 .selectList(SmartSearchList,AdviceData.getSmartSearchText())
	    			 .selectListBudgetMin(AdviceData.getSmartSearchMinBudget())
	    			 .selectListBudgetMax(AdviceData.getSmartSearchMaxBudget())
	    			 .ClickfindOptionInsmartSearch()
	    			 .SelectNewWindow()
	    			 .AssertEquals(SmartSearchInputSearchLocation.getValue(),firstElement(AdviceData.getSmartSearchText()))
	    			 .AssertEquals(SelectSecondElement2(SmartSearchInputBudgetPerSQft.getValue()),firstElement(AdviceData.getSmartSearchMinBudget()))
	    			 .AssertEquals(SelectSecondElement3(SmartSearchInputBudgetPerSQft.getValue()),firstElement(AdviceData.getSmartSearchMaxBudget())) 
	    			 .AssertEquals(SmartSearchInputTypeSearchLocation.getValue(),getTextElement);
	 }
	 public AdvicePage SmartSearchInvestInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   SmartSearchButton()
	    			 .GetWindowHandel()
	    			 .SelectinvestCheckBox()
	    			 .GetTextSmartSearch(SmartSearchInputTypeSearchTypeInvestLocation)
	    			 .selectList(SmartSearchList,AdviceData.getSmartSearchText())
	    			 .selectListBudgetMin(AdviceData.getSmartSearchMinBudget())
	    			 .selectListBudgetMax(AdviceData.getSmartSearchMaxBudget())
	    			 .ClickfindOptionInsmartSearch()
	    			 .SelectNewWindow()
	    			 .AssertEquals(SmartSearchInputSearchLocation.getValue(),firstElement(AdviceData.getSmartSearchText()))
	    			 .AssertEquals(SelectSecondElement2(SmartSearchInputBudgetPerSQft.getValue()),firstElement(AdviceData.getSmartSearchMinBudget()))
	    			 .AssertEquals(SelectSecondElement3(SmartSearchInputBudgetPerSQft.getValue()),firstElement(AdviceData.getSmartSearchMaxBudget())) 
	    			 .AssertEquals(SmartSearchInputTypeSearchLocation.getValue(),getTextElement);
	 }
	 public AdvicePage InvestSmartInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   InvestSmartSearchButton()
	    			 .GetWindowHandel()
	    			 .IsDisplayinvestSmartScreen();
	 }
	 
	 public AdvicePage LoanCalculatorInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   LoanCalculatorsSearchButton()
	    			 .GetWindowHandel()
	    			 .selectLoanAmount(AdviceData.getLoanAmount())
	    			 .ClickLoanCalculatorCheckEligibilityButton()
	    			 .GetTextSmartSearch(LoanCalculatorLoanAmountResult)
	    			 .SplitElement(getTextElement,"at")
	    	         .SplitElement(getTextElement," ")
	    			 .AssertEquals(ConvertToLac(getTextElement),firstElement(AdviceData.getLoanAmount()))
	    			 .ScrollToElement(LoanCalculatorScrollTo)
	    			 .ClickApplyForLoan()
	    			 .SelectNewWindow(1)
	    			 .AssertEquals(SplitElement1(LoanCalculatorNewPageHomeLOanHeader.getText()," "),"home loans")
	    			 .SwitchToDefaultContent()
	    			 .ClickForumButton()
	    			 .SelectNewWindow(2)
	    			 .AssertEquals(LoanCalculatorForumHeader.getAttribute("title"),"Magicbricks Forum")
	    			 .SelectNewWindow(0)
	    			 .SwitchToDefaultContent()
	    			 .ClickResetAllLoanCalculator()
	    			 .AssertEquals(LoanCalculatorLoanAmountTextbox.getText(),"");
	    			 
	    			 
	    	
	 }
	 public AdvicePage LoanCalculatorEMIInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   LoanCalculatorsSearchButton()
	    			 .GetWindowHandel()
	    			 .ClickLoanCalculatorEMI()
	    			 .selectLoanAmountEMI(AdviceData.getLoanAmount())
	    			 .ClickLoanCalculatorCalculateEMIButton()
	    			 .ClickApplyForLoanEMI()
	    			 .SelectNewWindow()
	    			 .AssertEquals(SplitElement1(LoanCalculatorNewPageHomeLOanHeader.getText()," "),"home loans")
	    			 .SwitchToDefaultContent()
	    			 .ClickResetAllLoanCalculatorEMI()
	    			 .AssertEquals(LoanCalculatorLoanAmountTextboxEMI.getText(),"");
	 }
	 public AdvicePage LoanCalculatorPrePaymentInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   LoanCalculatorsSearchButton()
	    			 .GetWindowHandel()
	    			 .ClickLoanCalculatorPrePayment()
	    			 .selectLoanAmountPrePayment(AdviceData.getLoanAmount())
	    			 .ScrollToElement(LoanCalculatorScrollTo)
	    			 .ClickResetAllLoanCalculatorPrePayment()
	    			 .AssertEquals(LoanCalculatorPrePaymentTextbox.getText(),"");
	 }
	 public AdvicePage LoanCalculatorRateChangeInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   LoanCalculatorsSearchButton()
	    			 .GetWindowHandel()
	    			 .ClickLoanCalculatorRateChange()
	    			 .selectLoanAmountRateChange(AdviceData.getLoanAmount())
	    			 .ScrollToElement(LoanCalculatorScrollTo)
	    			 .ClickResetAllLoanCalculatorRateChange()
	    			 .AssertEquals(LoanCalculatorRateChangeTextbox.getText(),"");
	 }
	 
	 public AdvicePage RateandTrendsSectionInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   Click(RateAndTrends)
	    			 .GetWindowHandel()
	    			 //.SelectFrame(By.xpath("//*[@class='ratesTrendsAvgHeading']"))
	    			 .SelectFrame(1)
	    			 .AssertTrue(RateAndTrendsImage.isDisplayed())
	    			 .SimulateClick(RateAndTrendsButton)
	    			 .selectCityRateAndTrends(AdviceData.getRateAndTrendsText())
	    			 .SimulateClick(ExploreMoreTrendButton)
	    			 .SelectNewWindow()
	    			 .AssertEquals(NextPageExploreMoreTrendButton.getText(),AdviceData.getRateAndTrendsText());
	    			 
	 }
	 public AdvicePage ForumSectionInAdvice(final AdviceData AdviceData) throws Exception {
	    	return   Click(Forum)
	    			 .GetWindowHandel()
	    			 .EnterTextFieldElement(ForumTextbox, AdviceData.getForumText())
	    			 .Click(ForumSearch)
	    			 .SelectNewWindow(1)
	    			 .AssertEquals(ForumSearchNextPage.getAttribute("value"),AdviceData.getForumText())
	    			 .SelectNewWindow(0)
	    			 .GetTextSmartSearch(FirstPopularCityForum)
	    			 .Click(FirstPopularCityForum)
	    			 .SelectNewWindow(2)
	    			 .AssertEquals(FirstPopularCityForumNextPageHeader.getText(),getTextElement);
	    	
}
	 public AdvicePage FinanceSectionInAdvice(final AdviceData AdviceData) throws Exception {
	    	return    MouseHover(More)
	    			 .Click(Finance)
	    			 .Click(SeeAllInHomeLoanHelp)
	    			 .AssertTrue(SeeAllInHomeLoanHelpNextPage.isDisplayed())
	    			 .GoBack()
	    			 .MouseHover(More)
	    			 .Click(Finance)
	    			 .GetWindowHandel()
	    			 .Click(FinanceBuyinghelp)
	    			 .SelectNewWindow(1)
	    			 .AssertTrue(FinanceBuyinghelpNextPage.isDisplayed())
	    			 .SelectNewWindow(0)
	    			 .Click(BuyVsRent)
	    			 .SelectNewWindow(2)
	    			 .AssertTrue(BuyVsRentNextPage.isDisplayed())
	    			 .SelectNewWindow(0)
	    			 .Click(ReturnOnInvestMent)
	    			 .SelectNewWindow(3)
	    			 .AssertTrue(ReturnOnInvestMentNextPage.isDisplayed())
	    			 .SelectNewWindow(0)
	    			 .Click(PropWorth)
	    			 .AssertTrue(PropWorthNextPage.isDisplayed());
}
	 public AdvicePage HomeBuyingGuideInAdvice(final AdviceData AdviceData) throws Exception {
	    	return    MouseHover(More)
	    			 .Click(HomeBuyingGuide)
	    			 .GetWindowHandel()
	    			 .Click(HomeBuyingGuideReadMore)
	    			 .SelectNewWindow(1)
	    			 .GetUrl()
	    			 .AssertEquals(url,"https://www.magicbricks.com/buyers-guide/the-need-to-buy-property.html")
	    			 .AssertTrue(HomeBuyingGuideReadNextPage.isDisplayed())
	    			 .SelectNewWindow(0)
	    			 .SimulateClick(HomeBuyingGuideReadFullGuide)
	    			 .SelectNewWindow(2)
	    			 .GetUrl()
	    			 .AssertEquals(url,"https://www.magicbricks.com/buyers-guide/")
	    			 .AssertTrue(HomeBuyingGuideReadFullGuideNextPage.isDisplayed());
	    
	 
	 }	
	 public AdvicePage ResearchReportInAdvice(final AdviceData AdviceData) throws Exception {
	    	return    MouseHover(More)
	    			 .Click(ResearchReport)
	    			 .GetWindowHandel()
	    			 .Click(HouseIndexingSentiment)
	    			 .SelectNewWindow(1)
	    			 .GetUrl()
	    			 .AssertEquals(url,"https://www.magicbricks.com/iimb-hsi/")
	    			 .AssertTrue(HouseIndexingSentimentNextPage.isDisplayed())
	    			 .SelectNewWindow(0)
	    			 .Click(PropIndex)
	    			 .SelectNewWindow(2)
	    			 .GetUrl()
	    			 .AssertEquals(url,"http://property.magicbricks.com/microsite/buy/propindex/index.html")
	    			 .AssertTrue(PropIndexNextPage.isDisplayed());
	    			 
	 }
	 
}

