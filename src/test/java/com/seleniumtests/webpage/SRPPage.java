package com.seleniumtests.webpage;

import static com.seleniumtests.core.CustomAssertion.assertEquals;
import static com.seleniumtests.core.CustomAssertion.assertThat;
import static com.seleniumtests.core.Locator.*;
import static org.hamcrest.CoreMatchers.is;

import java.sql.*;
import java.sql.SQLException;
import java.util.Map;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.*;
import com.seleniumtests.webelements.*;
import com.seleniumtests.dataobject.DbManager;
import org.openqa.selenium.By;
import com.seleniumtests.core.SeleniumTestsContextManager;


public class SRPPage extends PageObject{
	
	
	private static final TextFieldElement SearchTextbox = new TextFieldElement("Landmark,Location or project Search text box",
			locateByCSSSelector("#keyword"));
	
	private static final ButtonElement BuyerDashBoard_Popup = new ButtonElement("Click propType button",
    		locateByXPath("//*[@id='buyerDashboardNav']/div[3]/div/div[1]"));
	
	//select cross icon from buyerdashboard popup
    public SRPPage selectBuyerDashBoard_Popup() throws Exception {
    	try{
    	BuyerDashBoard_Popup.waitForPresent(20);
    	BuyerDashBoard_Popup.click();
    	
    }catch (Exception e){
    	
    }
    	return this;
    }
	//SRP all filter button
	
