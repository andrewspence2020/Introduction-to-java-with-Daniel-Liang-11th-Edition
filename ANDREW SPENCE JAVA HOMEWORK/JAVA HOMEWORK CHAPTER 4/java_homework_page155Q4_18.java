package Java_homework;

import java.util.Scanner;

public class java_homework_page155Q4_18 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner (System.in);
		//make sure to press enter after each character
		System.out.println("Enter 2 Characters");
		char personinput = sc.next().charAt(0);
		int personinputnum = input.nextInt();
		
		
		// If statement for Subjects
	    if(personinput == 'M') {
	    	System.out.println("Mathematics");
	    }
	    else if(personinput == 'C') {
	    	System.out.println("Computer Science");		
	    }
	    else if (personinput == 'I') {
	    	System.out.println("Information Technology");	
	    }
	    else {
	    	System.out.println("Invalid Data");	
	    }

	    //switch for high school positions 
	    switch(personinputnum) {
	    case 1:System.out.println("freshman");break; 
	    case 2:System.out.println("sophomore");break; 
	    case 3:System.out.println("junior");break;
	    case 4:System.out.println("senior");break;
	    default:System.out.println("Invalid Code");break;
	    }
	   
	  
	}
	}


