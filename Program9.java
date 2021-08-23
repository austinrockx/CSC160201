// Austin Bennett
// CSC 160 Computer Science 1:
// July 26, 2021

package csc160Assignments;

public class Program9 {

	public static void main(String[] args) throws IllegalTriangleException {
		
		try {
			Triangle t1 = new Triangle(1.50, 2.00, 3.00);
			
			System.out.println(t1.toString());
			System.out.println("Area: " + String.format("%.2f", t1.calculateArea()));
			System.out.println("Area: " + String.format("%.2f", t1.calculatePerimeter()));
		}
		catch (IllegalTriangleException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			Triangle t2 = new Triangle(10.00, 5.00, 100.00);
			
			System.out.println(t2.toString());
			System.out.println("Area: " + String.format("%.2f", t2.calculateArea()));
			System.out.println("Area: " + String.format("%.2f", t2.calculatePerimeter()));
		}
		catch (IllegalTriangleException ex2) {
			System.out.println(ex2.getMessage());
		}
		
	}

}