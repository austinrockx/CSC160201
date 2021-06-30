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
		String regexClean = "[^a-zA-Z0-9_]";
		Pattern clean = Pattern.compile(regexClean);
		Matcher matcher = clean.matcher(num);
		
		String cleanNum = matcher.replaceAll("");;
		return cleanNum;
	}
	
	//This checks the length of the phone number to verify if its 11.
	public boolean minimumLength(String num) {
		return num.length() == 11;
	}
	
	//This tests if the character at the start of the string is a 1.
	public boolean startsWithOne(String num) {
		return num.charAt(0) == '1';
	}
	
	//This tests if the area code is numeric.
	public boolean hasAreaCode(String num) {
		try
	    {
			String subNum = num.substring(1, 3);
	        Integer.parseInt(subNum);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}
	
	//This tests if there is 7 digits after the area code.
	public boolean hasSevenDigitPhoneNumber(String num) {
		String subNum = num.substring(4,11);
		return subNum.length() == 7;
	}
	
	//This compiles all the test methods to verify the number.
	public boolean isVaildPhoneNumber(String num) {
		
		if(minimumLength(num) == false) {
			System.out.println("Your phone number needs to be 11 digits");
			return false;
		}
		
		if(startsWithOne(num) == false) {
			System.out.println("You need to have a 1 and the start of the number.");
			return false;
		}
		
		if(hasAreaCode(num) == false) {
			System.out.println("You need an area code of 3 digits for your number.");
			return false;
		}
		
		if(hasSevenDigitPhoneNumber(num) == false) {
			System.out.println("You need to have 7 digits or characters after the area code");
			return false;
		}
		
		return true;
	}
	
	//This converts the letters in the phone number into numbers.
	public int getNumber(char num) {
		 switch(num) {
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
		
		
		return null;
	}
	
	//This takes the numeric string and inputs the -'s. Extra Credit.
	public String format() {
		return null;
	}
	
	public static void main(String[] args) {
		ProgramAssignment5 pa5 = new ProgramAssignment5();
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter a phone number string: ");
		String phoneNumber = scr.next();
		
		pa5.clean(phoneNumber);
		System.out.print(pa5.clean(phoneNumber) + "\n");
		
		pa5.isVaildPhoneNumber(pa5.clean(phoneNumber));
	}

}