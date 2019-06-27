package com.cn.ustb.mouse.basic;

public class PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
		displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
	}
	
	public static void displayObject(SimpleGeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
	}

}
