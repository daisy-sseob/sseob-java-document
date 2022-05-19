package com.example.demo.interfaceVsAbstract;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InterfaceVsAbstractTest {

	@Test
	@DisplayName("추상클래스의 구현체인 ChildCircleClass를 통해 class의 상태, 행위를 관찰하자")
	public void abstractTest() {
		CircleAbstractClass circleClass = new ChildCircleClass();
		circleClass.setColor("Red");
		assertTrue(circleClass.isValid());
	}
	
	@Test
	@DisplayName("interface는 상태를 가질 수 없기 때문에 구현체를 통해 상태, 행위를 확인한다.")
	public void interfaceTest() {
		CircleInterfaceImpl circleInterface = new CircleInterfaceImpl();
		circleInterface.setColor("Red");
		assertTrue(circleInterface.isValid());
	}
}