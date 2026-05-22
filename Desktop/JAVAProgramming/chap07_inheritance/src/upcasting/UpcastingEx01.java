package upcasting;

public class UpcastingEx01 {
	public static void main(String[] args) {
		Child child = new Child ("Engineer", 25);
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
	}
}
