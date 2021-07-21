// Austin Bennett
// CSC 160 Computer Science 1:
// June 9, 2021

package csc160Assignments;
import java.util.Hashtable;
import java.util.Scanner;

public class midTerm {
	Hashtable<Integer, Double> grad = new Hashtable<Integer, Double>();
	Hashtable<Integer, Double> underGrad = new Hashtable<Integer, Double>();
	
	//This adds content to underGrad Hashtable based on if the type undergrad and whatever GPA they input.
	public void addToUndergradGPA(int i, double gpa ) {
		
		underGrad.put(underGrad.size() + 1, gpa);
	}
	
	//This calculates and returns the undergrad's average.
	public double getUndergrdAvg() {
		
		//This checks if the undergrad Hashtable's size is 0 then returns 0.0.
		if(underGrad.size() == 0) {
			return 0;
		}
		
		double sum = underGrad.values().stream().mapToDouble(Double::doubleValue).sum();
	    double average = sum / underGrad.size();
		
	    return average;
	}
	
	//This adds content to grad Hashtable based on if the type grad and whatever GPA they input.
	public void addToGradGPA(int i, double gpa ) {

		grad.put(grad.size() + 1, gpa);
	}
	
	//This calculates and returns the grad's average.
	public double getGradAvg() {
		
		//This checks if the grad Hashtable's size is 0 then returns 0.0.
		if(grad.size() == 0) {
			return 0;
		}
		
		double sum = grad.values().stream().mapToDouble(Double::doubleValue).sum();
	    double average = sum / grad.size();
		
	    return average;
	}

	public static void main(String[] args) {
		midTerm mt = new midTerm();
		
		Scanner scr = new Scanner(System.in);
		
		while(true) {
			
				System.out.print("Please enter the student type: 'undergrad', 'grad', or 'quit' to exit. ");
				String type = scr.next();
				
				if(type.equalsIgnoreCase("quit")) {

					System.out.println();
					System.out.println("Thank you");
					System.out.println("The average GPA of all undergrad students is: " + mt.getUndergrdAvg());
					System.out.println("The average GPA of all grad students is: " + mt.getGradAvg());
					scr.close();
					System.exit(0);
				}
				
				System.out.print("Please enter this undergrad's GPA: ");
				double gpa = scr.nextDouble();
				System.out.println();
				
				int i = 0;
				
				switch(type) {
				
				case "undergrad":
					mt.addToUndergradGPA(i++, gpa);
					continue;
					
				case "grad":
					mt.addToGradGPA(i++, gpa);
					continue;
				}
				
				System.out.print("Invalid Student Type. ");
		}
	}
}