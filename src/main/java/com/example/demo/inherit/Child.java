package com.example.demo.inherit;

public class Child extends Parent {

	public Child() {
		super("test");
	}

	@Override
	public int getMultipleNumber(int number) {
		return number * 20;
	}
}
