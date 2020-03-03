/*
 * Copyright © 2018 www.muvi.com
 *
 * @author  Sunil Kumar Behera <sunilkumar@muvi.com>
 */



package com.seleniumtests.webpage;

import static com.seleniumtests.core.CustomAssertion.assertEquals;
import static com.seleniumtests.core.CustomAssertion.assertTrue;
import static com.seleniumtests.core.Locator.locateByXPath;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.WebUIData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;


public class ContentManage extends PageObject{
	public static String url = null;
	public static String URL = null;
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public ContentManage(final boolean openPageURL) throws Exception {
	
    super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}
private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ",
		locateByXPath("//html"));

String ContentFORM="//select[@id='parent_content_type']";
String contenttype="//select[@id='contenttype']";



private static final TextFieldElement today_date = new TextFieldElement("Enter release date",
		locateByXPath("//input[@id='release_date']"));
private static final ButtonElement today_date_click = new ButtonElement("Enter release date",
		locateByXPath("//input[@id='release_date']"));
private static final ButtonElement pick_date = new ButtonElement("Enter release pick",
		locateByXPath("//a[contains(text(),'28')]"));

private static final TextFieldElement description_data = new TextFieldElement("Enter Description Data in text area",
		locateByXPath("//textarea[@id='story1']"));
private static final ButtonElement select_content_catagory = new ButtonElement("Click on catagory movie ",
		locateByXPath("//select[@id='content_category_value']/option[1]"));
private static final ButtonElement Click_on_save = new ButtonElement("Click on save Button",
		locateByXPath("//button[@id='save-btn']"));
private static final TextFieldElement content_name = new TextFieldElement("Enterr value on content name",
		locateByXPath("//input[@id='mname']"));
private static final TextFieldElement amount_field = new TextFieldElement("Enter amount",
		locateByXPath("//input[@placeholder='Enter amount']"));
private static final TextFieldElement suk_number = new TextFieldElement("Enter amount",
		locateByXPath("//input[@id='skuno']"));
private static final ButtonElement clickOnextend = new ButtonElement("Click on save Button",
		locateByXPath("//i[@class='fa fa-angle-down']"));
private static final ButtonElement forConfirmation = new ButtonElement("Click on Confirmation",
		locateByXPath("//button[@class='confirm']"));






public ContentManage AssertEquals(final String actualText,final String expectedText) throws Exception {
	 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
    return this;
   }
public ContentManage Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
     return this;
 }
public ContentManage Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }
public ContentManage MouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.mouseOver();
    return this;
}
public String getCurentDate(final String Dateformat) throws Exception {
	
	 SimpleDateFormat formatter = new SimpleDateFormat(Dateformat);  
	    Date date = new Date();
	    return formatter.format(date);
		
        }
public ContentManage AssertTrue(final Boolean actualText) throws Exception {
	 assertTrue(actualText,"Text should  be visible but now its not visible");
    return this;
   }
public String getcustomizedDate(final String format,int day)  {
	
	 SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); 
		c.add(Calendar.DATE, day);
		return sdf.format(c.getTime());
	
	 
}

public ContentManage Textbox(TextFieldElement element,final String Text) throws Exception {
	
	element.clearAndType(Text);
    return this;
}




public ContentManage SelectByListIndex(final int index,String xpath) throws Exception {
	 waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByIndex(index);
			return this;
		     
		 }

public ContentManage SelectByText(final String value,String xpath) throws Exception {
	 waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByText(value);
			return this;
		     
		 }

public ContentManage SelectByList(final String Text,String xpath) throws Exception {
	 waitForSeconds(5);
	SelectList s = new SelectList(Text, By.xpath(xpath));
	s.selectByValue(Text);
		return this;
	     
	 }


public ContentManage ListOfElement(final String xpath) throws Exception
{
	 List<WebElement> li = driver.findElements(By.xpath(xpath));
	 li.get(0).click();
	return this;
	     
	 }



public CmsDashBoard VerifyContentManage(WebUIData WebUIData) throws Exception {
	
	
	String data=WebUIData.getContentform();
	 Wait(2)
	 
	 ;
	
	
	 
	 if(data.equalsIgnoreCase("AOD Single Part"))
	 {
		     SelectByText(WebUIData.getContentform(), ContentFORM)
			
			.Wait(10)
			.Textbox(content_name, WebUIData.getComanyname())
			.Textbox(description_data, WebUIData.getDescription())
			.Textbox(today_date, WebUIData.getTodaydate())
			.Click(select_content_catagory)
			.Click(Click_on_save)
			; 
	 }else if(data.equalsIgnoreCase("VOD Single Part"))
	 {
		     SelectByText(WebUIData.getContentform(), ContentFORM)
			.Wait(10)
			.Textbox(content_name, WebUIData.getComanyname())
			.Textbox(description_data, WebUIData.getDescription())
			.Textbox(today_date, WebUIData.getTodaydate())
			.Click(select_content_catagory)
			.Click(Click_on_save)
			; 
	 }else if(data.equalsIgnoreCase("Muvi Kart"))
	 {
		     SelectByText(WebUIData.getContentform(), ContentFORM)
			.Wait(10)
			.Textbox(content_name, WebUIData.getComanyname())
			.Click(today_date_click)
			.Click(pick_date)
			.Textbox(description_data, WebUIData.getDescription())
			.Textbox(amount_field, "100")
			.Textbox(suk_number, "123")
			.Click(Click_on_save)
			; 
	 }
	 
	 
	 
	 
	 
	 return new CmsDashBoard(false);
} 




public WebUIPage ClickOnDeleteContent(WebUIData WebUIData) throws Exception {
	Wait(4);
	final ButtonElement webelement = new ButtonElement("Click on  delete content", 
			locateByXPath("//td//div[contains(text(),'"
	+WebUIData.getComanyname()+ "')]/../../..//td[5]/h5/a[@class='confirm']"));
	
	webelement.clickAt();
	return new WebUIPage(false);

	
 }



public WebUIPage DeleteContentManageContent(WebUIData WebUIData) throws Exception {
	
	
	String data=WebUIData.getContentform();
	 Wait(2) 
	 ;
	
	
	 
	 if(data.equalsIgnoreCase("AOD Single Part"))
	 {
		      Click(clickOnextend)
		     .SelectByText("Audio", contenttype)
		     .Wait(5)
		     .ClickOnDeleteContent(WebUIData)
		     .Click(forConfirmation)
		     .Wait(5)
			; 
	 }else if(data.equalsIgnoreCase("VOD Single Part"))
	 {
		 Click(clickOnextend)
	     .SelectByText("Video", contenttype)
	     .Wait(5)
	     .ClickOnDeleteContent(WebUIData)
	     .Click(forConfirmation)
	     .Wait(5)
			; 
	 }else if(data.equalsIgnoreCase("Muvi Kart"))
	 {
		 Click(clickOnextend)
	     .SelectByText("Physical", contenttype)
	     .Wait(5)
	     .ClickOnDeleteContent(WebUIData)
	     .Click(forConfirmation)
	     .Wait(5)
			; 
	 }
	 
	 
	 
	 
	 
	 return new WebUIPage(false);
} 



}
