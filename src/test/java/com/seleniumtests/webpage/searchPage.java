package com.seleniumtests.webpage;

import static com.seleniumtests.core.Locator.locateByCSSSelector;
import static com.seleniumtests.core.Locator.locateByName;
import static com.seleniumtests.core.Locator.locateByXPath;
import org.openqa.selenium.By;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.User;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;

public class searchPage extends PageObject{

	
	private static final TextFieldElement SearchTextbox = new TextFieldElement("Landmark,Location or project Search text box",
            locateByName("keyword"));

    private TextFieldElement lastNameTextbox = new TextFieldElement("Last name text box", locateByName("lastname"));

    private TextFieldElement userNameTextbox = new TextFieldElement("user name text box", locateByName("username"));

    private TextFieldElement pwd1NameTextbox = new TextFieldElement("password 1 text box", locateByName("psw1"));

    private TextFieldElement pwd2NameTextbox = new TextFieldElement("password 2 text box", locateByName("psw2"));

    private static final ButtonElement ClickText = new ButtonElement("Click location Button",
    		locateByXPath("//*[@id='keyword_suggest']/div[2]/span"));
    
    private  ButtonElement ClickButton = new ButtonElement("Click search Button",
    		locateByXPath("//*[@id='btnPropertySearch']"));
    
    private static final ButtonElement PropertiesTab = new ButtonElement("Properties Tab",
    		locateByXPath("//*[@id='resultDiv']/div/div[1]/ul/li[1]/a"));
    
    private static final ButtonElement ClickOnProperty = new ButtonElement("Click on first Property",
    		locateByXPath("(//*[@class='sepBlock'])[1]"));
    public searchPage(final boolean openPageURL) throws Exception {
        super(SearchTextbox, openPageURL ? SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
    }

  

	public searchPage searchText(final String searchText) {
    	SearchTextbox.clearAndType(searchText);

        return this;
    }

    public searchPage enterLastName(final String lastName) {
        lastNameTextbox.clearAndType(lastName);

        return this;
    }

    public searchPage enterUserName(final String userName) {
        userNameTextbox.clearAndType(userName);

        return this;
    }

    public searchPage enterPassword(final String password) {
        pwd1NameTextbox.clearAndType(password);

        return this;
    }

    public searchPage enterConfirmPassword(final String password) {
        pwd2NameTextbox.clearAndType(password);

        return this;
    }
    public searchPage enterSearch(final String search) {
        pwd2NameTextbox.clearAndType(search);

        return this;
    }

    public searchPage clickText() throws Exception {
    	ClickText.waitForPresent();
        ClickText.submit();
        return this;
    }
    
    public searchPage clickSearchButton() throws Exception {
       
        ClickButton.click();
        return this;
    }
    
    public searchPage clickFirstProperty() throws Exception {
        
        ClickOnProperty.click();
        return this;
    }
    public static boolean isHomePageDisplayed() {
        return PropertiesTab.isDisplayed();
    }

    public searchPage searchLocation(final User user) throws Exception {
        return searchText(user.getSearchText()).clickText().clickSearchButton();
    }
	
	
}
