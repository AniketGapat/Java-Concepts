package collectionFramework;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class map {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(6, "green");
		map.put(null, "blue");
		map.put(1, null);
		map.put(2, "white");
		map.put(2, "red");
		map.put(3, "red");
		map.putIfAbsent(4, "orange");
		
		for(Map.Entry<Integer,String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		} 
		
		map.remove(3);  
	    System.out.println("Updated list of elements: "+map); 
		
	    map.replace(2, "black");
	    System.out.println("Updated list of elements: "+map);
	    
		Map<Integer, String> studentMap = new HashMap<>();  
        // Adding some student records to the HashMap  
        studentMap.put(1001, "John Smith");  
        studentMap.put(1002, "Emily Brown");  
        studentMap.put(1003, "Michael Johnson");  
        // Retrieving and printing a student's name based on their ID  
        int studentIdToFind = 1002;  
        String studentName = studentMap.get(studentIdToFind);  
        if (studentName != null) {  
            System.out.println("Student with ID " + studentIdToFind + " is: " + studentName);  
        } else {  
            System.out.println("Student with ID " + studentIdToFind + " not found.");  
        }  
        // Iterating over the entries of the HashMap and printing each key-value pair  
        System.out.println("Student Records:");  
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {  
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());  
        }  
        // Checking if a student ID exists in the HashMap  
        int idToCheck = 1004;  
        boolean exists = studentMap.containsKey(idToCheck);  
        System.out.println("Student with ID " + idToCheck + " exists in records: " + exists); 
        
        studentMap.putAll(map);
        System.out.println("After invoking putAll() method ");  
        for(Map.Entry<Integer,String> m:studentMap.entrySet()){    
             System.out.println(m.getKey()+" "+m.getValue());    
            } 
        
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>();
		
		lmap.put(1, null);
		lmap.put(5, null);
		lmap.put(2, "red");
		lmap.put(4, "orange");
		lmap.put(3, "yellow");
		lmap.put(null, "yellow");
	
		for(Map.Entry<Integer,String> m : lmap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		} 
		
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		
		tmap.put(1, null);
		tmap.put(1, null);
		tmap.put(4, "orange");
		tmap.put(2, "red");
		tmap.put(3, "red");
	//	tmap.put(null, "yellow"); //giving null pointer exception
		tmap.put(100,"Amit");
		tmap.put(102,"Ravi");    
        tmap.put(101,"Vijay");    
	    tmap.put(103,"Rahul"); 
		for(Map.Entry<Integer,String> m : tmap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		} 
		
		System.out.println("descendingMap: "+tmap.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+tmap.headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+tmap.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+tmap.subMap(100, false, 102, true)); 
	      
	}
}
