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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.core.TestLogging;
import com.seleniumtests.dataobject.WebUIData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.HtmlElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;

public class FacebookLoginAndGoogleLogin extends PageObject {
	public static String url = null;
	public static String URL = null;

	public static Map<Object, Map<Object, Object>> mastermap = new HashMap<Object, Map<Object, Object>>();

	public FacebookLoginAndGoogleLogin(final boolean openPageURL) throws Exception {

		super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
	}

	private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ", locateByXPath("//html"));

	private static final ButtonElement clickOnRegisterButton = new ButtonElement("Click on Register button",
			locateByXPath("//a[@class='register']"));
	private static final ButtonElement clickOnLoginButton = new ButtonElement("Click on Login button",
			locateByXPath("//a[@class='login']"));
	
	private static final ButtonElement clickOnFacebookButton = new ButtonElement("Click on Register button",
			locateByXPath("//div[@class='row']//span[contains(text(),'Continue With Facebook')]"));
	//div[@class='row']//a[@class='facebook_login']//img
	//ul[@class='new_social']//a[@class='facebook_login']//img
	//div[@class='col-md-6']//a[@class='facebook_login']//img
	private static final ButtonElement clickOnFacebookButtoninloginPage = new ButtonElement("Click on Register button",
			locateByXPath("//div[@class='row']//span[contains(text(),'Continue With Facebook')]"));
	private static final ButtonElement PreviewWebsite_Button = new ButtonElement("Click on preview website",
			locateByXPath("//a[@id='prev_btn_disable']"));
	private static final ButtonElement clickOnGoogleButton = new ButtonElement("Click on google button",
			locateByXPath("//div[@class='row']//span[contains(text(),'Continue With Google')]"));
	//ul[@class='new_social']/li[2]/a
	//img[@src='http://muviwebuiltd.idogic.com/themes/muviwebuiltd/images/googleplus_new.jpg']
	//div[@class='form-group']//img[substring(@src, string-length(@src) - 17) = 'googleplus_new.jpg'][@xpath='1']
	//img[@src='https://securitymuviwebuiltd.idogic.com/themes/muviwebuiltd/images/googleplus_new.jpg'][@xpath='1']
	//img[@src='https://muviwebuiltd.idogic.com/themes/muviwebuiltd/images/googleplus_new.jpg']
	private static final TextFieldElement LoginFacebookUsername = new TextFieldElement("Enter username in username textbox ",
			locateByXPath("//input[@id='email']"));
	private static final TextFieldElement LoginFacebookPassword = new TextFieldElement("Enter password in password textbox ",
			locateByXPath("//input[@id='pass']"));
	private static final ButtonElement clicoOnLogInButton = new ButtonElement("Click on login button",
			locateByXPath("//button[@id='loginbutton']"));
	private static final TextFieldElement LoginGoogleUsername = new TextFieldElement("Enter username in username textbox ",
			locateByXPath("//input[@type='email']"));
	private static final TextFieldElement LoginGooglePassword = new TextFieldElement("Enter password in password textbox ",
			locateByXPath("//input[@type='password']"));
	private static final ButtonElement clickOnNextButton = new ButtonElement("Click on next button",
			locateByXPath("//div[@id='identifierNext']"));
	private static final ButtonElement clickOnNextButton1 = new ButtonElement("Click on next button",
			locateByXPath("//span[contains(text(),'Next')]"));
	
	String match="Sign in - Google Accounts";

	public FacebookLoginAndGoogleLogin SelectByText(final String Text, String xpath) throws Exception {
		waitForSeconds(1);
		SelectList s = new SelectList(Text, By.xpath(xpath));
		s.selectByText(Text);
		return this;

	}

	public FacebookLoginAndGoogleLogin SimulateClick(ButtonElement element) throws Exception {
		waitForSeconds(2);
		element.simulateClick();
		return this;
	}

	public FacebookLoginAndGoogleLogin AssertEquals(final String actualText, final String expectedText) throws Exception {
		assertEquals(actualText.toLowerCase(), expectedText.toLowerCase(), "Actual text and Expected Text Not Equal");
		return this;
	}

	public FacebookLoginAndGoogleLogin Click(ButtonElement element) throws Exception {

		element.waitForPresent(10);
		element.click();
		return this;
	}

	public FacebookLoginAndGoogleLogin Wait(int value) throws Exception {
		waitForSeconds(value);

		return this;

	}

	public FacebookLoginAndGoogleLogin WaitForElementPresent(final HtmlElement element) {
		element.waitForPresent(20);

		return this;
	}

