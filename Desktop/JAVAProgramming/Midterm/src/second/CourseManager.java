package second;

public class CourseManager {
	// 생성자 
	public CourseManager() {
		int[] courseArray = new int[10];
		int courseArrayLength = 10;
	}
	
	// append 메소드
	public void append(Course newCourse) {
		
	}
	
	// pop() 기능 구현 
	public void pop(Course[] courseList) {
		
	}
	
	// 배열에 저장된 데이터의 개수 출력
	public void printAllCourses() {
		System.out.println("------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("[%s]: %30s", i, toString());
		}
	}
}