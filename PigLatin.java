package csc160Assignments;

import java.util.Scanner;

public class PigLatin {
	
	// returns all the vowels as characters
			public boolean isVowel(char v) {
				 return (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U');
			}
			
			// makes the pig latin word
			public String pigLatin(String p) {
				
				int index = -1;
				for (int i = 0; i < p.length(); i++) {
					if(isVowel(p.charAt(i))) {
						index = i;
				        break;
					}
					
				}
				// used substring for one of two consonants
				return p.substring(index) + p.substring(0, index) + "yay";
			}

			public static void main(String[] args) {
				PigLatin pa3 = new PigLatin();
				
				while(true) {
				
					Scanner pL = new Scanner(System.in);
					System.out.print("Enter a word to translate Or Enter Bye to stop: ");
				
					// put in try/catch just in case user inputs something other then a word.
					try {
						String word = pL.nextLine();
						
						if (word.equals("Bye")) {
							System.out.print("Bye, Thanks for playing");
							pL.close();
							System.exit(0);
						}

						if(word.equalsIgnoreCase(word)) {
							System.out.print(pa3.pigLatin(word) + "\n");
						}
					}
					catch (Exception e) {
						System.out.println("Your word is invalid. Try Again");
					}
				}
			}

	}
