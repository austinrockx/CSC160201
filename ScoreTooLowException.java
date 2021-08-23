// Austin Bennett
// CSC 160 Computer Science 1:
// August 9, 2021

package csc160Assignments;

public class ScoreTooLowException extends Exception{
	/**
	 * Decide to make my own exceptions for too high and too low scores. 
	 * This exception is for too high.
	 */
	
	private static final long serialVersionUID = 1L;

	public ScoreTooLowException() {
		super("Only numbers greater than or equal to 0 are allowed. Please try again.");
	}
}
