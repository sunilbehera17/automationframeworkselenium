package com.seleniumtests.dataobject;

import com.github.javafaker.Faker;

public class RandomZip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   zip();
	}
	public static String zip() {
		Faker faker = new Faker();

		
		String name = faker.address().zipCode();
		
		
		System.out.println(name);
		return name;
	}

}
