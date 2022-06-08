package com.example.demo.selfproblem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelfProblemTest {

	@DisplayName("self 문제 wrapper 객체의 callCount가 늘어나지 않는 것을 테스트")
	@Test
	public void selfProblemTest() {
		SomeService service = new SomeService();
		SomethingWithCallback wrappedObject = new WrappedObject(service);
		Wrapper wrapper = new Wrapper(wrappedObject);
		wrapper.doSomething();
		wrapper.call();

		assertEquals(1, wrapper.getCallCount());
		
		/*
			Wrapper 객체는 WrappedObject를 감싸고 있다.
				- Wrapper 클래스는 WrappedObject 클래스를 Composition으로 기능의 확장을 이루어 내려고 한다.  
			WrappedObject는 내부적으로 callback 메소드를 사용한다.
			Wrapper 객체는 WrappedObejct 의 doSomething 메소드를 호출하여 
		 */
	}
}