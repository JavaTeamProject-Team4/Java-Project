package Lab01;

public class DiceSum {

	public static void main(String[] args) {
		int sum = 0;
		while(true) {
			
			int a = (int)(Math.random() * 6) + 1;
			int b = (int)(Math.random() * 6) + 1;
			
			sum = a + b;
			
			if (sum == 5) {
				System.out.printf("주사위(%d, %d) = %d -> 주사위의 합은 5입니다.\n", a, b, sum);
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.printf("주사위(%d, %d) = %d -> 다시 주사위를 던집니다.\n", a, b, sum);
			}
		}

	}

}
