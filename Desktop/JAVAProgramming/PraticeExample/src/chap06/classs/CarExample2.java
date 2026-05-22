package chap06.classs;

public class CarExample2 {
	public static void main(String[] args) {
		Car2 myCar2 = new Car2();
		
		System.out.println("제작회사: " + myCar2.company);
		System.out.println("현재속도: " + myCar2.speed);
		
		myCar2.speed = 60;
		System.out.println("수정된 속도: " + myCar2.speed);
	}
}