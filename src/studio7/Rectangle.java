package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;
	
	//constructors
	public Rectangle() {
		this.width = 0.0;
		this.length = 0.0;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	

	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public boolean isSquare() {
		if (width == length) {
			return true;
		} else {
			return false;
		}
	}
	
	public void drawRectangle() {
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(0.5, 0.5, width/2, length/2);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(.2, .4);
		System.out.println(r1.getArea());
		r1.drawRectangle();
	}

}