	private static final ButtonElement Filter_PropType = new ButtonElement("Click propType button",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[2]/div[1]"));
	private static final ButtonElement Filter_Budget = new ButtonElement("Click Budget button",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[3]/div[1]"));
	private static final ButtonElement Filter_BHK = new ButtonElement("Click BHK button",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[4]/div[1]"));
	private static final ButtonElement Filter_ConstructionStatus = new ButtonElement("Click Construction status button",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[5]/div[1]"));
	private static final ButtonElement Filter_TopLocalities = new ButtonElement("Click TopLocalities button",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[6]/div[1]"));
	private static final ButtonElement Filter_More = new ButtonElement("Click More button",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[7]/div[1]"));
	
	
	//MouseHover on Property Type 
    public SRPPage mouseHoverPropType() throws Exception {
        
    	Filter_PropType.waitForPresent();
		Filter_PropType.mouseOver();
        return this;
    }
    //MouseHover on Budget 
    public SRPPage mouseHoverBudget() throws Exception {
        
    	Filter_Budget.waitForPresent();
    	Filter_Budget.mouseOver();
        return this;
    }
    //MouseHover on BHK
    public SRPPage mouseHoverBHK() throws Exception {
        
    	Filter_BHK.waitForPresent();
    	Filter_BHK.mouseOver();
    	
        return this;
    }
    //MouseHover on construction status
    public SRPPage mouseHoverConsStatus() throws Exception {
        
    	Filter_ConstructionStatus.waitForPresent();
    	Filter_ConstructionStatus.mouseOver();
        return this;
    }
    
    //MouseHover on topLocality
    public SRPPage mouseHoverTopLocality() throws Exception {
        
    	Filter_TopLocalities.waitForPresent();
    	Filter_TopLocalities.mouseOver();
        return this;
    }
    
    //MouseHover on more filter
    public SRPPage mouseHoverMoreFilter() throws Exception {
        
    	Filter_More.waitForPresent();
    	Filter_More.mouseOver();
        return this;
    }
    

    //select 1bhk from property Type
    public SRPPage select1Bhk() throws Exception {
        
    	PropTypeBHK_1.click();
        return this;
    }
    //select 2bhk from property Type
    public SRPPage select2Bhk() throws Exception {
        
    	PropTypeBHK_2.click();
        return this;
    }
    //select 3bhk from property Type
    public SRPPage select3Bhk() throws Exception {
        
    	PropTypeBHK_3.click();
        return this;
    }
    //select 4bhk from property Type
    public SRPPage select4Bhk() throws Exception {
        
    	PropTypeBHK_4.click();
        return this;
    }
    //select 5bhk from property Type
    public SRPPage select5Bhk() throws Exception {
        
    	PropTypeBHK_5.click();
        return this;
    }
    //select more than 5bhk from property Type
    public SRPPage selectMoreThan5Bhk() throws Exception {
        
    	PropTypeMoreThanBHK_5.click();
        return this;
    } 
	

	/*
	//Going to specific BHK data that provides from csv
		private ButtonElement PropertyTypeBhk(String bhk) {
			
			Filter_PropType.waitForPresent();
			Filter_PropType.mouseOver();
			
			switch (bhk) {
			case "1":
				return new ButtonElement(bhk, locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[1]/label"));

			case "2":
				return new ButtonElement(bhk, locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[2]/label"));

			case "3":
				return new ButtonElement(bhk, locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[3]/label"));

			case "4":
				return new ButtonElement(bhk, locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[4]/label"));

			case "5":
				return new ButtonElement(bhk, locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[5]/label"));
				
			case "5+":
				return new ButtonElement(bhk, locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[6]/label"));
            
			default:
				return new ButtonElement(bhk, locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[2]/div[1]"));

			}
			
		}
       //Select BHK
		public SRPPage SelectBhk(final String bhkValue) throws Exception {
			ButtonElement button = PropertyTypeBhk(bhkValue);
			button.click();
		return this;
		    }
		*/
		
		
   //SRP Property Type BHK filter 
	private static final ButtonElement PropTypeBHK_1 = new ButtonElement("Select 1 BHK",
    		locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[1]/label"));
	private static final ButtonElement PropTypeBHK_2 = new ButtonElement("Select 2 BHK",
    		locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[2]/label"));
	private static final ButtonElement PropTypeBHK_3 = new ButtonElement("Select 3 BHK",
    		locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[3]/label"));
	private static final ButtonElement PropTypeBHK_4 = new ButtonElement("Select 4 BHK",
    		locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[4]/label"));
	private static final ButtonElement PropTypeBHK_5 = new ButtonElement("Select 5 BHK",
    		locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[5]/label"));
	private static final ButtonElement PropTypeMoreThanBHK_5 = new ButtonElement("Select More Than 5 BHK",
    		locateByXPath("//*[@id='bhkDropDownHome']/div/ul/li[6]/label"));
	
	//select flat from property Type
    public SRPPage selectFlat() throws Exception {
        
    	propType_Flat.click();
        return this;
    }
  //select House villa from property Type
    public SRPPage selectHouseVilla() throws Exception {
        
    	propType_HouseVilla.click();
        return this;
    }
  //select Plot land from property Type
    public SRPPage selectPlotLand() throws Exception {
        
    	propType_PlotLand.click();
        return this;
    }
	
	//SRP property Type Residential Filter
	private static final ButtonElement propType_Flat = new ButtonElement("Select property type flat",
    		locateByXPath("//*[@id='propType']/div[2]/ul/li[2]/span"));
	private static final ButtonElement propType_HouseVilla = new ButtonElement("Select property type house/Villa",
    		locateByXPath("//*[@id='propType']/div[2]/ul/li[3]/span"));

	private static final ButtonElement propType_PlotLand = new ButtonElement("Select property type plot/land",
    		locateByXPath("//*[@id='propType']/div[2]/ul/li[4]/span"));
	
	
	//select officeSpace from property Type
    public SRPPage selectOfficeSpace() throws Exception {
        
    	propTypeComm_OfficeSpace.click();
        return this;
    }
  //select ShopShowroom from property Type
    public SRPPage selectShopShowRoom() throws Exception {
        
    	propTypeComm_ShopShowroom.click();
        return this;
    }
    
  //select Commercial Land from property Type
    public SRPPage selectCommercialLand() throws Exception {
        
    	propTypeComm_CommLand.click();
        return this;
    }
    
  //select WareHouse from property Type
    public SRPPage selectWareHouse() throws Exception {
        
    	propTypeComm_WareHouse.click();
        return this;
    }
  //select Industrial Building from property Type
    public SRPPage selectIndsBuilding() throws Exception {
        
    	propTypeComm_IndsBuilding.click();
        return this;
    }
  //select Industrial Shed from property Type
    public SRPPage selectIndsShed() throws Exception {
        
    	propTypeComm_IndsShed.click();
        return this;
    }
    
    
	
	
	//SRP property Type commercial Filter
	private static final ButtonElement propTypeComm_OfficeSpace = new ButtonElement("Select commercial property type officeSpace",
    		locateByXPath("//*[@id='propType']/div[3]/ul/li[2]/span"));
	private static final ButtonElement propTypeComm_ShopShowroom = new ButtonElement("Select commercial property type shopshowroom",
    		locateByXPath("//*[@id='propType']/div[3]/ul/li[3]/span"));
	private static final ButtonElement propTypeComm_CommLand = new ButtonElement("Select commercial property type Commercial Land",
    		locateByXPath("//*[@id='propType']/div[3]/ul/li[4]/span"));
	private static final ButtonElement propTypeComm_WareHouse = new ButtonElement("Select commercial property type WareHouse/Godown",
    		locateByXPath("//*[@id='propType']/div[3]/ul/li[5]/span"));
	private static final ButtonElement propTypeComm_IndsBuilding = new ButtonElement("Select commercial property type Industrial Building",
    		locateByXPath("//*[@id='propType']/div[3]/ul/li[6]/span"));
	private static final ButtonElement propTypeComm_IndsShed = new ButtonElement("Select commercial property type Industrial Shed",
    		locateByXPath("//*[@id='propType']/div[3]/ul/li[7]/span"));
	
	
	//select Agricultural Land from property Type
    public SRPPage selectAgriLand() throws Exception {
        
    	propTypeOth_AgriLand.click();
        return this;
    }
  //select Farm House from property Type
    public SRPPage selectFarmHouse() throws Exception {
        
    	propTypeOth_FarmHouse.click();
        return this;
    }
	
	//SRP property Type others Filter
	
	private static final ButtonElement propTypeOth_AgriLand = new ButtonElement("Select commercial property type Agricultural Land",
    		locateByXPath("//*[@id='propType']/div[4]/ul/li[2]/span"));
	private static final ButtonElement propTypeOth_FarmHouse = new ButtonElement("Select commercial property type Farm House",
    		locateByXPath("//*[@id='propType']/div[4]/ul/li[3]/span"));
	
	
	//Enter amount in min budget
	public SRPPage enterMinBudget(final String minBudget) {
		BudgetMin.clearAndType(minBudget);

        return this;
    }
	//Enter amount in max budget
		public SRPPage enterMaxBudget(final String maxBudget) {
			BudgetMax.clearAndType(maxBudget);
			

	        return this;
	    }
	
	//SRP Budget Filter
	
	private static final TextFieldElement BudgetMin = new TextFieldElement("Enter minimum budget in budget textbox",
    		locateByXPath("//*[@id='rangeMinLinkbudgetinput']"));
	private static final TextFieldElement BudgetMax = new TextFieldElement("Enter maximum budget in budget textbox",
    		locateByXPath("//*[@id='rangeMaxLinkbudgetinput']"));
	
	//select 1BHK from BHK type
    public SRPPage selectBhk1() throws Exception {
        
    	BHK_1.click();
    	assertThat(" 1 BHK Properties not showing on SRP page!!!",
                SRPPage.VerifyTextSrpproperty1BHK(), is(true));
        return this;
    }
  //select 2BHK from BHK type
    public SRPPage selectBhk2() throws Exception {
        
    	BHK_2.click();
    	
    	assertThat(" 2 BHK Properties not showing on SRP page!!!",
                SRPPage.VerifyTextSrpproperty2BHK(), is(true));
        return this;
    }
  //select 3BHK from BHK type
    public SRPPage selectBhk3() throws Exception {
        
    	BHK_3.click();
    	assertThat(" 3 BHK Properties not showing on SRP page!!!",
                SRPPage.VerifyTextSrpproperty3BHK(), is(true));
    	
        return this;
    }
  //select 4BHK from BHK type
    public SRPPage selectBhk4() throws Exception {
        
    	BHK_4.click();
        return this;
    }
  //select 1BHK from BHK type
    public SRPPage selectBhk5() throws Exception {
        
    	BHK_5.click();
        return this;
    }
  //select 1BHK from BHK type
    public SRPPage selectBhk5More() throws Exception {
        
    	MoreThanBHK_5.click();
        return this;
    }
	
	//SRP BHK Filter
	private static final ButtonElement BHK_1 = new ButtonElement("Select 1 BHK",
    		locateByXPath("//*[@id='refinebedrooms']/ul/li[1]/label"));
	private static final ButtonElement BHK_2 = new ButtonElement("Select 2 BHK",
    		locateByXPath("//*[@id='refinebedrooms']/ul/li[2]/label"));
	private static final ButtonElement BHK_3 = new ButtonElement("Select 3 BHK",
    		locateByXPath("//*[@id='refinebedrooms']/ul/li[3]/label"));
	private static final ButtonElement BHK_4 = new ButtonElement("Select 4 BHK",
    		locateByXPath("//*[@id='refinebedrooms']/ul/li[4]/label"));
	private static final ButtonElement BHK_5 = new ButtonElement("Select 5 BHK",
    		locateByXPath("//*[@id='refinebedrooms']/ul/li[5]/label"));
	private static final ButtonElement MoreThanBHK_5 = new ButtonElement("Select More Than 5 BHK",
    		locateByXPath("//*[@id='refinebedrooms']/ul/li[6]/label"));
	
	//select ready to move from Construction Status Filter
    public SRPPage selectReadyToMove() throws Exception {
        
    	ConstStatus_ReadyToMove.click();
        return this;
    }
  //select UnderConstruction from Construction Status Filter
    public SRPPage selectUnderConstruction() throws Exception {
        
    	ConstStatus_UnderConstruction.click();
        return this;
    }
	//SRP Construction Status Filter
	
	private static final ButtonElement ConstStatus_ReadyToMove= new ButtonElement("Select Construction status Ready to move",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[5]/div[2]/div[1]/label"));
	private static final ButtonElement ConstStatus_UnderConstruction = new ButtonElement("Select Construction status under constuction",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[5]/div[2]/div[2]/label"));
	
	
	 //select possession  1 year from More After Select UnderConstruction
    public SRPPage selectPoss1Year() throws Exception {
        
    	ConstStatus_UnderConstruction_Poss1Year.click();
        return this;
    }
  //select possession  2 year from More After Select UnderConstruction
    public SRPPage selectPoss2Year() throws Exception {
        
    	ConstStatus_UnderConstruction_Poss2Year.click();
        return this;
    }
  //select possession  3 year from More After Select UnderConstruction
    public SRPPage selectPoss3Year() throws Exception {
        
    	ConstStatus_UnderConstruction_Poss3Year.click();
        return this;
    }
  //select possession more than 3 year from More After Select UnderConstruction
    public SRPPage selectMoreThanPoss3Year() throws Exception {
        
    	ConstStatus_UnderConstruction_PossMoreThan3Year.click();
        return this;
    }
	
	//More After Select UnderConstruction
	private static final ButtonElement ConstStatus_UnderConstruction_Poss1Year = new ButtonElement("Select Construction status under constuction and possession with a year",
    		locateByXPath("//*[@id='possessionStatus2Scrollar']/div[1]/ul/li[1]/label"));
	private static final ButtonElement ConstStatus_UnderConstruction_Poss2Year = new ButtonElement("Select Construction status under constuction and possession with in 2 year ",
    		locateByXPath("//*[@id='possessionStatus2Scrollar']/div[1]/ul/li[2]/label"));
	private static final ButtonElement ConstStatus_UnderConstruction_Poss3Year = new ButtonElement("Select Construction status under constuction and possession with in 3 year",
    		locateByXPath("//*[@id='possessionStatus2Scrollar']/div[1]/ul/li[3]/label"));
	private static final ButtonElement ConstStatus_UnderConstruction_PossMoreThan3Year = new ButtonElement("Select Construction status under constuction and possession more than 3 year",
    		locateByXPath("//*[@id='possessionStatus2Scrollar']/div[1]/ul/li[4]/label"));
	
	//select TopLOcalities from TopLOcalities Filter
    public SRPPage selectShowonlyTopLocalities() throws Exception {
        
    	topLocalities_ShowonlyTopLocalities.click();
        return this;
    }
	
	//SRP TopLOcalities Filter
	
	private static final ButtonElement topLocalities_ShowonlyTopLocalities= new ButtonElement("Select Show only top localities",
    		locateByXPath("//*[@id='refinelocality']/ul[1]/li/label"));
	
	
	//SRP More Filter
	
	//select Resale from More_Ownership Filter
    public SRPPage selectResale() throws Exception {
        
    	moreOwnership_Resale.click();
        return this;
    }
  //select new from More_Ownership Filter
    public SRPPage selectNew() throws Exception {
        
    	moreOwnership_New.click();
        return this;
    }
	
	//More_Ownership
	private static final ButtonElement moreOwnership_Resale= new ButtonElement("Select Resale button from More tab",
    		locateByXPath("//*[@id='refinesaleType']/div/span[2]"));
	private static final ButtonElement moreOwnership_New= new ButtonElement("Select New button from More tab",
    		locateByXPath("//*[@id='refinesaleType']/div/span[1]"));
	
	
	 //MouseHover on PostedBy button 
    public SRPPage mouseHoverPostedBy() throws Exception {
        
    	morePostedBy.waitForPresent();
    	morePostedBy.mouseOver();
        return this;
    }
  //select owner from postedBy Filter
    public SRPPage selectOwners() throws Exception {
        
    	morePostedBy_Owners.click();
    	
    	assertThat(" posted by owner Properties not showing on SRP page!!!",
                SRPPage.VerifypostedBy(), is(true));
    	
    	
        return this;
    }
  //select brokers from postedBy Filter
    public SRPPage selectBrokers() throws Exception {
        
    	morePostedBy_Brokers.click();
        return this;
    }
  //select builders from postedBy Filter
    public SRPPage selectBuilders() throws Exception {
        
    	morePostedBy_Builders.click();
        return this;
    }
	
	//More_PostedBy
	private static final ButtonElement morePostedBy = new ButtonElement("Select PostedBy  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[1]/ul/li[2]/div/div[1]"));
	private static final ButtonElement morePostedBy_Owners= new ButtonElement("Select PostedBy owners from More tab",
    		locateByXPath("//*[@id='inputListings_I']"));
	private static final ButtonElement morePostedBy_Brokers= new ButtonElement("Select PostedBy Brokers from More tab",
    		locateByXPath("//*[@id='inputListings_A']"));
	private static final ButtonElement morePostedBy_Builders= new ButtonElement("Select PostedBy Builders from More tab",
    		locateByXPath("//*[@id='inputListings_B']"));
	
	
	//MouseHover on PostedSince button 
    public SRPPage mouseHoverPostedSince() throws Exception {
        
    	morePostedSince.waitForPresent();
    	morePostedSince.mouseOver();
        return this;
    }
	
  //select all from postedSince Filter
    public SRPPage selectPostedSince_All() throws Exception {
        
    	morePostedSince_All.click();
        return this;
    }
  //select Yesterday from postedSince Filter
    public SRPPage selectPostedSince_Yesterday() throws Exception {
        
    	morePostedSince_Yesterday.click();
        return this;
    }
  //select LastWeek from postedSince Filter
    public SRPPage selectPostedSince_LastWeek() throws Exception {
        
    	morePostedSince_LastWeek.click();
        return this;
    }
  //select Last3Weeks from postedSince Filter
    public SRPPage selectPostedSince_Last2Weeks() throws Exception {
        
    	morePostedSince_Last2Weeks.click();
        return this;
    }
  //select Last3Weeks from postedSince Filter
    public SRPPage selectPostedSince_Last3Weeks() throws Exception {
        
    	morePostedSince_Last3Weeks.click();
        return this;
    }
  //select LastMonth from postedSince Filter
    public SRPPage selectPostedSince_LastMonth() throws Exception {
        
    	morePostedSince_LastMonth.click();
        return this;
    }
  //select Last2Month from postedSince Filter
    public SRPPage selectPostedSince_Last2Month() throws Exception {
        
    	morePostedSince_Last2Months.click();
        return this;
    }
  //select Last4Month from postedSince Filter
    public SRPPage selectPostedSince_Last4Month() throws Exception {
        
    	morePostedSince_Last4Months.click();
        return this;
    }
	
	
	//More_PostedSince
	private static final ButtonElement morePostedSince = new ButtonElement("Select PostedBySince  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[1]/ul/li[3]/div/div[1]"));
	private static final ButtonElement morePostedSince_All = new ButtonElement("Select PostedBySince All  from More tab",
    		locateByXPath("//*[@id='refinepostedSince']/ul/li[1]/label"));
	private static final ButtonElement morePostedSince_Yesterday = new ButtonElement("Select PostedBySince Yesterday  from More tab",
    		locateByXPath("//*[@id='refinepostedSince']/ul/li[2]/label"));
	private static final ButtonElement morePostedSince_LastWeek = new ButtonElement("Select PostedBySince LastWeek from More tab",
    		locateByXPath("//*[@id='refinepostedSince']/ul/li[3]/label"));
	private static final ButtonElement morePostedSince_Last2Weeks = new ButtonElement("Select PostedBySince last 2 weeks  from More tab",
    		locateByXPath("//*[@id='refinepostedSince']/ul/li[4]/label"));
	private static final ButtonElement morePostedSince_Last3Weeks = new ButtonElement("Select PostedBySince  last 3 weeks from More tab",
    		locateByXPath("//*[@id='refinepostedSince']/ul/li[5]/label"));
	private static final ButtonElement morePostedSince_LastMonth = new ButtonElement("Select PostedBySince last month from More tab",
    		locateByXPath("//*[@id='refinepostedSince']/ul/li[6]/label"));
	private static final ButtonElement morePostedSince_Last2Months = new ButtonElement("Select PostedBySince  last 2 months from More tab",
    		locateByXPath("//*[@id='refinepostedSince']/ul/li[7]/label"));
	private static final ButtonElement morePostedSince_Last4Months = new ButtonElement("Select PostedBySince  last 4 months from More tab",
    		locateByXPath("//*[@id='refinepostedSince']/ul/li[8]/label"));
	
	//MouseHover on Ownership button 
    public SRPPage mouseHoverOwnership() throws Exception {
        
    	more_OwnerShip.waitForPresent();
    	more_OwnerShip.mouseOver();
        return this;
    }
    
	
    //select FreeHold from Ownership Filter
      public SRPPage selectFreeHold() throws Exception {
          
    	  more_OwnerShip_FreeHold.click();
          return this;
      }
    //select LeaseHold from Ownership Filter
      public SRPPage selectLeaseHold() throws Exception {
          
    	  more_OwnerShip_LeaseHold.click();
          return this;
      }
    //select PowerOfAttorney from Ownership Filter
      public SRPPage selectPowerOfAttorney() throws Exception {
          
    	  more_OwnerShip_PowerOfAttorney.click();
          return this;
      }
    //select CoOperativeSociety from Ownership Filter
      public SRPPage selectCoOperativeSociety() throws Exception {
          
    	  more_OwnerShip_CoOperativeSociety.click();
          return this;
      }
	//More_Ownership
	private static final ButtonElement more_OwnerShip = new ButtonElement("Select OwnerShip  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[1]/ul/li[4]/div/div[1]"));
	private static final ButtonElement more_OwnerShip_FreeHold = new ButtonElement("Select Free hold  from More tab",
    		locateByXPath("//*[@id='refineownershipType']/ul/li[1]/label"));
	private static final ButtonElement more_OwnerShip_LeaseHold = new ButtonElement("Select Lease Hold  from More tab",
    		locateByXPath("//*[@id='refineownershipType']/ul/li[2]/label"));
	private static final ButtonElement more_OwnerShip_PowerOfAttorney = new ButtonElement("Select Power of attorney  from More tab",
    		locateByXPath("//*[@id='refineownershipType']/ul/li[3]/label"));
	private static final ButtonElement more_OwnerShip_CoOperativeSociety = new ButtonElement("Select Co-operative Society  from More tab",
    		locateByXPath("//*[@id='refineownershipType']/ul/li[4]/label"));
	

	//MouseHover on MoreArea button 
    public SRPPage mouseHoverMoreArea() throws Exception {
        
    	more_Area.waitForPresent();
    	more_Area.mouseOver();
        return this;
    }
    
  //Enter area in min area
  	public SRPPage enterMinArea(final String minArea) {
  		more_Area_Min.clearAndType(minArea);

          return this;
      }
  	//Enter area in max area
  		public SRPPage enterMaxArea(final String maxArea) {
  			more_Area_Max.clearAndType(maxArea);
  			
  	        return this;
  	    }
  	
  	//MouseHover on AreaText button 
  	    public SRPPage mouseHoverAreaText() throws Exception {
  	        
  	    	more_Area_text.waitForPresent();
  	    	more_Area_text.mouseOver();
  	        return this;
  	    }
  	    
  	//select sqft from Areatext Filter
        public SRPPage selectAreaSqft() throws Exception {
            
        	more_Area_sqft.click();
            return this;
        }
      //select sqYard from Areatext Filter
        public SRPPage selectAreaSqYard() throws Exception {
            
        	more_Area_sqyard.click();
            return this;
        }
      //select sqm from Areatext Filter
        public SRPPage selectAreaSqm() throws Exception {
            
        	more_Area_sqm.click();
            return this;
        }
        //select AreaGo from Areatext Filter
        public SRPPage ClickAreaGo() throws Exception {
            
        	more_Area_Go.click();
            return this;
        }
	//More_Area
	private static final ButtonElement more_Area = new ButtonElement("Select Area  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[2]/ul/li[1]/div/div[1]"));
	private static final TextFieldElement more_Area_Min = new TextFieldElement("Enter minimum area in area textbox",
    		locateByXPath("//*[@id='areaFrom_']"));
	private static final TextFieldElement more_Area_Max = new TextFieldElement("Enter maximum area in area textbox",
    		locateByXPath("//*[@id='areaTo_']"));
	private static final ButtonElement more_Area_text = new ButtonElement("Select area text  from More tab",
    		locateByXPath("//*[@id='areaTxt']"));
	private static final ButtonElement more_Area_sqft = new ButtonElement("Select Sqft  from More tab",
    		locateByXPath("//*[@id='area']/div/div/div[4]/div/div/div/div/div[1]]"));
	private static final ButtonElement more_Area_sqyard = new ButtonElement("Select sq yard  from More tab",
    		locateByXPath("//*[@id='area']/div/div/div[4]/div/div/div/div/div[2]"));
	private static final ButtonElement more_Area_sqm = new ButtonElement("Select sqm  from More tab",
    		locateByXPath("//*[@id='area']/div/div/div[4]/div/div/div/div/div[3]"));
	private static final ButtonElement more_Area_Go = new ButtonElement("Click Go  from More tab",
    		locateByXPath("//*[@id='area']/div/div/div[5]/a"));
	
	//MouseHover on MoreFurnishing button 
    public SRPPage mouseHoverMoreFurnishing() throws Exception {
        
    	more_Furnishing.waitForPresent();
    	more_Furnishing.mouseOver();
        return this;
    }
	
	//select furnished from MoreFurnishing Filter
    public SRPPage selectFurnished() throws Exception {
        
    	more_Furnishing_Furnished.click();
        return this;
    }
  //select semi furnished from MoreFurnishing Filter
    public SRPPage selectSemiFurnished() throws Exception {
        
    	more_Furnishing_SemiFurnished.click();
        return this;
    }
  //select Unfurnished from MoreFurnishing Filter
    public SRPPage selectUnFurnished() throws Exception {
        
    	more_Furnishing_Unfurnished.click();
        return this;
    }
	
	//More_Furnishing
	private static final ButtonElement more_Furnishing = new ButtonElement("Select Furnishing  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[2]/ul/li[3]/div/div[1]"));
	private static final ButtonElement more_Furnishing_Furnished = new ButtonElement("Select Furnished  from More tab",
    		locateByXPath("//*[@id='refinefurnished']/ul/li[1]/label"));
	private static final ButtonElement more_Furnishing_SemiFurnished = new ButtonElement("Select Semi-Furnished  from More tab",
    		locateByXPath("//*[@id='refinefurnished']/ul/li[2]/label"));
	private static final ButtonElement more_Furnishing_Unfurnished = new ButtonElement("Select Unfurnished  from More tab",
    		locateByXPath("//*[@id='refinefurnished']/ul/li[3]/label"));
	

	//MouseHover on MoreFloor button 
    public SRPPage mouseHoverMoreFloor() throws Exception {
        
    	more_Floor.waitForPresent();
    	more_Floor.mouseOver();
        return this;
    }
  //select basement from MoreFloor  Filter
    public SRPPage selectBasement() throws Exception {
        
    	more_Floor_Basement.click();
        return this;
    }
  //select ground from MoreFloor  Filter
    public SRPPage selectGround() throws Exception {
        
    	more_Floor_Ground.click();
        return this;
    }
  //select 1to4 from MoreFloor  Filter
    public SRPPage select1to4() throws Exception {
        
    	more_Floor_1to4.click();
        return this;
    }
  //select 5to8 from MoreFloor  Filter
    public SRPPage select5to8() throws Exception {
        
    	more_Floor_5to8.click();
        return this;
    }
    //select 9to12 from MoreFloor  Filter
    public SRPPage select9to12() throws Exception {
        
    	more_Floor_9to12.click();
        return this;
    }
    //select 13to16 from MoreFloor  Filter
    public SRPPage select13to16() throws Exception {
        
    	more_Floor_13to16.click();
        return this;
    }
  //select more than 16 from MoreFloor  Filter
    public SRPPage selectMoreThan16() throws Exception {
        
    	more_Floor_16AndMore.click();
        return this;
    }
	//More_Floor
	private static final ButtonElement more_Floor = new ButtonElement("Select Floor  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[2]/ul/li[5]/div/div[1]"));
	private static final ButtonElement more_Floor_Basement = new ButtonElement("Select Basement  from More tab",
    		locateByXPath("//*[@id='refinefloorNo']/ul/li[1]/label"));
	private static final ButtonElement more_Floor_Ground = new ButtonElement("Select Ground floor  from More tab",
    		locateByXPath("//*[@id='refinefloorNo']/ul/li[2]/label"));
	private static final ButtonElement more_Floor_1to4 = new ButtonElement("Select 1 to 4 Floor  from More tab",
    		locateByXPath("//*[@id='refinefloorNo']/ul/li[3]/label"));
	private static final ButtonElement more_Floor_5to8 = new ButtonElement("Select 5 to 8 Floor  from More tab",
    		locateByXPath("//*[@id='refinefloorNo']/ul/li[4]/label"));
	private static final ButtonElement more_Floor_9to12 = new ButtonElement("Select 9 to 12 Floor  from More tab",
    		locateByXPath("//*[@id='refinefloorNo']/ul/li[5]/label"));
	private static final ButtonElement more_Floor_13to16 = new ButtonElement("Select 13 to 16 Floor  from More tab",
    		locateByXPath("//*[@id='refinefloorNo']/ul/li[6]/label"));
	private static final ButtonElement more_Floor_16AndMore = new ButtonElement("Select 16+  from More tab",
    		locateByXPath("//*[@id='refinefloorNo']/ul/li[7]/label"));
	
	//MouseHover on PropertiesIn button 
    public SRPPage mouseHoverMorePropertiesIn() throws Exception {
        
    	more_PropertiesIn.waitForPresent();
    	more_PropertiesIn.mouseOver();
        return this;
    }
  //select upcoming from PropertiesIn  Filter
    public SRPPage selectUpcoming() throws Exception {
        
    	more_PropertiesIn_Upcoming.click();
        return this;
    }
  //select Developed  from PropertiesIn  Filter
    public SRPPage selectDeveloped() throws Exception {
        
    	more_PropertiesIn_Developed.click();
        return this;
    }
  //select Premium from PropertiesIn  Filter
    public SRPPage selectPremium() throws Exception {
        
    	more_PropertiesIn_Premium.click();
        return this;
    }
	
	//More_Properties_In
	private static final ButtonElement more_PropertiesIn = new ButtonElement("Select Properties In  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[2]/ul/li[7]/div/div[1]"));
	private static final ButtonElement more_PropertiesIn_Upcoming = new ButtonElement("Select Upcoming localities  from More tab",
    		locateByXPath("//*[@id='refinepropertiesIn']/ul/li[1]/label"));
	private static final ButtonElement more_PropertiesIn_Developed = new ButtonElement("Select Developed localities  from More tab",
    		locateByXPath("//*[@id='refinepropertiesIn']/ul/li[2]/label"));
	private static final ButtonElement more_PropertiesIn_Premium = new ButtonElement("Select premium localities  from More tab",
    		locateByXPath("//*[@id='refinepropertiesIn']/ul/li[3]/label"));
	
	
	//MouseHover on BathRoom button 
    public SRPPage mouseHoverMoreBathRoom() throws Exception {
        
    	more_BathRoom.waitForPresent();
    	more_BathRoom.mouseOver();
        return this;
    }
  //select 1Bath from BathRoom  Filter
    public SRPPage select1Bath() throws Exception {
        
    	more_BathRoom_1Bath.click();
        return this;
    }
  //select 2Bath from BathRoom  Filter
    public SRPPage select2Bath() throws Exception {
        
    	more_BathRoom_2Bath.click();
        return this;
    }
  //select 3Bath from BathRoom  Filter
    public SRPPage select3Bath() throws Exception {
        
    	more_BathRoom_3Bath.click();
        return this;
    }
  //select 4Bath from BathRoom  Filter
    public SRPPage select4Bath() throws Exception {
        
    	more_BathRoom_4Bath.click();
        return this;
    }
  //select 5Bath from BathRoom  Filter
    public SRPPage select5Bath() throws Exception {
        
    	more_BathRoom_5Bath.click();
        return this;
    }

	//More_BathRoom
	private static final ButtonElement more_BathRoom = new ButtonElement("Select Bath room  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[2]/ul/li[2]/div/div[1]"));
	private static final ButtonElement more_BathRoom_1Bath = new ButtonElement("Select 1 Bath room  from More tab",
    		locateByXPath("//*[@id='refinebathrooms']/ul/li[1]/label"));
	private static final ButtonElement more_BathRoom_2Bath = new ButtonElement("Select 2 Bath room  from More tab",
    		locateByXPath("//*[@id='refinebathrooms']/ul/li[2]/label"));
	private static final ButtonElement more_BathRoom_3Bath = new ButtonElement("Select 3 Bath room  from More tab",
    		locateByXPath("//*[@id='refinebathrooms']/ul/li[3]/label"));
	private static final ButtonElement more_BathRoom_4Bath = new ButtonElement("Select 4 Bath room  from More tab",
    		locateByXPath("//*[@id='refinebathrooms']/ul/li[4]/label"));
	private static final ButtonElement more_BathRoom_5Bath = new ButtonElement("Select 5 Bath room  from More tab",
    		locateByXPath("//*[@id='refinebathrooms']/ul/li[5]/label"));
	
	

	//MouseHover on facing button 
    public SRPPage mouseHoverMoreFacing() throws Exception {
        
    	more_Facing.waitForPresent();
    	more_Facing.mouseOver();
        return this;
    }
  //select East from Facing  Filter
    public SRPPage selectEast() throws Exception {
        
    	more_Facing_East.click();
        return this;
    }
  //select North from Facing  Filter
    public SRPPage selectNorth() throws Exception {
        
    	more_Facing_North.click();
        return this;
    }
  //select NorthEast from Facing  Filter
    public SRPPage selectNorthEast() throws Exception {
        
    	more_Facing_NorthEast.click();
        return this;
    }
  //select NorthWest from Facing  Filter
    public SRPPage selectNorthWest() throws Exception {
        
    	more_Facing_NorthWest.click();
        return this;
    }
  //select South from Facing  Filter
    public SRPPage selectSouth() throws Exception {
        
    	more_Facing_South.click();
        return this;
    }
  //select SouthEast from Facing  Filter
    public SRPPage selectSouthEast() throws Exception {
        
    	more_Facing_SouthEast.click();
        return this;
    }
	
	//More_Facing
	private static final ButtonElement more_Facing = new ButtonElement("Select Facing  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[2]/ul/li[4]/div/div[1]"));
	private static final ButtonElement more_Facing_East = new ButtonElement("Select East Facing  from More tab",
    		locateByXPath("//*[@id='refinefacing']/ul/li[1]/label"));
	private static final ButtonElement more_Facing_North = new ButtonElement("Select North Facing  from More tab",
    		locateByXPath("//*[@id='refinefacing']/ul/li[2]/label"));
	private static final ButtonElement more_Facing_NorthEast = new ButtonElement("Select North-east Facing  from More tab",
    		locateByXPath("//*[@id='refinefacing']/ul/li[3]/label"));
	private static final ButtonElement more_Facing_NorthWest = new ButtonElement("Select North-west Facing  from More tab",
    		locateByXPath("//*[@id='refinefacing']/ul/li[4]/label"));
	private static final ButtonElement more_Facing_South = new ButtonElement("Select South Facing  from More tab",
    		locateByXPath("//*[@id='refinefacing']/ul/li[5]/label"));
	private static final ButtonElement more_Facing_SouthEast = new ButtonElement("Select South-East Facing  from More tab",
    		locateByXPath("//*[@id='refinefacing']/ul/li[6]/label"));
	
	//MouseHover on Amenities button 
    public SRPPage mouseHoverMoreAmenities() throws Exception {
        
    	more_Amenities.waitForPresent();
    	more_Amenities.mouseOver();
        return this;
    }
  //select PowerBackUp from Amenities  Filter
    public SRPPage selectPowerBackUp() throws Exception {
        
    	more_Amenities_PowerBackUp.click();
        return this;
    }
  //select Lift from Amenities  Filter
    public SRPPage selectLift() throws Exception {
        
    	more_Amenities_Lift.click();
        return this;
    }
  //select SwimmingPool from Amenities  Filter
    public SRPPage selectSwimmingPool() throws Exception {
        
    	more_Amenities_SwimmingPool.click();
        return this;
    }
  //select Gymnasium from Amenities  Filter
    public SRPPage selectGymnasium() throws Exception {
        
    	more_Amenities_Gymnasium.click();
        return this;
    }
  //select Park from Amenities  Filter
    public SRPPage selectPark() throws Exception {
        
    	more_Amenities_Park.click();
        return this;
    }
  //select ReservedParking from Amenities  Filter
    public SRPPage selectReservedParking() throws Exception {
        
    	more_Amenities_ReservedParking.click();
        return this;
    }
	
	//More_Amenities
	private static final ButtonElement more_Amenities = new ButtonElement("Select Amenities  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[2]/ul/li[6]/div/div[1]"));
	private static final ButtonElement more_Amenities_PowerBackUp = new ButtonElement("Select Power back up  from More tab",
    		locateByXPath("//*[@id='refineamenities']/ul/li[1]/label"));
	private static final ButtonElement more_Amenities_Lift = new ButtonElement("Select Lift  from More tab",
    		locateByXPath("//*[@id='refineamenities']/ul/li[2]/label"));
	private static final ButtonElement more_Amenities_SwimmingPool = new ButtonElement("Select Swimming pool  from More tab",
    		locateByXPath("//*[@id='refineamenities']/ul/li[3]/label"));
	private static final ButtonElement more_Amenities_Gymnasium = new ButtonElement("Select Gymnasium  from More tab",
    		locateByXPath("//*[@id='refineamenities']/ul/li[4]/label"));
	private static final ButtonElement more_Amenities_Park = new ButtonElement("Select Park  from More tab",
    		locateByXPath("//*[@id='refineamenities']/ul/li[5]/label"));
	private static final ButtonElement more_Amenities_ReservedParking = new ButtonElement("Select Reserved Parking  from More tab",
    		locateByXPath("//*[@id='refineamenities']/ul/li[6]/label"));
	
	//MouseHover on PropertyType button 
    public SRPPage mouseHoverMorePropertyType() throws Exception {
        
    	more_PropertyType.waitForPresent();
    	more_PropertyType.mouseOver();
        return this;
    }
  //select Multistorey from More PropertyType  Filter
    public SRPPage selectMoreMultistorey() throws Exception {
        
    	more_PropertyType_Multistorey.click();
        return this;
    }
  //select Penthouse from More PropertyType  Filter
    public SRPPage selectMorePenthouse() throws Exception {
        
    	more_PropertyType_Penthouse.click();
        return this;
    }
  //select BuilderFloor from More PropertyType  Filter
    public SRPPage selectMoreBuilderFloor() throws Exception {
        
    	more_PropertyType_BuilderFloor.click();
        return this;
    }
  //select Studio from More PropertyType  Filter
    public SRPPage selectMoreStudio() throws Exception {
        
    	more_PropertyType_Studio.click();
        return this;
    }
	//More_Property_Type
	private static final ButtonElement more_PropertyType = new ButtonElement("Select PropertyType  from More tab",
    		locateByXPath("//*[@id='moreRefined']/div/div[2]/ul/li[8]/div/div[1]"));
	private static final ButtonElement more_PropertyType_Multistorey = new ButtonElement("Select Multistorey Apartment  from More tab",
    		locateByXPath("//*[@id='refinepType']/ul/li[1]/label"));
	private static final ButtonElement more_PropertyType_Penthouse = new ButtonElement("Select penthouse  from More tab",
    		locateByXPath("//*[@id='refinepType']/ul/li[2]/label"));
	private static final ButtonElement more_PropertyType_BuilderFloor = new ButtonElement("Select BuilderFloor Apartment  from More tab",
    		locateByXPath("//*[@id='refinepType']/ul/li[3]/label"));
	private static final ButtonElement more_PropertyType_Studio = new ButtonElement("Select Studio Apartment  from More tab",
    		locateByXPath("//*[@id='refinepType']/ul/li[4]/label"));
	
	
	 //select photos from More  Filter
    public SRPPage selectMorePhotos() throws Exception {
        
    	more_Photos.click();
        return this;
    }
	//More Filter by photos
	private static final ButtonElement more_Photos = new ButtonElement("Select Photos  from More tab",
    		locateByXPath("//*[@id='refineimageVideo']/div/ul/li[1]/label"));
	
	 //select videos from More  Filter
    public SRPPage selectMorevideos() throws Exception {
        
    	more_Videos.click();
        return this;
    }
	//More Filter by videos
	private static final ButtonElement more_Videos = new ButtonElement("Select Videos  from More tab",
    		locateByXPath("//*[@id='refineimageVideo']/div/ul/li[2]/label"));
	
	 //select PostedBy_CertfiedAgent from More  Filter
    public SRPPage selectMorePostedBy_CertfiedAgent() throws Exception {
        
    	more_PostedBy_CertfiedAgent.click();
        return this;
    }
	//More filter by Posted By certified agent
	private static final ButtonElement more_PostedBy_CertfiedAgent = new ButtonElement("Select Posted By certified agent  from More tab",
    		locateByXPath("//*[@id='refineisCertifedAgent']/div/ul/li/label"));
	
	
	 //select PropetiesWithOffer from More  Filter
    public SRPPage selectMorePropetiesWithOffer() throws Exception {
        
    	more_PropetiesWithOffer.click();
        return this;
    }
	//More Filter by properties with offer
	private static final ButtonElement more_PropetiesWithOffer = new ButtonElement("Select Properties with offer  from More tab",
    		locateByXPath("//*[@id='refinediscountsOffers']/div/ul/li/label"));
	
	
	//select VerifiedProperties from More  Filter
    public SRPPage selectMoreVerifiedProperties() throws Exception {
        
    	more_VerifiedProperties.click();
        return this;
    }
	//More Filter by verified properties
	private static final ButtonElement more_VerifiedProperties = new ButtonElement("Select Verified properties  from More tab",
    		locateByXPath("//*[@id='refineverified']/div/ul/li/label"));
	
	
	
	private static final ButtonElement False_Click = new ButtonElement("False click to close open popup",
    		locateByXPath("//*[@class='SRmTab']/ul/li[1]/a"));
	
	//False Click
    public SRPPage Click_False() throws Exception {
    	False_Click.click();
        return this;
    }

    private static final ButtonElement ClickText = new ButtonElement("Click location Button",
    		locateByXPath("//*[@id='keyword_suggest']/div[2]"));
    private static final ButtonElement ClickTextSRP = new ButtonElement("Click location Button",
    		locateByXPath("//*[@id='keyword_suggest']/div[2]"));
    
    private  ButtonElement ClickButton = new ButtonElement("Click search Button",
    		locateByXPath("//*[@id='btnPropertySearch']"));
    
    private static final ButtonElement PropertiesTab = new ButtonElement("Properties Tab",
    		locateByXPath("//*[@id='resultDiv']/div/div[1]/ul/li[1]/a"));
    
    private static final ButtonElement ClickOnProperty = new ButtonElement("Click on first Property",
    		locateByXPath("(//*[@class='sepBlock'])[1]"));
    
    
    public SRPPage(final boolean openPageURL) throws Exception {
        super(SearchTextbox, openPageURL ? SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
    }

  

	public SRPPage searchText(final String searchText) throws Exception {
    	SearchTextbox.clearAndType(searchText);

    	 return this;
    }

	
	


    public SRPPage clickText() throws Exception {
    	Thread.sleep(5000);
        ClickText.click();
        return this;
    }
    public SRPPage clickTextSRP() throws Exception {
    	Thread.sleep(5000);
        ClickTextSRP.click();
        return this;
    }
    
    public SRPPage clickSearchButton() throws Exception {
       
        ClickButton.click();
        return this;
    }
    
    
    public SRPPage clickFirstProperty() throws Exception {
        
        ClickOnProperty.click();
        return this;
    }
    public static boolean isHomePageDisplayed() {
        return PropertiesTab.isDisplayed();
    }
    
    public static boolean isBuyTabDisplayed() {
        return MouseHover_BuyRent.isDisplayed();
    }
    
    //Property Detail tab in property detail page
    private static final ButtonElement PropertyDetailPageTab = new ButtonElement("Property Detail tab in property detail page",
    		locateByXPath("//*[@id='propertyDetailTabId']"));
    
    public static boolean isPropertyDetailPageTabDisplayed() {
    	
        return PropertyDetailPageTab.isDisplayed();
    }
    
    //Rent
    
    private static final ButtonElement MouseHover_BuyRent = new ButtonElement("MouseHover on Rent button",
    		locateByXPath("//*[@id='inputcategory']"));
    
    private static final ButtonElement MouseHover_Rent = new ButtonElement("MouseHover on Rent button",
    		locateByXPath("//*[@id='refinecategory']/div/ul/li[2]/label"));

	//MouseHover on Property Type 
    public SRPPage mouseHoverRent() throws Exception {
        
    	MouseHover_BuyRent.waitForPresent();
    	MouseHover_BuyRent.mouseOver();
        return this;
    }
    
    //Select  Rent from property type
    
  //Click posted by Brokers on Rent
  	 public SRPPage clickRentTab() throws Exception {
  	        
  		MouseHover_Rent.click();
  	        return this;
  	    }
    
    private static final ButtonElement FilterRent_PostedBy= new ButtonElement("Click Posted By button",
    		locateByXPath("//*[@id='srpRefine']/div[1]/div/div/div[5]/div[1]"));
    
    //MouseHover on Posted By status
    public SRPPage mouseHoverRentPostedBy() throws Exception {
        
    	FilterRent_PostedBy.waitForPresent();
    	FilterRent_PostedBy.mouseOver();
        return this;
    }
    
    private static final ButtonElement RentFilter_PostedbyOwner = new ButtonElement("Click Posted By Owner button",
    		locateByXPath("//*[@id='refineinputListings']/ul/li[1]/label"));
	private static final ButtonElement RentFilter_PostedbyBrokers = new ButtonElement("Click Posted By Brokers  button",
    		locateByXPath("//*[@id='refineinputListings']/ul/li[2]/label"));
	
	//Click posted by owner on Rent
	 public SRPPage clickRentPostedByOwner() throws Exception {
	        
		 RentFilter_PostedbyOwner.click();
	        return this;
	    }
	//Click posted by Brokers on Rent
	 public SRPPage clickRentPostedByBrokers() throws Exception {
	        
		 RentFilter_PostedbyBrokers.click();
	        return this;
	    }
	 
	 private static final ButtonElement FilterRent_Society_Only= new ButtonElement("MouseHover on Society Only button",
	    		locateByXPath("//*[@id='moreRefined']/div/div[1]/ul/li[1]/div/div[1]"));
	    
	    //Mouse Hover on Society Only
	    public SRPPage mouseHoverRentSocietyonly() throws Exception {
	        
	    	FilterRent_Society_Only.waitForPresent();
	    	FilterRent_Society_Only.mouseOver();
	        return this;
	    }
	  
	    
	    private static final ButtonElement FilterRent_Society_OnlyClick= new ButtonElement("Click Society Only button",
	    		locateByXPath("//*[@id='refinesocityOnly']/ul/li/label"));
	  //Click Society Only in Rent
		 public SRPPage clickRentSocietyOnly() throws Exception {
		        
			 FilterRent_Society_OnlyClick.click();
		        return this;
		    }
		 
		 

			//MouseHover on Rent PostedSince button 
		    public SRPPage mouseHoverRentPostedSince() throws Exception {
		        
		    	moreRentPostedSince.waitForPresent();
		    	moreRentPostedSince.mouseOver();
		        return this;
		    }
			
		  //select all from Rent postedSince Filter
		    public SRPPage selectRentPostedSince_All() throws Exception {
		        
		    	moreRentPostedSince_All.click();
		        return this;
		    }
		  //select Yesterday from Rent postedSince Filter
		    public SRPPage selectRentPostedSince_Yesterday() throws Exception {
		        
		    	moreRentPostedSince_Yesterday.click();
		        return this;
		    }
		  //select LastWeek from Rent postedSince Filter
		    public SRPPage selectRentPostedSince_LastWeek() throws Exception {
		        
		    	moreRentPostedSince_LastWeek.click();
		        return this;
		    }
		  //select Last3Weeks from Rent postedSince Filter
		    public SRPPage selectRentPostedSince_Last2Weeks() throws Exception {
		        
		    	moreRentPostedSince_Last2Weeks.click();
		        return this;
		    }
		  //select Last3Weeks from Rent postedSince Filter
		    public SRPPage selectRentPostedSince_Last3Weeks() throws Exception {
		        
		    	moreRentPostedSince_Last3Weeks.click();
		        return this;
		    }
		  //select LastMonth from Rent postedSince Filter
		    public SRPPage selectRentPostedSince_LastMonth() throws Exception {
		        
		    	moreRentPostedSince_LastMonth.click();
		        return this;
		    }
		  //select Last2Month from Rent postedSince Filter
		    public SRPPage selectRentPostedSince_Last2Month() throws Exception {
		        
		    	moreRentPostedSince_Last2Months.click();
		        return this;
		    }
		  //select Last4Month from Rent postedSince Filter
		    public SRPPage selectRentPostedSince_Last4Month() throws Exception {
		        
		    	moreRentPostedSince_Last4Months.click();
		        return this;
		    }

		//MoreRent_PostedSince
		private static final ButtonElement moreRentPostedSince = new ButtonElement("Select PostedBySince  from More tab",
	    		locateByXPath("//*[@id='moreRefined']/div/div[1]/ul/li[2]/div/div[1]"));
		private static final ButtonElement moreRentPostedSince_All = new ButtonElement("Select PostedBySince All  from More tab",
	    		locateByXPath("//*[@id='refinepostedSince']/ul/li[1]/label"));
		private static final ButtonElement moreRentPostedSince_Yesterday = new ButtonElement("Select PostedBySince Yesterday  from More tab",
	    		locateByXPath("//*[@id='refinepostedSince']/ul/li[2]/label"));
		private static final ButtonElement moreRentPostedSince_LastWeek = new ButtonElement("Select PostedBySince LastWeek from More tab",
	    		locateByXPath("//*[@id='refinepostedSince']/ul/li[3]/label"));
		private static final ButtonElement moreRentPostedSince_Last2Weeks = new ButtonElement("Select PostedBySince last 2 weeks  from More tab",
	    		locateByXPath("//*[@id='refinepostedSince']/ul/li[4]/label"));
		private static final ButtonElement moreRentPostedSince_Last3Weeks = new ButtonElement("Select PostedBySince  last 3 weeks from More tab",
	    		locateByXPath("//*[@id='refinepostedSince']/ul/li[5]/label"));
		private static final ButtonElement moreRentPostedSince_LastMonth = new ButtonElement("Select PostedBySince last month from More tab",
	    		locateByXPath("//*[@id='refinepostedSince']/ul/li[6]/label"));
		private static final ButtonElement moreRentPostedSince_Last2Months = new ButtonElement("Select PostedBySince  last 2 months from More tab",
	    		locateByXPath("//*[@id='refinepostedSince']/ul/li[7]/label"));
		private static final ButtonElement moreRentPostedSince_Last4Months = new ButtonElement("Select PostedBySince  last 4 months from More tab",
	    		locateByXPath("//*[@id='refinepostedSince']/ul/li[8]/label"));
		
		
//Sorted By Relevance
		 private static final ButtonElement FilterRelevance= new ButtonElement("MouseHover on Relevance button",
		    		locateByXPath("//*[@class='shortByDD']"));
		
		    
		    //Mouse Hover on Relevance
		    public SRPPage mouseHoverRelevance() throws Exception {
		        
		    	FilterRelevance.waitForPresent();
		    	FilterRelevance.mouseOver();
		        return this;
		    }
		    
		  //select Revelance From Revelance Filter
		    public SRPPage selectRevelance() throws Exception {
		        
		    	Filter_Relevance.click();
		        return this;
		    }
		  //select Low to High From Revelance Filter
		    public SRPPage selectRevelanceLowtoHigh() throws Exception {
		        
		    	Filter_Relevance_LowtoHigh.click();
		        return this;
		    }
		  //select High to Low From Revelance Filter
		    public SRPPage selectRevelanceHightoLow() throws Exception {
		        
		    	Filter_Relevance_HightoLow.click();
		        return this;
		    }
		  //select Most Recent From Revelance Filter
		    public SRPPage selectRevelanceMostRecent() throws Exception {
		        
		    	Filter_Relevance_MostRecent.click();
		        return this;
		    }
		  //select Ownerproperties From Revelance Filter
		    public SRPPage selectRevelanceOwnerproperties() throws Exception {
		        
		    	Filter_Relevance_OwnerProperties.click();
		        return this;
		    }
		  //select Sqft Low to High From Revelance Filter
		    public SRPPage selectRevelanceSqftLowtoHigh() throws Exception {
		        
		    	Filter_Relevance_Sqft_LowtoHigh.click();
		        return this;
		    }
		  //select Sqft High to Low From Revelance Filter
		    public SRPPage selectRevelanceSqftHightoLow() throws Exception {
		        
		    	Filter_Relevance_Sqft_HightoLow.click();
		        return this;
		    }
		  //select Nearest From Revelance Filter
		    public SRPPage selectRevelanceNearest() throws Exception {
		        
		    	Filter_Relevance_Nearest.click();
		        return this;
		    }

		    
		    private static final ButtonElement Filter_Relevance = new ButtonElement("Select Revelance on Relevance",
		    		locateByXPath("//*[@id='sort1']"));
		    private static final ButtonElement Filter_Relevance_LowtoHigh = new ButtonElement("Select Low to High on Relevance",
		    		locateByXPath("//*[@id='sort2']"));
		    private static final ButtonElement Filter_Relevance_HightoLow = new ButtonElement("Select High to Low on Relevance",
		    		locateByXPath("//*[@id='sort3']"));
		    private static final ButtonElement Filter_Relevance_MostRecent = new ButtonElement("Select MostRecent on Relevance",
		    		locateByXPath("//*[@id='sort4']"));
		    private static final ButtonElement Filter_Relevance_OwnerProperties = new ButtonElement("Select OwnerProperties Relevance",
		    		locateByXPath("//*[@id='sort5']"));
		    private static final ButtonElement Filter_Relevance_Sqft_LowtoHigh = new ButtonElement("Select Sqft Low to hIgh on Relevance",
		    		locateByXPath("//*[@id='sort6']"));
		    private static final ButtonElement Filter_Relevance_Sqft_HightoLow = new ButtonElement("Select Sqft High to Low on Relevance",
		    		locateByXPath("//*[@id='sort7']"));
		    private static final ButtonElement Filter_Relevance_Nearest = new ButtonElement("Select Nearest on Relevance",
		    		locateByXPath("//*[@id='sort8']"));
		    
		    //Delete location from search bar SRP
		    private static final ButtonElement deleteLocationSearchBarSRP = new ButtonElement("Delete location search bar in SRP",
		    		locateByXPath("//*[@class='crossIcon']"));
		    
		    //Delete location from search bar
		    public SRPPage deleteLocationSearchBarSRP() throws Exception {
		        
		    	deleteLocationSearchBarSRP.click();
		    	return this;
		    }
		    //Search TextBox SRP
		    private static final TextFieldElement SearchTextboxSRP = new TextFieldElement("Landmark,Location or project Search text box SRP page",
					locateByCSSSelector("#refine_keyword"));
		    
		    //Enter text Search TextBox SRP
		    public SRPPage searchTextSRP(final String searchText) throws Exception {
		    	SearchTextboxSRP.waitForPresent(30);
		    	SearchTextboxSRP.clearAndType(searchText);

		    	 return this;
		    }
		    
		    //see othercharge
		    private static final ButtonElement FirstSeeOtherCharges = new ButtonElement("Select See Other Charges",
		    		locateByXPath("(//*[@class='SRSeeAllInc']/a)[1]"));
		    
		    //select First other charge from SRP
		    public SRPPage selectFirstSeeOtherCharges() throws Exception {
		    	Thread.sleep(10000);
		    	FirstSeeOtherCharges.click();
		    	
		        return this;
		    }
		  //First Property SRP
		    private static final ButtonElement FirstPropertySRP = new ButtonElement("Select FirstProperty SRP",
		    		locateByXPath("(//*[@class='proBrf'])[1]"));
		    
		    //select First property from SRP
		    public SRPPage selectFirstPropertySRP() throws Exception {
		        
		    	FirstPropertySRP.click();
		    	return this;
		    }
		    //Select New Windows
           public SRPPage selectNewWindows() throws Exception {
        	 
        	    selectNewWindow();
		    	return this;
		    }
		 /*   //Execute query in db
           public static String executeQuery(final String query,Object ColumnName) throws ClassNotFoundException, SQLException {
          	    String name = null;
       		 Map<Object,Object> map =  DbManager.executeQuery(query);
       		 if(!map.isEmpty()) {
       			 name = (String)map.get(ColumnName);
       		 }
       		 System.out.println(name);
               return name;
            }*/
		   private static final SelectList PostedBY = new SelectList("Select  Posted By",
		    		locateByXPath("//*[@id='refineinputListings']"));
		   private static final SelectList PostedBY1 = new SelectList("Select  Posted By",
		    		locateByXPath("//*[@id='refineinputListings']/ul/li"));
		   public SRPPage selectPostedBY(String string)  throws Exception {
			   
			    mouseHoverMoreFilter().mouseHoverPostedBy();
	            PostedBY.selectByText(string);
		    	return this;
		    }
		   public SRPPage getPostedBY()  throws Exception {
	            
	            System.out.println(PostedBY1.getSelectedText());
		    	return this;
		    }
		   private static final SelectList selectRevelance = new SelectList("Select Revelance",
		    		locateByXPath("//*[@class='shortByList']"));
		  
		   public SRPPage selectRevelanceType(String string)  throws Exception {
			    mouseHoverRelevance();
			    selectRevelance.selectByText(string);
		    	return this;
		    }
		   private static final SelectList selectPostedSince = new SelectList("Select Revelance",
		    		locateByXPath("//*[@id='refinepostedSince']"));
		  
		   public SRPPage selectPostedSinceType(String string)  throws Exception {
			    mouseHoverPostedSince();
			    selectPostedSince.selectByText(string);
		    	return this;
		    }
		   private static final SelectList selectConstructionStatus = new SelectList("Select Revelance",
		    		locateByXPath("//*[@id='refinepostedSince']"));
		  
		   public SRPPage selectConstructionStatusType(String string)  throws Exception {
			    mouseHoverConsStatus();
			    //selectConstructionStatus.selectByText(string);
			    if(string == "Ready To Move") {
			    	selectReadyToMove();
			       }
			    else if(string == "Under Construction") {
			    	selectUnderConstruction();
			    }
		    	return this;
		    }

		   private static final SelectList BuyRentType = new SelectList("Select  BHK",
		    		locateByXPath("//*[@class='dropdownList refineDropDownList buyRentList toggleList']"));
		  
		   public SRPPage selectBuyRentType(String string)  throws Exception {
			    mouseHoverRent();
			    BuyRentType.selectByText(string);
		    	return this;
		    }
		  
		   private static final SelectList BHKType = new SelectList("Select  BHK",
		    		locateByXPath("//*[@id='refinebedrooms']"));
		  
		   public SRPPage selectBHKType(String string)  throws Exception {
			    mouseHoverBHK();
			    BHKType.selectByText(string);
		    	return this;
		    }
		   public SRPPage getBHKType()  throws Exception {
	            
	            System.out.println(BHKType.getSelectedText());
		    	return this;
		   }
		/*//Db Feature
		     public SRPPage searchPropertyType(final SRPData SRPData) throws Exception {
		    	 return executeQuery(SRPData.getQuery(),SRPData).searchText(SRPData.getResult());
		         		
		     }*/
//*****************************//Assert Text***********************************************************************************************************		 	
		   //First property get text
		   private static final HtmlElement SrpPropertyText = new HtmlElement("First property text",
		    		locateByXPath("(//*[@class='proBrf']/a/h3)[1]"));
		   
		   public static String getTextSrpproperty() throws Exception {
			   
		       return SrpPropertyText.getText();
		    }
		   public static boolean VerifyTextSrpproperty1BHK()  {
			   try{
				   
		        return getTextSrpproperty().toLowerCase().contains("1");
			   }catch(Exception e){
				   
			   }
			return true;
		    }
		   public static boolean VerifyTextSrpproperty2BHK()  {
			   try{
				   
		        return getTextSrpproperty().toLowerCase().contains("2");
			   }catch(Exception e){
				   
			   }
			return true;
		    }
		   //Assert for 3BHK
		   public static boolean VerifyTextSrpproperty3BHK()  {
			   try{
				   
		        return getTextSrpproperty().toLowerCase().contains("3");
			   }catch(Exception e){
				   
			   }
			return true;
		    }
		   
		   
		   public static boolean VerifypostedBy()  {
			   try{
				   
		        return getTextSrpproperty().toLowerCase().contains("owner");
			   }catch(Exception e){
				   
			   }
			return true;
		    }
		   public static boolean VerifyBudget()  {
			   try{
				   
		        return getTextSrpproperty().toLowerCase().contains("<=Budget");
			   }catch(Exception e){
				   
			   }
			return true;
		    }
		   public static boolean VerifyMinArea()  {
			   try{
				   
		        return getTextSrpproperty().toLowerCase().contains("<=MInArea");
			   }catch(Exception e){
				   
			   }
			return true;
		    }
		    
    //Test Case Start
    public SRPPage searchPropertyType(final SRPData SRPData) throws Exception {
        return searchText(SRPData.getSearchText()).clickText().clickSearchButton().selectBHKType(SRPData.getBhkType())
        		
        		.selectBuyerDashBoard_Popup().Click_False().selectPostedBY(SRPData.getPostedType()).mouseHoverBudget().enterMinBudget(SRPData.getMinBudget()).enterMaxBudget(SRPData.getMaxBudget())
        		.mouseHoverMoreFilter().mouseHoverMoreArea().enterMinArea(SRPData.getMinArea())
        		.enterMaxArea(SRPData.getMaxArea()).ClickAreaGo().mouseHoverBudget();
    }
   public SRPPage searchBhk(final SRPData SRPData) throws Exception {
        return searchText(SRPData.getSearchText()).clickText().clickSearchButton().mouseHoverBHK()
        		.selectBHKType(SRPData.getBhkType()).selectBuyerDashBoard_Popup().Click_False()
        		.selectRevelanceType(SRPData.getRevelanceType()).mouseHoverMoreFilter()
        		.selectPostedBY(SRPData.getPostedType()).mouseHoverBudget()
        		.enterMinBudget(SRPData.getMinBudget()).enterMaxBudget(SRPData.getMaxBudget())
        		.mouseHoverMoreFilter().mouseHoverMoreArea().enterMinArea(SRPData.getMinArea())
        		.enterMaxArea(SRPData.getMaxArea()).ClickAreaGo()
        		.selectPostedSinceType(SRPData.getPostedSinceType()).mouseHoverBudget()
        		.deleteLocationSearchBarSRP().searchTextSRP(SRPData.getSearchTextSRP()).clickTextSRP().clickSearchButton();
    }
 
    public SRPPage searchPropertyTypeRent(final SRPData SRPData) throws Exception {
        return searchText(SRPData.getSearchText()).clickText().clickSearchButton().selectBuyRentType(SRPData.getBuyRentType()).selectBHKType(SRPData.getBhkType())
        		.selectBuyerDashBoard_Popup().Click_False().mouseHoverMoreFilter().mouseHoverRentPostedBy().clickRentPostedByOwner()
        		.mouseHoverBudget().enterMinBudget(SRPData.getMinBudget()).enterMaxBudget(SRPData.getMaxBudget())
        		.mouseHoverMoreFilter().mouseHoverMoreArea().enterMinArea(SRPData.getMinArea())
        		.enterMaxArea(SRPData.getMaxArea()).ClickAreaGo().mouseHoverBudget();
}
    public SRPPage searchPropertyTypeVerifySeeOtherCharge(final SRPData SRPData) throws Exception {
    	return searchText(SRPData.getSearchText()).clickText().clickSearchButton().selectBHKType(SRPData.getBhkType())
    			.selectBuyerDashBoard_Popup().Click_False().selectRevelanceType(SRPData.getRevelanceType())
    			.selectConstructionStatusType(SRPData.getConstructionStatusType()).selectFirstSeeOtherCharges().selectFirstPropertySRP().selectNewWindows();
    }
    public SRPPage searchPropertyTypeInSRP(final SRPData SRPData) throws Exception {
    	return searchText(SRPData.getSearchText()).clickText().clickSearchButton().selectBHKType(SRPData.getBhkType()).selectBuyerDashBoard_Popup()
    			.mouseHoverPropType().selectHouseVilla().mouseHoverPropType().selectOfficeSpace().mouseHoverPropType().selectShopShowRoom();
    }
}



