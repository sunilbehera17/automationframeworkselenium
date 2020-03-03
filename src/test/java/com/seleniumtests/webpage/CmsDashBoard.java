/*
 * Copyright © 2018 www.muvi.com
 *
 * @author  Sunil Kumar Behera <sunilkumar@muvi.com>
 */

package com.seleniumtests.webpage;

import static com.seleniumtests.core.CustomAssertion.assertEquals;
import static com.seleniumtests.core.Locator.locateByXPath;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.core.TestLogging;
import com.seleniumtests.dataobject.WebUIData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;


public class CmsDashBoard extends PageObject{
	public static String url = null;
	public static String URL = null;
	
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public CmsDashBoard(final boolean openPageURL) throws Exception {
	
    super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}

private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ",
		locateByXPath("//html"));




//Add content
private static final HtmlElement Manage_Content = new HtmlElement("Mouse over on manage content Menu Button",
		locateByXPath("//em[contains(@class,'icon-film left-icon')]"));//div[@id='mCSB_1_container']/ul/li[2]/a
private static final ButtonElement Click_content_library = new ButtonElement("Click on content library",
		locateByXPath("//div[@id='mCSB_1_container']/ul/li[2]/ul/li[1]/a"));
private static final ButtonElement Click_Add_content_button = new ButtonElement("Click on content library",
		locateByXPath("//a[@href='/cmscontent/newContents']/button"));

//Mouse over on Website

private static final HtmlElement MouseoverWebsite = new HtmlElement("Mouse over on website",
		locateByXPath("//div[@id='mCSB_1_container']//em[@class='icon-globe left-icon']"));
private static final ButtonElement ClickOnTemplate = new ButtonElement("Click on Template",
		locateByXPath("//ul[@class='menu-wrap']/li[3]/ul/li[1]/a"));
private static final ButtonElement ClickOnHome = new ButtonElement("Click on home page",
		locateByXPath("//a[@href='/template/homepage']"));

//Click for preview button
private static final ButtonElement PreviewWebsite_Button = new ButtonElement("Click on preview website",
		locateByXPath("//a[@id='prev_btn_disable']"));


//Mouse over on user profile


private static final HtmlElement mouseoverUserprofile = new HtmlElement("Mouse over on user profile",
		locateByXPath("//em[@class='icon-user-follow left-icon']"));
private static final ButtonElement clickOnManageProfile = new ButtonElement("Click on Manage profile",
		locateByXPath("//a[@href='/userfeature/customprofile']"));

//Social Network intigration
private static final ButtonElement clickOnSocialNetworkIntigration = new ButtonElement("Click on Social Network Intigration",
		locateByXPath("//a[contains(text(),'Social network integration')]"));

//Social Network login
private static final ButtonElement clickOnFacebookLoginButton = new ButtonElement("Click on login ",
		locateByXPath("//input[@value='Log In']"));
private static final TextFieldElement  enterTextIntoLogin= new TextFieldElement("Enter username in username textbox ",
		locateByXPath("//input[@id='email']"));
private static final TextFieldElement  enterTextIntopassword= new TextFieldElement("Enter username in password textbox ",
		locateByXPath("//input[@id='pass']"));
private static final ButtonElement signInGmail = new ButtonElement("Gmail Sign In",
		locateByXPath("//a[contains(text(), 'Sign In')]"));
private static final TextFieldElement LoginGoogleUsername = new TextFieldElement("Enter username in username textbox ",
		locateByXPath("//input[@type='email']"));
private static final TextFieldElement LoginGooglePassword = new TextFieldElement("Enter password in password textbox ",
		locateByXPath("//input[@type='password']"));
private static final ButtonElement clickOnNextButton = new ButtonElement("Click on next button",
		locateByXPath("//div[@id='identifierNext']"));
private static final ButtonElement clickOnNextButton1 = new ButtonElement("Click on next button",
		locateByXPath("//span[contains(text(),'Next')]"));
