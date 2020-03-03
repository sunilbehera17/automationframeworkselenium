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

public class WebUILoginPage extends PageObject{
	public static String url = null;
	public static String URL = null;
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public WebUILoginPage(final boolean openPageURL) throws Exception {
	
    super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}

private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ",
		locateByXPath("//html"));
private static final ButtonElement click_on_login = new ButtonElement("Click on login button",
		locateByXPath("//a[@id='clk']"));
private static final TextFieldElement LoginUserNameTextbox = new TextFieldElement("enter username in User name textbox ",
		locateByXPath("//input[@id='email']"));
private static final TextFieldElement LoginPassWordTextbox = new TextFieldElement("enter password in password textbox ",
		locateByXPath("//input[@id='password']"));
private static final ButtonElement LoginButton_LoginPage = new ButtonElement("Click login button to login",
		locateByXPath("//input[@id='login']"));
private static final TextFieldElement LoginUserNameTextbox1 = new TextFieldElement("enter username in User name textbox ",
		locateByXPath("//input[@id='LoginForm_email']"));
private static final TextFieldElement LoginPassWordTextbox1 = new TextFieldElement("enter password in password textbox ",
		locateByXPath("//input[@id='LoginForm_password']"));
private static final ButtonElement LoginButton_LoginPage1 = new ButtonElement("Click login button to login",
		locateByXPath("//input[@id='btn-login']"));

//end user login

private static final ButtonElement clickOnLoginEndUser = new ButtonElement("Click on Preview button",
		locateByXPath("//a[@class='login']"));
private static final TextFieldElement loginUserNameEndUserTextbox = new TextFieldElement("enter username in User name textbox ",
		locateByXPath("//div[@class='controls']//input[@id='username']"));
private static final TextFieldElement loginPassWordEndUserTextbox = new TextFieldElement("enter password in password textbox ",
		locateByXPath("//div[@class='col-md-6']//input[@id='password']"));
private static final ButtonElement loginButtonEndUserLoginPage = new ButtonElement("Click login button to login",
		locateByXPath("//div[@class='form-group']//button[@id='login-btn']"));









public WebUILoginPage Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
     return this;
 }
public WebUILoginPage Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }

public WebUILoginPage Textbox(TextFieldElement element,final String Text) throws Exception {
	
	element.clearAndType(Text);
    return this;
}

public WebUILoginPage Uncheck(final CheckBoxElement element ) throws Exception {
	
    element.uncheck();
		return this;
	     
	 }
public WebUILoginPage Check(final CheckBoxElement element ) throws Exception {
	
element.check();
	return this;
  
}


public String URL() throws Exception {
	
String matchvalue=driver.getCurrentUrl();



	return matchvalue;
  
}




public CmsDashBoard ClickOnLogIn(WebUIData WebUIData) throws Exception 
{
    		if(URL().matches("http(s?)://cms(.*)"))
    		{
    			 
       		  Textbox(LoginUserNameTextbox, WebUIData.getLoginUserName())
   			 .Textbox(LoginPassWordTextbox, WebUIData.getLoginPassWord())
   			 .Click(LoginButton_LoginPage)
   			 .Wait(10)
   			     		
       		;
    		}
    		else
    		{
    		  Click(click_on_login).Wait(2)
       		 .Textbox(LoginUserNameTextbox1, WebUIData.getLoginUserName())
   			 .Textbox(LoginPassWordTextbox1, WebUIData.getLoginPassWord())
   			 .Click(LoginButton_LoginPage1)
   			 .Wait(10)
   			     		
       		;
    			
    		}
    		
    		 
    		 return new CmsDashBoard(false);
	
}






public VerifyEndUserPreview ClickOnLogInForEndUser(WebUIData WebUIData) throws Exception 
{

    return new VerifyEndUserPreview(false)
    		 .Wait(5)
    		 .Click(clickOnLoginEndUser)
    		 .Textbox(loginUserNameEndUserTextbox, WebUIData.getLoginUserName())
			 .Textbox(loginPassWordEndUserTextbox, WebUIData.getLoginPassWord())
			 .Click(loginButtonEndUserLoginPage)
			 .Wait(10)
			     		
    		;
	
}


	
	
	
	
}
