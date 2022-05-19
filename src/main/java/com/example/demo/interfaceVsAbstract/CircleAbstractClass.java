package main.java.com.example.demo.diffrent;

import java.util.Arrays;
import java.util.List;

public abstract class CircleAbstractClass {

	private String color;
	private List<String> allowedColors = Arrays.asList("Red", "Green", "Blue");
	
	public boolean isValid() {
		return allowedColors.contains(getColor());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
