package second;

public class Course {
	
	// 필드 정의 
	String code;
	String subject;
	String department;
	
	// 생성자
	public Course(String code, String subject, String department) {
		this.code = code;
		this.subject = subject;
		this.department = department;
	}
	
	// 과목 코드가 같거나 과목명이 동일한 경우 
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof Course target) {
			if (this.code.equals(target.code) && this.subject == target.subject) {
				return true;
			}
		}
		return false;
	}
	
	// Course 객체 출력 형식 정의 
	@Override
	public String toString() {
		return this.code + "," + this.subject + "," + this.department;
	}

}
