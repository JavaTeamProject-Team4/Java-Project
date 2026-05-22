package hw0102.again;

import java.util.Scanner;

public class SavingsAccountApp {

	public static void main(String[] args) {
		// Scanner 객체 생성 
		Scanner scanner = new Scanner(System.in);
		
		// 이자율 화면 입력
		System.out.print("Input The Anual Interest Rate of Account1(0.0 ~ 0.1): ");
		double rate1 = scanner.nextDouble();
		System.out.print("Input The Anual Interest Rate of Account2(0.0 ~ 0.1): ");
		double rate2 = scanner.nextDouble();
		
		SavingsAccount account1 = new SavingsAccount(20000000, rate1);
		SavingsAccount account2 = new SavingsAccount(20000000, rate2);
		
		for (int i = 1; i <= 12; i++) {
			account1.Calcuator();
			account2.Calcuator();
			System.out.printf("[Month %2d] account1: %,.2f, account2: %,.2f", i, account1.getBalance(), account2.getBalance());
			System.out.println();
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.printf("Account1 Interest rate: %.2f, Balance: %,.2f\n", account1.getRate(), account1.getBalance());
		System.out.printf("Account2 Interest rate: %.2f, Balance: %,.2f\n", account2.getRate(), account2.getBalance());
		System.out.println("---------------------------------------------------------------");
		double diff = Math.abs(account1.getBalance() - account2.getBalance());
		System.out.printf("Difference: %,.2f", diff);
		
		scanner.close();
	}

}
