package com.example.demo.selfproblem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelfProblemTest {

	@DisplayName("self 문제 print")
	@Test
	public void selfProblemTest() {
		SomeService service = new SomeService();
		WrappedObject wrappedObject = new WrappedObject(service);
		Wrapper wrapper = new Wrapper(wrappedObject);
		wrapper.doSomething();
	}
}