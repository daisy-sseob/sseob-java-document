package com.demo.inherit;

public class Child extends Parent{

	// Parent type에 선언되어있는 private mehtod는 재정의 할 수 없다.
	@Override
	public void printPrivate() {
		System.out.println("printPrivate() - child");
	}
}
