import java.util.Scanner;

public class java_homework_page278Q7_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a Scanner
		int[] numbers = new int[10];	// Create an array of length ten

		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		reverse(numbers);

		for (int e: numbers) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void reverse(int[] list) {
		int temp;
		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
			temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}

	}

}
