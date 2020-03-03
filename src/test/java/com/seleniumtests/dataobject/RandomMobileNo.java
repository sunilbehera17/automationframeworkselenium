package com.seleniumtests.dataobject;

import java.util.Random;

public class RandomMobileNo {

	public static String randomMobileNo(){

		Random randomGenerator = new Random();  
		int num = randomGenerator.nextInt(90000000) + 10000000;

		String phonePrefix = "98";

		return phonePrefix + num;
	}
	//For debug perpose only
	public static void main(String args[]){
	
		System.out.println(randomMobileNo());
	}
}
