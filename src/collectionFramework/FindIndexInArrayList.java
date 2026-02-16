package collectionFramework;

import java.util.ArrayList;

public class FindIndexInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(25);
		numbers.add(30);
		numbers.add(45);
		numbers.add(25);
		numbers.add(60);
		
		System.out.println("List of numbers is: " + numbers);
		
		int targetElement = 25;
		findIndex(numbers, targetElement);
		
		findIndex(numbers, 45);
		
		findIndex(numbers, 55);
	}

	public static void findIndex(ArrayList<Integer> list, int target) {
		// TODO Auto-generated method stub
		int index = list.indexOf(target);
		
		if(index != -1) {
			System.out.println("Element " + target + " found at index: " + index);
		} else {
			System.out.println("Element " + target + " is not found in the list." );
		}
	}

}
