package Java_homework;

import java.util.Scanner;

public class java_homework_page236Q6_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	      System.out.print("Input an integer: ");
	      int digits = in.nextInt();
		  System.out.println("The sum is " + sumD(digits));
	    }

	 public static int sumD(long n) {
			int result = 0;
			
			while(n > 0) {
				result += n % 10;
				n /= 10;
			}
			
			return result;
		
		
	}
}
