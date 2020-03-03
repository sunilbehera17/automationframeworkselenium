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
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.core.TestLogging;
import com.seleniumtests.dataobject.WebUIData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;


public class VerifyEndUserPreview extends PageObject{
	public static String url = null;
	public static String URL = null;
	
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public VerifyEndUserPreview(final boolean openPageURL) throws Exception {
	
    super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}

private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ",
		locateByXPath("//html"));


private static final TextFieldElement addpapularcomtent = new TextFieldElement("Enter Section name",
		locateByXPath("//input[@id='title']"));
private static final ButtonElement clickOnSaveButton = new ButtonElement("Click on Save Button",
		locateByXPath("//button[@id='fcontent_save']"));




public VerifyEndUserPreview SelectByText(final String Text,String xpath) throws Exception
	{
	 waitForSeconds(5);
	SelectList s = new SelectList(Text, By.xpath(xpath));
	s.selectByText(Text);
		return this;
	     
	 }

public VerifyEndUserPreview Textbox(TextFieldElement element,final String Text) throws Exception 
{
	
	element.clearAndType(Text);
    return this;
}


public VerifyEndUserPreview SimulateClick(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.simulateClick();
  return this;
}

public VerifyEndUserPreview AssertEquals(final String actualText,final String expectedText) throws Exception {
	 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
    return this;
   }
public VerifyEndUserPreview Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
     return this;
 }

public VerifyEndUserPreview Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }
public VerifyEndUserPreview MouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.mouseOver();
    return this;
} 

public VerifyEndUserPreview SimulateMouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.simulateMouseOver();
    return this;
}

public VerifyEndUserPreview Check(final CheckBoxElement element ) throws Exception {
	 
    element.check();
		return this;
	     
	 }
public VerifyEndUserPreview SelectWindow(int index) throws Exception {
	 waitForSeconds(2);
	 	selectWindow(index);
		return this;
	     
	 }
public VerifyEndUserPreview pageScrollDown() throws Exception
{
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,1000)");
	
	return this;
}


public VerifyEndUserPreview Clickat(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.clickAt();
return this;
}
public VerifyEndUserPreview WindowSwitch(int val) throws Exception {
	TestLogging.logWebStep(
            "select new window", false);
    driver.switchTo().window((String)
            driver.getWindowHandles().toArray()[val]);
    waitForSeconds(1);
        
    
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




public String matchContent(WebUIData WebUIData) throws Exception {
	
 final HtmlElement verifyElement = new HtmlElement("Click on Save Button",
		locateByXPath("//div[@id='homepage_sections']//span[contains(text(),'"
      + WebUIData.getName()+ "')]/../..//a[contains(text(),'"+ WebUIData.getComanyname()+
      "')]"));
 
 verifyElement.scroll();
 
 String contentname=verifyElement.getText();
 return contentname;
}

public String matchDefaultContent(WebUIData WebUIData) throws Exception {
	 
	
	 final HtmlElement verifyElement = new HtmlElement("Click on Save Button",
				locateByXPath("//div[@id='homepage_sections']//span[contains(text(),'"
	      + WebUIData.getName()+"')]/../..//a[contains(text(),'Demo')]"));
	 verifyElement.scroll();
	 String defaultcontentname=verifyElement.getText();
	 return defaultcontentname;
	}

public CmsDashBoard AddNewFeaturedManually(WebUIData WebUIData) throws Exception
{
	
	 AssertEquals(matchContent(WebUIData), WebUIData.getComanyname())
	 .AssertEquals(matchDefaultContent(WebUIData), "Demo")
	 .WindowSwitch(0)
	 ;
	
	return new CmsDashBoard(false);
}


public FeaturedAndContent afterDeletcontent(WebUIData WebUIData) throws Exception
{
	
	 AssertEquals(matchDefaultContent(WebUIData), "Demo")
	 .WindowSwitch(0)
	 ;
	
	return new FeaturedAndContent(false);
}

public CmsDashBoard afterDeletcontentFeature(WebUIData WebUIData) throws Exception
{
	refresh();
	 
	
	return new CmsDashBoard(false);
}








}
