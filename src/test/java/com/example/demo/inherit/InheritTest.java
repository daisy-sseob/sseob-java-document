package com.example.demo.inherit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InheritTest {
	

	@DisplayName("override 확인하기")
	@Test
	public void overrideTest() {
		Parent parent = new Parent();
		parent.getMultipleNumber(10);
		assertEquals(100, parent.getMultipleNumber(10));
		
		Child child = new Child();
		assertEquals(200, child.getMultipleNumber(10));
	}
}