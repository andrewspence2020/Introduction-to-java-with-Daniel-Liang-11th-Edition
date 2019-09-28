package Java_homework;

import java.util.Scanner;

public class java_homework_page_109Q3_6 {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter weight in pounds");
		double pounds = input.nextDouble();
		
		System.out.print("Enter feet");
		double feet = input.nextDouble();
	
		
		final double Kilograms_Per_Pound = 45359237;
		final double Meters_Per_Inch = 0.0254;
		
		double weight_In_Kilograms = pounds * Kilograms_Per_Pound;
		double height_In_Meters = feet * Meters_Per_Inch;
		double bmi = weight_In_Kilograms / (height_In_Meters * height_In_Meters);
		
		
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");	

	}

}
