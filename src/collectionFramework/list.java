package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class list {
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public static void addEle() {
		numbers.add(10);
		
		numbers.add(10);
		
		System.out.println(numbers.contains(10));
		System.out.println(numbers.contains(1));
		System.out.println(numbers.get(0));//getValue
		System.out.println(numbers.size());
		numbers.set(0, 20);//setValue
		System.out.println("First Ele after changing value:"+numbers.get(0));
		numbers.add(0, 30);//add value at 0th index
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(numbers);
		System.out.println("Sorted numbers:");
		for(int i:numbers) {
			System.out.println(i);
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Mango");
		strList.add("Apple");
		
		Iterator<String> itrt = strList.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
		
		Collections.sort(strList);
		System.out.println("Sorted string list:");
		for(String i:strList) {
			System.out.println(i);
		}
		//strList.clear();
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Aniket");
		nameList.add("Komal");
		
		//adding one arrayList into another
		nameList.addAll(strList);
        System.out.println(nameList);
        
        //clear an arrayList
        nameList.clear();
        
        System.out.println("After clearing one arraylist: "+nameList);
	}
	
	public static void main(String[] args) {
		addEle();
		
		//Creating user-defined class objects    
		  Student s1=new Student(101,"Sonoo",23);    
		  Student s2=new Student(102,"Ravi",21);    
		  Student s3=new Student(103,"Hanumat",25);   
		  
		  //creating arraylist    
		  ArrayList<Student> al=new ArrayList<Student>();    
		  al.add(s1);//adding Student class object    
		  al.add(s2);    
		  al.add(s3);    
		  
		  //Getting Iterator    
		  Iterator<Student> itr=al.iterator();    
		  //traversing elements of ArrayList object    
		  while(itr.hasNext()){    
		    Student st=(Student)itr.next();    
		    System.out.println(st.rollno+" "+st.name+" "+st.age);    
		  }  
		  
		  LinkedList<String> ll=new LinkedList<String>();  
          ll.add("Ravi");  
          ll.add("Vijay");  
          ll.add("Ajay");  
          //Traversing the list of elements in reverse order  
          Iterator<String> i=ll.descendingIterator();  
          while(i.hasNext()) {  
              System.out.println(i.next());  
          }  
          
          // Convert Array to List using array as list method
          String[] arr = {"A", "B", "C"};
          List<String> list1 = Arrays.asList(arr);
          System.out.println(list1);
          
       // Convert Array to List using iterator
          String[] array={"Java","Python","PHP","C++"}; 
          System.out.println(array);
          System.out.println("Printing Array: "+Arrays.toString(array));  
          //Converting Array to List  
          List<String> list=new ArrayList<String>();  
          for(String lang:array){  
          list.add(lang);  
          }  
          System.out.println("Printing List: "+list);
          
          // Convert List to Array
          String[] array1 = ll.toArray(new String[ll.size()]);
          System.out.println(Arrays.toString(array1));
          
          // Print list in forward and backward direction in index and value format
          List<String> al1=new ArrayList<String>();    
          al1.add("Amit");    
          al1.add("Vijay");    
          al1.add("Kumar");    
          al1.add(1,"Sachin");    
          ListIterator<String> itr1=al1.listIterator();    
          System.out.println("Traversing elements in forward direction");    
          while(itr1.hasNext()){    
                
          System.out.println("index:"+itr1.nextIndex()+" value:"+itr1.next());    
          }  
          
          System.out.println("Traversing elements in backward direction");    
          while(itr1.hasPrevious()){    
            
          System.out.println("index:"+itr1.previousIndex()+" value:"+itr1.previous());    
          }   
         
        //Comparable and Comparator interfaces for ordering of user-defined class
      	ArrayList<StudentList> als=new ArrayList<StudentList>();  
    	als.add(new StudentList(101,"Vijay",23));  
    	als.add(new StudentList(106,"Ajay",27));  
    	als.add(new StudentList(105,"Jai",21));  
    	  
    	System.out.println("Comparable Interface with Age");
    	Collections.sort(als);  
    	for(StudentList st:als){  
    	System.out.println(st.rollno+" "+st.name+" "+st.age);  
    	}
    	
    	System.out.println("Comparator Interface with Name");
    	Collections.sort(als,new NameComparator());
    	for(StudentList st:als){  
        	System.out.println(st.rollno+" "+st.name+" "+st.age);  
        	}
    	
    	System.out.println("Comparator Interface with Age");
    	Collections.sort(als,new AgeComparator());
    	for(StudentList st:als){  
        	System.out.println(st.rollno+" "+st.name+" "+st.age);  
        	}
    }
			
}

class Student{    
	  int rollno;    
	  String name;    
	  int age;    
	  Student(int rollno,String name,int age){    
	   this.rollno=rollno;    
	   this.name=name;    
	   this.age=age;    
	  }    
	}
