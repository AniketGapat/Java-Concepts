package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveGreaterThanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(3);
		list.add(9);
		list.add(15);
		list.add(2);
		list.add(10);
		list.add(12);
		
		int value = 10;
		
		removeGreaterThan(list, value);

	}

	public static void removeGreaterThan(ArrayList<Integer> list, int value) {
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int current = it.next();
			if(current > value) {
				it.remove();
			}
		}
		System.out.println("updated list after removing values greater than '" + value + "' is: " + list);
	}

}
