

/*
 * Copyright © 2018 www.muvi.com
 *
 * @author  Sunil Kumar Behera <sunilkumar@muvi.com>
 */

package com.seleniumtests.webpage;


import static com.seleniumtests.core.Locator.locateByLinkText;
import static com.seleniumtests.core.Locator.locateByXPath;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.JavascriptExecutor;
import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.CompanyName;

import com.seleniumtests.dataobject.NewRandomData;
import com.seleniumtests.dataobject.RandomAddress;
import com.seleniumtests.dataobject.RandomEmailID;
import com.seleniumtests.dataobject.RandomMobileNo;
import com.seleniumtests.dataobject.RandomName;
import com.seleniumtests.dataobject.RandomNewStateName;
import com.seleniumtests.dataobject.RandomPassword;
import com.seleniumtests.dataobject.RandomZip;
import com.seleniumtests.dataobject.WebUIData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.TextFieldElement;


public class WebUISignUP extends PageObject{
	public static String url = null;
	public static String URL = null;
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public WebUISignUP(final boolean openPageURL) throws Exception {
	
    super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}

private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ",
		locateByXPath("//html"));
private static final ButtonElement LoginButton_freeRegistration = new ButtonElement("Click on free trial",
		locateByLinkText("Start free trial"));
private static final TextFieldElement NameTextbox = new TextFieldElement("Enter name in name textbox.",
		locateByXPath(".//*[@id='name']"));
private static final TextFieldElement companynameTextbox = new TextFieldElement("Enter company name in textbox ",
		locateByXPath(".//*[@id='companyname']"));
private static final TextFieldElement emailTextbox = new TextFieldElement("Enter email in email textbox ",
		locateByXPath(".//*[@id='email']"));
private static final TextFieldElement passwordTextbox = new TextFieldElement("Enter password in password textbox ",
		locateByXPath(".//*[@id='inputPassword']"));
private static final TextFieldElement phonenumberTextbox = new TextFieldElement("Enter phone number in phone number textbox",
		locateByXPath(".//*[@id='userinfo']/div[3]/div/input"));
private static final CheckBoxElement Aggrement_Check_Box = new CheckBoxElement("Click on terms checkbox",
		locateByXPath("//input[@name='terms']"));//.//*[@id='userinfo']/div[7]/div/label/input
private static final ButtonElement next_freeRegistration = new ButtonElement("Click on next button",
		locateByXPath(".//*[@id='nextbtn']"));

 static final ButtonElement Subscription_Vedio = new ButtonElement("Click on video link for subscription",
		locateByXPath("//img[@src[contains(.,'Content-Video-on-demand_blue.png')]]/.."));
private static final ButtonElement Subscription_Audio = new ButtonElement("Click on Audio link for subscription",
		locateByXPath("//img[@src[contains(.,'Content-Audio-streming.png')]]/.."));
private static final ButtonElement Subscription_Physical = new ButtonElement("Click on Physical link for Physical subscription",
		locateByXPath("//img[@src[contains(.,'physical_goods_icon.png')]]"));

private static final ButtonElement Platform_Website = new ButtonElement("Click on Website platform",
		locateByXPath("//img[@src[contains(.,'Platform_website_blue.png')]]"));
private static final ButtonElement Platform_iOS_App = new ButtonElement("Click on iOS App platform",
		locateByXPath("//img[@src[contains(.,'Platform_ios.png')]]"));
private static final ButtonElement Platform_Android_App = new ButtonElement("Click on Android App platform",
		locateByXPath("//img[@src[contains(.,'Platform_android.png')]]"));
private static final ButtonElement Platform_Roku_App  = new ButtonElement("Click on Roku App platform",
		locateByXPath("//img[@src[contains(.,'Platform_Roku.png')]]"));
private static final ButtonElement Platform_Fire_TV_App = new ButtonElement("Click on Fire TV App platform",
		locateByXPath("//img[@src[contains(.,'Platform_Fire_TV.png')]]"));
private static final ButtonElement Platform_Apple_TV_App = new ButtonElement("Click on    Apple TV App   platform",
		locateByXPath("//img[@src[contains(.,'Platform_apple_tv.png')]]"));
private static final ButtonElement Platform_Android_TV_App = new ButtonElement("Click on   Android TV App  platform",
		locateByXPath("//img[@src[contains(.,'Platform_android_tv.png')]]"));
private static final ButtonElement Platform_Samsung_TV = new ButtonElement("Click on Samsung TV  ",
		locateByXPath("//img[@src[contains(.,'tizen.png')]]/.."));
