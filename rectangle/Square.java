package rectangle;

public class Square {

	private Rectangle delegate;

	public Square(int size) {
		delegate = new Rectangle(size, size);
	}

	public int size() {
		return delegate.height();
	}

	public void setSize(int s) {
		delegate.setHeight(s);
		delegate.setWidth(s);
	}

	public int perimeter() {
		return delegate.perimeter();
	}

	public int surface() {
		return delegate.surface();
	}
}
