// Austin Bennett
// CSC 160 Computer Science 1:
// July 21, 2021

package csc160Assignments;

public class Program8 {

	public static void main(String[] args) {
		Queue Q = new Queue(20);
		
		//I did try to have one loop to add, print, and then remove the elements 
		// but errors aroused.
		
		//First for loop to add elements to the Queue
		for(int i = 0; i < 20; i++) {
			Q.enqueue(i + 1);
		}
		
		//Prints the elements in the Queue
		Q.printQueueContents();
		
		//Second for loop to remove the elements of the Queue
		for (int i = 0; i < Q.getSize(); i++) {
			Q.dequeue(i);
		}
		
		//Checks the removal of the elements was successful and the Queue is empty
		if (Q.isEmpty()) {
			System.out.print("\nThe Queue is Empty");
		}

	}

}