private static final ButtonElement clicoOnLogInButton = new ButtonElement("Click on login button",
		locateByXPath("//button[@id='loginbutton']"));

//a[@class='login active']
private static final HtmlElement ActiveButtonText = new HtmlElement("Get active button text",
		locateByXPath("//button[@id='fbact']"));
private static final HtmlElement ActiveGoogleButtonText = new HtmlElement("Get active button text",
		locateByXPath("//button[@id='fbact_gp']"));
private static final ButtonElement ActiveGoogleButtonText1 = new ButtonElement("Click on Active button",
		locateByXPath("//button[@id='fbact_gp']"));

private static final ButtonElement ClickOnActiveButton = new ButtonElement("Click on Active button",
		locateByXPath("//button[@id='fbact']"));
private static final ButtonElement ClickOnConfirmButton = new ButtonElement("Click on confirm button",
		locateByXPath("//button[@class='confirm']"));
private static final HtmlElement Statusmessage = new HtmlElement("Status message matched",
		locateByXPath("//div[@class='alert alert-success alert-dismissable flash-msg m-t-20']"));



//Watch history setting

private static final ButtonElement clickOnSetting = new ButtonElement("Click on setting link",
		locateByXPath("//a[@href='/userfeature/Settings']"));


//Related content mouseover

private static final HtmlElement hoverManageContent = new HtmlElement("Click on Log in button", 
		locateByXPath("//em[@class='icon-film left-icon']"));

private static final ButtonElement clickOnContentLibrary = new ButtonElement("Click on Log in button", 
		locateByXPath("//a[contains(text(),'Content Library')]"));
private static final ButtonElement clickOnAddNewContent= new ButtonElement("Click on Log in button", 
		locateByXPath("//button[contains(text(),'Add Content')]"));


public CmsDashBoard selectNewTab() throws Exception
{
	 waitForSeconds(2);
	selectNewWindow();
	return this;
   
}


public CmsDashBoard SelectByText(final String Text,String xpath) throws Exception {
	 waitForSeconds(5);
	SelectList s = new SelectList(Text, By.xpath(xpath));
	s.selectByText(Text);
		return this;
	     
	 }




public CmsDashBoard SimulateClick(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.simulateClick();
  return this;
}

public CmsDashBoard AssertEquals(final String actualText,final String expectedText) throws Exception {
	 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
    return this;
   }
public CmsDashBoard Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
     return this;
 }

public CmsDashBoard Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }
public CmsDashBoard MouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.mouseOver();
    return this;
} 

public CmsDashBoard SimulateMouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.simulateMouseOver();
    return this;
}

public CmsDashBoard Check(final CheckBoxElement element ) throws Exception {
	 
    element.check();
		return this;
	     
	 }
public CmsDashBoard SelectWindow(int index) throws Exception {
	 waitForSeconds(2);
	 	selectWindow(index);
		return this;
	     
	 }
public CmsDashBoard pageScrollDown() throws Exception
{
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,1000)");
	
	return this;
}

public CmsDashBoard WindowSwitch(int val) throws Exception {
	TestLogging.logWebStep(
            "select new window", false);
    driver.switchTo().window((String)
            driver.getWindowHandles().toArray()[val]);
    waitForSeconds(1);
        
    
	  return this;
} 

public CmsDashBoard Textbox(TextFieldElement element,final String Text) throws Exception 
{
	
	element.clearAndType(Text);
    return this;
}
public CmsDashBoard AssertTrue(final Boolean actualText2) throws Exception {
	assertTrue(actualText2, "Text should  be visible but now its not visible");
	return this;
}


public ContentManage clickOnAddContentManage() throws Exception
{
	  MouseOver(Manage_Content)
	 .Click(Click_content_library)
	 .Click(Click_Add_content_button)
	 ;
	
	return new ContentManage(false);
}
	
public ContentManage clickOnRemoveContentManage() throws Exception
{
	Wait(5)
	  .SimulateMouseOver(Manage_Content)
	 .SimulateClick(Click_content_library)
	 
	 ;
	
	return new ContentManage(false);
}	



