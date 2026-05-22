package Lab01;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		while (true) {
			System.out.printf("한달 동안 근무한 시간을 입력하세요: ");
			total = scanner.nextInt();
			
			if (total == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			if(total <= 160) {
				System.out.printf("총 근무시간: %d시간, 초과 근무시간: %d시간, 월급: %,d원\n", total, 0, 9860 * total);
			}
			else {
				System.out.printf("총 근무시간: %d시간, 초과 근무시간: %d시간, 월급: %,d원\n", total, total - 160, (9860 * 160) + (int)((total - 160) * 9860 * 1.5));
			}
			
		}
		
	}

}
