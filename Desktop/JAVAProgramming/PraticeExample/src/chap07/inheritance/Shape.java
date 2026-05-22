package chap07.inheritance;

// 부모 클래스 !!!
class Shape {
	public Shape() {}
	
	public void draw() {
		System.out.println("Shape draw");
	}
}

// 자식 클래스 !!!
class Line extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Line draw");
	}
}

// 자식 클래스 !!!
class Rect extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Rect draw");
	}
}

// 자식 클래스 !!!
class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Circle draw");
	}
}