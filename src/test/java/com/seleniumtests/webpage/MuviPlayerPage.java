/**
 * 
 */
package com.seleniumtests.webpage;

import static com.seleniumtests.core.CustomAssertion.*;
import static com.seleniumtests.core.CustomAssertion.assertFalse;
import static com.seleniumtests.core.CustomAssertion.assertTrue;

import static com.seleniumtests.core.Locator.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;
import com.seleniumtests.apicontroller.RestExecutor;
import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.DbManager;
import com.seleniumtests.dataobject.DbManager2;
import com.seleniumtests.dataobject.MuviData;
import com.seleniumtests.dataobject.MuviPlayerData;
import com.seleniumtests.dataobject.RandomAddress;
import com.seleniumtests.dataobject.RandomEmailID;
import com.seleniumtests.dataobject.RandomMobileNo;
import com.seleniumtests.dataobject.RandomName;
import com.seleniumtests.dataobject.RandomPassword;
import com.seleniumtests.dataobject.RandomZip;
import com.seleniumtests.dataobject.WebCRMData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.Table;
import com.seleniumtests.webelements.TextFieldElement;
/*

 * Copyright 2018 www.muvi.com

 */

/**

 * @author  Srikanta Kumar Sahoo <srikanta@muvi.com> 

seleniumtestsframework com.seleniumtests.webpage 25-Jul-2018
 */
