package com.example.demo.interfaceVsAbstract;

public class CircleInterfaceImpl implements CircleInterface {

	private String color;

	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