public FeaturedAndContent clickOnWebsite() throws Exception
{
	  Wait(5)
	 .SimulateMouseOver(MouseoverWebsite)
	 .SimulateClick(ClickOnTemplate)
	 .SimulateClick(ClickOnHome)
	 .Wait(5)
	 ;
	
	return new FeaturedAndContent(false);
}



public WebUILoginPage clickOnPreview() throws Exception
{
	 Click(PreviewWebsite_Button)
	.WindowSwitch(1)
	 ;
	
	return new WebUILoginPage(false);
}



public ManageUserProfilePage userFeature() throws Exception
{
	  Wait(5)
	 .SimulateMouseOver(mouseoverUserprofile)
	 .SimulateClick(clickOnManageProfile)
	 
	 .Wait(2)
	 ;
	
	return new ManageUserProfilePage(false);
}



public FacebookLoginAndGoogleLogin faceBookLogin() throws Exception
{
	  SimulateMouseOver(mouseoverUserprofile)
	 .SimulateClick(clickOnSocialNetworkIntigration)
	 
	 .Wait(5)
	 ;
	  
	 
	  
	  if(ActiveButtonText.getText().equalsIgnoreCase("Active Facebook Login"))
	  {
		 Click(ClickOnActiveButton)
		 .SimulateClick(ClickOnConfirmButton)
		 .AssertEquals(Statusmessage.getText(), "Status updated successfully.")
		 
		 ;
	  }
	  driver.get("https://muviwebuiltd.idogic.com/en/?preview=2");
	  
	
	return new FacebookLoginAndGoogleLogin(false);
}


public FacebookLoginAndGoogleLogin googleLogin() throws Exception
	{
		SimulateMouseOver(mouseoverUserprofile).SimulateClick(clickOnSocialNetworkIntigration)

				.Wait(5);

		if (ActiveGoogleButtonText.getText().equalsIgnoreCase("Active Google Login")) {
			Click(ActiveGoogleButtonText1).SimulateClick(ClickOnConfirmButton).AssertEquals(Statusmessage.getText(),
					"Status updated successfully.")

			;
		}
		driver.get("https://muviwebuiltd.idogic.com/en/?preview=2");

		return new FacebookLoginAndGoogleLogin(false);
}

public FacebookLoginAndGoogleLogin facebookLoginAlready(WebUIData WebUIData) throws Exception
	{
		SimulateMouseOver(mouseoverUserprofile).SimulateClick(clickOnSocialNetworkIntigration)

				.Wait(5);

		if ((ActiveButtonText.getText().equalsIgnoreCase("Active Facebook Login"))
				|| (ActiveButtonText.getText().equalsIgnoreCase("Deactive Facebook Login"))) {
			if (ActiveButtonText.getText().equalsIgnoreCase("Active Facebook Login")) {
				Click(ClickOnActiveButton).SimulateClick(ClickOnConfirmButton)
						.AssertEquals(Statusmessage.getText(), "Status updated successfully.")
						.Click(PreviewWebsite_Button).WindowSwitch(1).Wait(5);
				driver.get("https://www.facebook.com/");

				Textbox(enterTextIntoLogin, WebUIData.getLoginName())
						.Textbox(enterTextIntopassword, WebUIData.getLoginPassWord()).Click(clickOnFacebookLoginButton)
						.Wait(5).WindowSwitch(0);
				driver.get("https://muviwebuiltd.idogic.com/en/?preview=2");

			}

			if (ActiveButtonText.getText().equalsIgnoreCase("Deactive Facebook Login")) {
				Click(PreviewWebsite_Button).WindowSwitch(1);
				driver.get("https://www.facebook.com/");

				Textbox(enterTextIntoLogin, WebUIData.getLoginName())
						.Textbox(enterTextIntopassword, WebUIData.getLoginPassWord()).Click(clickOnFacebookLoginButton)
						.Wait(5).WindowSwitch(0);
				driver.get("https://muviwebuiltd.idogic.com/en/?preview=2");
			}
		}
	  
	
	return new FacebookLoginAndGoogleLogin(false);
}

