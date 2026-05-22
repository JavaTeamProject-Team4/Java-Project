package Lab01;
import java.util.Scanner;

public class CalculateInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("첫 번째 정수를 입력: ");
		int a = scanner.nextInt();
		System.out.printf("두 번째 정수를 입력: ");
		int b = scanner.nextInt();
		System.out.printf("세 번째 정수를 입력: ");
		int c = scanner.nextInt();
		
		System.out.println("결과: " + (a + b + c));
		
	}

}
