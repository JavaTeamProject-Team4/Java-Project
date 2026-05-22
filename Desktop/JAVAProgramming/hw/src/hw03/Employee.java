// 학번 : 2025005685
// 이름 : 유다경 

package hw03;

// 직원 정보 관리 클래스, 공통 항목 관리 
public class Employee {
	
	private int age;
	private String position;
	private String fullName;
	private int salary;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setName(String firstname, String lastname) {
		this.fullName = firstname + " " + lastname;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	 public void printEmployee() {
		 System.out.printf("%-20s %-5d %-20s%n", fullName, age, position);
	 }
	 
	 public String getName() {
		 return fullName;
	 }
	 
	 public int getSalary() {
		return salary;
	 }
	 
	 public String getPosition() {
		return position;
	 }
	 
	 public int getAge() {
		 return age;
	 }
}
