// Austin Bennett
// CSC 160 Computer Science 1:
// July 26, 2021

package csc160Assignments;

public class Triangle {
	
	private double side1;
	private double side2;
	private double side3;
	
	//Triangle object. Also checks each sum if it is less then the third angle.
	public Triangle(double s1, double s2, double s3) throws IllegalTriangleException{
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		
		if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
			throw new IllegalTriangleException();
		}
		
	}
	
	//calculate the area using Heron's Formula.
	public double calculateArea() {
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	
	//Calculate the perimeter of triangle.
	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}
	
	//String side analysis.
	public String toString() {
		return "Triangle: side1 = " + String.format("%.2f", side1) + " side2 = " + String.format("%.2f", side2) +
				" side3 = " + String.format("%.2f", side3);
	}
	
}
