/*
 * Copyright © 2018 www.muvi.com
 *
 * @author  Sunil Kumar Behera <sunilkumar@muvi.com>
 */

package com.seleniumtests.webpage;

import static com.seleniumtests.core.Locator.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
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

public class ManageUserProfilePage extends PageObject {
	public static String url = null;
	public static String URL = null;

	public static Map<Object, Map<Object, Object>> mastermap = new HashMap<Object, Map<Object, Object>>();

	// String selectpkg="//select[@id='packages']";

	public ManageUserProfilePage(final boolean openPageURL) throws Exception {

		super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);

	}

	private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ", locateByXPath("//html"));

	private static final TextFieldElement suscribtion_month = new TextFieldElement("subscription month",
			locateByXPath("//div[@id='carddetaildiv']/div/div[1]/div[2]/div[2]/label/.."));
	private static final TextFieldElement suscribtion_value = new TextFieldElement("subscription value",
			locateByXPath("//div[@id='carddetaildiv']//span[@class='charge_now']"));
	private static final TextFieldElement fullNameText = new TextFieldElement("Match with full text",
			locateByXPath("//label[contains(text(),'Full Name')]"));

	private static final TextFieldElement email = new TextFieldElement("match email",
			locateByXPath("//label[contains(text(),'Email')]"));
	private static final TextFieldElement password = new TextFieldElement("patch password",
			locateByXPath("//label[.//text()='Password']"));
	private static final TextFieldElement confirmPassword = new TextFieldElement("Match confirm password",
			locateByXPath("//label[contains(text(),'Confirm Password')]"));
	private static final ButtonElement addConstumeButton = new ButtonElement("Click on custome button",
			locateByXPath("//button[@class='btn btn-default-with-bg']"));
	private static final TextFieldElement fLevelTextBox = new TextFieldElement("Enter value on text box",
			locateByXPath("//input[@name='data[f_label]']"));
	private static final TextFieldElement hintText = new TextFieldElement("Enter Hint Text",
			locateByXPath("//input[@name='data[f_placeholder]']"));
	private static final ButtonElement hintTextc = new ButtonElement("Enter Hint Text",
			locateByXPath("//input[@name='data[f_placeholder]']"));
	private static final ButtonElement isRequiredCheckBox = new ButtonElement("Click Check box",
			locateByXPath("//input[@id='is_require']"));
	private static final ButtonElement saveButton = new ButtonElement("Click on Save button",
			locateByXPath("//div[@class='modal-footer']//button[@type='button'][contains(text(),'Save')]"));

	private static final ButtonElement addPlusSign = new ButtonElement("Click on plus sign",
			locateByXPath("//em[@class='icon-plus']"));
	private static final ButtonElement addPlusSignCustomeField = new ButtonElement("add option custome field",
			locateByXPath("//i[@class='icon-plus h4']"));
	final TextFieldElement textValue = new TextFieldElement("Enter option text",
			locateByXPath("//input[@name='data[field_values][0]']"));
	final TextFieldElement textValue1 = new TextFieldElement("Enter option text",
			locateByXPath("//input[@name='data[field_values][1]']"));
	final TextFieldElement textValue2 = new TextFieldElement("Enter option text",
			locateByXPath("//input[@name='data[field_values][2]']"));
	final TextFieldElement textValue3 = new TextFieldElement("Enter option text",
			locateByXPath("//input[@name='data[field_values][3]']"));
	private static final ButtonElement cancelButton = new ButtonElement("Click on cancel button",
			locateByXPath("//div[@id='mymodaldiv']//button[@type='button'][contains(text(),'Cancel')]"));
	private static final ButtonElement preview = new ButtonElement("Click on preview button",
			locateByXPath("//a[@id='prev_btn_disable']"));
	private static final ButtonElement registerClick = new ButtonElement("Click on register button",
			locateByXPath("//a[@class='register']"));
	private static final ButtonElement closeButton = new ButtonElement("Click on close button",
			locateByXPath("//i[@class='icon-close h4']"));
	private static final ButtonElement saveOnClickButton = new ButtonElement("Click on save button",
			locateByXPath("//button[@onclick='SaveCustomField(this)']"));

	// Assert match level
	private static final HtmlElement AddressLevel = new HtmlElement("Match the assert value with actual value",
			locateByXPath("//label[contains(text(),'Address')]"));
	private static final HtmlElement FathersNameLevel = new HtmlElement("Match the assert value with actual value",
			locateByXPath("//label[contains(text(),'Fathers Name')]"));
	private static final HtmlElement CityLevel = new HtmlElement("Match the assert value with actual value",
			locateByXPath("//label[contains(text(),'City')]"));
	private static final HtmlElement CourceLevel = new HtmlElement("Match the assert value with actual value",
			locateByXPath("//label[contains(text(),'Cource')]"));
	private static final HtmlElement GenderLevel = new HtmlElement("Match the assert value with actual value",
			locateByXPath("//label[contains(text(),'Gender')]"));
	private static final HtmlElement CatagoryLevel = new HtmlElement("Match the assert value with actual value",
			locateByXPath("//label[contains(text(),'Catagory')]"));
	private static final HtmlElement DateLevel = new HtmlElement("Match the assert value with actual value",
			locateByXPath("//label[contains(text(),'Date')]"));

	String fieldType = "//select[contains(@name,'data[input_type]')]";

	public ManageUserProfilePage Click(ButtonElement element) throws Exception {

		element.waitForPresent(10);
		element.click();
		return this;
	}

	public ManageUserProfilePage suggetionBoxdata(WebUIData WebUIData) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on suggetion iteam", locateByXPath(
				"//div[starts-with(@id,'ui-id')][contains(text(),'" + WebUIData.getAsserttruematch() + "')]"));
		webelement.scroll();
		webelement.click();
		return new ManageUserProfilePage(false);

	}

	public ManageUserProfilePage suggetionBoxDefaultData() throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on suggetion default data iteam",
				locateByXPath("//div[starts-with(@id,'ui-id')][contains(text(),'Demo')]"));
		webelement.scroll();
		webelement.click();
		return new ManageUserProfilePage(false);

	}

	public ManageUserProfilePage ClickOnAddContentDemo(WebUIData WebUIData) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on  add content",
				locateByXPath("//div[@class='Collapse-Block']//div[1]/h4[contains(text(),'" + WebUIData.getName()
						+ "')]/../following-sibling::div[@class='Collapse-Content row']//a[@class='btn btn-primary m-t-10 p-l-40']"));

		webelement.clickAt();
		return new ManageUserProfilePage(false);

	}

	public ManageUserProfilePage Textbox(TextFieldElement element, final String Text) throws Exception {

		element.clearAndType(Text);
		return this;
	}

	public ManageUserProfilePage SimulateClick(ButtonElement element) throws Exception {
		waitForSeconds(2);
		element.simulateClick();
		return this;
	}

	public ManageUserProfilePage MouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.mouseOver();
		return this;
	}

	public ManageUserProfilePage SimulateMouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.simulateMouseOver();
		return this;
	}

	public ManageUserProfilePage WaitforElelment(String text, int timeout) throws Exception {
		String xpath = "//em[@class='" + text + "']";
		waitForElementPresent(By.xpath(xpath), timeout);
		return this;
	}

	public ManageUserProfilePage WaitforElelmentRed(String text, int timeout) throws Exception {
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

	public ManageUserProfilePage KeyOp(String Key) throws Exception {

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).
		 * perform();
		 */

		Actions act = new Actions(driver);
		String key = "Keys." + Key;
		act.sendKeys(key).build().perform();

		return this;

	}

	public ManageUserProfilePage KeyOp(String Key, String Key1, String Key2) throws Exception {

		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).
		 * perform();
		 */

		Actions act = new Actions(driver);
		String keyDown = "Keys." + Key1;
		String keyUp = "Keys." + Key2;
		String key = "Keys." + Key;

		act.keyDown(keyDown).sendKeys(key).keyUp(keyUp).perform();
		;

		return this;

	}

	public ManageUserProfilePage PrintvalueAndMonth() throws Exception {
		waitForSeconds(5);
		System.out.println(storeValue());
		System.out.println(storeMonth());
		return this;

	}

	public ManageUserProfilePage AssertEquals(final String actualText1, final String expectedText) throws Exception {
		assertEquals(actualText1, expectedText);
		return this;
	}

	public ManageUserProfilePage AssertTrue(final Boolean actualText2) throws Exception {
		assertTrue(actualText2, "Text should  be visible but now its not visible");
		return this;
	}

	public ManageUserProfilePage Wait(int value) throws Exception {
		waitForSeconds(value);

		return this;

	}

	public ManageUserProfilePage Uncheck(final CheckBoxElement element) throws Exception {

		element.uncheck();
		return this;

	}

	public ManageUserProfilePage Check(final CheckBoxElement element) throws Exception {

		element.check();
		return this;

	}

	public ManageUserProfilePage browserVersion() throws Exception {
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

	public ManageUserProfilePage SelectByListIndex(final int index, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByIndex(index);
		return this;

	}

	public ManageUserProfilePage SelectByText(final String value, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByText(value);
		return this;

	}

	public ManageUserProfilePage SelectByList(final String Text, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList(Text, By.xpath(xpath));
		s.selectByValue(Text);
		return this;

	}

	public ManageUserProfilePage ListOfElement(final String xpath) throws Exception {
		List<WebElement> li = driver.findElements(By.xpath(xpath));
		li.get(0).click();
		return this;

	}

	public ManageUserProfilePage Wait1(int value) throws Exception {
		waitForSeconds(value);

		return this;

	}

	public ManageUserProfilePage pageScrollDown() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		return this;
	}

	public ManageUserProfilePage SidePannelScrollDown() throws Exception {

		JavascriptExecutor je = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath(".//ul[@class='menu-wrap']"));

		je.executeScript("arguments[0].scrollIntoView(true);", element);

		return this;
	}

	public ManageUserProfilePage NewUrl() throws Exception {
		driver.get("http://www.admin.idogic.com");
		return this;
	}

	public ManageUserProfilePage BaseUrl() throws Exception {
		driver.get("https://cms.idogic.com/admin/dashboard");

		return this;
	}

	public ManageUserProfilePage PopUpAccept() throws Exception {
		driver.switchTo().alert().accept();
		return this;
	}

	public ManageUserProfilePage ListOfElement1() throws Exception {

		List<WebElement> li = driver.findElements(By.xpath(".//ul[@class='menu-wrap']/li"));
		WebElement element = li.get(14);

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		driver.findElement(By.linkText("Account Info")).click();
		return this;

	}

	public ManageUserProfilePage pressEnter() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		return this;
	}

	public ManageUserProfilePage uploadFile(final String browsebutton, final String data) throws Exception {

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

	public ManageUserProfilePage randomData(final WebUIData WebUIData) throws Exception {
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

	public ManageUserProfilePage selectNewTab() throws Exception {
		waitForSeconds(2);
		selectNewWindow();
		return this;

	}

	public ManageUserProfilePage SelectPlaneName(String planname, String fee) throws Exception {
		final ButtonElement SelectPlanButton = new ButtonElement("Click on " + planname,
				locateByXPath("//form[@id='membership_form']//h3[text()='" + planname
						+ "']/following-sibling::h4/span[text()='$" + fee + ".00']"));
		SelectPlanButton.click();
		Wait(4);
		return this;

	}

	public ManageUserProfilePage ParentWindow() throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
		waitForSeconds(1);

		return this;
	}

	public ManageUserProfilePage ChildWindow() throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[2]);
		waitForSeconds(1);

		return this;
	}

	public ManageUserProfilePage GoBack() throws Exception {

		goBack();
		return this;

	}

	public ManageUserProfilePage closeCurrentWindow() throws Exception {

		driver.close();
		return this;

	}

	public ManageUserProfilePage getitle() throws Exception {

		String url = driver.getCurrentUrl();
		System.out.println(url);
		return this;

	}

	public ManageUserProfilePage MouseOverOnContent(String ContentName) throws Exception {

		final ButtonElement webelement = new ButtonElement("Mouse Over on " + ContentName,
				locateByXPath("//a[@data-name='" + ContentName + "']/../../../.."));
		MouseOver(webelement);
		Wait(4);

		return this;
	}

	public ManageUserProfilePage ClickOnCOntent(String ContentName) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on  " + ContentName,
				locateByXPath("//a[@data-name='" + ContentName + "']"));
		webelement.click();
		return this;

	}

	public ManageUserProfilePage WindowSwitch(int val) throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[val]);
		waitForSeconds(1);

		return this;
	}

	public ManageUserProfilePage FieldLevel(final WebUIData WebUIData) throws Exception {

		final ButtonElement webelement = new ButtonElement("Value foe field level",
				locateByXPath("//label[contains(text(), '" + WebUIData.getContentform()
						+ "')]//..//i[@class='icon-close h4 m-t-0 m-b-0']"));

		webelement.click();
		return this;

	}

	public SelectList DeleteButton(final String Text) throws Exception {
		waitForSeconds(1);
		SelectList s = new SelectList(Text, By.xpath(fieldType));
		s.selectByText(Text);

		return s;

	}

	public SelectList SelectFieldTypeText(final String Text) throws Exception {
		waitForSeconds(1);
		SelectList s = new SelectList(Text, By.xpath(fieldType));
		s.selectByText(Text);

		return s;

	}



	public ManageUserProfilePage AddValueInCSV(final WebUIData WebUIData) throws Exception {

		if ((WebUIData.getContentname()).equalsIgnoreCase("Textarea"))

		{

			WebUIData.setAsserttruematch(AddressLevel.getText());

		} else if ((WebUIData.getContentname()).equalsIgnoreCase("TextField")) {
			WebUIData.setAsserttruematch(FathersNameLevel.getText());
		} else if ((WebUIData.getContentname()).equalsIgnoreCase("List")) {
			WebUIData.setAsserttruematch(CityLevel.getText());
		} else if ((WebUIData.getContentname()).equalsIgnoreCase("Radio")) {
			WebUIData.setAsserttruematch(GenderLevel.getText());
		} else if ((WebUIData.getContentname()).equalsIgnoreCase("Checkbox")) {
			WebUIData.setAsserttruematch(CatagoryLevel.getText());
		} else if ((WebUIData.getContentname()).equalsIgnoreCase("Cource")) {
			WebUIData.setAsserttruematch(CourceLevel.getText());
		} else if ((WebUIData.getContentname()).equalsIgnoreCase("Date Picker")) {
			WebUIData.setAsserttruematch(DateLevel.getText());
		}

		return new ManageUserProfilePage(false);
	}

	public ManageUserProfilePage DeleteUsderProfile(WebUIData WebUIData) throws Exception {

		final HtmlElement viewOldData = new HtmlElement("Match the assert value with actual value",
				locateByXPath("//label[contains(text(), '"+WebUIData.getContentform()+"')]"));
		try {
			while (viewOldData.isDisplayed()) {

				FieldLevel(WebUIData).SimulateClick(closeButton).pressEnter().SimulateClick(saveOnClickButton);

			}
		} catch (Exception e) {

		}
		return this;

	}

	public WebUIPage addCustomeField(WebUIData WebUIData) throws Exception {

		AssertTrue(fullNameText.isDisplayed()).AssertTrue(email.isDisplayed()).AssertTrue(password.isDisplayed())
				.AssertTrue(confirmPassword.isDisplayed()).DeleteUsderProfile(WebUIData).Click(addConstumeButton);

		/*
		 * if() { Click(addConstumeButton); }else { Click(addConstumeButton); }
		 */

		if (SelectFieldTypeText(WebUIData.getContentname()).getSelectedText().equalsIgnoreCase("Textarea")) {
			Textbox(fLevelTextBox, WebUIData.getContentform()).Wait(5).Textbox(hintText, "Address mandatory");
			if (isRequiredCheckBox.isEnabled()) {
				
				

				Click(isRequiredCheckBox).Click(saveButton).Wait(5).SimulateClick(addPlusSignCustomeField)
						.SimulateClick(saveOnClickButton).Wait(5).AddValueInCSV(WebUIData)

						.Click(preview).Wait(5).WindowSwitch(1).Click(registerClick).Wait(5)

						.AssertEquals(WebUIData.getContentform().trim(), AddressLevel.getText().trim()).Wait(5)
						.WindowSwitch(0).Wait(5).FieldLevel(WebUIData).SimulateClick(closeButton).pressEnter()

				;

			} else {
				AssertTrue(isRequiredCheckBox.isDisplayed());
			}

		} else if (SelectFieldTypeText(WebUIData.getContentname()).getSelectedText().equalsIgnoreCase("TextField")) {
			Textbox(fLevelTextBox, WebUIData.getContentform()).Wait(5).Textbox(hintText, "Fathers name mandatory");
			if (isRequiredCheckBox.isEnabled()) {

				Click(isRequiredCheckBox).Click(saveButton).Wait(5).SimulateClick(addPlusSignCustomeField)
						.SimulateClick(saveOnClickButton).Wait(5).AddValueInCSV(WebUIData)

						.Click(preview).Wait(5).WindowSwitch(1).Click(registerClick).Wait(5)

						.AssertEquals(WebUIData.getContentform().trim(), FathersNameLevel.getText().trim()).Wait(5)
						.WindowSwitch(0).Wait(5).FieldLevel(WebUIData).SimulateClick(closeButton).pressEnter()

				;

			} else {
				AssertTrue(isRequiredCheckBox.isDisplayed());
			}

		} else if (SelectFieldTypeText(WebUIData.getContentname()).getSelectedText().equalsIgnoreCase("Dropdown")) {
			Textbox(fLevelTextBox, WebUIData.getContentform()).Wait(5).Textbox(hintText, "Enter City Value");
			if (isRequiredCheckBox.isEnabled()) {
				Click(isRequiredCheckBox).Textbox(textValue, "Cuttack").Click(addPlusSign)
						.Textbox(textValue1, "Bhubaneswar").Click(addPlusSign).Textbox(textValue2, "Bhadrak")
						.Click(addPlusSign).Textbox(textValue3, "Kendarapara")

						.Click(saveButton).Wait(5).SimulateClick(addPlusSignCustomeField)
						.SimulateClick(saveOnClickButton).Wait(5).AddValueInCSV(WebUIData)

						.Click(preview).Wait(5).WindowSwitch(1).Click(registerClick).Wait(5)

						.AssertEquals(WebUIData.getContentform(), CityLevel.getText()).Wait(5).WindowSwitch(0).Wait(5)
						.FieldLevel(WebUIData).SimulateClick(closeButton).pressEnter()

				;

			} else {
				AssertTrue(isRequiredCheckBox.isDisplayed());
			}

		} else /*if (SelectFieldTypeText(WebUIData.getContentname()).getSelectedText().equalsIgnoreCase("List")) {
			Textbox(fLevelTextBox, WebUIData.getContentform()).Wait(5).Textbox(hintText, "Enter Cource");
			if (isRequiredCheckBox.isEnabled()) {
				Click(isRequiredCheckBox).Textbox(textValue, "Java").Click(addPlusSign).Textbox(textValue1, "C#")
						.Click(addPlusSign).Textbox(textValue2, "PHP").Click(addPlusSign)
						.Textbox(textValue3, "Selenium")
						.Click(saveButton).Wait(5).SimulateClick(addPlusSignCustomeField)
						.SimulateClick(saveOnClickButton).Wait(5).AddValueInCSV(WebUIData)
						.Click(preview).Wait(5).WindowSwitch(1).Click(registerClick).Wait(5)
						.AssertEquals(WebUIData.getContentform(), CourceLevel.getText()).Wait(5)
						.WindowSwitch(0).Wait(5).FieldLevel(WebUIData).SimulateClick(closeButton).pressEnter()
				;
			} else {
				AssertTrue(isRequiredCheckBox.isDisplayed());
			}
		} else*/ if (SelectFieldTypeText(WebUIData.getContentname()).getSelectedText().equalsIgnoreCase("Radio")) {
			Textbox(fLevelTextBox, WebUIData.getContentform()).Wait(5).Textbox(hintText, "Gender mandatory");
			if (isRequiredCheckBox.isEnabled()) {
				Click(isRequiredCheckBox).Textbox(textValue, "Male").Click(addPlusSign).Textbox(textValue1, "Female")
						

						.Click(saveButton).Wait(5).SimulateClick(addPlusSignCustomeField)
						.SimulateClick(saveOnClickButton).Wait(5).AddValueInCSV(WebUIData)

						.Click(preview).Wait(5).WindowSwitch(1).Click(registerClick).Wait(5)

						.AssertEquals(WebUIData.getContentform().trim(), GenderLevel.getText().trim()).Wait(5)
						.WindowSwitch(0).Wait(5).FieldLevel(WebUIData).SimulateClick(closeButton).pressEnter()

				;

			} else {
				AssertTrue(isRequiredCheckBox.isDisplayed());
			}

		} else if (SelectFieldTypeText(WebUIData.getContentname()).getSelectedText().equalsIgnoreCase("Checkbox")) {
			Textbox(fLevelTextBox, WebUIData.getContentform()).Wait(5).Textbox(hintText, "Catagory is mandatory")
					.Click(isRequiredCheckBox);

			if (isRequiredCheckBox.isEnabled()) {
				Textbox(textValue, "SC").Click(addPlusSign).Textbox(textValue1, "ST").Click(addPlusSign)
						.Textbox(textValue2, "OBC").Click(addPlusSign).Textbox(textValue3, "General").Click(saveButton)
						.Wait(5).SimulateClick(addPlusSignCustomeField).SimulateClick(saveOnClickButton).Wait(5)
						.AddValueInCSV(WebUIData)

						.Click(preview).Wait(5).WindowSwitch(1).Click(registerClick).Wait(5)

						.AssertEquals(WebUIData.getContentform().trim(), CatagoryLevel.getText().trim()).Wait(5)
						.WindowSwitch(0).Wait(5).FieldLevel(WebUIData).SimulateClick(closeButton).pressEnter()

				;

			} else {
				AssertTrue(isRequiredCheckBox.isDisplayed());
			}

		} else if (SelectFieldTypeText(WebUIData.getContentname()).getSelectedText().equalsIgnoreCase("Date Picker")) {
			Textbox(fLevelTextBox, WebUIData.getContentform()).Wait(5).Textbox(hintText, "mandatory");
			if (isRequiredCheckBox.isEnabled()) {
				Click(isRequiredCheckBox).Click(saveButton).Click(addPlusSignCustomeField).Click(saveOnClickButton);

			} else {
				AssertTrue(isRequiredCheckBox.isDisplayed());
			}
		}

		return new WebUIPage(false);
	}
	
	
	//div[@class='col-sm-7']//p
	
	
	private static final TextFieldElement ErrorText = new TextFieldElement("Validate Error text in assertion",
			locateByXPath("//label[@id='data[f_label]-error']"));
	private static final ButtonElement CancelButton = new ButtonElement("Click on Cancel Button",
			locateByXPath("//div[@id='mymodaldiv']//button[@type='button'][contains(text(),'Cancel')]"));
	private static final ButtonElement ClickOnAdvanceLink = new ButtonElement("Click on Advance Link",
			locateByXPath("//a[@onclick='toggleAllowLoginCheck()']"));//a[@class='blue advanced_field']
	private static final ButtonElement ClickOnAllowLogInButton = new ButtonElement("Click on Advance Link",
			locateByXPath("//input[@id='login_with_field']"));
	private static final ButtonElement DropdownValue = new ButtonElement("Field is text field selected",
			locateByXPath("//option[@value='1']"));
	private static final HtmlElement KeyWordValue = new HtmlElement("Field is text field selected",
			locateByXPath("//span[@id='uniq_value']"));
	
	
	

	public ManageUserProfilePage pressBackSpace() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		return this;
	}
	
	
	
	public ManageUserProfilePage clearTextBox(final WebUIData WebUIData) throws Exception {

		final TextFieldElement fLevelTextBoxclear = new TextFieldElement("Enter value on text box",
				locateByXPath("//input[@name='data[f_label]']"));

		fLevelTextBoxclear.clear();
		return this;

	}
	/*private static final TextFieldElement ErrorText = new TextFieldElement("Validate Error text in assertion",
			locateByXPath("//div[@class='alert alert-danger alert-dismissable flash-msg m-t-20']"));*/
	
	//div[@id='success_msg']
	
	
	
	//Only text field can be selected when Allow Login is checked.
	
	
	public WebUIPage CheckOtherFeature(WebUIData WebUIData) throws Exception {
		
		  Click(addConstumeButton)
		 .Click(saveButton)
		 .Wait(2)
		 .AssertEquals(ErrorText.getText(), "Please enter a field label")
		 .Click(CancelButton)
		 .Wait(2)
		 .Click(addConstumeButton)
		 .Wait(5)
		 .Click(ClickOnAdvanceLink)
		 .Wait(5);
		 if(ClickOnAllowLogInButton.isDisplayed())
		 {
			 Click(ClickOnAllowLogInButton)
			 .Wait(5)
			 .AssertTrue(DropdownValue.isDisplayed());
			 
			 
			 
			 
		 }/*else
		 {
			 AssertTrue(DropdownValue.isDisplayed());
		 }*/
		 
		 
		 
		 try
		 {
			 int size=WebUIData.getContentform().length();
			 
			  Click(CancelButton)
			 .Wait(2)
			 .Click(addConstumeButton)
			 .Wait(2)
			 .Textbox(fLevelTextBox, WebUIData.getContentform())
			 .Wait(5);
			 
			 if(fLevelTextBox!=null)
			 {
				 AssertTrue(KeyWordValue.getText()!=null)
				 .Wait(5);
				 
				 for(int i=1;i<=size;i++)
				 {
					 pressBackSpace()
					 .Wait(3);
				 }
				  
				
				  AssertEquals(KeyWordValue.getText(), "")
				
				 ;
				 
			 }
			 
			 
			
			 
			 
		 }catch(Exception e)
		 {
			e.printStackTrace(); 
		 }
		 
		 
		 
		 
		Wait(10)
		
		
		;
		
		
		return new WebUIPage(false);
	}
	
	

}