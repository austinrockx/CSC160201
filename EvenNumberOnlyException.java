package csc160Assignments;

public class EvenNumberOnlyException extends Exception {
	
	public EvenNumberOnlyException() {
		super("You can only enter even numbers.");
	}
}
