// Austin Bennett
// CSC 160 Computer Science 1:
// August 9, 2021

package csc160Assignments;

import java.util.Scanner;

public class Final {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in); // Scanner to allow user input
		
		StudentScores ss = new StudentScores(); // Create the StudentScores object
		
		boolean done = false;
		boolean a1Set = false;
		boolean a2Set = false;
		boolean a3Set = false;
		boolean t1Set = false;
		boolean t2Set = false;
		boolean p1Set = false;
		
		while(!done) {
			
			/**
			 * Using a try/catch for invalid inputs. Throws exception if invalid.
			 * See exceptions down below.
			 */
			try {
				
				/**
				 * For each score attribute, I'm checking if they have already given me a valid input.
				 * So that the program doesn't ask them each score again and again.
				 * It will only ask for the score with the invalid input again.
				 */
				
				if (!a1Set) {
					System.out.println("Please enter your 1st assignment score: ");
					ss.setAssignment1(scr.nextDouble());
					a1Set = true;
				}
				
				if (!a2Set) {
					System.out.println("Please enter your 2nd assignment score: ");
					ss.setAssignment2(scr.nextDouble());
					a2Set = true;
				}
				
				if (!a3Set) {
					System.out.println("Please enter your 3rd assignment score: ");
					ss.setAssignment3(scr.nextDouble());
					a3Set = true;
				}
				
				if (!t1Set) {
					System.out.println("Please enter your 1st test score: ");
					ss.setTest1(scr.nextDouble());
					t1Set = true;
				}
				
				if (!t2Set) {
					System.out.println("Please enter your 2nd test score: ");
					ss.setTest2(scr.nextDouble());
					t2Set = true;
				}
				
				if (!p1Set) {
					System.out.println("Please enter your participation score: ");
					ss.setParticipationScore(scr.nextDouble());
					p1Set = true;
				}
				
				StudentGrade sg = new StudentGrade(ss); // Calls Constructor using the user's inputs through StudentScores
				
				double totalScore = sg.calculateScore(); // This is to prevent me from calling calculateScore twice.
				
				//The string format is to print the double with two decimal places.
				System.out.println("Your Total Score: " + String.format("%.2f", totalScore)); // Prints Final Score
				System.out.println("Your Final Grade: " + sg.calculateGrade(totalScore)); // Prints Grade Letter
				
			}
			/**
			 * Multiple exceptions:
			 * One to give ScoreTooLow message if the score is too low.
			 * Another to give ScoreTooHigh message if the score is to high.
			 * The last gives message if the user gives anything other then a number.
			 */
			catch(ScoreTooHighException sthe) {
				System.out.println(sthe.getMessage());
				continue;
			}
			catch(ScoreTooLowException stle) {
				System.out.println(stle.getMessage());
				continue;
			}
			catch(Exception ex) {
				System.out.println("Only numbers between 0 and 100 are allowed. Please try again.");
				scr.next();
				continue;
			}
			done = true;
		}
		scr.close();
	}

}