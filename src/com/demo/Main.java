package com.demo;

public class Main {
	public static void main(String[] args) {

		Main main = new Main();
		main.callWildCardMethod();
		
	}
	
	public void callWildCardMethod() {
		WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
		wildcard.setWildcard("A");
		wildcardStringMethod(wildcard);
	}

	private void wildcardStringMethod(WildcardGeneric<String> wildcard) {
		String value = wildcard.getWildcard();
		System.out.println(value);
	}
}
