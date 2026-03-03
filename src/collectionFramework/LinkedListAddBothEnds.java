package collectionFramework;

import java.util.LinkedList;

public class LinkedListAddBothEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Pune");
		System.out.println("List before adding: " + cities);
		
		cities.addFirst("Dharashiv");
		cities.addLast("Banglore");
		System.out.println("List after adding at both ends: " + cities);
		
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
//		numbers.add(60);
		
		int middleElement = getMiddle(numbers);
		
		System.out.println("Middle element is: " + middleElement);
	}

	public static int getMiddle(LinkedList<Integer> list) {
		// TODO Auto-generated method stub
		if(list.size()== 0) {
			return -1;
		}
		
		int middleIndex = list.size() /2;
		return list.get(middleIndex);
	}

}