public class MuviPlayerPage extends PageObject{
	public static String url = null;
	public static String URL = null;
	private static final String APIURL = "https://mailsac.com/api/addresses/";	
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();
public MuviPlayerPage(final boolean openPageURL) throws Exception {
		
        super(PlayButton, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
    }

private static final TextFieldElement LoginUserNameTextbox = new TextFieldElement("enter username in User name textbox ",
		locateByXPath("//input[@id='LoginForm_email']"));
private static final TextFieldElement LoginPassWordTextbox = new TextFieldElement("enter password in password textbox ",
		locateByXPath("//input[@id='LoginForm_password']"));
private static final ButtonElement LoginButton = new ButtonElement("Click login button to login",
		locateByXPath("//input[@class='btn btn-primary btn-large']"));
private static final ButtonElement MuviAdminPageLogo = new ButtonElement("Muvi Admin page logo",
		locateByXPath("//a[@href='https://admin.muvi.com/admin/manageuser']"));
private static final ButtonElement UsernameDisplay = new ButtonElement("Username Display",
		locateByXPath("//li[@class='dropdown user user-menu']//a[@href='#']//span"));


private static final ButtonElement LoginButton_HomePage = new ButtonElement("Click login button on homepage to login",
		locateByXPath("//a[@id='clk']"));
private static final ButtonElement LoginButton_LoginPage = new ButtonElement("Click login button to login",
		locateByXPath("//input[@id='btn-login']"));

private static final ButtonElement PreviewWebsite_Button = new ButtonElement("Click on preview website",
		locateByXPath("//a[@id='prev_btn_disable']"));

private static final ButtonElement Movie_Button = new ButtonElement("Click on Movie button",
		locateByXPath("//ul[@class='nav navbar-nav c-theme-nav']//li//a[contains(text(), 'Movie')]"));
private static final ButtonElement Register_Button_HomePage = new ButtonElement("Click on Register button",
		locateByXPath("//*[@class='register c-link']"));

private static final ButtonElement Register_Button = new ButtonElement("Click on Register button",
		locateByXPath("//ul[@class='nav navbar-nav c-theme-nav']//li//a[contains(text(), 'Register')]"));

private static final ButtonElement InSideMovie_MoviePlayButton = new ButtonElement("Click on Movie Play button",
		locateByXPath("(//div[@class='content-area']//a[contains(text(), 'Play Now')])[4]"));
private static final ButtonElement InSideMovie_MoviePlayButtongetText = new ButtonElement("get contain name  ",
		locateByXPath("(//div[@class='content-area']//div[2]/p[1])[4]"));

private static final ButtonElement InSideMovie_MoviePlayButton1 = new ButtonElement("Click on Movie Play button",
		locateByXPath("(//div[@class='content-area']//a)[29]"));
private static final ButtonElement SecondPage = new ButtonElement("Click on second page ",
		locateByXPath("//a[@id='pg_3']"));

private static final ButtonElement ProceedToPayment = new ButtonElement("Click on proceed to payment button ",
		locateByXPath("//button[@id='btn_proceed_payment']"));



private static final ButtonElement MoviePlay_RegisterButton = new ButtonElement("Click on Register button on Movie Play Section",
		locateByXPath("//a[@class='link-ylw txt-right'][contains(text(),'Register')]"));

private static final TextFieldElement Register_Name_RegisterPage = new TextFieldElement("enter name in name textbox ",
		locateByXPath("//input[@id='name']"));
private static final TextFieldElement Register_Email_RegisterPage = new TextFieldElement("enter Email in Email textbox ",
		locateByXPath("//input[@id='email_address']"));
private static final TextFieldElement Register_Password_RegisterPage = new TextFieldElement("enter Password in password textbox ",
		locateByXPath("//div[@class='col-sm-4']//input[@id='join_password']"));
private static final TextFieldElement Register_ConfirmPassword_RegisterPage = new TextFieldElement("enter confirm password in confirm password textbox ",
		locateByXPath("//input[@id='confirm_password']"));
private static final TextFieldElement Register_Address = new TextFieldElement("enter Address in address textbox ",
		locateByXPath("//textarea[@id='address']"));
private static final TextFieldElement Register_MobileNumber = new TextFieldElement("enter MobileNumber in MobileNumber textbox ",
		locateByXPath("//input[@id='mobile']"));
private static final TextFieldElement Register_Zip = new TextFieldElement("enter Zip in zip textbox ",
		locateByXPath("//textarea[@id='pin']"));
private static final CheckBoxElement Register_TermsCheckBox = new CheckBoxElement("Click terms checkbox",
		locateByXPath("//input[@required='required']"));



private static final ButtonElement Register_SignupButton = new ButtonElement("Click on Signup button on Registration page",
		locateByXPath("//form[@id='register_form']//div[contains(@class,'form-group')]//div[@class='controls pull-left']//button[@id='register-btn']"));
private static final TextFieldElement Register_Name = new TextFieldElement("enter name in name textbox ",
		locateByXPath("//form[@id='register_form']//div[@class='form-group']//input[@id='fullname']"));
private static final TextFieldElement Register_Email = new TextFieldElement("enter Email in Email textbox ",
		locateByXPath("//form[@id='register_form']//div[@class='form-group']//input[@id='email']"));
private static final TextFieldElement Register_Password = new TextFieldElement("enter Password in password textbox ",
		locateByXPath("//input[@id='join_password']"));
private static final TextFieldElement Register_ConfirmPassword = new TextFieldElement("enter confirm password in confirm password textbox ",
		locateByXPath("//input[@id='confirm_password']"));
private static final ButtonElement Register_MembershipButton = new ButtonElement("Click on Register button on Registration page",
		locateByXPath("//button[@id='register_membership']"));

private static final TextFieldElement NameOnCardTextbox = new TextFieldElement("enter name in  name on card textbox ",
		locateByXPath("//input[@id='card_name']"));
private static final TextFieldElement CardNumberTextbox = new TextFieldElement("enter card numberon card number textbox ",
		locateByXPath("//input[@id='card_number']"));
private static final TextFieldElement CardCVV = new TextFieldElement("enter cvv in  Card CVV textbox ",
		locateByXPath("//input[@id='security_code']"));
private static final ButtonElement PayNowButton = new ButtonElement("Click on PayNow button on Payment page",
				locateByXPath("//button[@id='paynowbtn']"));
private static final HtmlElement ProfileButton = new HtmlElement("Mouse over on profile ",
		locateByXPath("//li[@class='c-menu-type-classic']"));
private static final HtmlElement MonetizationMenuButton = new HtmlElement("Mouse over on Monetization Menu Button",
		locateByXPath("//li[@id='monetization-menu']"));
private static final HtmlElement WebsiteMenuButton = new HtmlElement("Mouse over on Monetization Menu Button",
		locateByXPath("//html//ul[@class='menu-wrap']/li[3]/a[1]"));

private static final ButtonElement PurchaseHistoryButton = new ButtonElement("Click on Purchase History button on Home page",
		locateByXPath("//li//a[contains(text(), 'Purchase History')]"));
private static final ButtonElement ProductName = new ButtonElement("Product Name",
		locateByXPath("//tr[@class='cart_item']/td[4]"));

private static final ButtonElement MonitizationSettingButton = new ButtonElement("click on Monitization Setting Button",
		locateByXPath("//a[@href='/monetization/settings']"));
private static final ButtonElement MonitizationSubscriptionsButton = new ButtonElement("click on Monitization Subscriptions Button",
		locateByXPath("//a[@href='/subscriptions/subscriptions']"));
private static final ButtonElement TemplatesButton = new ButtonElement("click on Monitization Subscriptions Button",
		locateByXPath("//html//ul[@class='menu-wrap']/li[3]/ul[1]/li[1]/a[1]"));


private static final CheckBoxElement SubscriptionCheckBox = new CheckBoxElement("click on Subscription checkbox",
		locateByXPath("//input[@id='subscription']"));
private static final CheckBoxElement PPVCheckBox = new CheckBoxElement("click on PPV checkbox",
		locateByXPath("//input[@id='ppv']"));

private static final ButtonElement UpdateButton = new ButtonElement("Click on update button",
		locateByXPath("//button[@id='updatebtn']"));

private static final HtmlElement Player_Play = new HtmlElement("Click on play button on player page",
		locateById("video_block_html5_api"));
private static final ButtonElement PlayButton = new ButtonElement("Click on Play button",
		locateByXPath("//a[@href='javascript:void(0);'][contains(text(),'Play Now')]"));

String ExpMonth = "//select[@id='exp_month']";
String ExpYear = "//select[@id='exp_year']";
String Country = "//select[@id='countr']";
		
public MuviPlayerPage Textbox(TextFieldElement element,final String Text) throws Exception {
	waitForSeconds(2);
	element.clearAndType(Text);
    return this;
} 
public MuviPlayerPage MouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.mouseOver();
    return this;
} 
 

