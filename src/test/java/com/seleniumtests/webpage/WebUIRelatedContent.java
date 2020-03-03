
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

public class WebUIRelatedContent extends PageObject {
	public WebUIRelatedContent() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String url = null;
	public static String URL = null;

	public static Map<Object, Map<Object, Object>> mastermap = new HashMap<Object, Map<Object, Object>>();

	// String selectpkg="//select[@id='packages']";

	public WebUIRelatedContent(final boolean openPageURL) throws Exception {

		super(HtmlPage, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);

	}
	String ContentFORM="//select[@id='parent_content_type']";
	String contenttype="//select[@id='contenttype']";
	private static final TextFieldElement today_date = new TextFieldElement("Enter release date",
			locateByXPath("//input[@id='release_date']"));
	private static final ButtonElement today_date_click = new ButtonElement("Enter release date",
			locateByXPath("//input[@id='release_date']"));
	private static final ButtonElement pick_date = new ButtonElement("Enter release pick",
			locateByXPath("//a[contains(text(),'28')]"));

	private static final ButtonElement HtmlPage = new ButtonElement("Click on Login button ", locateByXPath("//html"));
	private static final ButtonElement clickOnLoginButton = new ButtonElement("Click on Login button ", 
			locateByXPath("//a[@id='clk']"));
	private static final TextFieldElement UsernameCMS = new TextFieldElement("Enter your username into text field", 
			locateByXPath("//input[@id='LoginForm_email']"));
	private static final TextFieldElement password = new TextFieldElement("Enter text into text field", 
			locateByXPath("//input[@id='LoginForm_password']"));
	private static final ButtonElement login = new ButtonElement("Click on Log in button", 
			locateByXPath("//input[@id='btn-login']"));
	
	

	private static final TextFieldElement description_data = new TextFieldElement("Enter Description Data in text area",
			locateByXPath("//textarea[@id='story1']"));
	private static final TextFieldElement description_data_muvikart = new TextFieldElement("Enter Description Data in text area",
			locateByXPath("//textarea[@id='mdescription']"));
	
	private static final ButtonElement select_content_catagory = new ButtonElement("Click on catagory movie ",
			locateByXPath("//select[@id='content_category_value']/option[1]"));
	private static final ButtonElement Click_on_save = new ButtonElement("Click on save Button",
			locateByXPath("//button[@id='save-btn']"));
	private static final TextFieldElement content_name = new TextFieldElement("Enter value on content name",
			locateByXPath("//input[@id='mname']"));
	private static final TextFieldElement amount_field = new TextFieldElement("Enter amount",
			locateByXPath("//input[@placeholder='Enter amount']"));
	private static final TextFieldElement suk_number = new TextFieldElement("Enter amount",
			locateByXPath("//input[@id='skuno']"));
	private static final ButtonElement clickOnextend = new ButtonElement("Click on save Button",
			locateByXPath("//i[@class='fa fa-angle-down']"));
	private static final ButtonElement forConfirmation = new ButtonElement("Click on Confirmation",
			locateByXPath("//button[@class='confirm']"));
	
	private static final HtmlElement test = new HtmlElement("Click on Confirmation",
			locateByXPath("//a[contains(text(),'AOD Single Part')]"));
	
	
	
	private static final TextFieldElement addpapularcomtent = new TextFieldElement("Enter content",
			locateByXPath("//input[@id='title']"));
	private static final ButtonElement clickOnSaveButton = new ButtonElement("Click on Save Button",
			locateByXPath("//button[@id='fcontent_save']"));
	private static final ButtonElement clickOnaddbuttonRelatedcontent = new ButtonElement("Click on add button to relate the content",
			locateByXPath("//button[@id='fcontent_add']"));
	private static final ButtonElement clickOnSavebuttonRelatedcontent = new ButtonElement("Click on add button to relate the content",
			locateByXPath("//button[@id='fcontent_save']"));

