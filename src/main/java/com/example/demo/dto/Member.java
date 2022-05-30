package com.example.demo.dto;

import lombok.*;

import java.util.Objects;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Member {
	
	private Long id;
	private String username;
	private int age;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Member member = (Member) o;
		return getAge() == member.getAge() && Objects.equals(getId(), member.getId()) && Objects.equals(getUsername(), member.getUsername());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getUsername(), getAge());
	}
}
