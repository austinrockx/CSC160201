package csc160Assignments;

public class Ch7 {

	public static void main(String[] args) {
		
		int[] counts = new int[10];
		
		for(int i = 0; i <= 100; i++){
			counts[(int)(Math.random() * 10)]++;
		}
		for(int j = 0; j < counts.length; j++) {
			System.out.println("Count for " + j + " is " + counts[j]);
		}

	}
}
