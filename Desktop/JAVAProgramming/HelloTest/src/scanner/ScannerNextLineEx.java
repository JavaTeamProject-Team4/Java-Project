package scanner;

import java.util.Scanner;

public class ScannerNextLineEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		System.out.println("원하는내용을 입력하세요: ");
		input = scanner.nextLine();
		System.out.println("입력 내용: " + input);
		
		scanner.close();
		System.out.println();
		
	}

}
