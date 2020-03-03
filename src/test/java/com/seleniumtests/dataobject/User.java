/*
 * Copyright 2017 www.magicbricks.com
 */
/**
 * @author  Srikanta Kumar Sahoo <srikanta.sahoo@timesgroup.com>
 */

package com.seleniumtests.dataobject;

/**
 * User account object for TestLink.
 */
public class User {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String searchText;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSearchText() {
        return searchText;
    }
    
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
    
    public void setSearchText(final String searchText) {
        this.searchText = searchText;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.append("searchText : " + searchText + " ]").toString();
    }
//    return stringBuilder.append("User [firstName = " + firstName + ", ")
//            .append("lastName = " + lastName + ",").append("userName = " +
//                userName + ",").append("password " + password + "]").append("searchText" + searchText + "]").toString();
//    }

}
