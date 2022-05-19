package main.java.com.example.demo.diffrent;

public interface CircleInterface {

	String getColor();
	
	default boolean isValid(String color) {
		return true;
	}
}
