package collectionFramework;

import java.util.HashSet;

public class HashsetEqualityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<>();
		//set1.add("banana");  // It will get added in hashset as this is cases sensitive, allows value to add with different case
		set1.add("banana");
		set1.add("apple");
		set1.add("grapes");
		System.out.println("First Hashset is: " + set1);
		
		HashSet<String> set2 = new HashSet<>();
		set2.add("grapes");
		set2.add("banana");
		set2.add("apple");
		System.out.println("Second Hashset is: " + set2);
		
		if(set1.equals(set2)) {
			System.out.println("Both hashsets are equal");
		} else {
			System.out.println("Both hashsets are not equal");
		}
	}

}
