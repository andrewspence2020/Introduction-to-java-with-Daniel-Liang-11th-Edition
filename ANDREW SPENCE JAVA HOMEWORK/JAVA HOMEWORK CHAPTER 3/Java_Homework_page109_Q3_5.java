import java.util.Scanner;

public class Java_Homework_page109_Q3_5 {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter today's day");
		int dayChosen = input.nextInt();

		
		switch (dayChosen){
		case 0: System.out.println("Monday"); y ="Monday"; break;
		case 1: System.out.println("Tuesday"); y = "Tuesday;"break;
		case 2: System.out.println("Wednesday"); y = "Wednesday";break;
		case 3: System.out.println("Thursday");y = "Thursday";break;
		case 4: System.out.println("Friday");y = "friday";break;
		case 5: System.out.println("Saturday");y = "saturday";break;
		case 6: System.out.println("Sunday");y = "Sunday";break;	
		}
		System.out.println("\n");
		
		
	
        System.out.println("Enter the number of days elapsed since today:");
        
        int dayselapsed = input.nextInt();
	int x = (dayselapsed+dayChosen)%7;

                switch (x){
		case 0: System.out.println("Monday");m = "monday"break;
		case 1: System.out.println("Tuesday");m="tuesday"break;
		case 2: System.out.println("Wednesday");m="wednesday"break;
		case 3: System.out.println("Thursday");m="thursday"break;
		case 4: System.out.println("Friday");m="friday"break;
		case 5: System.out.println("Saturday");m="Saturday"break;
		case 6: System.out.println("Sunday");m="Sunday"break;	
		}
		System.out.println("\n");
		
       
		
		if ( dayselapsed  == 1 ){
		  System.out.println("Monday");
		}
		else if ( dayselapsed == 2) {
		  System.out.println("Tuesday");
	    }
		else if (totaldays == 3){
		  System.out.println("Wednesday");
		}
		else if (totaldays == 4) {
		  System.out.println("Thursday");
		}
		else if (totaldays == 5) {
	      System.out.println("Friday");  	
		}
		else if (totaldays == 6) {
		System.out.println("Saturday");
		}
		else if (totaldays <= 7) {
		System.out.println("Sunday");
		}

		System.out.println("Today is " + dayChosen + " and the future day is " + totaldays );
				
		
		
	
		

	}

}
