package java_book_examples;

import java.util.Scanner;

public class java_homework_page195Q5_1 {

	public static void main(String[] args) {
		

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("Enter numbers: ");
			int num = input.nextInt();
			int positive = 0;
			int negative = 0;
			int sum = 0;
			int counter = 0;

			while (num != 0) {
			 if (num > 0) 
			  positive++;
			 if (num < 0)
			  negative++;
			 sum = sum + num;
			 counter++;
			 
			 num = input.nextInt();
			}

			double avg = (double)sum / counter;
			System.out.println("sum " + sum + " positive " + positive + " negative " + negative + " avg " + avg);

	}

}
