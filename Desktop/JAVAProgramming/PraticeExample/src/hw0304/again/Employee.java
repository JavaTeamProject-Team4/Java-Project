package hw0304.again;

// 직원 정보 관리 클래스, 공통 항목 관리 (상위 클래스)
public class Employee {
	private int age;
	private String position;
	private String name;
	private int salary;
	
	// 생성자
//	public Employee(String firstname, String lastname, int age, String position, int salary) {
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.age = age;
//		this.position = position;
//		this.salary = salary;
//	}
	
	// 나이 입력 함수
	public void setAge(int age) {
		this.age = age;
	}
	
	// 직위 입력 함수
	public void setPosition(String position) {
		this.position = position;
	}
	
	// 이름 입력 함수
	public void setName(String firstname, String lastname) {
		this.name = firstname + " " + lastname;
	}
	
	// 월급 입력 함수
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// 한 명의 직원 정보 출력 함수
	public void printEmployee() {
		// 이름, 나이, 직위 
		System.out.printf("%20s %5d %20s\n", this.name, this.age, this.position);
	}
	
	// 이름 출력 함수 
	public String getName() {
		return name;
	}
	
	// 월급 출력 함수 
	public int getSalary() {
		return salary;
	}
	
	// 직위 출력 함수
	public String getPosition() {
		return position;
	}
	
	// 나이 출력 함수
	public int getAge() {
		return age;
	}
}
