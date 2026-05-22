package chap06.classs;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("모델명: " + myCar.model);
		System.out.println("모델명: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
	}

}