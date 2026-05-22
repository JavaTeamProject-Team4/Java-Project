package chap07.inheritance;

public class Phone {
	// 필드 
	public String model;
	public String color;
	
	// 생성자 
	public Phone() {
		model = "";
		color = "";
	}
	
	// 메서드 
	public void bell() {
		System.out.println("벨이 울립니다. ");
	}
	
	// 메서드
	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	// 메서드
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	// 메서드
	public void hangUp() {
		System.out.println("전화를 끊습니다. ");
	}
}