public FacebookLoginAndGoogleLogin googlesLoginAlready(WebUIData WebUIData) throws Exception
	{
		SimulateMouseOver(mouseoverUserprofile).SimulateClick(clickOnSocialNetworkIntigration)

				.Wait(5);

		if ((ActiveGoogleButtonText.getText().equalsIgnoreCase("Active Google Login"))
				|| (ActiveGoogleButtonText.getText().equalsIgnoreCase("Deactive Google Login"))) {
			if (ActiveGoogleButtonText.getText().equalsIgnoreCase("Active Google Login")) {
				Click(ActiveGoogleButtonText1).SimulateClick(ClickOnConfirmButton)
						.AssertEquals(Statusmessage.getText(), "Status updated successfully.")
						.Click(PreviewWebsite_Button).WindowSwitch(1).Wait(5);
				driver.get("https://www.gmail.com");

				Click(signInGmail).AssertEquals(driver.getTitle(), "Sign in - Google Accounts").Wait(5)
						.Textbox(LoginGoogleUsername, WebUIData.getLoginName()).Click(clickOnNextButton).Wait(5)
						.Textbox(LoginGooglePassword, WebUIData.getLoginPassWord()).Click(clickOnNextButton1).Wait(5)
						.Click(clicoOnLogInButton).Wait(5).WindowSwitch(0);
				driver.get("https://muviwebuiltd.idogic.com/en/?preview=2");

			}

			if (ActiveGoogleButtonText.getText().equalsIgnoreCase("Deactive Google Login")) {
				Wait(5).Click(PreviewWebsite_Button).Wait(5).WindowSwitch(1);
				driver.get("https://www.gmail.com");

				AssertEquals(driver.getTitle(), "Gmail").Wait(5).Textbox(LoginGoogleUsername, WebUIData.getLoginName())
						.Click(clickOnNextButton).Wait(5).Textbox(LoginGooglePassword, WebUIData.getLoginPassWord())
						.Click(clickOnNextButton1).Wait(5)
						// .Click(clicoOnLogInButton)

						.WindowSwitch(0);
				driver.get("https://muviwebuiltd.idogic.com/en/?preview=2");
			}
		}

		return new FacebookLoginAndGoogleLogin(false);
}


public BannerEditorPage bannerEditor() throws Exception
{
	  Wait(5)
	 .SimulateMouseOver(MouseoverWebsite)
	 .SimulateClick(ClickOnTemplate)
	 .SimulateClick(ClickOnHome)
	 .Wait(5)
	 ;
	
	return new BannerEditorPage(false);
}


public RegisterLoginPage loginRegister() throws Exception
{
	  Wait(5)
	 .Click(PreviewWebsite_Button)
	 .WindowSwitch(1)
	 .Wait(5)
	 ;
	
	return new RegisterLoginPage(false);
}


public WatchHistory verifyWatchHistory() throws Exception
{
	  Wait(5)
	 .SimulateMouseOver(mouseoverUserprofile)
	 .SimulateClick(clickOnSetting)
	 .Wait(5)
	 ;
	
	return new WatchHistory(false);
}

public MyFavoritePage verifyMyFavorite() throws Exception
{
	  Wait(5)
	 .SimulateMouseOver(mouseoverUserprofile)
	 .SimulateClick(clickOnSetting)
	 .Wait(5)
	 ;
	
	return new MyFavoritePage(false);
}


public WebUIRelatedContent verifyMyRelatedContent() throws Exception
{
	  Wait(5)
	 .SimulateMouseOver(hoverManageContent)
	 .SimulateClick(clickOnContentLibrary)
	 .SimulateClick(clickOnAddNewContent)
	 .Wait(5)
	 ;
	
	return new WebUIRelatedContent(false);
}


}