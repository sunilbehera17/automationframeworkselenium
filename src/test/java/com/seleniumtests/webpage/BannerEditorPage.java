/*
 * Copyright © 2018 www.muvi.com
 *
 * @author  Sunil Kumar Behera <sunilkumar@muvi.com>
 */

package com.seleniumtests.webpage;

import static com.seleniumtests.core.CustomAssertion.assertEquals;

import static com.seleniumtests.core.Locator.locateByXPath;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.core.TestLogging;
import com.seleniumtests.dataobject.WebUIData;
import com.seleniumtests.driver.WebUIDriver;
import com.seleniumtests.helper.WaitHelper;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;


public class BannerEditorPage extends PageObject{
	public static String url = null;
	public static String URL = null;
	
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public BannerEditorPage(final boolean openPageURL) throws Exception {
	
    super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}

private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ",
		locateByXPath("//html"));


private static final TextFieldElement addpapularcomtent = new TextFieldElement("Enter Section name",
		locateByXPath("//input[@id='title']"));
private static final ButtonElement clickOnSaveButton = new ButtonElement("Click on Save Button",
		locateByXPath("//h4[contains(text(),'Add Popular Content')]/../..//button[@id='fcontent_save']"));




public BannerEditorPage SelectByText(final String Text,String xpath) throws Exception
	{
	 waitForSeconds(5);
	SelectList s = new SelectList(Text, By.xpath(xpath));
	s.selectByText(Text);
		return this;
	     
	 }

public BannerEditorPage SimulateClick(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.simulateClick();
  return this;
}

public BannerEditorPage AssertEquals(final String actualText,final String expectedText) throws Exception {
	 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
    return this;
   }
public BannerEditorPage Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
     return this;
 }

public BannerEditorPage Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }
public BannerEditorPage MouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.mouseOver();
    return this;
} 

public BannerEditorPage SimulateMouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.simulateMouseOver();
    return this;
}

public BannerEditorPage Check(final CheckBoxElement element ) throws Exception {
	 
    element.check();
		return this;
	     
	 }
public BannerEditorPage SelectWindow(int index) throws Exception {
	 waitForSeconds(2);
	 	selectWindow(index);
		return this;
	     
	 }
public BannerEditorPage pageScrollDown() throws Exception
{
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,1000)");
	
	return this;
}


public BannerEditorPage Clickat(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.clickAt();
return this;
}


public WebUIPage ClickOnAddContent(WebUIData WebUIData) throws Exception {
	Wait(4);
	final ButtonElement webelement = new ButtonElement("Click on  add content", 
			locateByXPath("//div[@class='Collapse-Block']//div[1]/h4[contains(text(),'"
	+WebUIData.getName()+ "')]/../following-sibling::div[@class='Collapse-Content row']//a[@class='btn btn-primary m-t-10 p-l-40']"));
	
	webelement.clickAt();
	return new WebUIPage(false);
	
 }

String style="//select[contains(@class,'form-control banner_style')]";

private static final HtmlElement leftArrowButton = new HtmlElement("Check the element is present or not",
		locateByXPath("//span[@class='icon-arrow-left']"));
private static final HtmlElement rightArrowButton = new HtmlElement("Check the element is present or not",
		locateByXPath("//span[@class='icon-arrow-right']"));
private static final ButtonElement topArrowButton = new ButtonElement("Check the element is present or not",
		locateByXPath("//a[@class='dire-nav _top']"));
private static final ButtonElement buttomArrowButton = new ButtonElement("Check the element is present or not",
		locateByXPath("//a[@class='dire-nav _bottom']"));

public BannerEditorPage assertElementmatchDisplayed(HtmlElement element) throws Exception {
	   
	   assertElementDisplayed(element);
return this;
}






public WebUIPage bannerEditstyle(WebUIData WebUIData) throws Exception
{
	   
	if(SelectByText("Style 1", style).isTextPresent("Style 1"))
	{
		assertElementmatchDisplayed(leftArrowButton)
		.assertElementmatchDisplayed(rightArrowButton)
		;
	}
	
	if(SelectByText("Style 2", style).isTextPresent("Style 2"))
	{
		assertElementmatchDisplayed(topArrowButton)
		.assertElementmatchDisplayed(buttomArrowButton)
		;
	}
	
	
	
	
	  
	  
	return new WebUIPage(false);
}






}
