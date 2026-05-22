package chap06.classs;

public class CafeExample {

	public static void main(String[] args) {
		Cafe keanu = new Cafe();
		
		System.out.printf("메뉴1: %s ", keanu.menu1);
		System.out.printf("메뉴1의 가격: %d\n", keanu.price1);
		
		Cafe paik = new Cafe();
		
		paik.menu1 = "초코버블티";
		paik.price1 = 4200;
		
		System.out.printf("메뉴1: %s ", paik.menu1);
		System.out.printf("메뉴1의 가격: %d\n", paik.price1);
	}

}
