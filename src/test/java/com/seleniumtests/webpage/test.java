package com.seleniumtests.webpage;

import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.solr.common.SolrDocument;

import com.github.javafaker.Faker;
import com.seleniumtests.dataobject.DbManager;
import com.seleniumtests.dataobject.DbManager2;

public class test {
	public static String URL = null;
	
	public static Map<Object,Map<Object,Object>> mastermap = new HashMap<Object, Map<Object,Object>>();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
   
		executeQuery(("select * from sdk_users where email = 'automation20180419095516@mailsac.com'"),"display_name");
		
	}
	
	public static String executeQuery(final String query,Object ColumnName) throws ClassNotFoundException, SQLException {
	     
	     if(!mastermap.containsKey(query)) {
	    	 System.out.println("inner"+query);
	    	 Map<Object,Object> map =  DbManager2.executeQuery(getSQLDomain(),"srikanta","cv8voMjWFo",query);
	     } 
	     
				 
		 
	    return mastermap.get(query).get(ColumnName).toString();
	 }
	 public static String getSQLDomain() {
		    URL = "http://edocent.com";
		    if(URL.contains("edocent")) {
		    	URL="jdbc:mysql://preprod.cagqnk2yhltv.us-east-1.rds.amazonaws.com:3306/edocent";
		    }else if(URL.contains("idogic")) {
		    	URL="jdbc:mysql://preprod.cagqnk2yhltv.us-east-1.rds.amazonaws.com:3306/studio";
		    }else {
		    	URL="jdbc:mysql://192.168.207.177:3310/";
		    }
			String SQL_URL = URL;
			return SQL_URL;
			
		}

}
