package com.example.demo.classes;

public class DoorLockManager {
	
	// 상태
	String password;
	
	// 행동
	public boolean validationPassword() {
		return "1234".equals(password);
	}
}
