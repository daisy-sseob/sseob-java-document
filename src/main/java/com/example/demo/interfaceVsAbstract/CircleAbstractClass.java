package com.example.demo.interfaceVsAbstract;

import java.util.Arrays;
import java.util.List;

public abstract class CircleAbstractClass {

	private String color;
	private final List<String> allowedColors = Arrays.asList("Red", "Green", "Blue");
	
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
