package com.example.demo.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MemberTest {

	@DisplayName("동등성 비교 테스트")
	@Test
	public void memberEqualsTest() {
		Member memberA = Member.builder()
				.id(1L)
				.username("sseob")
				.age(29)
				.build();
		
		Member memberB = Member.builder()
				.id(1L)
				.username("sseob")
				.age(29)
				.build();


		System.out.println(memberA.hashCode());
		System.out.println(memberB.hashCode());
		assertEquals(memberA, memberB);
	}
}