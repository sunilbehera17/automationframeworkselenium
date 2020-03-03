/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */
package com.seleniumtests.webpage;

import static com.seleniumtests.core.Locator.locateByCSSSelector;
import static com.seleniumtests.core.Locator.locateByName;

import com.seleniumtests.core.SeleniumTestsContextManager;

import com.seleniumtests.dataobject.User;

import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.SelectList;
import com.seleniumtests.webelements.TextFieldElement;


public class RegistrationPage extends PageObject {

    private static final TextFieldElement firstNameTextbox = new TextFieldElement("First name text box",
            locateByName("firstname"));

    private TextFieldElement lastNameTextbox = new TextFieldElement("Last name text box", locateByName("lastname"));

    private TextFieldElement userNameTextbox = new TextFieldElement("user name text box", locateByName("username"));

    private TextFieldElement pwd1NameTextbox = new TextFieldElement("password 1 text box", locateByName("psw1"));

    private TextFieldElement pwd2NameTextbox = new TextFieldElement("password 2 text box", locateByName("psw2"));

    private ButtonElement submitButton = new ButtonElement("submit Button",
            locateByCSSSelector("input~input[value='Submit']"));
    
    private static final SelectList searchTextBox = new SelectList("Search Textbox",
    		locateByCSSSelector("#keyword"));

    public RegistrationPage(final boolean openPageURL) throws Exception {
        super(firstNameTextbox, openPageURL ? SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
    }

    public RegistrationPage enterFirstName(final String firstName) {
        firstNameTextbox.clearAndType(firstName);

        return this;
    }

    public RegistrationPage enterLastName(final String lastName) {
        lastNameTextbox.clearAndType(lastName);

        return this;
    }

    public RegistrationPage enterUserName(final String userName) {
        userNameTextbox.clearAndType(userName);

        return this;
    }

    public RegistrationPage enterPassword(final String password) {
        pwd1NameTextbox.clearAndType(password);

        return this;
    }

    public RegistrationPage enterConfirmPassword(final String password) {
        pwd2NameTextbox.clearAndType(password);

        return this;
    }
    public RegistrationPage enterSearch(final String search) {
        pwd2NameTextbox.clearAndType(search);

        return this;
    }

    public LoginPage clickSubmitButton() throws Exception {
        submitButton.click();

        return new LoginPage();
    }

    public LoginPage submitValidRegistrationData(final User user) throws Exception {
        return enterFirstName(user.getFirstName()).enterLastName(user.getLastName()).enterUserName(user.getUserName())
                                                  .enterPassword(user.getPassword())
                                                  .enterConfirmPassword(user.getPassword()).clickSubmitButton();
    }
//   public LoginPage Searchpage(final User user) throws Exception{
//	   return 
//   }
}
