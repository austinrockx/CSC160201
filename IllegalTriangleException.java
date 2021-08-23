// Austin Bennett
// CSC 160 Computer Science 1:
// July 26, 2021

package csc160Assignments;

public class IllegalTriangleException extends Exception {

	public IllegalTriangleException() {
		super("Illegal triangle: The sum of any two sides is less than the other side ");
	}
}
