package com.example.demo.interfaceVsAbstract;

import java.util.Arrays;
import java.util.List;

public interface CircleInterface {

	final List<String> allowedColors = Arrays.asList("Red", "Green", "Blue");
	String getColor();

	default boolean isValid() {
		return allowedColors.contains(getColor());
	}
}
