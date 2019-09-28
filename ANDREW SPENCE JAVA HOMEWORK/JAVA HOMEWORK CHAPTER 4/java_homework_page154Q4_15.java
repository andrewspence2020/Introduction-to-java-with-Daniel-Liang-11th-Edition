package Java_homework;

import java.util.Scanner;

public class java_homework_page154Q4_15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a letter");
		 char yourletter = sc.next().charAt(0);
		 
	
		 
		 if(yourletter == 'A' || yourletter == 'a' 
				 || yourletter == 'B' || yourletter == 'b' 
				 || yourletter == 'C'|| yourletter == 'c') {
		     System.out.println("The corrsoponding number is 2");
	          }
		 else if(yourletter == 'D' || yourletter == 'd' 
				 || yourletter == 'E' || yourletter == 'e' 
				 ||yourletter == 'F'|| yourletter == 'f') {
		     System.out.println("The corrsoponding number is 3");
	          }
		 else if(yourletter == 'G' || yourletter == 'g' 
				 || yourletter == 'H' || yourletter == 'h' 
				 || yourletter == 'I'|| yourletter == 'i') {
		     System.out.println("The corrsoponding number is 4");
	          }
		 else if(yourletter == 'J' || yourletter == 'j' 
				 || yourletter == 'K' || yourletter == 'k' 
				 || yourletter == 'L'|| yourletter == 'l') {
		     System.out.println("The corrsoponding number is 5");
	          }
		 else if(yourletter == 'M' || yourletter == 'm' 
				 || yourletter == 'N' || yourletter == 'n' 
				 || yourletter == 'O'|| yourletter == 'o') {
		     System.out.println("The corrsoponding number is 6");
	          }
		 else if(yourletter == 'P' || yourletter == 'p' 
				 || yourletter == 'Q' || yourletter == 'q' 
				 || yourletter == 'R'|| yourletter == 'r'
				 || yourletter == 'S'|| yourletter == 's') {
		     System.out.println("The corrsoponding number is 7");
	          }
		 else if(yourletter == 'T' || yourletter == 't' 
				 || yourletter == 'U' || yourletter == 'u' 
				 || yourletter == 'V'|| yourletter == 'v') {
		     System.out.println("The corrsoponding number is 8");
	          }
		 else if(yourletter == 'W' || yourletter == 'w' 
				 || yourletter == 'X' || yourletter == 'x' 
				 || yourletter == 'Y'|| yourletter == 'y'
				 || yourletter == 'Z'|| yourletter == 'z') {
		     System.out.println("The corrsoponding number is 9");
	          }
		 else {
			 System.out.println(yourletter + " is a Invalid Input");
		 }

	
	}
	}

