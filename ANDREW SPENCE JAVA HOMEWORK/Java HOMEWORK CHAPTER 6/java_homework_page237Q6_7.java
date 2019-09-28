package Java_homework;

import java.util.Scanner;

public class java_homework_page237Q6_7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		final int NumberOFYears = 30; 

	
		System.out.print("\nThe amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		
		double monthlyInterestRate = annualInterestRate / 1200;


		System.out.println("Years     Future Value"); 
		for (int years = 1; years <= NumberOFYears; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(amount, monthlyInterestRate, years));

	}

}
	public static double futureInvestmentValue(
			double investmentAmount, double monthlyIntRate, int years) {
			return investmentAmount * Math.pow(1 + monthlyIntRate, years * 12);
		}
	}
