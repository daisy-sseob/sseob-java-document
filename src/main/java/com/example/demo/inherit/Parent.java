package com.example.demo.inherit;

public class Parent {

	private String str;

	public Parent() {
	}

	public Parent(String str) {
		this.str = str; 
	}

	public int getMultipleNumber(int number) {
		return number * 10;
	}
}
