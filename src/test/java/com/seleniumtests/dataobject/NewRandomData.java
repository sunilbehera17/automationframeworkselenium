package com.seleniumtests.dataobject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NewRandomData 
{

	//Updated new random data for muvi6	
	
	public static String newRandomName()
	{
			
		
		DateFormat dateFormat = new SimpleDateFormat("ssmm");
		Calendar cal = Calendar.getInstance();
		
		
		String nameNew="muvi"+dateFormat.format(cal.getTime());
		
		
		return nameNew;	
		
		
		
	}
	
	
	public static String newRandomCompanyName()
	{
			
		
		DateFormat dateFormat = new SimpleDateFormat("mmss");
		Calendar cal = Calendar.getInstance();
		String companyNew="Muvi"+dateFormat.format(cal.getTime())+"Pvt.Ltd";
		
		
			
		return companyNew;
		
		
		
	}
	
	
	public static String newRandomPassword()
	{
			
		
		
		DateFormat mob = new SimpleDateFormat("HHmmssMMdd");
		Calendar cal = Calendar.getInstance();
		
		
		
		String passwordNew="Muvi@"+mob.format(cal.getTime());
		
		
		
		return passwordNew;
		
		
		
	}
	
	
	public static String newRandomPhoneNumber()
	{
			
		
		
		DateFormat mob = new SimpleDateFormat("ssddHHmm");
		Calendar cal = Calendar.getInstance();
		
		
		
		String phonenuberNew="98"+mob.format(cal.getTime());
		
		
		
		return phonenuberNew;
		
		
		
	}
	
	
	
	
	public static String newRandomEmail()
	{
			
		
		DateFormat dateFormat = new SimpleDateFormat("mmssmm");
		Calendar cal = Calendar.getInstance();
		
		
		
		String emailNew="test"+"."+"muvi"+dateFormat.format(cal.getTime())+"@yopmail.com";
		
		
		return emailNew;
		
		
	}
	
	
	public static String todayDate()
	{
	
	
	DateFormat dateFormat1 = new SimpleDateFormat("MM/dd/YYYY");
	Calendar callender = Calendar.getInstance();
	String nameNew=dateFormat1.format(callender.getTime());
	System.out.println(nameNew);
	return nameNew;
	}
	
	
	
	
	public static void main(String[] args)
	{
	
		
		System.out.println(newRandomName());
		System.out.println(newRandomCompanyName());
		System.out.println(newRandomPassword());
		System.out.println(newRandomPhoneNumber());
		System.out.println(newRandomEmail());
		
		
		
	}

	
	
	
}