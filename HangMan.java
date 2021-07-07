// Austin Bennett
// CSC 160 Computer Science 1:
// July 9, 2021

package csc160Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
	
	List<String> wordArray = new ArrayList<String>();

	public ArrayList<String> fileTextArray = new ArrayList<String>();
	public StringBuilder newWord = new StringBuilder();	
	public int missedletters = 0;
	public String currentWord = "";
	public String inPlayWord = "";
	
	public String outPlayAgain = "Do you want to play again? Enter y or n:";
	public String outGuess = "(Guess) Enter a letter in the word %s: ";
	public String outNotThere = "%s is not in the word.";
	public String outWordIs = "The word is %s.";
	public String outMissed = "You missed %o times.";
	
	//This loads all the words into the wordArray array.
	//It also checks if the length of the array is 0 when they guess all the words.
	public String[] loadWords() {
		if (wordArray.isEmpty()) {
			wordArray.add("excellent");
			wordArray.add("hang");
			wordArray.add("crabs");
			wordArray.add("latin");
			wordArray.add("coin");
		}
		if (wordArray.isEmpty()) {
			return null;
		}
		
		return wordArray.stream().toArray(String[]::new);
	}

	//This gets the random word from the array.
	public StringBuilder getRandomWord() {
		StringBuilder builder = new StringBuilder();
		Random rand = new Random();
		
		currentWord = inPlayWord = loadWords()[rand.nextInt(loadWords().length)];
		builder.append(updateInPlayWord('\0'));
		
		return builder;
	}

	//This replace the asterisks with the correct letter.
	public StringBuilder updateInPlayWord(char g) {

		char[] word = currentWord.toCharArray();
		char[] inPlay = inPlayWord.toCharArray();
		
		for (int i = 0; i < word.length; i++) {
			if (g == '\0' && currentWord == inPlayWord) {
				newWord.append("*");
				continue;
			}
			if (word[i] == g) {
				newWord.append(g);
				continue;
			}
			newWord.append(inPlay[i]);
		}
		
		return newWord;
	}
	
	//This remove the played word from wordArray.
	public void removeWord(String word) {
		wordArray.remove(word);
	}
	
	//This load all the words from a file into wordArray.
	public void loadWordsFromFile(String word) throws FileNotFoundException {
		Scanner scr = new Scanner(new File("filepath"));
		while (scr.hasNext()) {
			wordArray.add(scr.next());
		}
	}
	
	//This tests if the letter is in the word.
	public boolean testLetter(String letter) {
		return currentWord.indexOf(letter) > -1;
	}
	
	public static void main(String[] args) {
		HangMan hm = new HangMan();
		Scanner scr = new Scanner(System.in);
		
		hm.loadWords();
		StringBuilder sb = hm.getRandomWord();
		
		while(true) {
			System.out.println(String.format(hm.outGuess, sb));
			String guessLetter = scr.next();
			
			if (hm.testLetter(guessLetter)) {
				hm.updateInPlayWord(guessLetter.charAt(0));
				hm.missedletters++;
			}else {
				System.out.println(String.format(hm.outNotThere, guessLetter));
				continue;
			}
			if (hm.newWord.equals(hm.inPlayWord)) {
				System.out.println(String.format(hm.outWordIs, hm.inPlayWord));
				System.out.println(String.format(hm.outMissed, hm.missedletters));
				System.out.println(String.format(hm.outPlayAgain));
				String playAgain = scr.next();
				
				if(playAgain.equals("y")) {
					System.out.println(String.format(hm.outGuess, sb));
				}
				if(playAgain.equals("n")) {
					System.out.println("Thanks for playing.  Goodbye!");
					scr.close();
					System.exit(0);
				}
			}
		}
	}
}