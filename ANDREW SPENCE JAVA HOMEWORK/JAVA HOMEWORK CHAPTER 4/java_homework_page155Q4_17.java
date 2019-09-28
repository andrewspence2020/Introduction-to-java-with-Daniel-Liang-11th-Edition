package Java_homework;

import java.util.Scanner;

public class java_homework_page155Q4_17 {

	@SuppressWarnings("resource")
	public static <varchar> void main(String[] args) {
		Scanner input = new Scanner(System. in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year");
		int year = input.nextInt();
		System.out.println(year);
		
		String month;
		System.out.println("Enter a month");
	    month = sc.nextLine();
	    System.out.println(month);
		
		switch(month) {
		case "Jan":System.out.println(month+ " " + year + " has 31 days ");break;
		case "Feb":System.out.println(month+ " " + year + " has 29 days " );break;
		case "Mar":System.out.println(month+ " " + year + " has 31 days ");break;
		case "Apr":System.out.println(month+ " " + year + " has 30 days ");break;
		case "May":System.out.println(month+ " " + year + " has 31 days ");break;
		case "June":System.out.println(month+ " " + year + " has 30 days ");break;
		case "July":System.out.println(month+ " " + year + " has 31 days ");break;
		case "Aug":System.out.println(month+ " " + year + " has 31 days ");break;
		case "Sep":System.out.println(month+ " " + year + " has 30 days ");break;
		case "Oct":System.out.println(month+ " " + year + " has 31 days ");break;
		case "Nov":System.out.println(month+ " " + year + " has 30 days ");break;
		case "Dec":System.out.println(month+ " " + year + " has 31 days ");break;
		}
		
	
		
		System.out.println(month);
		
		
	
		
		
		
		
		


	}

}
