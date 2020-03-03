package com.seleniumtests.dataobject;

import com.github.javafaker.Faker;

public class CompanyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		comanyName();
	}
	
	
	public static String comanyName() {
		Faker comanyfakerobj = new Faker();

		String comanyname = comanyfakerobj.company().name();
		System.out.println(comanyname);
		return comanyname;
	}
	
	
}