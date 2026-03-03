package collectionFramework;

public class StackUsingTwoArrays {
	private int[] dataArray; // Array to hold the stack data
	private int[] indexArray; // auxiliary array to track stack indexes
	private int capacity; // maximum size of the stack
	private int currentSize; // Current size of the stack
	private int topIndex; // Index of the top element of the stack
	
	public StackUsingTwoArrays(int capacity){
		this.capacity = capacity; 
		this.dataArray = new int[capacity]; // allocate space for data
		this.indexArray = new int[capacity]; // allocate space for index tracking
		this.currentSize = 0; // no elements in stack yet
		this.topIndex = -1; // no top element initially
	}
	
	// push an element into the stack
	public void push(int value) {
		if(currentSize >= capacity) {
			System.out.println("stack Overflow: Unable to push, stack is full.");
			return;
		}
		//Increment top index and add  value to the dataArray
		topIndex++;
		dataArray[topIndex] = value;
		indexArray[topIndex] = topIndex;
		currentSize++;
		System.out.println("Pushed "+ value + " onto the stack.");
	}
	
	public int pop() {
		if(currentSize == 0) {
			System.out.println("Stack underflow: unable to pop, stack is empty");
			return -1;
		}
		int popValue = dataArray[topIndex];
		topIndex--;
		currentSize--;
		System.out.println("Popped " + popValue + " from the stack.");
		return popValue;
	}
	
	public int peek() {
		if(currentSize == 0) {
			System.out.println("Stack underflow: unable to peek, stack is empty");
			return -1;
		}
		System.out.println("Top element is " + dataArray[topIndex]);
		return dataArray[topIndex];
	}
	
	public boolean isEmpty() {
		return currentSize==0;
	}
	
	public int size() {
		return currentSize;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingTwoArrays stack = new StackUsingTwoArrays(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.peek();
		
		stack.pop();
		stack.pop();
		
		System.out.println("is stack Empty: " + stack.isEmpty());
		
		stack.pop();
		System.out.println("is stack Empty: " + stack.isEmpty());
		
		stack.push(40);
		stack.push(50);
		
		System.out.println("Current size of the stack is: " + stack.size());
	}

}
