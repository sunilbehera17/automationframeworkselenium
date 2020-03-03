package com.seleniumtests.dataobject;

import com.github.javafaker.Faker;

public class RandomNewStateName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   state();
	}
	public static String state() {
		Faker faker = new Faker();

		
		String name3 = faker.address().city();
		
		
		
		
		
		System.out.println(name3);
		return name3;
	}
}