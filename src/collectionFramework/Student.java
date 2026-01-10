package collectionFramework;

import java.util.Comparator;

class StudentList implements Comparable<StudentList> {
	int rollno;  
	String name;  
	int age;  
	StudentList(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  
	public int compareTo(StudentList st){  
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
	}
	
}

class AgeComparator implements Comparator<StudentList>{  
@Override
public int compare(StudentList o1, StudentList o2) {
	// TODO Auto-generated method stub
	StudentList s1=(StudentList)o1;  
	StudentList s2=(StudentList)o2;  
	if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
		}
	
}  

class NameComparator implements Comparator<StudentList>{  
public int compare(StudentList o1, StudentList o2){  
	StudentList s1=(StudentList)o1;  
	StudentList s2=(StudentList)o2;  
  
return s1.name.compareTo(s2.name);  
}  
}  
