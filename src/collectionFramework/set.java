package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		hSet.add(2);
		hSet.add(3);
		hSet.add(2);//it allows but will not add duplicate value
		hSet.add(null);
		hSet.add(null);//does not allow to add more than one null value
		System.out.println(hSet.size());
		
		Iterator<Integer> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		HashSet<String> set=new HashSet<String>();    
        set.add("Ravi");    
        set.add("Vijay");    
        set.add("Arun");    
        set.add("Sumit");    
        System.out.println("An initial list of elements: "+set);    
        //Removing specific element from HashSet    
        set.remove("Ravi");    
        System.out.println("After invoking remove(object) method: "+set);    
        HashSet<String> set1=new HashSet<String>();    
        set1.add("Ajay");    
        set1.add("Gaurav");    
        set.addAll(set1);    
        System.out.println("Updated List: "+set);    
        //Removing all the new elements from HashSet    
        set.removeAll(set1);    
        System.out.println("After invoking removeAll() method: "+set);    
        //Removing elements on the basis of specified condition    
        set.removeIf(str->str.contains("Vijay"));      
        System.out.println("After invoking removeIf() method: "+set);    
        //Removing all the elements available in the set    
        set.clear();    
        System.out.println("After invoking clear() method: "+set);  
        
		LinkedHashSet<Integer> lhSet = new LinkedHashSet<Integer>();
		lhSet.add(20);
		lhSet.add(null);
		lhSet.add(null);
		lhSet.add(21);
		lhSet.add(45);
		lhSet.add(null);
		lhSet.add(100);
		System.out.println(lhSet.size());
		
		Iterator<Integer> itrt = lhSet.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(20);
		//tSet.add(null);
		
		tSet.add(45);
		tSet.add(45);
		
		tSet.add(30);

		//tSet.add(null);
		
		System.out.println(tSet.size());
		
		Iterator<Integer> itrtr = tSet.iterator();
		while(itrtr.hasNext()) {
			System.out.println(itrtr.next());
		}
		
		TreeSet<String> tset=new TreeSet<String>();  
        tset.add("A");  
        tset.add("B");  
        tset.add("C");  
        tset.add("D");  
        tset.add("E");  
        System.out.println("Initial Set: "+tset);  
          
        System.out.println("Reverse Set: "+tset.descendingSet());  
          
        System.out.println("Head Set: "+tset.headSet("C", true));  
        System.out.println("Head Set: "+tset.headSet("C"));
        
        System.out.println("SubSet: "+tset.subSet("A", false, "E", true));  
        System.out.println("SubSet: "+tset.subSet("A", "E"));
        
        System.out.println("TailSet: "+tset.tailSet("C", false));  
        System.out.println("TailSet: "+tset.tailSet("C"));
  
	}
}
