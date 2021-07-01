// Austin Bennett
// CSC 160 Computer Science 1:
// June 29, 2021

package csc160Assignments;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramAssignment5 {
	
	//This cleans up the string by removing anything that is not a # or letter.
	public String clean(String num) {
		return Pattern
				.compile("[^a-zA-Z0-9_]")
				.matcher(num)
				.replaceAll("");
	}
	
	//This checks the length of the phone number to verify if its 11.
	public boolean phoneNumberLength(String num) {
		return num.length() == 11;
	}
	
	//This tests if the character at the start of the string is a 1.
	public boolean startsWithOne(String num) {
		return num.charAt(0) == '1';
	}
	
	//This tests if the area code is numeric.
	public boolean hasAreaCode(String num) {
		try {
	        Integer.parseInt(num.substring(1, 3));
	        return true;
	    } catch (NumberFormatException ex) {
	        return false;
	    }
	}
	
	//This tests if there is 7 digits after the area code.
	public boolean hasSevenDigitPhoneNumber(String num) {
		String subNum = num.substring(4);
		return subNum.length() == 7;
	}
	
	//This compiles all the test methods to verify the number.
	public boolean isVaildPhoneNumber(String num) {
		
		boolean isValid = true;
		
		if(!phoneNumberLength(num)) {
			System.out.println("Your phone number needs to be 11 digits.");
			isValid = false;
		}
		
		if(!startsWithOne(num)) {
			System.out.println("You need to have a 1 and the start of the number.");
			isValid = false;
		}
		
		if(!hasAreaCode(num)) {
			System.out.println("You need an area code of 3 digits for your number.");
			isValid = false;
		}
		
		if(!hasSevenDigitPhoneNumber(num)) {
			System.out.println("You need to have 7 digits or characters after the area code.");
			isValid = false;
		}
		
		return isValid;
	}
	
	//This converts the letters in the phone number into numbers.
	public int getNumber(char ch) {

		if (Character.isDigit(ch)) {
			return Character.getNumericValue(ch);
		}
		
		switch(ch) {
			case 'A': case 'B': case 'C': return 2;
			case 'D': case 'E': case 'F': return 3;
			case 'G': case 'H': case 'I': return 4;
			case 'J': case 'K': case 'L': return 5;
			case 'M': case 'N': case 'O': return 6;
			case 'P': case 'Q': case 'R': case 'S': return 7;
			case 'T': case 'U': case 'V': return 8;
			case 'W': case 'X': case 'Y': case 'Z': return 9;
		}
		return -1;
	}
	
	//This takes the inputed phone number and converts to the numeric phone number.
	public String translateNumber(String num) {

        String newPhoneNumber = num.substring(0, 4);

        char[] ch = num.toCharArray();
        for(int i = 4; i < ch.length; i++) {
        	newPhoneNumber += getNumber(ch[i]);
        }
        
		return newPhoneNumber;
	}
	
	//This takes the numeric string and inputs the -'s. Extra Credit.
	public String format(String num) {
		return String.valueOf(num).replaceFirst("(\\d{1})(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3-$4");
	}
	
	public static void main(String[] args) {
		ProgramAssignment5 pa5 = new ProgramAssignment5();
		
		Scanner scr = new Scanner(System.in);
	
		while(true) {
			System.out.print("Enter a phone number string: ");
			String phoneNumber = scr.next().toUpperCase();
			
			String cleanNumber = pa5.clean(phoneNumber);
			
			if (pa5.isVaildPhoneNumber(cleanNumber)) {
				String newPhoneNumber = pa5.translateNumber(cleanNumber);
		        System.out.println(pa5.format(newPhoneNumber) + "\n");
		        scr.close();
				System.exit(0);
			}else {
				System.out.println("Please try again. \n");
				continue;
			}
		}
	}
}