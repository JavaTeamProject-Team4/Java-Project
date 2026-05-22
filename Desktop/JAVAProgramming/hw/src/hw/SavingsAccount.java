// 학번 : 2025005685
// 이름 : 유다경

package hw;

public class SavingsAccount {

	double balance;
	double rate;
	
	public SavingsAccount(double balance, double rate) {
		this.balance = balance;
		this.rate = rate;
	}
	
	// 매달 이자 계산하기
	public void calculateMonthInterest() {
		double interest = balance * (rate / 12.0);
		balance += interest;
	}
	
	// 현재 잔고 리턴
	public double getBalance() {
		return balance;
	}
	
	// 현재 이자율 리턴 
	public double getRate() {
		return rate;
	}
}
