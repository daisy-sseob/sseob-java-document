package com.example.demo.finalexample;

public class FinalVariable {

	public void method(final int parameter) {
		final int localVriable;
		localVriable = 1;
//		localVriable = 2; 한번 초기화된 final 변수는 다시 할당할 수 없다.

		System.out.println(parameter);
	}
}