private static final ButtonElement Platform_Muvi_Server = new ButtonElement("Click on Muvi Server platform",
		locateByXPath("//img[@src[contains(.,'muvi_server.png')]]"));

private static final ButtonElement Subscription = new ButtonElement("Click on Subscription",
		locateByXPath("//img[@src[contains(.,'Monetization_subscription_blue.png')]]"));
private static final ButtonElement Pay_Per_View = new ButtonElement("Click on Pay_Per_View",
		locateByXPath("//img[@src[contains(.,'Monetization_pay_per_view.png')]]/.."));
private static final ButtonElement Advertising = new ButtonElement("Click on Advertising",
		locateByXPath("//img[@src[contains(.,'Monetization_Video_ads.png')]]/.."));




public WebUISignUP SelectSubscription(String Subscriptiondata,String Subscriptionvalue) throws Exception {
	   
	
	
	
	if((Subscriptiondata.equalsIgnoreCase("audio"))&&(Subscriptionvalue.equalsIgnoreCase("audio")))
	{
		
		final ButtonElement ClickOnAudio = new ButtonElement("Click on Subscription Audio", 
				locateByXPath("//img[@src[contains(.,'Content-Audio-streming.png')]]/.."));
		final ButtonElement ClickOnVideo = new ButtonElement("Click on Subscription Video", 
				locateByXPath("//img[@src[contains(.,'Content-Video-on-demand_blue.png')]]/.."));
		
		ClickOnVideo.click();
		ClickOnAudio.click();
		
		
		

	}else if((Subscriptiondata.equalsIgnoreCase("vedio"))&&(Subscriptionvalue.equalsIgnoreCase("vedio")))
	{
		
		
		final ButtonElement ClickOnVideo = new ButtonElement("Click on Subscription Video", 
				locateByXPath("//img[@src[contains(.,'Content-Video-on-demand_blue.png')]]/.."));
		
		ClickOnVideo.click();
		ClickOnVideo.click();
		
	}else if((Subscriptiondata.equalsIgnoreCase("physical"))&&(Subscriptionvalue.equalsIgnoreCase("physical")))
	{
		
		final ButtonElement ClickOnPhysical = new ButtonElement("Click on Subscription Physical", 
				locateByXPath("//img[@src[contains(.,'physical_goods_icon.png')]]/.."));
		final ButtonElement ClickOnVideo = new ButtonElement("Click on Subscription Video", 
				locateByXPath("//img[@src[contains(.,'Content-Video-on-demand_blue.png')]]/.."));
		
		ClickOnVideo.click();
		ClickOnPhysical.click();
		
	}else if(((Subscriptiondata.equalsIgnoreCase("audio"))&&(Subscriptionvalue.equalsIgnoreCase("vedio"))) || 
			((Subscriptiondata.equalsIgnoreCase("vedio"))&&(Subscriptionvalue.equalsIgnoreCase("audio"))))
	{
		final ButtonElement ClickOnAudio = new ButtonElement("Click on Subscription Audio", 
				locateByXPath("//img[@src[contains(.,'Content-Audio-streming.png')]]/.."));
		ClickOnAudio.click();
		
	}else if(((Subscriptiondata.equalsIgnoreCase("audio"))&&(Subscriptionvalue.equalsIgnoreCase("physical")))
			||((Subscriptiondata.equalsIgnoreCase("physical"))&&(Subscriptionvalue.equalsIgnoreCase("audio"))))
	{
		final ButtonElement ClickOnPhysical = new ButtonElement("Click on Subscription Physycal", 
				locateByXPath("//img[@src[contains(.,'physical_goods_icon.png')]]/.."));
		final ButtonElement ClickOnVideo = new ButtonElement("Click on Subscription Video", 
				locateByXPath("//img[@src[contains(.,'Content-Video-on-demand_blue.png')]]/.."));
		final ButtonElement ClickOnAudio = new ButtonElement("Click on Subscription Audio", 
				locateByXPath("//img[@src[contains(.,'Content-Audio-streming.png')]]/.."));
		ClickOnAudio.click();
		ClickOnVideo.click();
		ClickOnPhysical.click();
		
	}else if(((Subscriptiondata.equalsIgnoreCase("vedio"))&&(Subscriptionvalue.equalsIgnoreCase("physical"))) ||
			((Subscriptiondata.equalsIgnoreCase("physical"))&&(Subscriptionvalue.equalsIgnoreCase("vedio"))))
	{
		final ButtonElement ClickOnPhysical = new ButtonElement("Click on Subscription Physical", 
				locateByXPath("//img[@src[contains(.,'physical_goods_icon.png')]]/.."));
				
		ClickOnPhysical.click();
		
	}else
	{
		SimulateClick(Subscription_Audio)
		.SimulateClick(Subscription_Physical)
		
		
		;
		
	}
	   
  return this;
}





