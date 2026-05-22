
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
    	
	}

}
