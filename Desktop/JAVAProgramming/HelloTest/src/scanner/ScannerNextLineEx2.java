package scanner;

import java.util.Scanner;

public class ScannerNextLineEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = scanner.nextInt();
		System.out.println(num1);
		scanner.nextLine();
		
		System.out.print("Enter a single line of string: ");
		String lineString = scanner.nextLine();
		System.out.println(lineString);
		
		scanner.close();
		System.out.println("Exit program");
	}

}