public WebUISignUP Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
     return this;
 }
public WebUISignUP Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }
public WebUISignUP pageScrollDown() throws Exception
{
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,1000)");
	
	return this;
}

public WebUISignUP randomData(final WebUIData WebUIData) throws Exception 
{
 	
    WebUIData.setName(RandomName.name());
    WebUIData.setComanyname(CompanyName.comanyName());
    WebUIData.setMobilenumber(RandomMobileNo.randomMobileNo());
    WebUIData.setEmail(RandomEmailID.randomEmail());
    WebUIData.setPassword(RandomPassword.password(10));
    WebUIData.setAddress(RandomAddress.address());
    WebUIData.setState(RandomNewStateName.state());
    WebUIData.setZip(RandomZip.zip());
    WebUIData.setTodaydate(NewRandomData.todayDate());
    
	
	//Updated new random data for muvi6
	
    WebUIData.setNameNew(NewRandomData.newRandomName());
    WebUIData.setCompanyNew(NewRandomData.newRandomCompanyName());
    WebUIData.setPasswordNew(NewRandomData.newRandomPassword());
    WebUIData.setPhonenuberNew(NewRandomData.newRandomPhoneNumber());
    WebUIData.setEmailNew(NewRandomData.newRandomEmail());
	 
      
	
	return this;
  
}

public WebUISignUP Textbox(TextFieldElement element,final String Text) throws Exception {
	waitForSeconds(2);
	element.clearAndType(Text);
    return this;
}

public WebUISignUP Uncheck(final CheckBoxElement element ) throws Exception {
	
    element.uncheck();
		return this;
	     
	 }
public WebUISignUP Check(final CheckBoxElement element ) throws Exception {
	
element.check();
	return this;
  
}
public WebUISignUP SimulateClick(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.simulateClick();
   return this;
}






public WebUIPage signUpWithAllData(WebUIData WebUIData) throws Exception 
{

    
    		  Click(LoginButton_freeRegistration)
			 .randomData(WebUIData)
			 .Textbox(NameTextbox,WebUIData.getName())
			 .Textbox(companynameTextbox,WebUIData.getComanyname())
			 .Textbox(phonenumberTextbox, WebUIData.getMobilenumber())
			 .Textbox(emailTextbox, WebUIData.getEmail())
			 .Textbox(passwordTextbox, "Test@12345678")
			 .pageScrollDown()
			 .Check(Aggrement_Check_Box)
			 .SimulateClick(next_freeRegistration)
			 .pageScrollDown()
			 .SimulateClick(next_freeRegistration)
			 .Wait(15)
    		
    		;
    		  return new WebUIPage(false);
    		//em[@class='icon-globe left-icon']
    		//a[contains(text(),'Templates')]
    		//a[contains(text(),'Manage Template')]
    		//h4//a[contains(text(),'Modern')]//..//..//..//..//a[contains(text(),'Activate')]
    		//button[@class='confirm']
    		//div[@class='col-sm-4 text-right']//button[1]
    		  //Purchase Subscription
}


public WebUIPage signUpWithSelectedData(WebUIData WebUIData) throws Exception 
{

    return new WebUIPage(false)
    		 .Click(LoginButton_freeRegistration)
			 //.randomData(WebUIData)
			 .Textbox(NameTextbox,WebUIData.getName())
			 .Textbox(companynameTextbox,WebUIData.getComanyname())
			 .Textbox(phonenumberTextbox, WebUIData.getMobilenumber())
			 .Textbox(emailTextbox, WebUIData.getEmail())
			 .Textbox(passwordTextbox, WebUIData.getPassword())
			 .pageScrollDown()
			 .Check(Aggrement_Check_Box)
			 .SimulateClick(next_freeRegistration)
			 /*.Wait(10)
			 .Click(Subscription_Audio)
			 
			 .Click(Platform_Android_TV_App)
			 .Click(Platform_Samsung_TV)
			 .Click(Platform_Muvi_Server)
			 .Wait(5)
			 .Click(Pay_Per_View)
			 .Click(Advertising)
			 .Wait(5)*/
			 .pageScrollDown()
			 .SimulateClick(next_freeRegistration)
			 .Wait(10)
			 
    		;
    
	
}









}