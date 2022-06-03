package com.example.demo.passbyvalueVsPassbyreference;

import com.example.demo.dto.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassByTest {

	@DisplayName("passByValue 메소드에서 값이 변하지 않는지 테스트.")
	@Test
	public void passByValueTest() {

		int number = 1;
		String str = "abc";

		PassBy passBy = new PassBy();
		passBy.passByValue(number, str);

		assertEquals(1, number);
		assertEquals("abc", str);
		
		// Test passed
	}
	
	@DisplayName("member 참조를 넘겼기 때문에 username에 String을 새로 할당한다.")
	@Test
	public void passByReferenceTest() {
		Member member = new Member();
		member.setUsername("sseob");

		PassBy passBy = new PassBy();
		passBy.passByReference(member);

		assertEquals("현섭", member.getUsername());
		
		// Tests failed
	}
}