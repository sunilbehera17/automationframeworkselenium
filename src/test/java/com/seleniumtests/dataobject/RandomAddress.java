package com.seleniumtests.dataobject;

import com.github.javafaker.Faker;

public class RandomAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   address();
	}
	public static String address() {
		Faker faker = new Faker();

		String name1 = faker.address().streetAddress();
		String name2 = faker.address().streetName();
		String name3 = faker.address().city();
		String name4 = faker.address().cityName();
		String name5 = faker.address().country();
		
		
		
		String name = name1+","+name2+","+name3+","+name4+","+name5;
		System.out.println(name);
		return name;
	}
}
