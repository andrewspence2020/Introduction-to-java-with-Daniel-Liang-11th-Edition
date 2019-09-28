package Java_homework;
import java.io.*;
import java.util.*;

public class java_homework_page696Q17_1 {

	public static void main(String[] args)throws FileNotFoundException {
	
		ArrayList<String> list = new ArrayList<>();

		
		File file = new File("java_homework_page696Q17.txt");
		if (file.exists()) {
			try (
			
				Scanner input = new Scanner(file);
			) {
				while (input.hasNext()) {
					list.add(input.nextLine());
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			list.add(((int)(Math.random() * 100)) + " ");
		}

		try (
			PrintWriter output = new PrintWriter(file);
		) {
	
			for (String l: list) {
				output.print(l);
			}
		}
		

	}

}

