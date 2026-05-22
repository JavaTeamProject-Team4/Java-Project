package hw0102.again;

public class SavingsAccount {
	// 필드 구현 : 초기 입금 금액, 이자율
	double balance;
	double rate;
	
	// 생성자 
	public SavingsAccount(double balance, double rate) {
		this.balance = balance;
		this.rate = rate;
	}
	
	// 이자율 계산 메소드
	public void Calcuator() {
		double plusMoney = balance * (rate / 12.0);
		balance += plusMoney;
	}
	
	// 현재 잔고 리턴 메소드
	public double getBalance() {
		return balance;
	}
	
	// 설정된 이자율 리턴 메소드
	public double getRate() {
		return rate;
	}
}
