package csc160Assignments;

import java.text.DecimalFormat;

public class Ch9 {
	
	private static DecimalFormat df = new DecimalFormat("#.##");

	public static void main(String[] args) {
		Rectangle drec = new Rectangle();
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);

		
		System.out.println("Perimeter of the first rectangle: " + rec1.getPerimeter());
		System.out.println("Area of the first rectangle: " + rec1.getArea());
		System.out.println();
		
		System.out.println("Perimeter of the second rectangle: " + rec2.getPerimeter());
		System.out.println("Area of the second rectangle: " + df.format(rec2.getArea()));
		System.out.println();
		
		System.out.println("Perimeter of the default rectangle: " + drec.getPerimeter());
		System.out.println("Area of the default rectangle: " + drec.getArea());
		System.out.println();
		
	}
	
}
