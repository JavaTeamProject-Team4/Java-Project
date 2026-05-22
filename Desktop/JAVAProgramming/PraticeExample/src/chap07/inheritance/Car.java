package chap07.inheritance;

public class Car {
	// 최상위 부모 타입 필드 선언 
	public Tire tire;
	
	public void run() {
		// tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}
}