package chap07.inheritance;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// tire 필드에 서로 다른 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		// HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		// KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
