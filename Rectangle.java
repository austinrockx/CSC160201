package csc160Assignments;

public class Rectangle {
	
	private double theRectanglesHeight;
	private double theRectanglesWidth;
	
	public Rectangle() {
		theRectanglesHeight = 1;
		theRectanglesWidth = 1;
	}
	
	public Rectangle(double height, double width) {
		theRectanglesHeight = height;
		theRectanglesWidth = width;
	}
	
	public void setHeight(double high) {
		theRectanglesHeight = high;
	}
	
	public void setWidth(double wid) {
		theRectanglesWidth = wid;
	}
	
	public double getArea() {
		return theRectanglesHeight * theRectanglesWidth;
	}
	
	public double getPerimeter() {
		return 2 * (theRectanglesHeight + theRectanglesWidth);
	}
	
}
