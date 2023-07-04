package u4d7.entities;

public class Rectangle {
	private double x, y;

	public Rectangle(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Deprecated
	public double getArea() {
		return x * y;
	}

}
