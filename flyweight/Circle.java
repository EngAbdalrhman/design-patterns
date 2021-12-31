package designpatterns.flyweight;

public class Circle implements Shape{
	private String Color;
	private int x;
	private int y;
	private int radius;
	public Circle(String color) {
		super();
		Color = color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle [Color=" + Color + ", x=" + x + ", y=" + y + ", radius=" + radius + "]");
	}
	
	
	
}