 public MuviPlayerPage Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
        return this;
    }
 public MuviPlayerPage Click1(ButtonElement element) throws Exception {
	 waitForSeconds(10);
 	try {
	    element.click();
 	}catch(Exception e) {
 		
 	}
     return this;
 }
 public MuviPlayerPage Scroll(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.scroll();
     return this;
 }
 
 
 public MuviPlayerPage SimulateClick(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.simulateClick();
     return this;
 }
 public MuviPlayerPage HtmlvideoPlayerPlay(HtmlElement element) throws Exception {
	 waitForSeconds(2);
	    element.HtmlvideoPlayerPlay();
     return this;
 }
 public MuviPlayerPage HtmlvideoPlayerPause(HtmlElement element) throws Exception {
	 waitForSeconds(2);
	    element.HtmlvideoPlayerPause();
     return this;
 }
 public MuviPlayerPage HtmlvideoPlayerDragTimeForward(HtmlElement element,int value) throws Exception {
	 waitForSeconds(2);
	    element.HtmlvideoPlayerDragTimeForward(value);;
     return this;
 }
 
 public MuviPlayerPage selectNewTab() throws Exception {
	 waitForSeconds(2);
 	selectNewWindow();
	return this;
     
 }
 public MuviPlayerPage SelectWindow(int index) throws Exception {
	 waitForSeconds(2);
	 	selectWindow(index);
		return this;
	     
	 }
 
 public MuviPlayerPage Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }
 public MuviPlayerPage SelectByList(final String Text,String xpath) throws Exception {
	 waitForSeconds(5);
	SelectList s = new SelectList(Text, By.xpath(xpath));
	s.selectByValue(Text);
		return this;
	     
	 }
 public MuviPlayerPage SelectByListIndex(final int index,String xpath) throws Exception {
	 waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByIndex(index);
			return this;
		     
		 }
 
