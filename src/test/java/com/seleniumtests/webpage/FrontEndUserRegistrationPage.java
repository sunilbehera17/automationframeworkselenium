/*
 * Copyright © 2018 www.muvi.com
 *
 * @author  Sunil Kumar Behera <sunilkumar@muvi.com>
 */

package com.seleniumtests.webpage;


import static com.seleniumtests.core.Locator.locateByXPath;

import java.util.HashMap;
import java.util.Map;

import com.seleniumtests.core.SeleniumTestsContextManager;

import com.seleniumtests.dataobject.WebUIData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.TextFieldElement;

public class FrontEndUserRegistrationPage extends PageObject{
	public static String url = null;
	public static String URL = null;
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public FrontEndUserRegistrationPage(final boolean openPageURL) throws Exception {
	
    super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}

private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ",
		locateByXPath("//html"));
private static final ButtonElement clickOnRegisterButton = new ButtonElement("Click on resgister button",
		locateByXPath("//a[@class='register']"));
private static final TextFieldElement CustomerNameTextbox = new TextFieldElement("enter customer name in  textbox ",
		locateByXPath("//input[@id='name']"));
private static final TextFieldElement emailTextbox = new TextFieldElement("enter email in  textbox ",
		locateByXPath("//input[@id='email_address']"));
private static final TextFieldElement PasswordTextbox = new TextFieldElement("enter password in  textbox ",
		locateByXPath("//div[@class='col-sm-4']//input[@id='join_password']"));
private static final TextFieldElement ConfirmPasswordNameTextbox = new TextFieldElement("enter confirm password in  textbox ",
		locateByXPath("//input[@id='confirm_password']"));
private static final TextFieldElement CardNunberTextbox = new TextFieldElement("enter card number in  textbox ",
		locateByXPath("//input[@id='card_number']"));
private static final TextFieldElement CardNameTextbox = new TextFieldElement("enter card name in  textbox ",
		locateByXPath("//input[@id='card_name']"));
private static final TextFieldElement securitycodeTextbox = new TextFieldElement("enter security text in  textbox ",
		locateByXPath("//input[@id='security_code']"));
private static final ButtonElement clickOnSaveButton = new ButtonElement("Click on login button",
		locateByXPath("//button[@id='register_membership']"));
private static final ButtonElement playNowButton = new ButtonElement("Click on playnow button",
		locateByXPath("//span[contains(text(),'Test AutoGenerated flow')]/../..//a[contains(text(),'YouTube Nature')]/../..//a[@class='playbtn']"));
private static final ButtonElement clickOnProcessPaymentButton = new ButtonElement("Click on process payment button",
		locateByXPath("//button[@id='btn_proceed_payment']"));
private static final ButtonElement clickOnpaynowButton = new ButtonElement("Click on Pay now  button",
		locateByXPath("//select[@id='creditcard']"));




String paymentdropdown="//button[@id='paynowbtn']";
String month="//select[@id='exp_month']";
String year="//select[@id='exp_year']";














public FrontEndUserRegistrationPage Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
     return this;
 }
public FrontEndUserRegistrationPage Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }

public FrontEndUserRegistrationPage Textbox(TextFieldElement element,final String Text) throws Exception {
	
	element.clearAndType(Text);
    return this;
}

public FrontEndUserRegistrationPage Uncheck(final CheckBoxElement element ) throws Exception {
	
    element.uncheck();
		return this;
	     
	 }
public FrontEndUserRegistrationPage Check(final CheckBoxElement element ) throws Exception {
	
element.check();
	return this;
  
}


public String URL() throws Exception {
	
String matchvalue=driver.getCurrentUrl();



	return matchvalue;
  
}






public VerifyEndUserPreview ClickOnLogInForEndUser(WebUIData WebUIData) throws Exception 
{

    return new VerifyEndUserPreview(false)
    		 .Wait(5)
    		 .Click(clickOnRegisterButton)
    		 .Textbox(CustomerNameTextbox, WebUIData.getLoginUserName())
			 .Textbox(emailTextbox, WebUIData.getLoginPassWord())
			 .Textbox(PasswordTextbox, WebUIData.getLoginUserName())
			 .Textbox(ConfirmPasswordNameTextbox, WebUIData.getLoginPassWord())
			 .Textbox(CardNunberTextbox, WebUIData.getLoginUserName())
			 .Textbox(CardNameTextbox, WebUIData.getLoginPassWord())
			 .Textbox(securitycodeTextbox, WebUIData.getLoginUserName())
			 
			 .Click(clickOnSaveButton)
			 .Click(playNowButton)
			 .Click(clickOnProcessPaymentButton)
			 .Click(clickOnpaynowButton)
			 .Wait(10)
			     		
    		;
    
    
    
    
    
    
    
    
    
    
    
    
	
}


	
	
	
	
}
