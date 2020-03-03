package com.seleniumtests.webpage;

import static com.seleniumtests.core.CustomAssertion.*;
import static com.seleniumtests.core.CustomAssertion.assertFalse;
import static com.seleniumtests.core.CustomAssertion.assertTrue;

import static com.seleniumtests.core.Locator.*;

import java.awt.dnd.DropTargetDropEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.javafaker.Faker;
import com.google.gdata.util.parser.Action;
import com.seleniumtests.apicontroller.RestExecutor;
import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.DbManager;
import com.seleniumtests.dataobject.DbManager2;
import com.seleniumtests.dataobject.BillingData;
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

public class BillingPage extends PageObject{
	public static String url = null;
	public static String URL = null;
	private static final String APIURL = "https://mailsac.com/api/addresses/";	
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

public BillingPage(final boolean openPageURL) throws Exception {
	
    super(LoginUserNameTextbox, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
}
private static final TextFieldElement LoginUserNameTextbox = new TextFieldElement("enter username in User name textbox ",
		locateByXPath("//input[@id='LoginForm_email']"));
private static final TextFieldElement LoginPassWordTextbox = new TextFieldElement("enter password in password textbox ",
		locateByXPath("//input[@id='LoginForm_password']"));
private static final ButtonElement LoginButton = new ButtonElement("Click login button to login",
		locateByXPath("//input[@id='btn-login']"));
private static final ButtonElement MuviAdminPageLogo = new ButtonElement("Muvi Admin page logo",
		locateByXPath("//img[@alt='Muvi Logo']"));
private static final ButtonElement UsernameDisplay = new ButtonElement("Username Display",
		locateByXPath("//body[@id='body_alert']/nav/ul/li[3]/ul/li[4]/a/span"));


private static final ButtonElement LoginButton_HomePage = new ButtonElement("Click login button on homepage to login",
		locateByXPath("//a[@id='clk']"));
private static final ButtonElement LoginButton_LoginPage = new ButtonElement("Click login button to login",
		locateByXPath("//input[@id='btn-login']"));

private static final ButtonElement PreviewWebsite_Button = new ButtonElement("Click on preview website",
		locateByXPath("//a[@id='prev_btn_disable']"));

private static final ButtonElement Monetization_Button = new ButtonElement("Mouse Over on monetization", 
		locateByXPath("//li[@id='monetization-menu']/a/em[1]"));

private static final ButtonElement Subcription_Button = new ButtonElement("Click on Subcription ", 
		locateByXPath("//li[@id='monetization-menu']/ul/li[1]/a"));

private static final ButtonElement Add_Button = new ButtonElement("Click on Add button", 
		locateByXPath("//button[text()='Add']"));

private static final TextFieldElement PlanNameTextbox = new TextFieldElement("Enter Plan name", 
		locateByXPath("//input[@id='plan_name']"));
 
private static final TextFieldElement ShortdescriptionTextbox = new TextFieldElement("Enter Short description", 
		locateByXPath("//textarea[@id='short_desc']"));

private static final HtmlElement DurationDropDown= new HtmlElement("Select any duration option from the duration drop down", 
		locateByXPath("//select[@id='recurrence']"));

private static final TextFieldElement SubscriptionFeeTextbox = new TextFieldElement("Enter Subscription fee", 
		locateByXPath("//div[@id='sub_price_box']/div/div[2]/div/input"));

private static final ButtonElement Submit_Button = new ButtonElement("Click on Submit",
		locateByXPath("//button[@id='sub-btn']"));

private static final HtmlElement SuccessfulMessageWebelement= new HtmlElement("Verify the successful message ", 
		locateByCSSSelector(".alert.alert-success.alert-dismissable.flash-msg.m-t-20"));

private static final ButtonElement RegisterLink_Button = new ButtonElement("Click on Register", 
		locateByXPath("//i[@class='fa fa-user']"));

private static final TextFieldElement NameTextbox = new TextFieldElement("Enter Name ", 
		locateByXPath("//input[@id='name']"));

private static final TextFieldElement EmailTextbox = new TextFieldElement("Enter Email ", 
		locateByXPath("//input[@id='email_address']"));

private static final TextFieldElement PasswordTextbox = new TextFieldElement("Enter Password ", 
		locateByXPath("//input[@id='join_password']"));

private static final TextFieldElement ConfPasswordTextbox = new TextFieldElement("Enter Conform Password ", 
		locateByXPath("//input[@id='confirm_password']"));

private static final ButtonElement SelectPlanButton = new ButtonElement("Select your Plan ", 
		locateByXPath("//div[@id='membership-plan_830']//h3[text()='Magic Plan']"));

private static final TextFieldElement NameOnCardTextbox = new TextFieldElement("Enter Name on card ", 
		locateByXPath("//input[@id='card_name']"));

private static final TextFieldElement CardNumTextbox = new TextFieldElement("Enter Card number ", 
		locateByXPath("//input[@id='card_number']"));

private static final HtmlElement MonthDropdown = new HtmlElement("Select Month from list ", 
		locateByXPath("//select[@id='exp_month']"));

private static final HtmlElement YearDropdown = new HtmlElement("Select Year from list ", 
		locateByXPath("//select[@id='exp_year']"));

private static final TextFieldElement SecurityCodeTextbox= new TextFieldElement("Enter Security code ", 
		locateByXPath("//input[@id='security_code']"));

private static final ButtonElement Register_Button = new ButtonElement("Click on Register", 
		locateByXPath("//button[@id='register_membership']"));

private static final HtmlElement PlanPrice = new HtmlElement("Verify price ", 
		locateByXPath("//div[@id='membership-plan_830']/../div/h4/span"));

private static final HtmlElement SucsessMsg = new HtmlElement("Verify Sucsess message ", 
		locateByXPath("//div[@class='modal-title success-popup-payment']"));

private static final HtmlElement ThankyouMsg = new HtmlElement("Verify Thank you message ", 
		locateByCSSSelector(".alert.alert-success"));

private static final HtmlElement ProfileLinkButton = new HtmlElement("Click onProfile Link ", 
		locateByXPath("//a[@class='profile c-link dropdown-toggle']"));

private static final ButtonElement PurchaseHistory = new ButtonElement("Click Purchase History ", 
		locateByXPath("//a[contains(text(),'Purchase ')]"));

private static final HtmlElement PurchaseHistoryPage = new HtmlElement("Verify purchage History Page ", 
		locateByXPath("//div[@id='main']/div[1]/div[1]/div/div/h3"));

private static final HtmlElement Table = new HtmlElement("VerifyTable ", 
		locateByXPath("//div[@id='main']/div[1]/div[2]/div"));

private static final ButtonElement OrderLink = new ButtonElement("Click on Order link ", 
		locateByXPath("//th[text()='Order']/../../../tbody//td[2]/a"));

private static final HtmlElement TransactionDetailsPage = new HtmlElement("Verify Transaction page ", 
		locateByXPath("//h3[text()='Transaction Details']"));

private static final ButtonElement BackTransactionButton = new ButtonElement("Click on Back ", 
		locateByXPath("//a[text()='Back']"));

private static final ButtonElement ViewInvoiceButton = new ButtonElement("Click on View Invoice ", 
		locateByXPath("//a[text()='View invoice']"));

private static final HtmlElement InvoiceMailid = new HtmlElement("Verify invoice mailid ", 
		locateByXPath("//div[@id='pageContainer1']/xhtml:div[2]/xhtml:div[6]"));

private static final HtmlElement InvoiceDate = new HtmlElement("Verify invoice date ", 
		locateByXPath("//div[@id='pageContainer1']/xhtml:div[2]/xhtml:div[9]"));

private static final ButtonElement MyPlansButton = new ButtonElement("Click on My plan", 
		locateByXPath("//ul[@class='dropdown-menu']/li/a[contains(text(),'My Plans')]"));

private static final HtmlElement MyPlanPage = new HtmlElement("Verify MyPlan Page ", 
		locateByXPath("//h3[text()='My Plans']"));

private static final HtmlElement MyPlanName = new HtmlElement("Verify MyPlan Name ", 
		locateByXPath("//th[text()='Plan Name']/../../../tbody//td[1]"));

private static final HtmlElement RenewOnValidtillDate = new HtmlElement("Verify Renew on/Valid till Date ", 
		locateByXPath("//th[contains(text(),'Renews')]/../../../tbody//td[2]"));

private static final ButtonElement CancelSubscriptionButton = new ButtonElement("Verify Renew on/Valid till Date ", 
		locateByXPath("//a[text()='Cancel Subscription']"));

private static final ButtonElement Analytics = new ButtonElement("Mouse Over on Analytics Button ", 
		locateByXPath("//ul[@class='menu-wrap']/li[8]"));

private static final ButtonElement RevenueButton = new ButtonElement("Click on Revenue Button ", 
		locateByXPath("//a[text()='Revenue']"));

private static final ButtonElement DateButton = new ButtonElement("Click on Date Dropdown ", 
		locateByXPath("//button[@id='drp_autogen0']"));

private static final ButtonElement ApplyButton = new ButtonElement("Click on Apply ", 
		locateByXPath("//span[text()='Apply']"));

private static final TextFieldElement SearchTextBox = new TextFieldElement("Enter Subscriber MailId ", 
		locateByXPath("//input[@id='search-sub']"));

private static final HtmlElement SubscriberId = new HtmlElement("Verify Subscriber ", 
		locateByXPath("//img[@class='img-circle user-icon']"));

private static final HtmlElement PlanName = new HtmlElement("Verify Plan name ", 
		locateByXPath("//th[text()='Subscriber']/../../../tbody//td[3]"));

private static final HtmlElement PlanAmount = new HtmlElement("Verify Plan Amount ", 
		locateByXPath("//th[text()='Subscriber']/../../../tbody//td[6]"));

private static final HtmlElement PlanStatus = new HtmlElement("Verify Plan Status ", 
		locateByXPath("//th[text()='Subscriber']/../../../tbody//td[8]"));

private static final ButtonElement SearchButton = new ButtonElement("Click On Search ", 
		locateByXPath("//th[text()='Subscriber']/../../../tbody//td[8]"));

private static final ButtonElement SettingsButton = new ButtonElement("Click On Settings ", 
		locateByXPath("//li[@id='monetization-menu']/ul/li[11]/a"));

private static final CheckBoxElement SubscriptionCheckbox = new CheckBoxElement("Uncheck Subscription Checkbox  ", 
		locateByXPath("//input[@id='subscription']"));

private static final ButtonElement UpdateButton = new ButtonElement("Click On Update ", 
		locateByXPath("//button[@id='updatebtn']"));

private static final HtmlElement DateValue = new HtmlElement("Verify Date of Purchase ", 
		locateByXPath("//th[text()='Date']/../../../tbody//td[1]"));

private static final HtmlElement OrderValue = new HtmlElement("Verify Order No ", 
		locateByXPath("//th[text()='Date']/../../../tbody//td[2]/a"));

private static final HtmlElement OrderTypeValue = new HtmlElement("Verify Order Type ", 
		locateByXPath("//th[text()='Date']/../../../tbody//td[3]"));

private static final HtmlElement IteamValue = new HtmlElement("Verify Item Details", 
		locateByXPath("//th[text()='Date']/../../../tbody//td[4]"));

private static final HtmlElement TransactionDateValue = new HtmlElement("Verify Transaction Date", 
		locateByXPath("//div[@class='container content-area']//p[1]"));

private static final HtmlElement Planname_Value = new HtmlElement("Verify Plan Name and Subscription fee", 
		locateByXPath("//div[@class='container content-area']//p[6]"));


String ExpMonth = "//select[@id='exp_month']";
String ExpYear = "//select[@id='exp_year']";
String Country = "//select[@id='countr']";
String CurrencyDropdown = "//select[@id='currency-box']";
		
public BillingPage Textbox(TextFieldElement element,final String Text) throws Exception {
	waitForSeconds(2);
	element.clearAndType(Text);
    return this;
} 
public BillingPage MouseOver(HtmlElement element) throws Exception {
	
	element.waitForPresent(10);
	element.mouseOver();
    return this;
} 
 

 public BillingPage Click(ButtonElement element) throws Exception {
	   
	   element.waitForPresent(10);
	   element.click();
        return this;
    }
 public BillingPage Click1(ButtonElement element) throws Exception {
	 waitForSeconds(10);
 	try {
	    element.click();
 	}catch(Exception e) {
 		
 	}
     return this;
 }
 
 public BillingPage Scroll(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.scroll();
     return this;
 }
 
 
 public BillingPage SimulateClick(ButtonElement element) throws Exception {
	 waitForSeconds(2);
	    element.simulateClick();
     return this;
 }
 public BillingPage HtmlvideoPlayerPlay(HtmlElement element) throws Exception {
	 waitForSeconds(2);
	    element.HtmlvideoPlayerPlay();
     return this;
 }
 public BillingPage HtmlvideoPlayerPause(HtmlElement element) throws Exception {
	 waitForSeconds(2);
	    element.HtmlvideoPlayerPause();
     return this;
 }
 
 public BillingPage selectNewTab() throws Exception {
	 waitForSeconds(2);
 	selectNewWindow();
	return this;
	
     
 }
 
 public BillingPage SelectWindow(int index) throws Exception {
	 waitForSeconds(2);
	 	selectWindow(index);
		return this;
	     
	 }
 
 public BillingPage printpagesource() throws Exception {
	 waitForSeconds(2);
	 	System.out.println(driver.getPageSource());
		return this;
 }
 public BillingPage Wait(int value) throws Exception {
	 waitForSeconds(value);
	 	
		return this;
	     
	 }
 public BillingPage WaitforElelment(HtmlElement element) throws Exception {
	 waitForElementPresent(element);
	 	
		return this;
	     
	 }
 public BillingPage SelectByList(final String Text,String xpath) throws Exception {
	 waitForSeconds(5);
	SelectList s = new SelectList(Text, By.xpath(xpath));
	s.selectByValue(Text);
		return this;
	     
	 }
 public BillingPage SelectByListIndex(final int index,String xpath) throws Exception {
	 waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByIndex(index);
			return this;
		     
		 }
 
// public MuviPage Table_GetRowContain(final String Text,String xpath) throws Exception {
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
 public BillingPage GoBack() throws Exception {
		
		goBack();
			return this;
		     
		 }
 
 public BillingPage Uncheck(final CheckBoxElement element ) throws Exception {
		
	       element.uncheck();
			return this;
		     
		 }
 public BillingPage Print(HtmlElement element) throws Exception {
		System.out.println("Required Printing Object "+element.getText());
    
		return this;
	     
	 }
 public BillingPage printurl() throws Exception {
		
    System.out.println("url hela"+driver.getCurrentUrl());
		return this;
	     
	 }
 public BillingPage Check(final CheckBoxElement element ) throws Exception {
		
     element.check();
		return this;
	     
	 }
 public BillingPage GetCompairText(final BillingData BillingData,ButtonElement element) throws Exception {
		
	       BillingData.setTextCompair(element.getText());
			return this;
		     
		 }
 public String getCurentDate(final String Dateformat) throws Exception {
		
	 SimpleDateFormat formatter = new SimpleDateFormat(Dateformat);  
	    Date date = new Date();
	    return formatter.format(date);
		
         }
 
 public BillingPage randomData(final BillingData BillingData) throws Exception {
	 	
	 	
	  
	       BillingData.setEmail(RandomEmailID.randomEmail());
	       BillingData.setName(RandomName.name());
	       BillingData.setPassword(RandomPassword.password(10));
	       BillingData.setMobilenumber(RandomMobileNo.randomMobileNo());
	       BillingData.setAddress(RandomAddress.address());
	       BillingData.setZip(RandomZip.zip());
	      
	 	
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
	    URL = BillingPage.url;
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
 
 public String getAPI(final BillingData BillingData)  {
	 waitForSeconds(5);
	 RestExecutor executor = new RestExecutor(APIURL);
		 
		System.out.println(executor.get(BillingData.getEmail()+"/messages").printBodyString());
		return executor.get(BillingData.getEmail()+"/messages").printBodyString();
 }
 public String getcustomizedDate(final String format,int day)  {
	
	 SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); 
		c.add(Calendar.DATE, day);
		return sdf.format(c.getTime());
	
	 
 }
 
 
 public BillingPage AssertEquals(final String actualText,final String expectedText) throws Exception {
	 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
     return this;
    }
 public BillingPage AssertFalse(final Boolean actualText) throws Exception {
	 assertFalse(actualText,"Text should not be visible but now its visible");
     return this;
    }
 public BillingPage AssertTrue(final Boolean actualText) throws Exception {
	 assertTrue(actualText,"Text should  be visible but now its not visible");
     return this;
    }
 public BillingPage pressEnter() throws Exception {
	 Actions act=new Actions(driver);
	 act.sendKeys(Keys.ENTER).perform();
     return this;
    }
 
 public BillingPage TC_SubscriptionReg_01(final BillingData BillingData) throws Exception {
 	return    Click(LoginButton_HomePage)
 			.Textbox(LoginUserNameTextbox, BillingData.getLoginUserName())
 			.Textbox(LoginPassWordTextbox, BillingData.getLoginPassWord())
 			.Click(LoginButton_LoginPage)
 			.MouseOver(Monetization_Button)
 			.Click(Subcription_Button)
 			.Click(Add_Button)
 			.Textbox(PlanNameTextbox, BillingData.getPlanname())
 			.Textbox(ShortdescriptionTextbox, BillingData.getShortdescription())
 			.Textbox(SubscriptionFeeTextbox, BillingData.getSubscriptionfee())
 			.Click(Submit_Button)
 			.AssertEquals(SuccessfulMessageWebelement.getText().substring(4), "subscription has added successfully");
 	

 			
 }
 public BillingPage TC_SubscriptionReg_02(final BillingData BillingData) throws Exception {
	 	return    Click(LoginButton_HomePage)
	 			.randomData(BillingData)
	 			.Textbox(LoginUserNameTextbox, BillingData.getLoginUserName())
	 			.Textbox(LoginPassWordTextbox, BillingData.getLoginPassWord())
	 			.Click(LoginButton_LoginPage)
	 			.MouseOver(Monetization_Button)
	 			.Click(Subcription_Button)
	 			.Click(Add_Button)
	 			.Textbox(PlanNameTextbox, BillingData.getPlanname())
	 			.Textbox(ShortdescriptionTextbox, BillingData.getShortdescription())
	 			.Textbox(SubscriptionFeeTextbox, BillingData.getSubscriptionfee())
	 			.Click(Submit_Button)
	 			.Click(PreviewWebsite_Button)
	 			.selectNewTab()
	 			.Click(RegisterLink_Button)
	 			.Textbox(NameTextbox, BillingData.getName())
	 			.Textbox(EmailTextbox, BillingData.getEmail())
	 			.Textbox(PasswordTextbox, BillingData.getLoginPassWord())
	 			.Textbox(ConfPasswordTextbox, BillingData.getLoginPassWord())
	 			.Click(SelectPlanButton)
	 			.AssertEquals(PlanPrice.getText().substring(1,4), BillingData.getSubscriptionfee())
	 			.Textbox(NameOnCardTextbox, BillingData.getName())
	 			.Textbox(CardNumTextbox, BillingData.getCardnumber())
	 			.SelectByListIndex(BillingData.getExpmonth(), ExpMonth)
	 			.SelectByList(BillingData.getExpyear(), ExpYear)
	 			.Textbox(SecurityCodeTextbox, BillingData.getSecuritycode())
	 			.Click(Register_Button)
	 			.Wait(20)
	 			.AssertEquals(SubscriberId.getAttribute("title"), BillingData.getName());
	 }
 public BillingPage TC_SubscriptionReg_03(final BillingData BillingData) throws Exception {
	 	return    Click(LoginButton_HomePage)
	 			.randomData(BillingData)
	 			.Textbox(LoginUserNameTextbox, BillingData.getLoginUserName())
	 			.Textbox(LoginPassWordTextbox, BillingData.getLoginPassWord())
	 			.Click(LoginButton_LoginPage)
	 			.Click(PreviewWebsite_Button)
	 			.selectNewTab()
	 			.Click(RegisterLink_Button)
	 			.Textbox(NameTextbox, BillingData.getName())
	 			.Textbox(EmailTextbox, BillingData.getEmail())
	 			.Textbox(PasswordTextbox, BillingData.getLoginPassWord())
	 			.Textbox(ConfPasswordTextbox, BillingData.getLoginPassWord())
	 			.Click(SelectPlanButton)
	 			.Textbox(NameOnCardTextbox, BillingData.getName())
	 			.Textbox(CardNumTextbox, BillingData.getCardnumber())
	 			.SelectByListIndex(BillingData.getExpmonth(), ExpMonth)
	 			.SelectByList(BillingData.getExpyear(), ExpYear)
	 			.Textbox(SecurityCodeTextbox, BillingData.getSecuritycode())
	 			.Click(Register_Button)
	 			.Wait(20)
	 			.MouseOver(ProfileLinkButton)
	 			.Click(PurchaseHistory)
	 			.Wait(10)
	 			.Print(PurchaseHistoryPage)
	 			.AssertEquals(PurchaseHistoryPage.getText(), "Purchase History")
	 			.AssertEquals(DateValue.getText(), getCurentDate("MMM dd, yyyy"))
	 			.AssertEquals(OrderTypeValue.getText(), "Subscription Charges")
	 			.AssertTrue(IteamValue.getText().contains(BillingData.getPlanname()))
	 			.Click(OrderLink)
	 			.AssertEquals(TransactionDetailsPage.getText(), "Transaction Details")
	 			.AssertEquals(TransactionDateValue.getText().substring(19, 37), getCurentDate("MMMM dd, yyyy"))
	 			.AssertEquals(Planname_Value.getText().substring(12,22), BillingData.getPlanname())
	 			.AssertEquals(Planname_Value.getText().substring(25, 28), BillingData.getSubscriptionfee())
	 			.Click(BackTransactionButton)
	 			.AssertEquals(PurchaseHistoryPage.getText(), "Purchase History");
	 			
	 }
 public BillingPage TC_SubscriptionReg_04(final BillingData BillingData) throws Exception {
	 	return    Click(LoginButton_HomePage)
	 			.randomData(BillingData)
	 			.Textbox(LoginUserNameTextbox, BillingData.getLoginUserName())
	 			.Textbox(LoginPassWordTextbox, BillingData.getLoginPassWord())
	 			.Click(LoginButton_LoginPage)
	 			.Click(PreviewWebsite_Button)
	 			.selectNewTab()
	 			.printurl()
	 			.Click(RegisterLink_Button)
	 			.Textbox(NameTextbox, BillingData.getName())
	 			.Textbox(EmailTextbox, BillingData.getEmail())
	 			.Textbox(PasswordTextbox, BillingData.getLoginPassWord())
	 			.Textbox(ConfPasswordTextbox, BillingData.getLoginPassWord())
	 			.Click(SelectPlanButton)
	 			.Textbox(NameOnCardTextbox, BillingData.getName())
	 			.Textbox(CardNumTextbox, BillingData.getCardnumber())
	 			.SelectByListIndex(BillingData.getExpmonth(), ExpMonth)
	 			.SelectByList(BillingData.getExpyear(), ExpYear)
	 			.Textbox(SecurityCodeTextbox, BillingData.getSecuritycode())
	 			.Click(Register_Button)
	 			.Wait(20)
	 			.MouseOver(ProfileLinkButton)
	 			.Click(PurchaseHistory)
	 			.Wait(5)
	 			.Click(ViewInvoiceButton)
	 			.Wait(9)
	 			.SelectWindow(2);
	 			
	 	
}
 public BillingPage TC_SubscriptionReg_05(final BillingData BillingData) throws Exception {
	 	return    Click(LoginButton_HomePage)
	 			.randomData(BillingData)
	 			.Textbox(LoginUserNameTextbox, BillingData.getLoginUserName())
	 			.Textbox(LoginPassWordTextbox, BillingData.getLoginPassWord())
	 			.Click(LoginButton_LoginPage)
	 			.Click(PreviewWebsite_Button)
	 			.selectNewTab()
	 			.Click(RegisterLink_Button)
	 			.Textbox(NameTextbox, BillingData.getName())
	 			.Textbox(EmailTextbox, BillingData.getEmail())
	 			.Textbox(PasswordTextbox, BillingData.getLoginPassWord())
	 			.Textbox(ConfPasswordTextbox, BillingData.getLoginPassWord())
	 			.Click(SelectPlanButton)
	 			.Textbox(NameOnCardTextbox, BillingData.getName())
	 			.Textbox(CardNumTextbox, BillingData.getCardnumber())
	 			.SelectByListIndex(BillingData.getExpmonth(), ExpMonth)
	 			.SelectByList(BillingData.getExpyear(), ExpYear)
	 			.Textbox(SecurityCodeTextbox, BillingData.getSecuritycode())
	 			.Click(Register_Button)
	 			.Wait(20)
	 			.MouseOver(ProfileLinkButton)
	 			.Wait(5)
	 			.Click(MyPlansButton)
	 			.Wait(5)
	 			.AssertEquals(MyPlanPage.getText(), "My Plans")
	 			.AssertEquals(MyPlanName.getText(), BillingData.getPlanname())
	 			.AssertEquals(RenewOnValidtillDate.getText().trim(), getcustomizedDate("MMMM dd, yyyy",1))
	 			.AssertEquals(CancelSubscriptionButton.getText(), "Cancel Subscription")
	 			.AssertTrue(CancelSubscriptionButton.isDisplayed())
	 			.AssertTrue(CancelSubscriptionButton.isElementPresent())
	 			.AssertTrue(CancelSubscriptionButton.isEnabled());
	 			
	 			
	 			
	 	
}
 public BillingPage TC_SubscriptionReg_06(final BillingData BillingData) throws Exception {
	 	return    Click(LoginButton_HomePage)
	 			.randomData(BillingData)
	 			.Textbox(LoginUserNameTextbox, BillingData.getLoginUserName())
	 			.Textbox(LoginPassWordTextbox, BillingData.getLoginPassWord())
	 			.Click(LoginButton_LoginPage)
	 			.Wait(5)
	 			.Click(PreviewWebsite_Button)
	 			.selectNewTab()
	 			.Click(RegisterLink_Button)
	 			.Textbox(NameTextbox, BillingData.getName())
	 			.Textbox(EmailTextbox, BillingData.getEmail())
	 			.Textbox(PasswordTextbox, BillingData.getLoginPassWord())
	 			.Textbox(ConfPasswordTextbox, BillingData.getLoginPassWord())
	 			.Click(SelectPlanButton)
	 			.Textbox(NameOnCardTextbox, BillingData.getName())
	 			.Textbox(CardNumTextbox, BillingData.getCardnumber())
	 			.SelectByListIndex(BillingData.getExpmonth(), ExpMonth)
	 			.SelectByList(BillingData.getExpyear(), ExpYear)
	 			.Textbox(SecurityCodeTextbox, BillingData.getSecuritycode())
	 			.Click(Register_Button)
	 			.Wait(20)
	 			.SelectWindow(0)
	 			.Wait(10)
	 			.MouseOver(Analytics)
	 			.Click(RevenueButton)
	 			//.Click(DateButton)
	 			//.Click(ApplyButton)
	 			//.SelectByList(BillingData.getCurrency(), CurrencyDropdown)
	 			.Wait(50)
	 			.Textbox(SearchTextBox, BillingData.getEmail())
	 			.Wait(10)
	 			.pressEnter()
	 			.pressEnter()
	 			.pressEnter()
	 			.pressEnter()
	 			.Wait(50)
	 			.AssertEquals(SubscriberId.getText(), BillingData.getEmail())
	 			.AssertEquals(PlanName.getText(), BillingData.getPlanname())
	 			.AssertEquals(PlanAmount.getText(), BillingData.getSubscriptionfee())
	 			.AssertEquals(PlanStatus.getText(), "Yes");
	
	 	
}
 public BillingPage TC_SubscriptionReg_07(final BillingData BillingData) throws Exception {
	 	return    Click(LoginButton_HomePage)
	 			.randomData(BillingData)
	 			.Textbox(LoginUserNameTextbox, BillingData.getLoginUserName())
	 			.Textbox(LoginPassWordTextbox, BillingData.getLoginPassWord())
	 			.Click(LoginButton_LoginPage)
	 			.Wait(5)
	 			.MouseOver(Monetization_Button)
	 			.Click(SettingsButton)
	 			.Uncheck(SubscriptionCheckbox)
	 			.Click(UpdateButton)
	 			.Wait(10)
	 			.AssertEquals(SuccessfulMessageWebelement.getText().substring(3), "Settings updated successfully.");
	 			
	 			
	 		
	
	 	
}


}