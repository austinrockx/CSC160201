package csc160Assignments;

import java.util.Random;
import java.util.Scanner;

public class RPS {
	
	// to keep score for player.
		int playerScore = 0;
		int computerScore = 0;
		
		public enum RPC {
			ROCK, PAPER, SCISSOR
		}
		
		public RPC GetRandomRPC() {
			Random gen = new Random();
			return RPC.values()[gen.nextInt(3)];
		}
		
		public int Results (RPC player, RPC computer) {
			
			// Check if it's a draw.
			if (computer == player) {
				System.out.println("It's a tie!");
				return 0;
			}
			

			// Check if the player lost.
			switch (player) {
				case ROCK:
					if (computer == RPC.PAPER) {
						System.out.println("You lost.");
						++computerScore;
						return -1;
					}
				case PAPER:	
					if (computer == RPC.ROCK) {
						System.out.println("You lost.");
						++computerScore;
						return -1;
					}
				case SCISSOR:	
					if (computer == RPC.ROCK) {
						System.out.println("You lost.");
						++computerScore;
						return -1;
					}
			}
			
			// Otherwise the player won.
			System.out.println("You WIN!");
			++playerScore;
			return 1;
		}
		
		public static void main(String[] args) {
			
			// to use the methods: Results, GetRandomRPC, and the enum RPC.
			RPS pa3 = new RPS();
			
			while (true) {
			
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter a number: rock (0), paper (1), scissor (2).  Or, Close the program (3). : ");
				
				// It's in a try catch, just in case they put in anything other then the 0, 1, 2, 3.
				try {
					int userInput = scan.nextInt();
					
					if (userInput == 3) {
						System.out.println("Thanks for playing.  Goodbye!");
						scan.close();
						System.exit(0);
					}
					
					RPC player = RPC.values()[userInput];
					RPC computer = pa3.GetRandomRPC();

					System.out.println("\nYou are: " + player);
					System.out.println("The computer is: " + computer);
					pa3.Results(player, computer);
					System.out.println("");
					System.out.println("SCORE - You: " + pa3.playerScore + "  Computer: " + pa3.computerScore);
					System.out.println("");
					
				}
				catch (Exception e) {

					System.out.println("");
					System.out.println("Sorry. I didn't recognize that input.  Please try again.");
					
				}
				
				
			}
		}
}
