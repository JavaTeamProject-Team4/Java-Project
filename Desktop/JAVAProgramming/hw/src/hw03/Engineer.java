// 학번 : 2025005685
// 이름 : 유다경 

package hw03;

// 개발자 관리 클래스 
public class Engineer extends Employee {
	int annualSalary;
	int overtimePay;
	int overtimeDay;
	
	public void setOvrworkingDay(int day) {
		this.overtimeDay= day;
	}
	
	public int getOverworkingPay() {
		overtimePay = overtimeDay * 3;
		return overtimePay;
	}
	
	public int getAnnualSalary() {
		annualSalary = (getSalary() + getOverworkingPay()) * 12;
		return annualSalary;
	}
	// Engineer 멤버 출력 함수
	@Override
	public void printEmployee() {
		System.out.printf("%20s %5d %20s %15d %10d %10d\n", getName(), getAge(), getPosition(), getOverworkingPay(), getSalary(), getAnnualSalary());
	}
	
}