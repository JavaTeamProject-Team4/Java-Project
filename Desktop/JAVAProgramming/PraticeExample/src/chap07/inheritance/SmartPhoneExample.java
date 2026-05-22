package chap07.inheritance;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// SmartPhone 객체 생성한다 
		SmartPhone mySmartPhone = new SmartPhone("갤럭시", "은색");
		// Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: " + mySmartPhone.model);
		System.out.println("모델: " + mySmartPhone.color);
		
		// SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + mySmartPhone.wifi);
		// Phone으로부터 상속받은 메소드 호출
		mySmartPhone.bell();
		mySmartPhone.sendVoice("여보세요. ");
		mySmartPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		mySmartPhone.sendVoice("아~네, 반갑습니다.");
		mySmartPhone.hangUp();
		
		// SmartPhone의 메소드 호출
		mySmartPhone.setWifi(true);
		mySmartPhone.internet();
	}

}
