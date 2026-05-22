package chap07.inheritance;

public class MethodOverringEx {
	static void paint(Shape p) {
		if (p instanceof Shape)
			System.out.print("Shape object-");
		if (p instanceof Line)
			System.out.print("Link object-");
		if (p instanceof Rect)
			System.out.print("Rect object-");
		if (p instanceof Circle)
			System.out.print("Circle object-");
		
		p.draw();
	}

	public static void main(String[] args) {
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
