import rectangle.Rectangles;
import rectangle.Square;
import rectangle.Rectangle;

public class Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 10);
		Square s = new Square(10);
		System.out.println("height = " + r.height() + " width = "
				+ r.width() + " perimeter = " + r.perimeter() + " surface = "
				+ r.surface());
		System.out.println("size = " + s.size() + " perimeter = " + s.perimeter() + " surface = "
				+ s.surface());
		Rectangles.resize(r, 2);
		Rectangles.resize(s, 2);
		System.out.println("height = " + r.height() + " width = "
				+ r.width() + " perimeter = " + r.perimeter() + " surface = "
				+ r.surface());
		System.out.println("size = " + s.size() + " perimeter = " + s.perimeter() + " surface = "
				+ s.surface());
	}
}
