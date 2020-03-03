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
import java.util.List;
import java.util.Map;

import org.eclipse.jetty.client.api.Request.Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.core.TestLogging;
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
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;

public class RegisterLoginPage extends PageObject {
	public static String url = null;
	public static String URL = null;

	public static Map<Object, Map<Object, Object>> mastermap = new HashMap<Object, Map<Object, Object>>();

	public RegisterLoginPage(final boolean openPageURL) throws Exception {

		super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
	}

	private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ", locateByXPath("//html"));


	
	public RegisterLoginPage SelectByText(final String Text, String xpath) throws Exception {
		waitForSeconds(1);
		SelectList s = new SelectList(Text, By.xpath(xpath));
		s.selectByText(Text);
		return this;

	}

	public RegisterLoginPage SimulateClick(ButtonElement element) throws Exception {
		waitForSeconds(2);
		element.simulateClick();
		return this;
	}

	public RegisterLoginPage AssertEquals(final String actualText, final String expectedText) throws Exception {
		assertEquals(actualText.toLowerCase(), expectedText.toLowerCase(), "Actual text and Expected Text Not Equal");
		return this;
	}

	public RegisterLoginPage Click(ButtonElement element) throws Exception {

		element.waitForPresent(10);
		element.click();
		return this;
	}

	public RegisterLoginPage Wait(int value) throws Exception {
		waitForSeconds(value);

		return this;

	}

	public RegisterLoginPage WaitForElementPresent(final HtmlElement element) {
		element.waitForPresent(20);

		return this;
	}

