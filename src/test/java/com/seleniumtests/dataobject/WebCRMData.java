package com.seleniumtests.dataobject;

public class WebCRMData {
	private String loginUserName;
	private String loginPassWord;
	private String callingInterfaceURL;
	private String buyerId;
	private String encryptionMobile;
	private String urlBuyerid;
	private String urlMobileNo;
	private String mysqlurl;
	private String mysqluserName;
	private String mysqlpassword;
	private String query;
    private String solrCore;
	private String solrQuery;
	private String solrValue;
	private String sqlCore;
	private String emailId;
	
	
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(final String emailId) {
		this.emailId = emailId;
	}
	public String getSolrCore() {
		return solrCore;
	}
	public void setSolrCore(final String solrCore) {
		this.solrCore = solrCore;
	}
	public String getSqlCore() {
		return sqlCore;
	}
	public void setSqlCore(final String sqlCore) {
		this.sqlCore = sqlCore;
	}
	public String getSolrValue() {
		return solrValue;
	}
	public void setSolrValue(final String solrValue) {
		this.solrValue = solrValue;
	}
	public String getSolrQuery() {
		return solrQuery;
	}
	public void setSolrQuery(final String solrQuery) {
		this.solrQuery = solrQuery;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(final String query) {
		this.query = query;
	}
	public String getMysqlurl() {
		return mysqlurl;
	}
	public void setMysqlurl(final String mysqlurl) {
		this.mysqlurl = mysqlurl;
	}
	public String getMysqluserName() {
		return mysqluserName;
	}
	public void setMysqluserName(final String mysqluserName) {
		this.mysqluserName = mysqluserName;
	}
	public String getMysqlpassword() {
		return mysqlpassword;
	}
	public void setMysqlpassword(final String mysqlpassword) {
		this.mysqlpassword = mysqlpassword;
	}
	public String getUrlBuyerid() {
		return urlBuyerid;
	}
	public void setUrlBuyerid(final String urlBuyerid) {
		this.urlBuyerid = urlBuyerid;
	}
	public String getUrlMobileNo() {
		return urlMobileNo;
	}
	public void setUrlMobileNo(final String urlMobileNo) {
		this.urlMobileNo = urlMobileNo;
	}
	public String getEncryptionMobile() {
		return encryptionMobile;
	}
	public void setEncryptionMobile(String encryptionMobile) {
		this.encryptionMobile = encryptionMobile;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(final String buyerId) {
		this.buyerId = buyerId;
	}
	public String getCallingInterfaceURL() {
		return callingInterfaceURL;
	}
	public void setCallingInterfaceURL(final String callingInterfaceURL) {
		this.callingInterfaceURL = callingInterfaceURL;
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
	
	
	@Override public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.append("loginUserName : " + loginUserName +
        		" loginPassWord : " + loginPassWord +
        		"callingInterfaceURL : " + callingInterfaceURL +
        		" buyerId : " + buyerId +
        		
        		
        		
        		" ]").toString();
    }
}
