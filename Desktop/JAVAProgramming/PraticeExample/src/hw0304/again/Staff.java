package hw0304.again;

public class Staff extends Employee {
//	// 생성자
//	public Staff() {
//		super();
//	}
	
	// 연봉 계산 함수 
	public int getAnnualSalary() {
		return getSalary() * 12;
	}
	
	// Staff 멤버 출력 함수 
	// 이름, 나이, 직위, 월급, 연봉 
	// 오버라이딩
	@Override
	public void printEmployee() {
	    System.out.printf("%20s %5d %20s %10d %10d\n",
	        getName(), getAge(), getPosition(), getSalary(), getAnnualSalary());
	}
}