// Austin Bennett
// CSC 160 Computer Science 1:
// July 21, 2021

package csc160Assignments;

import java.util.ArrayList;

public class Queue {
	
	//Its easier to add and remove items from an ArrayList then an Array.
	private ArrayList<Integer> numbersForQueue = new ArrayList<Integer>();
	private int defaultSizeOfQueue = 8;// I made the default size 8.
	
	public Queue() {
		numbersForQueue.ensureCapacity(defaultSizeOfQueue);;
	}
	
	public Queue(int capacity) {
		numbersForQueue.ensureCapacity(capacity);;
	}
	
	public void enqueue(int num) {
		numbersForQueue.add(num);
	}
	
	public int dequeue(int num) {
		numbersForQueue.remove(num);
		return num;
	}
	
	public boolean isEmpty() {
		if (numbersForQueue.size() == 0) {
			return false;
		}
		return true;
	}
	
	public int getSize() {
		return numbersForQueue.size();
	}
	
	//Made another method to easily print the elements in a more fancy way.
	public void printQueueContents() {
		for (int i = 0; i < numbersForQueue.size(); i++) {
			System.out.println("The Queue Element: " + numbersForQueue.get(i));
		} 
	}
	
}
