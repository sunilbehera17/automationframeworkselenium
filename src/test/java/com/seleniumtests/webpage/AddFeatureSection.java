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
import org.openqa.selenium.JavascriptExecutor;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.WebUIData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;


public class AddFeatureSection extends PageObject{
	public static String url = null;
	public static String URL = null;
	
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public AddFeatureSection(final boolean openPageURL) throws Exception {
	
    super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}

private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ",
		locateByXPath("//html"));


private static final TextFieldElement addpapularcomtent = new TextFieldElement("Enter Section name",
		locateByXPath("//input[@id='title']"));
private static final ButtonElement clickOnSaveButton = new ButtonElement("Click on Save Button",
		locateByXPath("//h4[contains(text(),'Add Popular Content')]/../..//button[@id='fcontent_save']"));

//div[@class='modal-footer']//button[@type='submit'][contains(text(),'Save')]
//button[@id='fcontent_save']



public AddFeatureSection SelectByText(final String Text,String xpath) throws Exception
	{
	 waitForSeconds(5);
	SelectList s = new SelectList(Text, By.xpath(xpath));
	s.selectByText(Text);
		return this;
	     
	 }




public AddFeatureSection SimulateClick(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.simulateClick();
  return this;
}

public AddFeatureSection AssertEquals(final String actualText,final String expectedText) throws Exception {
	 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
    return this;
   }
public AddFeatureSection Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
     return this;
 }

public AddFeatureSection Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }
public AddFeatureSection MouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.mouseOver();
    return this;
} 

public AddFeatureSection SimulateMouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.simulateMouseOver();
    return this;
}

public AddFeatureSection Check(final CheckBoxElement element ) throws Exception {
	 
    element.check();
		return this;
	     
	 }
public AddFeatureSection SelectWindow(int index) throws Exception {
	 waitForSeconds(2);
	 	selectWindow(index);
		return this;
	     
	 }
public AddFeatureSection pageScrollDown() throws Exception
{
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,1000)");
	
	return this;
}


public AddFeatureSection Clickat(ButtonElement element) throws Exception {
	   
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


private static final ButtonElement clickOnXButton = new ButtonElement("Click on Save Button",
		locateByXPath("//form[@id='add_content']//button[@type='button'][contains(text(),'×')]"));



public CmsDashBoard addNewFeaturedSectionContent(WebUIData WebUIData) throws Exception
{
	   Wait(10)
	  .ClickOnAddContent(WebUIData)
	  .Textbox(addpapularcomtent, WebUIData.getComanyname())
	  .Wait(5)
	  .suggetionBoxdata(WebUIData)
	  .Wait(10)
	  .Click(clickOnSaveButton)
	  .Wait(5)
	  //.Click(clickOnXButton)
	  //.AssertEquals(, "")
	  .ClickOnAddContentDemo(WebUIData)
	  .Textbox(addpapularcomtent, "Demo")
	  .Wait(5)
	  .suggetionBoxDefaultData()
	  .Wait(10)
	  .Click(clickOnSaveButton)
	  //.AssertEquals(, "")
	  .Wait(5)
	  
	  //.Click(clickOnXButton)
	  ;
	  
	  
	return new CmsDashBoard(false);
}






}