	public RegisterLoginPage MouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.mouseOver();
		return this;
	}

	public RegisterLoginPage SimulateMouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.simulateMouseOver();
		return this;
	}

	public RegisterLoginPage Textbox(TextFieldElement element, final String Text) throws Exception {

		element.clearAndType(Text);
		return this;
	}

	public RegisterLoginPage scrollToElement() throws Exception {

		WebElement element = driver
				.findElement(By.xpath("//button[@id='nextbtn'][contains(text(),'Add Featured Section')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click().perform();

		return this;
	}

	public RegisterLoginPage Clickat(ButtonElement element) throws Exception {

		element.waitForPresent(10);
		element.clickAt();
		return this;
	}

	public WebUIPage ClickOnDeleteContent(WebUIData WebUIData) throws Exception {

		final ButtonElement webelement = new ButtonElement("Click on  delete content",
				locateByXPath("//div[@class='Collapse-Block']//h4[contains(text(),'" + WebUIData.getName()
						+ "')]/../..//h5[contains(text(),'" + WebUIData.getComanyname() + "')]/../div//em"));

		webelement.clickAt();
		return new WebUIPage(false);

	}

	public RegisterLoginPage ClickOnDeleteFeature(WebUIData WebUIData) throws Exception {

		final ButtonElement webelement = new ButtonElement("Click on  delete feature",
				locateByXPath("//div[@class='Collapse-Block']//div/h4[contains(text(),'" + WebUIData.getName()
						+ "')]/..//em[@class='icon-trash icon']"));

		webelement.clickAt();
		return new RegisterLoginPage(false);

	}

	public RegisterLoginPage ClickOnDeleteAutoFeature() throws Exception {

		final ButtonElement webelement = new ButtonElement("Click on  delete feature", locateByXPath(
				"//div[@class='Collapse-Block']//div/h4[contains(text(),'Auto Generated Feature Section')]/..//em[@class='icon-trash icon']"));

		WebElement element = driver.findElement(By.xpath(
				"//div[@class='Collapse-Block']//div/h4[contains(text(),'Auto Generated Feature Section')]/..//em[@class='icon-trash icon']"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		webelement.simulateClick();
		return new RegisterLoginPage(false);

	}

	

	public RegisterLoginPage pressEnter() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		return this;
	}

	

	String sectioncriteria = "//select[@id='section_criteria']";
	String sectionCatagory = "//select[@id='section_category']";
	String contentType = "//select[@id='content_types']";

	private static final TextFieldElement contentLimit = new TextFieldElement("Enter content limit in text box",
			locateByXPath("//input[@id='content_limit']"));

	public RegisterLoginPage pageScrollDown() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		return this;
	}

	public SelectList SelectText(final String Text) throws Exception {
		waitForSeconds(1);
		SelectList s = new SelectList(Text, By.xpath(sectioncriteria));
		s.selectByText(Text);

		return s;

	}

	public RegisterLoginPage pressSpace() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.SPACE).perform();
		return this;
	}

	public RegisterLoginPage refreshPage() throws Exception {
		refresh();
		return this;
	}

	public RegisterLoginPage closeCurrentWindow() throws Exception {
		driver.close();
		return this;
	}

	public RegisterLoginPage WindowSwitch(int val) throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[val]);
		waitForSeconds(1);

		return this;
	}

	public RegisterLoginPage AssertTrue(final Boolean actualText2) throws Exception {
		assertTrue(actualText2, "Text should  be visible but now its not visible");
		return this;
	}

	public RegisterLoginPage goBackPage() {
		goBack();
		return this;
	}
	public RegisterLoginPage print() {
		System.out.println(logincredential.getText());
		return this;
	}

	
	private static final ButtonElement ClickOnRegisterButton = new ButtonElement("Click on register button",
			locateByXPath("//a[@class='register']"));
	private static final ButtonElement ClickOnRegisterButtonForSubmit = new ButtonElement("Click on register button for submit",
			locateByXPath("//button[@id='register_membership']"));
	
	private static final HtmlElement name = new HtmlElement("Assert match with name field",
			locateByXPath("//label[@id='name-error']"));
	private static final HtmlElement mailId = new HtmlElement("Assert match with mail field",
			locateByXPath("//label[@id='email_address-error']"));
	private static final HtmlElement password = new HtmlElement("Assert match with password field",
			locateByXPath("//label[@id='join_password-error']"));
	private static final HtmlElement confirmPassword = new HtmlElement("Assert match with confirm password field",
			locateByXPath("//label[@id='confirm_password-error']"));
	private static final ButtonElement ClickOnLoginButton = new ButtonElement("Click on login button",
			locateByXPath("//a[@class='login']"));
	private static final ButtonElement ClickOnLoginButtonForSubmit = new ButtonElement("Click on login button for submit",
			locateByXPath("//div[@class='form-group']//button[@id='login-btn']"));
	private static final HtmlElement username = new HtmlElement("Assert match with password field",
			locateByXPath("//label[@id='username-error']"));
	private static final HtmlElement loginPassword = new HtmlElement("Assert match with password field",
			locateByXPath("//label[@id='password-error']"));
	private static final HtmlElement logincredential = new HtmlElement("Assert match with credential",
			locateByXPath("//div[@class='col-md-6']//div[@id='login_errors']"));
	private static final TextFieldElement usernametextfield = new TextFieldElement("Enter user name in name field",
			locateByXPath("//div[@class='controls']//input[@id='username']"));
	private static final TextFieldElement passwordtextfield = new TextFieldElement("Enter password in password field",
			locateByXPath("//div[@class='col-md-6']//input[@id='password']"));
	private static final TextFieldElement nameTextfield = new TextFieldElement("Enter name in name field",
			locateByXPath("//input[@id='name']"));
	private static final TextFieldElement emailtextfield = new TextFieldElement("Enter emailid in email field",
			locateByXPath("//input[@id='email_address']"));
	private static final TextFieldElement passwordTextfieldnew = new TextFieldElement("Enter password in password field",
			locateByXPath("//input[@id='join_password'][@placeholder='Enter your password']"));
	private static final TextFieldElement passwordConfirmtextfield = new TextFieldElement("Enter password in confirm password field",
			locateByXPath("//input[@id='confirm_password']"));
	
	
	
	
	
	
	
	
	

	
		
	
	
	
	
	

	private static final ButtonElement ClickOnForgetPassword = new ButtonElement("Click on forget password button",
			locateByXPath("//a[@class='link txt-right']"));
	private static final TextFieldElement resetEmailtextfield = new TextFieldElement("Enter email in confirm email field",
			locateByXPath("//input[@id='reset_email']"));
	private static final ButtonElement ClickOnConfirmButton = new ButtonElement("Click on cofirm button",
			locateByXPath("//form[@id='frmRP']//button[@id='login-btn']"));
	private static final HtmlElement errormessage = new HtmlElement("Assert match with wrong email message",
			locateByXPath("//div[@id='reset-errors']"));
	private static final HtmlElement blankErrorMessage = new HtmlElement("Assert match with wrong email message",
			locateByXPath("//label[@id='reset_email-error']"));
	private static final HtmlElement loginpage = new HtmlElement("Assert match with wrong email message",
			locateByXPath("//h2[@class='txt-camel']"));
	
	
	
	
	public WebUIPage loginRegisterBlankSubmit() throws Exception
	{
		
		//validation for blank submission in registration
		  Click(ClickOnRegisterButton)
		  .Wait(5)
		  .Click(ClickOnRegisterButtonForSubmit)
		  .AssertEquals(name.getText(), "Please enter your full name")
		  .AssertEquals(mailId.getText(), "Please enter email address")
		  .AssertEquals(password.getText(), "Please enter your password")
		  .AssertEquals(confirmPassword.getText(), "Please enter confirm password")
		  
		//validation for blank submission in login 
		  .Wait(2)
		  .Click(ClickOnLoginButton)
		  .Wait(5)
		  .Click(ClickOnLoginButtonForSubmit)
		  .AssertEquals(username.getText(), "Please enter email address")
		  .AssertEquals(loginPassword.getText(), "Please enter your password")
		  
		  //validation for mailid
		  
		  .Wait(5)
		  .Textbox(usernametextfield, "abacd")
		  .Textbox(passwordtextfield, "shdsjhfdhsf@2423432A")
		  .Click(ClickOnLoginButtonForSubmit)
		  .AssertEquals(username.getText(), "Please enter a valid email address")
		  
		//invalid credential
		 
		  .Wait(5)
		  .Textbox(usernametextfield, "automation-webui@yopmail.com")
		  .Textbox(passwordtextfield, "123")
		  .Click(ClickOnLoginButtonForSubmit)
		  .print()
		  //.AssertEquals(logincredential.getText(), "You have entered incorrect email or password")
		  
		  //register validation
		  .Wait(2)
		  .Click(ClickOnRegisterButton)
		  .Wait(5)
		  .Textbox(nameTextfield, "!)@3$")
		  .Textbox(emailtextfield, "abacd")
		  .Textbox(passwordTextfieldnew, "123")
		  .Textbox(passwordConfirmtextfield, "321543")
		  .Click(ClickOnRegisterButtonForSubmit)
		  .AssertEquals(name.getText(), "Please fill out this field.")
		  .AssertEquals(mailId.getText(), "Please enter a valid email address")
		  .AssertEquals(password.getText(), "Your password must be atleast 6 characters long")
		  .AssertEquals(confirmPassword.getText(), "Passwords do not match")
		  
		  
		  
		  .Wait(2)
		  .Click(ClickOnLoginButton)
		  .Click(ClickOnForgetPassword)
		  .Click(ClickOnConfirmButton)
		  .Wait(2)
		  .AssertEquals(blankErrorMessage.getText(), "Please enter registered email")
		  
		  
		  .Wait(2)
		  .Textbox(resetEmailtextfield, "automdfgfation321@yopdfgdfgdfgdfmail.com")
		  .Click(ClickOnConfirmButton)
		  .Wait(3)
		  .AssertEquals(errormessage.getText(), "Email does not exist. Please enter correct email.")
		  
		  
		  
		  .Wait(2)
		  .Textbox(resetEmailtextfield, "automation321@yopmail.com")
		  .Click(ClickOnConfirmButton)
		  
		  
		  .Wait(2)
		  .AssertEquals(loginpage.getText(), "Login")
		  
		
		
		 ;
		
		return new WebUIPage(false);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}