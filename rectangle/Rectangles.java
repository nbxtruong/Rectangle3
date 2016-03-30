package rectangle;

public class Rectangles {
	public static void resize(Rectangle r, int factor) {
		r.setHeight(factor * r.height());
		r.setWidth(factor * r.width());
	}
	
	public static void resize(Square s, int factor) {
		s.setSize(factor * s.size());
	}

}
