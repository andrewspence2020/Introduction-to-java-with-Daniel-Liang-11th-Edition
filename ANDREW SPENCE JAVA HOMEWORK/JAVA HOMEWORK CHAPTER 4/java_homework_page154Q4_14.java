package Java_homework;

import java.util.Scanner;

public class java_homework_page154Q4_14 {
	



	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
      System.out.println("Enter a letter Grade");
      char yourGrade = sc.next().charAt(0);

	if (yourGrade == 'A' || yourGrade == 'a') {
    	  System.out.println("The numeric value for A is 4");
     }
	else if (yourGrade == 'B' || yourGrade == 'b') {
  	  System.out.println("The numeric value for B is 3");
	 }
	else if (yourGrade == 'C' || yourGrade == 'c') {
	  	  System.out.println("The numeric value for C is 2");
	}
	else if(yourGrade == 'D' || yourGrade == 'd') {
	  	  System.out.println("The numeric value for D is 1");
	}
	else if (yourGrade == 'F' || yourGrade == 'f'){
		System.out.println("The numeric value for f is 0");	
	}
	else {
		System.out.println("Invalid Grade");	
	}
      
      
      
      
      

	}

}
