package second;

import java.util.Scanner;

public class CourseManagerApp {

	public static void main(String[] args) {
		// 초기 저장할 코스 목록 
    	Course[] courseList = {new Course("CS11", "Java Programming1", "Computer"),
    						new Course("CE11", "Java Programming2", "Education"),
    						new Course("EE12", "Data Structure", "Electronic"),    						
    						new Course("CS15", "Python Programming", "Computer"),
    						new Course("CS16", "System Programming", "Computer")};

    	// Append 메뉴에서 사용할 코스 목록 
    	Course[] newCourses = {	new Course("CS10", "Java Programming3", "Education"),
    							new Course("CS12", "Java Programming1", "Computer"),	// subject 중복 
    							new Course("EE13", "Data Structure2", "Engineering"),	 
    							new Course("CS15", "Python Programming", "Computer"), // code, subject 중복 
    							new Course("CS16", "System Programming", "Computer"),  // code, subject 중복 
    							new Course("CE17", "Network Programming", "Computer")};
		
		Scanner scanner = new Scanner(System.in);
		
		int op = -1;
		
		while (op != 4) {
			System.out.println("----------------------------------------------");
			System.out.println(" University Course Management System");
			System.out.println(" 1. Append One Course");
			System.out.println(" 2. Delete the First Course");
			System.out.println(" 3. Display All courses");
			System.out.println(" 4. Quit Program");
			System.out.println("----------------------------------------------");
			System.out.print("-> ");
			
			op = scanner.nextInt();
			
			switch(op) {
				case 1:
					
					break;
					
				case 2:
					
					break;
					
				case 3:
					// Display All Course
					break;
					
				case 4:
					System.out.println("Bye!");
					break;
					
				default:
					System.out.println("Wrong input. Try again!");		
			}
					
	
		}
	}

}
