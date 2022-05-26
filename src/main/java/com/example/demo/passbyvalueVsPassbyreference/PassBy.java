package com.example.demo.passbyvalueVsPassbyreference;

import com.example.demo.dto.Member;

public class PassBy {
	
	public void passByValue(int number, String str) {
		number = 20;
		str = "변경";
	}

	public void passByReference(Member member) {
		member.setUsername("현섭");
	}
}
