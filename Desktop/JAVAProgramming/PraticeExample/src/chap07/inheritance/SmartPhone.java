package chap07.inheritance;

public class SmartPhone extends Phone {
	// 필드 선언 
	public boolean wifi;
	
	// 생성자 선언
	public SmartPhone(String model, String color) {
		// 부모 생성자가 매개변수 없는 생성자라서 여기서 호출 안해도
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다. ");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다. ");
	}
}