	private static final ButtonElement clickOnYesButton = new ButtonElement("Click on yes button to delete the content",
			locateByXPath("//button[@class='confirm']"));
	//button[@class='confirm']
	public WebUIRelatedContent clickonManageRelatedContent(WebUIData WebUIData) throws Exception {
		
		final ButtonElement webelement = new ButtonElement("Click on  add content", 
				locateByXPath("//div[contains(text(),'"
		+ WebUIData.getComanyname()+ "')]//following::td[4]//em[@class='fa fa-shopping-cart']"));
		webelement.clickAt();
		
		return this;
	}
	
public WebUIRelatedContent clickonDeleteContent(WebUIData WebUIData) throws Exception {
		
		final ButtonElement webelement = new ButtonElement("Click on  add content", 
				locateByXPath("//div[contains(text(),'"
		+ WebUIData.getComanyname()+ "')]//following::td[4]//em[@class='icon-trash']"));
		webelement.clickAt();
		
		return this;
	}
	
public WebUIRelatedContent deleteContent(WebUIData WebUIData) throws Exception {
		
		final ButtonElement webelement = new ButtonElement("Click on  add content", 
				locateByXPath("//div[contains(text(),'"
		+ WebUIData.getComanyname()+ "')]//following::td[4]//em[@class='fa fa-shopping-cart']"));
		webelement.clickAt();
		
		return this;
	}
	

	
public WebUIRelatedContent clickonContentName(WebUIData WebUIData) throws Exception {
		
		final ButtonElement webelement = new ButtonElement("Click on  add content", 
				locateByXPath("//div[contains(text(),'"
		+ WebUIData.getComanyname()+ "')]"));
		webelement.clickAt();
		return this;
	}
	
	
	
	
	public WebUIRelatedContent Click(ButtonElement element) throws Exception {

		element.waitForPresent(10);
		element.click();
		return this;
	}