	public FacebookLoginAndGoogleLogin MouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.mouseOver();
		return this;
	}

	public FacebookLoginAndGoogleLogin SimulateMouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.simulateMouseOver();
		return this;
	}

	public FacebookLoginAndGoogleLogin Textbox(TextFieldElement element, final String Text) throws Exception {

		element.clearAndType(Text);
		return this;
	}

	public FacebookLoginAndGoogleLogin scrollToElement() throws Exception {

		WebElement element = driver
				.findElement(By.xpath("//button[@id='nextbtn'][contains(text(),'Add Featured Section')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click().perform();

		return this;
	}
	public FacebookLoginAndGoogleLogin AssertTrue(final Boolean actualText2) throws Exception {
		assertTrue(actualText2, "Text should  be visible but now its not visible");
		return this;
	}

	public FacebookLoginAndGoogleLogin Clickat(ButtonElement element) throws Exception {

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

	public FacebookLoginAndGoogleLogin ClickOnDeleteFeature(WebUIData WebUIData) throws Exception {

		final ButtonElement webelement = new ButtonElement("Click on  delete feature",
				locateByXPath("//div[@class='Collapse-Block']//div/h4[contains(text(),'" + WebUIData.getName()
						+ "')]/..//em[@class='icon-trash icon']"));

		webelement.clickAt();
		return new FacebookLoginAndGoogleLogin(false);

	}

	public FacebookLoginAndGoogleLogin ClickOnDeleteAutoFeature() throws Exception {

		final ButtonElement webelement = new ButtonElement("Click on  delete feature", locateByXPath(
				"//div[@class='Collapse-Block']//div/h4[contains(text(),'Auto Generated Feature Section')]/..//em[@class='icon-trash icon']"));

		WebElement element = driver.findElement(By.xpath(
				"//div[@class='Collapse-Block']//div/h4[contains(text(),'Auto Generated Feature Section')]/..//em[@class='icon-trash icon']"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		webelement.simulateClick();
		return new FacebookLoginAndGoogleLogin(false);

	}





	public FacebookLoginAndGoogleLogin pressEnter() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		return this;
	}






	public FacebookLoginAndGoogleLogin pressSpace() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.SPACE).perform();
		return this;
	}

	public FacebookLoginAndGoogleLogin refreshPage() throws Exception {
		refresh();
		return this;
	}

	public FacebookLoginAndGoogleLogin closeCurrentWindow() throws Exception {
		driver.close();
		return this;
	}

	public FacebookLoginAndGoogleLogin WindowSwitch(int val) throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[val]);
		waitForSeconds(1);

		return this;
	}

	


	public FacebookLoginAndGoogleLogin goBackPage() {
		goBack();
		return this;
	}
	

	

	
	
	
	public WebUIPage facebookLogInRegisterPage(WebUIData WebUIData) throws Exception {
		
		
		
		 Click(clickOnRegisterButton)
		.Click(clickOnFacebookButton)
		.Wait(5)
		.WindowSwitch(1)
		//.AssertEquals(driver.getTitle(), "Log in to Facebook | Facebook")
		.Textbox(LoginFacebookUsername, WebUIData.getLoginName())
		.Textbox(LoginFacebookPassword, WebUIData.getLoginPassWord())
		.Click(clicoOnLogInButton)
		.WindowSwitch(0)
		.Wait(5)
		
		;
		
		
		
		return new WebUIPage(false);
	}
	
	public WebUIPage googleLogInRegisterPage(WebUIData WebUIData) throws Exception {
		
		
		
		 Click(clickOnRegisterButton)
		 .Wait(5)
		.Click(clickOnGoogleButton)
		.Wait(5)
		//.AssertTrue(driver.getTitle().equalsIgnoreCase(match))
		.Textbox(LoginGoogleUsername, WebUIData.getLoginName())
		.Click(clickOnNextButton)
		.Wait(5)
		.Textbox(LoginGooglePassword, WebUIData.getLoginPassWord())
		.Click(clickOnNextButton1)
		.Wait(5)
		//.Click(clicoOnLogInButton)
		.WindowSwitch(0)
		.Wait(5)
		
		;
		
		
		
		return new WebUIPage(false);
	}
	
	public WebUIPage faceBookLogIn(WebUIData WebUIData) throws Exception {
		
		
		
		 Click(clickOnLoginButton)
		 .Wait(5)
		.Click(clickOnFacebookButtoninloginPage)
		/*.Wait(5)
		.AssertEquals(driver.getTitle(), "Home | muvi webui ltd")*/
		
		.Wait(5)
		
		;
		
		
		
		return new WebUIPage(false);
	}
	public WebUIPage googleLogIn(WebUIData WebUIData) throws Exception {
		
		
		
		  Click(clickOnLoginButton)
		 .Wait(5)
		 .Click(clickOnGoogleButton)
		/*.Wait(5)
		.AssertEquals(driver.getTitle(), "Home | muvi webui ltd")*/
		
		.Wait(10)
		
		;
		
		
		
		return new WebUIPage(false);
	}
	

}