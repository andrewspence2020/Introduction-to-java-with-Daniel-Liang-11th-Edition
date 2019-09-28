import java.util.Scanner;
// Question 2.1
public class Chapter2Page69 {
  public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	
      System.out.print("Enter a degree in Celcius: ");
	  double celsius = input.nextDouble();
	
	// Convert fahrenheit to Celsius
	double fahrenheit = (9.0/5) * (celsius + 32);
	  System.out.println("Celcius " + celsius + " is " + fahrenheit + " in Fahrenhiet" );
	  System.out.println("\n");
	
	// Question 2.2
	System.out.print("Enter the radius and the length of a cylinder ");
	  double radius = input.nextDouble();
	    double length = input.nextDouble();
	
	//Getting the radius of a circle
	double Area = radius * radius * 3.14; 
	double Volume = Area * length;
	
	//displaying results 
	System.out.println("The area is " + Area + "\n");
	System.out.println("The area is " + Volume + "\n");
	  System.out.println("\n");
	
	//Question 2.3
	System.out.print("Enter a value for Feet:");
	double feet = input.nextDouble();
	
	//Converting feet into meters
	double meters = (feet * 0.305);
	System.out.println(feet + " feet" + " is " + meters + " meters");
	  System.out.println("\n");
	
	//Question 2.6
	System.out.println("Enter a number Between 0 and 1000");
	int num = input.nextInt();
	int sum = 0;
	
	//Calculating the sum in a while loop
	while (num > 0) {
	sum = sum + num % 10;
	num = num / 10;
	System.out.println("The sum of the digits are " + sum);
	  System.out.println("\n");
	}
	//Question 2.7
	System.out.println("Enter the number of minutes:");
	int min = input.nextInt();
	
	//Calculating the days and years in any given input
	double totaldays = min * 0.000694;
	double totalyear = min * 1.9013;
	System.out.println(min + " minutes is approximately " + totalyear + " years and " + totaldays + " days");
	System.out.println("\n");
	  
	//Question 2.14
	System.out.println("Enter your weight in pounds");
	double pounds = input.nextDouble();
	System.out.println("Enter height in inches");
	double height = input.nextDouble();
	
	
	//Calculations
    double kilogram = 0.45359237;
    double inches = 0.0254;
	double totalkilos = pounds * kilogram;
	double totalmeters = height * inches;
	double totalBmi1 = totalmeters * totalmeters;
	double totalBmi2 = totalkilos / totalBmi1;
	System.out.println("BMI is " + totalBmi2);
	
  }
	
}