	public WebUIRelatedContent suggetionBoxdata(WebUIData WebUIData) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on suggetion iteam",
				locateByXPath("//div[starts-with(@id,'ui-id')][contains(text(),'" + WebUIData.getComanyname() + "')]"));
		webelement.scroll();
		webelement.click();
		return new WebUIRelatedContent(false);

	}

	public WebUIRelatedContent suggetionBoxDefaultData() throws Exception {
		Wait(5);
		final ButtonElement webelement = new ButtonElement("Click on suggetion default data iteam",
		locateByXPath("//li[starts-with(@id,'ui-id')][contains(text(),'testing')]"));
		webelement.scroll();
		webelement.click();
		return new WebUIRelatedContent(false);

	}
	public WebUIRelatedContent suggetionBoxDefaultDataAODContent() throws Exception {
		Wait(2);
		final ButtonElement webelement = new ButtonElement("Click on suggetion default data iteam",
				locateByXPath("//li[starts-with(@id,'ui-id')][contains(text(),'AOD Single Part')]"));
		webelement.scroll();
		webelement.click();
		return new WebUIRelatedContent(false);
		
	}
	public WebUIRelatedContent suggetionBoxDefaultDataPhysical() throws Exception {
		Wait(5);
		final ButtonElement webelement = new ButtonElement("Click on suggetion default data iteam",
				locateByXPath("//li[starts-with(@id,'ui-id')][contains(text(),'Muvikart1')]"));
		webelement.scroll();
		webelement.click();
		return new WebUIRelatedContent(false);
		
	}
	public WebUIRelatedContent verifyVODRelatedContentInFrontEnd() throws Exception {
		
		Wait(5);
		final ButtonElement webelement = new ButtonElement("Verify that testing content is available or not",
				locateByXPath("//a[contains(text(),'testing')]"));
		AssertEquals(webelement.getText(),"testing");

		return this;
	}
	
	//div[@ng-if='video']//following-sibling::a[text()='testing']
	public WebUIRelatedContent verifyAODRelatedContentInFrontEnd(WebUIData WebUIData) throws Exception {
		
		final ButtonElement webelement = new ButtonElement("Click on  add content", 
				locateByXPath("//div[contains(text(),'"
		+ WebUIData.getComanyname()+ "')]//following::td[4]//em[@class='fa fa-shopping-cart']"));
		webelement.clickAt();
		
		return this;
	}
	public WebUIRelatedContent verifyPhyRelatedContentInFrontEnd(WebUIData WebUIData) throws Exception {
		
		final ButtonElement webelement = new ButtonElement("Click on  add content", 
				locateByXPath("//div[contains(text(),'"
						+ WebUIData.getComanyname()+ "')]//following::td[4]//em[@class='fa fa-shopping-cart']"));
		webelement.clickAt();
		
		return this;
	}
	public WebUIRelatedContent ClickOnAddContentDemo(WebUIData WebUIData) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on  add content",
				locateByXPath("//div[@class='Collapse-Block']//div[1]/h4[contains(text(),'" + WebUIData.getName()
						+ "')]/../following-sibling::div[@class='Collapse-Content row']//a[@class='btn btn-primary m-t-10 p-l-40']"));

		webelement.clickAt();
		return new WebUIRelatedContent(false);

	}

	public WebUIRelatedContent Textbox(TextFieldElement element, final String Text) throws Exception {

		element.clearAndType(Text);
		return this;
	}

	public WebUIRelatedContent SimulateClick(ButtonElement element) throws Exception {
		waitForSeconds(2);
		element.simulateClick();
		return this;
	}

	public WebUIRelatedContent MouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.mouseOver();
		return this;
	}

	public WebUIRelatedContent SimulateMouseOver(HtmlElement element) throws Exception {

		element.waitForPresent(10);
		element.simulateMouseOver();
		return this;
	}

	public WebUIRelatedContent WaitforElelment(String text, int timeout) throws Exception {
		String xpath = "//em[@class='" + text + "']";
		waitForElementPresent(By.xpath(xpath), timeout);
		return this;
	}

	public WebUIRelatedContent WaitforElelmentRed(String text, int timeout) throws Exception {
		String xpath = "//em[@class='" + text + "'][@style='color:#EF6C00;']";
		waitForElementPresent(By.xpath(xpath), timeout);
		return this;
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

	public WebUIRelatedContent TakePrint(String Key) throws Exception {
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

	public WebUIRelatedContent KeyOp(String Key) throws Exception {

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

	public WebUIRelatedContent KeyOp(String Key, String Key1, String Key2) throws Exception {

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



	public WebUIRelatedContent AssertEquals(final String actualText1, final String expectedText) throws Exception {
		assertEquals(actualText1.toLowerCase(), "Actual text and Expected Text Not Equal");
		return this;
	}

	public WebUIRelatedContent AssertTrue(final Boolean actualText2) throws Exception {
		assertTrue(actualText2, "Text should  be visible but now its not visible");
		return this;
	}

	public WebUIRelatedContent Wait(int value) throws Exception {
		waitForSeconds(value);

		return this;

	}

	public WebUIRelatedContent Uncheck(final CheckBoxElement element) throws Exception {

		element.uncheck();
		return this;

	}

	public WebUIRelatedContent Check(final CheckBoxElement element) throws Exception {

		element.check();
		return this;

	}

	public WebUIRelatedContent browserVersion() throws Exception {
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

	public WebUIRelatedContent SelectByListIndex(final int index, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByIndex(index);
		return this;

	}

	public WebUIRelatedContent SelectByText(final String value, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList("", By.xpath(xpath));
		s.selectByText(value);
		return this;

	}

	public WebUIRelatedContent SelectByList(final String Text, String xpath) throws Exception {
		waitForSeconds(5);
		SelectList s = new SelectList(Text, By.xpath(xpath));
		s.selectByValue(Text);
		return this;

	}

	public WebUIRelatedContent ListOfElement(final String xpath) throws Exception {
		List<WebElement> li = driver.findElements(By.xpath(xpath));
		li.get(0).click();
		return this;

	}

	public WebUIRelatedContent Wait1(int value) throws Exception {
		waitForSeconds(value);

		return this;

	}

	public WebUIRelatedContent pageScrollDown() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		return this;
	}

	public WebUIRelatedContent SidePannelScrollDown() throws Exception {

		JavascriptExecutor je = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath(".//ul[@class='menu-wrap']"));

		je.executeScript("arguments[0].scrollIntoView(true);", element);

		return this;
	}

	public WebUIRelatedContent NewUrl() throws Exception {
		driver.get("http://www.admin.idogic.com");
		return this;
	}

	public WebUIRelatedContent BaseUrl() throws Exception {
		driver.get("https://cms.idogic.com/admin/dashboard");

		return this;
	}

	public WebUIRelatedContent PopUpAccept() throws Exception {
		driver.switchTo().alert().accept();
		return this;
	}

	public WebUIRelatedContent ListOfElement1() throws Exception {

		List<WebElement> li = driver.findElements(By.xpath(".//ul[@class='menu-wrap']/li"));
		WebElement element = li.get(14);

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		driver.findElement(By.linkText("Account Info")).click();
		return this;

	}

	public WebUIRelatedContent pressEnter() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		return this;
	}

	public WebUIRelatedContent uploadFile(final String browsebutton, final String data) throws Exception {

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

	public WebUIRelatedContent randomData(final WebUIData WebUIData) throws Exception {
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

	public WebUIRelatedContent ClickLogin() throws Exception {

		return new WebUIRelatedContent(false);
	}

	public WebUIRelatedContent selectNewTab() throws Exception {
		waitForSeconds(2);
		selectNewWindow();
		return this;

	}

	public WebUIRelatedContent SelectPlaneName(String planname, String fee) throws Exception {
		final ButtonElement SelectPlanButton = new ButtonElement("Click on " + planname,
				locateByXPath("//form[@id='membership_form']//h3[text()='" + planname
						+ "']/following-sibling::h4/span[text()='$" + fee + ".00']"));
		SelectPlanButton.click();
		Wait(4);
		return this;

	}

	public WebUIRelatedContent ParentWindow() throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
		waitForSeconds(1);

		return this;
	}

	public WebUIRelatedContent ChildWindow() throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[2]);
		waitForSeconds(1);

		return this;
	}

	public WebUIRelatedContent GoBack() throws Exception {

		goBack();
		return this;

	}

	public WebUIRelatedContent closeCurrentWindow() throws Exception {

		driver.close();
		return this;

	}

	public WebUIRelatedContent getitle() throws Exception {

		String url = driver.getCurrentUrl();
		System.out.println(url);
		return this;

	}

	public WebUIRelatedContent MouseOverOnContent(String ContentName) throws Exception {

		final ButtonElement webelement = new ButtonElement("Mouse Over on " + ContentName,
				locateByXPath("//a[@data-name='" + ContentName + "']/../../../.."));
		MouseOver(webelement);
		Wait(4);

		return this;
	}
	

	public WebUIRelatedContent ClickOnCOntent(String ContentName) throws Exception {
		Wait(4);
		final ButtonElement webelement = new ButtonElement("Click on  " + ContentName,
				locateByXPath("//a[@data-name='" + ContentName + "']"));
		webelement.click();
		return this;

	}

	public WebUIRelatedContent WindowSwitch(int val) throws Exception {
		TestLogging.logWebStep("select new window", false);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[val]);
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
	
	
	public WebUIRelatedContent VerifyContentManage(WebUIData WebUIData) throws Exception {	
		String data=WebUIData.getContentform();	
		 
		 if(data.equalsIgnoreCase("VOD Single Part"))
		 {
			// Wait(2)
			     SelectByText(WebUIData.getContentform(), ContentFORM)
			     .Wait(5)
				.Textbox(content_name, WebUIData.getComanyname())
				.Textbox(description_data, WebUIData.getDescription())
				.Textbox(today_date, WebUIData.getTodaydate())
				.Click(select_content_catagory)
				.Click(Click_on_save)
				.Wait(2)
				.Click(Click_on_save)
				.Wait(2)
				; 
		 }else if(data.equalsIgnoreCase("AOD Single Part"))
		 {
			     SelectByText(WebUIData.getContentform(), ContentFORM)
				
				.Wait(10)
				.Textbox(content_name, WebUIData.getComanyname())
				.Wait(5)
				.Textbox(description_data, WebUIData.getDescription())
				.Wait(5)
				.Textbox(today_date, WebUIData.getTodaydate())
				.Wait(5)
				.Click(select_content_catagory)
				.Wait(5)
				.Click(Click_on_save)
				; 
		 }else if(data.equalsIgnoreCase("Muvi Kart"))
		 {
			     SelectByText(WebUIData.getContentform(), ContentFORM)
				.Wait(10)
				.Textbox(content_name, WebUIData.getComanyname())
				.Click(today_date_click)
				.Click(pick_date)
				.Textbox(description_data_muvikart, WebUIData.getDescription())
				.Textbox(amount_field, "100")
				.Textbox(suk_number, "123")
				.Click(Click_on_save)
				; 
		 }
		 
		 
		 
		 
		 
		 return new WebUIRelatedContent(false);
	} 
	
	
	
	
	
	
	
	
	
	
	public WebUIPage relatedContentPage(WebUIData WebUIData) throws Exception
	{
		 
			
		 Wait(5)
		 .VerifyContentManage(WebUIData)
		 .clickonManageRelatedContent(WebUIData)
		 
		 .Textbox(addpapularcomtent, "testing")
		 .Wait(3)
		 .suggetionBoxDefaultData()
		 .Click(clickOnaddbuttonRelatedcontent)
		  
		 .Textbox(addpapularcomtent, "AOD Single Part")
		.Wait(5)
		.suggetionBoxDefaultDataAODContent()
		.Click(clickOnaddbuttonRelatedcontent)
		
		.Textbox(addpapularcomtent, "Muvikart1")
		.Wait(5)
		.suggetionBoxDefaultDataPhysical()
		.Click(clickOnaddbuttonRelatedcontent)
		  
		  .Click(clickOnSavebuttonRelatedcontent)
		  .clickonContentName(WebUIData)
		  .WindowSwitch(1)
		  .Wait(10)
		  .WindowSwitch(0)
		  .clickonDeleteContent(WebUIData)
		  .Wait(2)
		  .Click(clickOnYesButton)
		  ;
		 
		
		  	 
		return new WebUIPage(false);
	}


}