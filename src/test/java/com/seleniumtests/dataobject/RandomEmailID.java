package com.seleniumtests.dataobject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomEmailID {
	//public static String email = null;
	//public static String name = null;
	//public static String password = null;
	
	public static String randomEmail(){
		
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		String emailprefix = "automation";
		String emailDomain = "@mailsac.com";
		String email = emailprefix + timeStamp + emailDomain;
//		name = emailprefix + timeStamp;
//		password = emailprefix + timeStamp;
		System.out.println(email);
		return email;
	}
public static void main(String args []) {
	randomEmail();
}
}
