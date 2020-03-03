/*
 * Copyright © 2018 www.muvi.com
 *
 * @author  Sunil Kumar Behera <sunilkumar@muvi.com>
 */

package com.seleniumtests.webpage;

import static com.seleniumtests.core.Locator.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

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

public class WebUIPage extends PageObject {
	public static String url = null;
	public static String URL = null;

	public static Map<Object, Map<Object, Object>> mastermap = new HashMap<Object, Map<Object, Object>>();

	// String selectpkg="//select[@id='packages']";

	public WebUIPage(final boolean openPageURL) throws Exception {

		super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);

	}

	private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ", locateByXPath("//html"));

	private static final TextFieldElement suscribtion_month = new TextFieldElement("subscription month",
			locateByXPath("//div[@id='carddetaildiv']/div/div[1]/div[2]/div[2]/label/.."));
	private static final TextFieldElement suscribtion_value = new TextFieldElement("subscription value",
			locateByXPath("//div[@id='carddetaildiv']//span[@class='charge_now']"));

	public WebUIPage Click(ButtonElement element) throws Exception {

		element.waitForPresent(10);
		element.click();
		return this;
	}

	public WebUIPage suggetionBoxdata(WebUIData WebUIData) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on suggetion iteam",
				locateByXPath("//div[starts-with(@id,'ui-id')][contains(text(),'" + WebUIData.getComanyname() + "')]"));
		webelement.scroll();
		webelement.click();
		return new WebUIPage(false);

	}

	public WebUIPage suggetionBoxDefaultData() throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on suggetion default data iteam",
				locateByXPath("//div[starts-with(@id,'ui-id')][contains(text(),'Demo')]"));
		webelement.scroll();
		webelement.click();
		return new WebUIPage(false);

	}

	public WebUIPage ClickOnAddContentDemo(WebUIData WebUIData) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on  add content",
				locateByXPath("//div[@class='Collapse-Block']//div[1]/h4[contains(text(),'" + WebUIData.getName()
						+ "')]/../following-sibling::div[@class='Collapse-Content row']//a[@class='btn btn-primary m-t-10 p-l-40']"));

		webelement.clickAt();
		return new WebUIPage(false);

	}

	public WebUIPage Textbox(TextFieldElement element, final String Text) throws Exception {

		element.clearAndType(Text);
		return this;
	}

	public WebUIPage SimulateClick(ButtonElement element) throws Exception {
		waitForSeconds(2);
		element.simulateClick();
		return this;
	}

	public WebUIPage MouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.mouseOver();
		return this;
	}

	public WebUIPage SimulateMouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.simulateMouseOver();
		return this;
	}

	public WebUIPage WaitforElelment(String text, int timeout) throws Exception {
		String xpath = "//em[@class='" + text + "']";
		waitForElementPresent(By.xpath(xpath), timeout);
		return this;
	}

	public WebUIPage WaitforElelmentRed(String text, int timeout) throws Exception {
		String xpath = "//em[@class='" + text + "'][@style='color:#EF6C00;']";
		waitForElementPresent(By.xpath(xpath), timeout);
		return this;
	}

	public String storeValue() throws Exception {
		waitForSeconds(5);
		String text = suscribtion_value.getText();

		/*
		 * String monthsuscribtion=suscribtion_month.getText();
		 * System.out.println(text+" "+ monthsuscribtion);
		 */

		return text;

	}

	public String storeMonth() throws Exception {

		String monthsuscribtionrep = suscribtion_month.getText();

		String monthsuscribtion = monthsuscribtionrep.replace("Next Billing date: ", "");

		return monthsuscribtion;

	}

	public String toDayDayFormat() throws Exception {

		Date current = new Date();
		String strDate;
		DateFormat dateFormat;
		Calendar cal = Calendar.getInstance();
		cal.setTime(current);
		cal.set(Calendar.MONTH, (cal.get(Calendar.MONTH)));
		current = cal.getTime();
		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		strDate = dateFormat.format(current);
		System.out.println(strDate);
		return strDate;

	}

	public String nextBillDat() throws Exception {

		Date current = new Date();
		String strDate;
		DateFormat dateFormat;
		Calendar cal = Calendar.getInstance();
		cal.setTime(current);
		cal.set(Calendar.DAY_OF_MONTH, (cal.get(Calendar.DAY_OF_MONTH) + 30));
		current = cal.getTime();
		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		strDate = dateFormat.format(current);
		System.out.println(strDate);

		return strDate;

	}

	public WebUIPage TakePrint(String Key) throws Exception {
		waitForSeconds(5);

//	 Robot rb=new Robot();
//	 rb.keyPress(KeyEvent.VK_CONTROL);    
//     rb.keyPress(KeyEvent.VK_P);
//     rb.keyPress(KeyEvent.VK_ENTER);
//     rb.keyPress(KeyEvent.VK_ENTER);
//     
//     rb.keyRelease(KeyEvent.VK_ENTER);
//     rb.keyRelease(KeyEvent.VK_ENTER);
//     rb.keyRelease(KeyEvent.VK_P);
//     rb.keyRelease(KeyEvent.VK_CONTROL);

		return this;

	}

	public WebUIPage KeyOp(String Key) throws Exception {

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).perform();
		 */

		Actions act = new Actions(driver);
		String key = "Keys." + Key;
		act.sendKeys(key).build().perform();

		return this;

	}

	public WebUIPage KeyOp(String Key, String Key1, String Key2) throws Exception {

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).perform();
		 */

		Actions act = new Actions(driver);
		String keyDown = "Keys." + Key1;
		String keyUp = "Keys." + Key2;
		String key = "Keys." + Key;

		act.keyDown(keyDown).sendKeys(key).keyUp(keyUp).perform();
		;

		return this;

	}

	public WebUIPage PrintvalueAndMonth() throws Exception {
		waitForSeconds(5);
		System.out.println(storeValue());
		System.out.println(storeMonth());
		return this;

	}

	public WebUIPage AssertEquals(final String actualText1, final String expectedText) throws Exception {
		assertEquals(actualText1.toLowerCase(), "Actual text and Expected Text Not Equal");
		return this;
	}

	public WebUIPage AssertTrue(final Boolean actualText2) throws Exception {
		assertTrue(actualText2, "Text should  be visible but now its not visible");
		return this;
	}

	public WebUIPage Wait(int value) throws Exception {
		waitForSeconds(value);

		return this;

	}

	public WebUIPage Uncheck(final CheckBoxElement element) throws Exception {

		element.uncheck();
		return this;

	}

	public WebUIPage Check(final CheckBoxElement element) throws Exception {

		element.check();
		return this;

	}

	public WebUIPage browserVersion() throws Exception {
		waitForSeconds(2);

		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		System.out.println(browserName);
		String os = cap.getPlatform().toString();
		System.out.println(os);
		String v = cap.getVersion().toString();
		System.out.println(v);

		return this;
	}

	public WebUIPage SelectByListIndex(final int index, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByIndex(index);
		return this;

	}

	public WebUIPage SelectByText(final String value, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByText(value);
		return this;

	}

	public WebUIPage SelectByList(final String Text, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList(Text, By.xpath(xpath));
		s.selectByValue(Text);
		return this;

	}

	public WebUIPage ListOfElement(final String xpath) throws Exception {
		List<WebElement> li = driver.findElements(By.xpath(xpath));
		li.get(0).click();
		return this;

	}

	public WebUIPage Wait1(int value) throws Exception {
		waitForSeconds(value);

		return this;

	}

	public WebUIPage pageScrollDown() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		return this;
	}

	public WebUIPage SidePannelScrollDown() throws Exception {

		JavascriptExecutor je = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath(".//ul[@class='menu-wrap']"));

		je.executeScript("arguments[0].scrollIntoView(true);", element);

		return this;
	}

	public WebUIPage NewUrl() throws Exception {
		driver.get("http://www.admin.idogic.com");
		return this;
	}

	public WebUIPage BaseUrl() throws Exception {
		driver.get("https://cms.idogic.com/admin/dashboard");

		return this;
	}

	public WebUIPage PopUpAccept() throws Exception {
		driver.switchTo().alert().accept();
		return this;
	}

	public WebUIPage ListOfElement1() throws Exception {

		List<WebElement> li = driver.findElements(By.xpath(".//ul[@class='menu-wrap']/li"));
		WebElement element = li.get(14);

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		driver.findElement(By.linkText("Account Info")).click();
		return this;

	}

	public WebUIPage pressEnter() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		return this;
	}

	public WebUIPage uploadFile(final String browsebutton, final String data) throws Exception {

		WebElement uploadElement = driver.findElement(By.xpath(browsebutton));
		uploadElement.click();

		File f1 = new File(data);
		String path = f1.getAbsolutePath();

		StringSelection mydata = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(mydata, null);

		System.out.println(path);
		System.out.println(mydata);

		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();

		Thread.sleep(5000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// uploadElement.sendKeys(Muvi6Data.getVideourl());
		return this;

	}

	public WebUIPage randomData(final WebUIData WebUIData) throws Exception {
		WebUIData.setName(RandomName.name());
		WebUIData.setComanyname(CompanyName.comanyName());
		WebUIData.setMobilenumber(RandomMobileNo.randomMobileNo());
		WebUIData.setEmail(RandomEmailID.randomEmail());
		WebUIData.setPassword(RandomPassword.password(10));
		WebUIData.setAddress(RandomAddress.address());
		WebUIData.setState(RandomNewStateName.state());
		WebUIData.setZip(RandomZip.zip());
		WebUIData.setTodaydate(NewRandomData.todayDate());

		// Updated new random data for WebUI

		WebUIData.setNameNew(NewRandomData.newRandomName());
		WebUIData.setCompanyNew(NewRandomData.newRandomCompanyName());
		WebUIData.setPasswordNew(NewRandomData.newRandomPassword());
		WebUIData.setPhonenuberNew(NewRandomData.newRandomPhoneNumber());
		WebUIData.setEmailNew(NewRandomData.newRandomEmail());

		return this;

	}

	public WebUILoginPage ClickLogin() throws Exception {

		return new WebUILoginPage(false);
	}
	
	public WebUISignUP signup() throws Exception {

		return new WebUISignUP(false);
	}
	public FacebookLoginAndGoogleLogin ClicknewPage() throws Exception {

		return new FacebookLoginAndGoogleLogin(false);
	}

	public WebUIPage selectNewTab() throws Exception {
		waitForSeconds(2);
		selectNewWindow();
		return this;

	}

	public WebUIPage SelectPlaneName(String planname, String fee) throws Exception {
		final ButtonElement SelectPlanButton = new ButtonElement("Click on " + planname,
				locateByXPath("//form[@id='membership_form']//h3[text()='" + planname
						+ "']/following-sibling::h4/span[text()='$" + fee + ".00']"));
		SelectPlanButton.click();
		Wait(4);
		return this;

	}

	public WebUIPage ParentWindow() throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
		waitForSeconds(1);

		return this;
	}

	public WebUIPage ChildWindow() throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[2]);
		waitForSeconds(1);

		return this;
	}

	public WebUIPage GoBack() throws Exception {

		goBack();
		return this;

	}

	public WebUIPage closeCurrentWindow() throws Exception {

		driver.close();
		return this;

	}

	public WebUIPage getitle() throws Exception {

		String url = driver.getCurrentUrl();
		System.out.println(url);
		return this;

	}

	public WebUIPage MouseOverOnContent(String ContentName) throws Exception {

		final ButtonElement webelement = new ButtonElement("Mouse Over on " + ContentName,
				locateByXPath("//a[@data-name='" + ContentName + "']/../../../.."));
		MouseOver(webelement);
		Wait(4);

		return this;
	}
	

	public WebUIPage ClickOnCOntent(String ContentName) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on  " + ContentName,
				locateByXPath("//a[@data-name='" + ContentName + "']"));
		webelement.click();
		return this;

	}

	public WebUIPage WindowSwitch(int val) throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[val]);
		waitForSeconds(1);

		return this;
	}

	public WebUIPage webUI_manually_generated(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false).randomData(WebUIData).ClickLogin().ClickOnLogIn(WebUIData).Wait(10).clickOnAddContentManage()
				.VerifyContentManage(WebUIData).clickOnWebsite().Wait(10).AddNewFeaturedManually(WebUIData)
				.addNewFeaturedSectionContent(WebUIData).clickOnPreview().ClickOnLogInForEndUser(WebUIData)
				.pageScrollDown().Wait(20).AddNewFeaturedManually(WebUIData).WindowSwitch(0).clickOnWebsite().Wait(10)
				.deleteContentFromFeature(WebUIData).Wait(20).afterDeletcontent(WebUIData)
				.deleteFeatureSection(WebUIData).clickOnRemoveContentManage().DeleteContentManageContent(WebUIData).Wait(10)

		;

	}

	public WebUIPage webUI_auto_generated(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false).randomData(WebUIData).ClickLogin().ClickOnLogIn(WebUIData).clickOnWebsite()
				.AddNewFeaturedAuto(WebUIData)

		;

	}
	
	public WebUIPage webUI_user_profile(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false).randomData(WebUIData).ClickLogin().ClickOnLogIn(WebUIData).userFeature()
				.addCustomeField(WebUIData)

		;

	}
	
	
	public WebUIPage webUI_user_profileAssert(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false).randomData(WebUIData).ClickLogin().ClickOnLogIn(WebUIData).userFeature()
				.CheckOtherFeature(WebUIData)

		;

	}
	
	public WebUIPage webUI_Facebook_Login(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false).randomData(WebUIData).ClickLogin().ClickOnLogIn(WebUIData).faceBookLogin()
				.facebookLogInRegisterPage(WebUIData)
				

		;

	}
	
	public WebUIPage webUI_Google_Login(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false).randomData(WebUIData).ClickLogin().ClickOnLogIn(WebUIData).googleLogin()
				.googleLogInRegisterPage(WebUIData)
				

		;

	}
	
	
	public WebUIPage webUI_Facebook_Login_Already(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false).randomData(WebUIData).ClickLogin().ClickOnLogIn(WebUIData).facebookLoginAlready(WebUIData).faceBookLogIn(WebUIData)
				

		;

	}
	
	public WebUIPage webUI_Google_Login_Already(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false).randomData(WebUIData).ClickLogin().ClickOnLogIn(WebUIData).googlesLoginAlready(WebUIData).googleLogIn(WebUIData)
				

		;

	}
	
	
	public WebUIPage webUI_Banner_Editor(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				.randomData(WebUIData)
				.ClickLogin()
				.ClickOnLogIn(WebUIData)
				.bannerEditor()
				.bannerEditstyle(WebUIData)
				
				

		;

	}
	public WebUIPage webUI_Login_validation(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				.randomData(WebUIData)
				.ClickLogin()
				.ClickOnLogIn(WebUIData)
				.loginRegister()
				.loginRegisterBlankSubmit()
				
				

		;

	}
	
	public WebUIPage webUI_Watch_History(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				.randomData(WebUIData)
				.ClickLogin()
				.ClickOnLogIn(WebUIData)
				.verifyWatchHistory()
				.checkVerifyWatchHistoryIsClickOrNot(WebUIData)
				
				

		;

	}
	
	public WebUIPage webUI_Watch_History_function(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				.randomData(WebUIData)
				.ClickLogin()
				.ClickOnLogIn(WebUIData)
				.verifyWatchHistory()
				.watchHistoryPageFunctionality(WebUIData)
				
				

		;

	}
	
	
	public WebUIPage free_SignUP_process(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				//.randomData(WebUIData)
				.signup()
				.signUpWithAllData(WebUIData)
				
				

		;

	}
	
	
	
	public WebUIPage webUI_My_Favorite_login_function(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				.randomData(WebUIData)
				.ClickLogin()
				.ClickOnLogIn(WebUIData)
				.verifyMyFavorite()
				.checkAndVerifyLoginOrNot(WebUIData)
				
				

		;

	}
	
	
	
	public WebUIPage webUI_My_Favorite_verification_CMS(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				.randomData(WebUIData)
				.ClickLogin()
				.ClickOnLogIn(WebUIData)
				.verifyMyFavorite()
				.checkVerifyMyFavoritePageIsClickOrNot(WebUIData)
				
				

		;

	}
	
	public WebUIPage webUI_My_Favorite_Functionality(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				.randomData(WebUIData)
				.ClickLogin()
				.ClickOnLogIn(WebUIData)
				.verifyMyFavorite()
				.MyFavoritePageFunctionality(WebUIData)
				
				

		;

	}
	
	
	
	public WebUIPage relatedContent(final WebUIData WebUIData) throws Exception {
		return new WebUIPage(false)
				.randomData(WebUIData)
				.ClickLogin()
				.ClickOnLogIn(WebUIData)
				.verifyMyRelatedContent()
				.relatedContentPage(WebUIData)
				
				

		;

	}
	
	
	

}