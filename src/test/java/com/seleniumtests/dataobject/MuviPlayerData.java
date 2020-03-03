/**
 * 
 */
package com.seleniumtests.dataobject;

/*

 * Copyright 2018 www.muvi.com

 */

/**

 * @author  Srikanta Kumar Sahoo <srikanta@muvi.com> 

seleniumtestsframework com.seleniumtests.dataobject 25-Jul-2018
 */
public class MuviPlayerData {
	private String loginUserName;
	private String loginPassWord;
	private String loginName;
	private String name;
	private String email;
	private String password;
	private String cardnumber;
	private int expmonth;
	private String expyear;
	private String cvv;
	private String query;
	private String textCompair;
	private String zip;
	private String address;
	private String mobilenumber;
	private String country;
	
	
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(final String country) {
		this.country = country;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(final String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(final String zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(final String address) {
		this.address = address;
	}
	public String getTextCompair() {
		return textCompair;
	}
	public void setTextCompair(final String textCompair) {
		this.textCompair = textCompair;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(final String query) {
		this.query = query;
	}
	public int getExpmonth() {
		return expmonth;
	}
	public void setExpmonth(final int expmonth) {
		this.expmonth = expmonth;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(final String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getExpyear() {
		return expyear;
	}
	public void setExpyear(final String expyear) {
		this.expyear = expyear;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(final String cvv) {
		this.cvv = cvv;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(final String password) {
		this.password = password;
	}
	public String getLoginUserName() {
		return loginUserName;
	}
	public void setLoginUserName(final String loginUserName) {
		this.loginUserName = loginUserName;
	}
	public String getLoginPassWord() {
		return loginPassWord;
	}
	public void setLoginPassWord(final String loginPassWord) {
		this.loginPassWord = loginPassWord;
	}

	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(final String loginName) {
		this.loginName = loginName;
	}
	@Override public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.append("loginUserName : " + loginUserName +
        		" loginPassWord : " + loginPassWord + " loginName : " + loginName +
        		" name : " + name +" email : " + email +
        		" password : " + password +
        		
        		
        		
        		" ]").toString();
    }
}
