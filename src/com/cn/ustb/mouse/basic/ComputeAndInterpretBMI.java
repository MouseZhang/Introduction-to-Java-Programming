package com.cn.ustb.mouse.basic;
import java.util.Scanner;

public class ComputeAndInterpretBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PRE_POUND = 0.45359237;
		final double METERS_PRE_INCH = 0.0254;
		
		double weightInKilograms = weight * KILOGRAMS_PRE_POUND;
		double heightInMeters = height * METERS_PRE_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if (bmi < 25) {
			System.out.println("Normal");
		}
		else if (bmi < 30) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}
}
