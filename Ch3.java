package csc160Assignments;

import java.util.Scanner;

public class Ch3 {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 while (true) {
		      System.out.print("Please enter 0 for heads, 1 for tails: ");
		      int call = input.nextInt();
		      int heads = 0;
		      int tails = 1;

		      // This is to see if you put in a input with a length less than 1,
		      //the program will end.
		      // It also works if you put in nothing.
		      if(call > 1){
		            break;
		        }
		      
		        int random = (int)(Math.random()*2); //to produce the random number

		        if(random < 1){ //assume that, if random variable is smaller than 1 then it is head. If bigger than 1 and smaller than 2, then tails.
		            if(heads == call){
		                System.out.println("The coin came up heads. You win!");
		            }
		            else{
		                 System.out.println("Sorry, incorrect.");
		            }
		        }else{
		            if(tails == call){
		                System.out.println("The coin came up tails. You win!");
		            }
		          else{
		               System.out.println("Sorry, incorrect.");
		          }
		      }

		  }
	 }

}
