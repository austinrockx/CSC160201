// Austin Bennett
// CSC 160 Computer Science 1:
// June 24, 202

package csc160Assignments;
import java.util.Scanner;

public class ProgramAssignment4 {
	
	int rollCount = 0;
	int point = 0;
	
	// This is the random dice roll.
	public int diceRoll(int d) {
		return (int) (Math.random() * d) + 1;
	}
	
	//this is the sum of the two dice.
	public int sumofTwoDice() {
		int dice1 = diceRoll(6);
		int dice2 = diceRoll(6);
		int sum = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " and " + dice2 + " which is " + sum);
		return sum;
	}
	
	//This is the instant win scenario.
	public boolean instantWinScenario(int roll) {		
		if (roll == 7 || roll == 11) {
			System.out.println("Congratulations, you win!");
			System.out.println("");
			return true;
		}
		return false;
	}
	
	//This is the instant lose scenario.
	public boolean instantLoseScenario(int roll) {
		if (roll == 2 || roll == 3 || roll == 12) {
			System.out.println("Sorry, you crapped out. You lose!");
			System.out.println("");
			return true;
		}
		return false;
	}
	
	//This is the welcome message and the instructions.
	public void instructions() {
		System.out.println("Instructions:");
		System.out.println("For your first roll, if you roll a 7 or 11: You win");
		System.out.println("OR, for you first roll, if you roll a 2, 3 or 12: You lose");
		System.out.println("");
		System.out.println("If instead you roll anything else, that roll becomes your point.");
		System.out.println("Keep rolling until you roll your point again to win, or you roll a 7 to lose.");
	}
	
	//This resets rollCount and point back to 0.
	public void reset() {
		rollCount = 0;
		point = 0;
	}
	
	//This is to simulate the roll.
	public boolean roll() {
		rollCount++;
		
		int thisRoll = sumofTwoDice();
		
		if (rollCount == 1) {
			if (instantWinScenario(thisRoll)) {
				reset();
				return true;
			}
			if (instantLoseScenario(thisRoll)) {
				reset();
				return true;
			}
			point = thisRoll;
		}

		if (rollCount > 1 && thisRoll == 7) {
			System.out.println("Sorry, you crapped out. You lose!");
			System.out.println("");
			reset();
			return true;
		}
		
		if (rollCount > 1 && thisRoll == point) {
			System.out.println("Congratulations, you win!");
			System.out.println("");
			reset();
			return true;
		}

		System.out.println("Your point is " + point + "...good luck!");
		return false;
	}

	public static void main(String[] args) {
		ProgramAssignment4 pa4 = new ProgramAssignment4();
		
		System.out.println("Welcome to the Devil's game of: Craps/n"); //reference to Cuphead :).
		
		Scanner scr = new Scanner(System.in);
		System.out.println("R to roll, Q to quit, or I for instructions: ");
		
		while(true) {

			String start = scr.next();
			
			if(start.equalsIgnoreCase("r")) {
				
				//this is to check if the have played and won/lost.
				//it ask if the want to play again.
				boolean done = pa4.roll();
				if (done) {
					System.out.println("Would you like to try again?(y or n): ");
					System.out.println("");
					String tryAgain = scr.next();
					
					if(tryAgain.equalsIgnoreCase("y")) {
						System.out.println("R to roll, Q to quit, or I for instructions: ");
					}
					if(tryAgain.equalsIgnoreCase("n")) {
						System.out.println("Thanks for playing.  Goodbye!");
						scr.close();
						System.exit(0);
					}
				}
				continue;
			}
			
			//This is to quit.
			if(start.equalsIgnoreCase("q")) {
				System.out.println("Thanks for playing.  Goodbye!");
				scr.close();
				System.exit(0);
			}
			
			//This is to view instructions.
			if(start.equalsIgnoreCase("i")) {
				pa4.instructions();
				System.out.println("");
				System.out.println("R to roll, Q to quit, or I for instructions: ");
				continue;
			}
			
			System.out.println("");
			System.out.println("Sorry, I didn't recognize that input. Would you like to play?");
		}
		
		
	}

}
