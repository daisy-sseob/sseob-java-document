package com.example.demo.passbyvalueVsPassbyreference;

import com.example.demo.dto.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassByTest {
	
	PassBy passBy = new PassBy();

	@DisplayName("passByValue 메소드에서 값이 변하지 않는지 테스트.")
	@Test
	public void passByValueTest() {

		int number = 1;
		String str = "abc";

		passBy.passByValue(number, str);

		assertEquals(1, number);
		assertEquals("abc", str);
	}
	
	@DisplayName("passByReference Reference의 변경 테스트")
	@Test
	public void passByReferenceTest() {
		Member member = new Member();
		member.setUsername("sseob");

		passBy.passByReference(member);

		assertEquals("현섭", member.getUsername());
	}
}