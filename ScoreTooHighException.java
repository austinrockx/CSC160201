// Austin Bennett
// CSC 160 Computer Science 1:
// August 9, 2021

package csc160Assignments;

public class ScoreTooHighException extends Exception{
	/**
	 * Decide to make my own exceptions for too high and too low scores. 
	 * This exception is for too high.
	 */

	private static final long serialVersionUID = 1L;

	public ScoreTooHighException() {
		super("Only numbers less than or equal to 100 are allowed. Please try again.");
	}
}
