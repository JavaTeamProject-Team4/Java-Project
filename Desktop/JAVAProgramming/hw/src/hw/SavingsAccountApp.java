// 학번 : 2025005685
// 이름 : 유다경

package hw;

import java.util.Scanner;

public class SavingsAccountApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input The Annual Interest Rate of Account1(0.0 ~ 0.1): ");
		double rate1 = scanner.nextDouble();
		
		System.out.print("Input The Annual Interest Rate of Account2(0.0 ~ 0.1): ");
		double rate2 = scanner.nextDouble();
		
		SavingsAccount acc1 = new SavingsAccount(20000000, rate1);
		SavingsAccount acc2 = new SavingsAccount(20000000, rate2);
		
		// 12번 반복
		for (int i = 1; i <= 12; i++) {
			acc1.calculateMonthInterest();
			acc2.calculateMonthInterest();
			
			System.out.printf("[Month %2d] account1: %,.2f, account2: %,.2f\n", i, acc1.getBalance(), acc2.getBalance());
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.printf("Account1 Interest rate: %.2f, Balance: %,.2f\n", acc1.getRate(), acc1.getBalance());
		System.out.printf("Account2 Interest rate: %.2f, Balance: %,.2f\n", acc2.getRate(), acc2.getBalance());
		System.out.println("-------------------------------------------------------");
		
		double diff = Math.abs(acc1.getBalance() - acc2.getBalance());
		System.out.printf("Difference: %,.2f\n", diff);
		
		scanner.close();
	}

}