// public MuviPlayerPage Table_GetRowContain(final String Text,String xpath) throws Exception {
//		wait(5);
//		Table s = new Table(Text, By.xpath(xpath));
//		s.getRows();
//		s.getColumns();
//		for(int i=0;i<=((s.getRows().size())-1);i++) {
//			for(int j=0;j<=((s.getColumns().size())-1);j++) {
//			if(s.getColumns().get(i).getText().equalsIgnoreCase("All Content"));
//		}
//		}
//			return this;
//		     
//		 }
 public MuviPlayerPage GoBack() throws Exception {
		
		goBack();
			return this;
		     
		 }
 
 public MuviPlayerPage Uncheck(final CheckBoxElement element ) throws Exception {
		
	       element.uncheck();
			return this;
		     
		 }
 public MuviPlayerPage Check(final CheckBoxElement element ) throws Exception {
		
     element.check();
		return this;
	     
	 }
 public MuviPlayerPage GetCompairText(final MuviData MuviData,ButtonElement element) throws Exception {
		
	       MuviData.setTextCompair(element.getText());
			return this;
		     
		 }
 
 public MuviPlayerPage randomData(final MuviData MuviData) throws Exception {
	 	
	 	
	  
	       MuviData.setEmail(RandomEmailID.randomEmail());
	       MuviData.setName(RandomName.name());
	       MuviData.setPassword(RandomPassword.password(10));
	       MuviData.setMobilenumber(RandomMobileNo.randomMobileNo());
	       MuviData.setAddress(RandomAddress.address());
	       MuviData.setZip(RandomZip.zip());
	      
	 	
		return this;
	     
	 }
 public String executeQuery(final String query,Object ColumnName) throws ClassNotFoundException, SQLException {
	     
     if(!mastermap.containsKey(query)) {
    	 //System.out.println("inner"+query);
    	 Map<Object,Object> map =  DbManager2.executeQuery(getSQLDomain(),"srikanta","cv8voMjWFo",query);
     } 
     
			 
	 
    return mastermap.get(query).get(ColumnName).toString();
 }
 public static String getSQLDomain() {
	    URL = MuviPage.url;
	    if(URL.contains("edocent")) {
	    	URL="jdbc:mysql://preprod.cagqnk2yhltv.us-east-1.rds.amazonaws.com:3306/edocent";
	    }else if(URL.contains("idogic")) {
	    	URL="jdbc:mysql://preprod.cagqnk2yhltv.us-east-1.rds.amazonaws.com:3306/studio";
	    }else {
	    	URL="jdbc:mysql://192.168.207.177:3310/";
	    }
		String SQL_URL = URL;
		return SQL_URL;
		
	}
 
 public String getAPI(final MuviData MuviData)  {
	 waitForSeconds(5);
	 RestExecutor executor = new RestExecutor(APIURL);
		 
		System.out.println(executor.get(MuviData.getEmail()+"/messages").printBodyString());
		return executor.get(MuviData.getEmail()+"/messages").printBodyString();
 }
 
 
 public MuviPlayerPage AssertEquals(final String actualText,final String expectedText) throws Exception {
	 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
     return this;
    }
 public MuviPlayerPage AssertFalse(final Boolean actualText) throws Exception {
	 assertFalse(actualText,"Text should not be visible but now its visible");
     return this;
    }
 public MuviPlayerPage AssertTrue(final Boolean actualText) throws Exception {
	 assertTrue(actualText,"Text should  be visible but now its not visible");
     return this;
    }
 
 public MuviPlayerPage LoginInMuviAdmin(final MuviData MuviData) throws Exception {
 	return    Textbox(LoginUserNameTextbox,MuviData.getLoginUserName())
 			 .Textbox(LoginPassWordTextbox,MuviData.getLoginPassWord())
 			 .Click(LoginButton)
 			 .AssertTrue(MuviAdminPageLogo.isDisplayed())
 			 .AssertEquals(UsernameDisplay.getText(), MuviData.getLoginName());
 }
 public MuviPlayerPage Register_Taking_Up_All_Content_Subscription_Plan(final MuviData MuviData) throws Exception {
	 return    Click(LoginButton_HomePage)
			  .Textbox(LoginUserNameTextbox,MuviData.getLoginUserName())
 			  .Textbox(LoginPassWordTextbox,MuviData.getLoginPassWord())
 			  .Click(LoginButton_LoginPage)
 			  .MouseOver(MonetizationMenuButton)
 			  .Click1(MonitizationSubscriptionsButton)
			  //.MouseOver(WebsiteMenuButton)
			  //.Wait(10)
			  //.Click(TemplatesButton)
			  .Click(PreviewWebsite_Button)
 			  .selectNewTab()
 			  .Click(Register_Button_HomePage)
 			  .randomData(MuviData)
 			  .Textbox(Register_Name_RegisterPage,MuviData.getName())
			  .Textbox(Register_Email_RegisterPage,MuviData.getEmail())
			  .Textbox(Register_Password_RegisterPage,MuviData.getPassword())
			  .Textbox(Register_ConfirmPassword_RegisterPage,MuviData.getPassword())
			  .Textbox(Register_Address, MuviData.getAddress())
			  .Textbox(Register_MobileNumber, MuviData.getMobilenumber())
			  .SelectByList(MuviData.getCountry(),Country)
			  .Textbox(Register_Zip, MuviData.getZip())
			  .Check(Register_TermsCheckBox)
			  .Textbox(NameOnCardTextbox,MuviData.getName())
 			  .Textbox(CardNumberTextbox,MuviData.getCardnumber())
 			  .SelectByListIndex(MuviData.getExpmonth(),ExpMonth)
 			  .SelectByList(MuviData.getExpyear(),ExpYear)
 			  .Textbox(CardCVV,MuviData.getCvv())
 			  .Click(Register_MembershipButton)
 			  .Wait(10)
 			  .AssertTrue(getAPI(MuviData).contains("\"address\":\""+MuviData.getLoginUserName()+"\""))
		      .AssertTrue(getAPI(MuviData).contains("\"subject\":\"Welcome to Classic Template Test\""))
		      .AssertEquals(executeQuery((MuviData.getQuery()+"'"+MuviData.getEmail()+"'"),"display_name"),MuviData.getName())
		      .Wait(10)
 			  .GoBack()
 			  .MouseOver(ProfileButton)
 			  ;
 }
 public MuviPlayerPage  Register_Subscription_Notenabled(final MuviData MuviData) throws Exception {
	 return    Click(LoginButton_HomePage)
			  .Textbox(LoginUserNameTextbox,MuviData.getLoginUserName())
 			  .Textbox(LoginPassWordTextbox,MuviData.getLoginPassWord())
 			  .Click(LoginButton_LoginPage)
 			  .Wait(5)
 			  .MouseOver(MonetizationMenuButton)
 			  .Click(MonitizationSettingButton)
 			  .Uncheck(SubscriptionCheckBox)
 			  .Scroll(UpdateButton)
 			  .Click(UpdateButton)
 			  .Click(PreviewWebsite_Button)
 			  .selectNewTab()
 			  .Click(Register_Button)
 			  .randomData(MuviData)
 			  .Textbox(Register_Name_RegisterPage,MuviData.getName())
			  .Textbox(Register_Email_RegisterPage,MuviData.getEmail())
			  .Textbox(Register_Password_RegisterPage,MuviData.getPassword())
			  .Textbox(Register_ConfirmPassword_RegisterPage,MuviData.getPassword())
			  .Textbox(Register_Address, MuviData.getAddress())
			  .Textbox(Register_MobileNumber, MuviData.getMobilenumber())
			  .SelectByList(MuviData.getCountry(),Country)
			  .Textbox(Register_Zip, MuviData.getZip())
			  .Check(Register_TermsCheckBox)
			  .Click(Register_MembershipButton)
			  .SelectWindow(0)
			  .MouseOver(MonetizationMenuButton)
 			  .Click(MonitizationSettingButton)
 			  .Check(SubscriptionCheckBox)
 			  .Scroll(UpdateButton)
 			  .Click(UpdateButton)
 			  ;
 }
 
 public MuviPlayerPage Purchase_Single_Part_Content(final MuviData MuviData) throws Exception {
	 return    Click(LoginButton_HomePage)
			  .Textbox(LoginUserNameTextbox,MuviData.getLoginUserName())
 			  .Textbox(LoginPassWordTextbox,MuviData.getLoginPassWord())
 			  .Click(LoginButton_LoginPage)
 			  .Wait(5)
 			  .MouseOver(MonetizationMenuButton)
			  .Click(MonitizationSettingButton)
			  .Check(PPVCheckBox)
			  .Scroll(UpdateButton)
			  .Click(UpdateButton)
 			  .Click(PreviewWebsite_Button)
 			  .selectNewTab()
 			  .Click(Movie_Button) 
 			
 			  //.Scroll(InSideMovie_MoviePlayButton1)
 			  //.SimulateClick(SecondPage)
 			  .Wait(4)
 			  .GetCompairText(MuviData, InSideMovie_MoviePlayButtongetText)
 			  .SimulateClick(InSideMovie_MoviePlayButton)
 			  .Click(MoviePlay_RegisterButton)
 			  .randomData(MuviData)
 			  .Textbox(Register_Name,MuviData.getName())
 			  .Textbox(Register_Email,MuviData.getEmail())
 			  .Textbox(Register_Password,MuviData.getPassword())
 			  //.Textbox(Register_ConfirmPassword,MuviData.getPassword())
 			  .Textbox(Register_Address, MuviData.getAddress())
 			  .Textbox(Register_MobileNumber, MuviData.getMobilenumber())
 			  .SelectByList(MuviData.getCountry(),Country)
 			  .Textbox(Register_Zip, MuviData.getZip())
 			  .Check(Register_TermsCheckBox)
 			  .Click(Register_SignupButton)
 			  .Wait(4)
 			  .AssertTrue(getAPI(MuviData).contains("\"address\":\""+MuviData.getLoginUserName()+"\""))
		      .AssertTrue(getAPI(MuviData).contains("\"subject\":\"Welcome to Classic Template Test\""))
		      .AssertEquals(executeQuery((MuviData.getQuery()+"'"+MuviData.getEmail()+"'"),"display_name"),MuviData.getName())
		      .Wait(4)
		      .Click(ProceedToPayment)
 			  .Wait(4)
 			  .Textbox(NameOnCardTextbox,MuviData.getName())
 			  .Textbox(CardNumberTextbox,MuviData.getCardnumber())
 			  .SelectByListIndex(MuviData.getExpmonth(),ExpMonth)
 			  .SelectByList(MuviData.getExpyear(),ExpYear)
 			  .Textbox(CardCVV,MuviData.getCvv())
 			  .Click(PayNowButton)
 			  .Wait(10)
 			  .GoBack()
 			  .MouseOver(ProfileButton)
 			  .SimulateClick(PurchaseHistoryButton)
 			  .AssertEquals(MuviData.getTextCompair(),ProductName.getText())
 			  
 			  ;
 }
 public MuviPlayerPage player(final MuviPlayerData MuviPlayerData) throws Exception {
	 return   Click(PlayButton)
			 .HtmlvideoPlayerPlay(Player_Play)
			 .HtmlvideoPlayerPause(Player_Play)
	         .HtmlvideoPlayerDragTimeForward(Player_Play,10);
}
}
