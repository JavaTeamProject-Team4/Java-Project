package Lab01;

import java.util.Scanner;

public class CoffeShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아메키라노 판매 수: ");
		int a = scanner.nextInt();
		System.out.print("카페라떼 판매 수: ");
		int b = scanner.nextInt();
		System.out.print("카푸치노 판매 수: ");
		int c = scanner.nextInt();

		System.out.printf("총 매출은 %,d입니다.\n", (a * 2000) + (b * 3000) + (c * 3500));
	}

}
