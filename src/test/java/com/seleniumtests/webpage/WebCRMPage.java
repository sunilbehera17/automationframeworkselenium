package com.seleniumtests.webpage;

import static com.seleniumtests.core.CustomAssertion.assertEquals;
import static com.seleniumtests.core.CustomAssertion.assertFalse;
import static com.seleniumtests.core.CustomAssertion.assertTrue;
import static com.seleniumtests.core.Locator.locateByCSSSelector;
import static com.seleniumtests.core.Locator.locateByXPath;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocument;

import com.seleniumtests.apicontroller.RestExecutor;
import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.dataobject.AdviceData;
import com.seleniumtests.dataobject.DbManager;
import com.seleniumtests.dataobject.SolrSingleton;
import com.seleniumtests.dataobject.WebCRMData;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.TextFieldElement;

public class WebCRMPage extends PageObject{
	private static final String APIURL = "https://mailsac.com/api/addresses/";	
	public static String url = null;
	public static String URL = null;
	public static SolrDocument SolrDocument = null;
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();
	public WebCRMPage(final boolean openPageURL) throws Exception {
		
        super(LoginUserNameTextbox, openPageURL ? url = SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
    }
	private static final TextFieldElement LoginUserNameTextbox = new TextFieldElement("enter username in User name textbox ",
			locateByCSSSelector("#j_username"));
	private static final TextFieldElement LoginPassWordTextbox = new TextFieldElement("enter password in password textbox ",
			locateByCSSSelector("#j_password"));
	private static final ButtonElement LoginButton = new ButtonElement("Click login button to login",
    		locateByXPath("//*[@id='wrapper']/div[2]/form/div[2]/p[8]/input"));
	private static final ButtonElement CallingInterfacePageLogo = new ButtonElement("Calling interface page",
    		locateByXPath("//*[@id='logo']/a/img"));
	private static final ButtonElement BuyerIdValue = new ButtonElement("BuyerId value",
    		locateByXPath("//*[@class='insideHeading']/b"));
	private static final ButtonElement GetEncryptionMobileNumber = new ButtonElement("Encryption Mobile Number",
    		locateByXPath("//*[@id='mobilelEncryp']"));
	private static final ButtonElement SaveRequirementButton = new ButtonElement("Save Requirement Button",
    		locateByXPath("//*[@id='saveRequirementBtnId']"));
	
	
	
	public WebCRMPage SetValue(ButtonElement element,WebCRMData WebCRMData) throws Exception {
		
		WebCRMData.setEncryptionMobile(element.getText());
		
	
	    return this;
    }  
	
	public WebCRMPage Textbox(TextFieldElement element,final String Text) throws Exception {
		
		element.clearAndType(Text);
	    return this;
    } 
	 
	 public WebCRMPage Click(ButtonElement element) throws Exception {
	    	wait(2);
		    element.click();
	        return this;
	    }
	 public WebCRMPage SimulateClick(ButtonElement element) throws Exception {
	    	wait(2);
		    element.simulateClick();
	        return this;
	    }
	 public WebCRMPage get(String url)throws Exception {
		 getDriver().get(url);
		 wait(2);
		 return this;
	 }
	 
	 public WebCRMPage AssertEquals(final String actualText,final String expectedText) throws Exception {
		 assertEquals(actualText.toLowerCase(),expectedText.toLowerCase(),"Actual text and Expected Text Not Equal");
	     return this;
	    }
	 public WebCRMPage AssertFalse(final Boolean actualText) throws Exception {
		 assertFalse(actualText,"Element should not be visible but now its visible");
	     return this;
	    }
	 public WebCRMPage AssertTrue(final Boolean actualText) throws Exception {
		 assertTrue(actualText,"Element should  be visible but now its not visible");
	     return this;
	    }
	 

	 public String executeQuery(final String query,String SqlCore,Object ColumnName) throws ClassNotFoundException, SQLException {
	   	     
		     if(!mastermap.containsKey(query)) {
		    	 System.out.println("inner"+query);
		    	 Map<Object,Object> map =  DbManager.executeQuery(getSQLDomain(SqlCore),"qc_srikantshoo","oohstnakirsY@990",query);
		     } 
		     
					 
			 
	        return mastermap.get(query).get(ColumnName).toString();
	     }
	 public static String getSQLDomain(String core) {
		    URL = WebCRMPage.url;
		    if(URL.contains("deployment")) {
		    	URL="jdbc:mysql://192.168.207.178:3311/";
		    }else if(URL.contains("testqc")) {
		    	URL="jdbc:mysql://192.168.207.177:3310/";
		    }else {
		    	URL="jdbc:mysql://192.168.207.177:3310/";
		    }
			String SQL_URL = URL+core;
			return SQL_URL;
			
		}

	 
	 public  String SolrQueryResult(String SolrQuery,String core,String SolrValue) throws ClassNotFoundException, SQLException, SolrServerException, IOException {
	   	    
			SolrDocument = SolrSingleton.getDocument(SolrQuery,getDomain(core));
		
     return SolrDocument.get(SolrValue).toString();

}
	 public String getAPI(final WebCRMData WebCRMData) throws InterruptedException {
    	 wait(5);
    	 RestExecutor executor = new RestExecutor(APIURL);
 		 
 		
 		return executor.get(WebCRMData.getEmailId()+"/messages").printBodyString();
     }
	 
	
	 public static String getDomain(String core) {
		    URL = WebCRMPage.url;
		    if(URL.contains("deployment")) {
		    	URL="http://192.168.207.111/MagicBricks/";
		    }else if(URL.contains("testqc")) {
		    	URL="http://192.168.207.111/MagicBricks/";
		    }else {
		    	URL="http://solrall.magicbricks.com/MagicBricks/";
		    }
			String SOLR_URL = URL+core;
			return SOLR_URL;
			
		}
	public WebCRMPage LoginInWebCRM(final WebCRMData WebCRMData) throws Exception {
    	return    Textbox(LoginUserNameTextbox,WebCRMData.getLoginUserName())
    			 .Textbox(LoginPassWordTextbox,WebCRMData.getLoginPassWord())
    			 .Click(LoginButton)
    			 .AssertTrue(CallingInterfacePageLogo.isDisplayed())
    			 .get(WebCRMData.getCallingInterfaceURL()+WebCRMData.getUrlBuyerid()+WebCRMData.getBuyerId())
    			 .AssertEquals(BuyerIdValue.getText(), WebCRMData.getBuyerId())
    			 .SetValue(GetEncryptionMobileNumber,WebCRMData)
    			 .get(WebCRMData.getCallingInterfaceURL()+WebCRMData.getUrlMobileNo()+WebCRMData.getEncryptionMobile())
    			 .AssertEquals(BuyerIdValue.getText(), WebCRMData.getBuyerId())
    			 .SimulateClick(SaveRequirementButton) 			 
    			 .AssertEquals(executeQuery(WebCRMData.getQuery(),WebCRMData.getSqlCore(),"EXFIELD2"),"")
    			 .AssertEquals(executeQuery(WebCRMData.getQuery(),WebCRMData.getSqlCore(),"MVTRFNUM"),"")
    			 .AssertEquals(SolrQueryResult(WebCRMData.getSolrQuery(),WebCRMData.getSolrCore(),WebCRMData.getSolrValue()), "11702")
    			 .AssertTrue(getAPI(WebCRMData).contains("\"address\":\"ssrikantasahoo@gmail.com\""))
	    		 .AssertTrue(getAPI(WebCRMData).contains("\"subject\":\"Thanks for Registering MagicBricks account\""))

    			 ;
}
}