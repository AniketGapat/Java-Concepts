package collectionFramework;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk= new Stack<>();  
		//pushing elements into Stack  
		stk.push("Mac Book");  
		stk.push("HP");  
		stk.push("DELL");  
		stk.push("Asus");  
		System.out.println("Stack: " + stk);  
		// Search an element  
		int location = stk.search("DELL");  
		System.out.println("Location of Dell: " + location); 
		
		//removing top element
		stk.pop();
		System.out.println("Stack: " + stk); 
		
		//retrieving top element
		System.out.println("Top element of stack is:" + stk.peek());
		
		System.out.println("Is stack empty: " + stk.isEmpty());
	}

}
