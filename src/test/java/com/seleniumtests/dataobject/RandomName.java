package com.seleniumtests.dataobject;

import com.github.javafaker.Faker;

public class RandomName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   name();
	}
	public static String name() {
		Faker faker = new Faker();

		String name = faker.name().fullName();
		System.out.println(name);
		return name;
	}
}
