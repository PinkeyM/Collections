package Listsconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		int a[]= new int[3];//static array as the size is fixed here, so if we want to get the 5th value it will give an error.
// so to resolve this we use Dynamic array,ie, arraylist (collection). Here we need to create an object of arraylist.
		ArrayList ar= new ArrayList();// object i have created like ar
		// properties of arraylist: contains duplicate values, it insert value in insertion order0,1,2...., 
		//its not synchronized
		//allows randoma ccess to fetch elements because it stores value on basis of indexes.
		// non-generic arraylist object.Here we can see yellow color warnig is there because havent defined which data type below.
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2... means size is 3
		ar.add(40);
		ar.add(40);
		System.out.println(ar.size());// size of arraylist, 
		//so dynamic in nature we don't define any size, whenever we need to add we can more values
		System.out.println(ar.get(4));//ar.get() we can get random value.
		//if we want to print all values from arraylist-1. For loop. whenever any collection is there in java and if we want to retrive all
		//values because for loop store vaaues in indexes.
		//For loop
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		//non generics vs generics
		//generics: available after jdk 1.5- 
		
		//Generics arraylist object.
		ArrayList <Integer>ar1=new  ArrayList<Integer>();//Here <> is generic and we can define any data type inside.
		ar1.add(100);
		//ar1.add(e;)// here we cannot enter any string or any other data type value.
		
		ArrayList <String>ar2 = new ArrayList<String>();
		ar2.add("e");
		
		//when we are not sure what data type we need to pass in, so in that case we use E.
		//ArrayList <E>ar4 = ArrayList<E>();
		//******************************************************************************************************
		//create an object for Employee class
		Employee em= new Employee("Pinkey", 20, "QA");
		Employee em1= new Employee("Kajal", 40, "PA");
		Employee em2= new Employee("Varsha", 29, "SA");
		//Create arraylist
		ArrayList <Employee> ar6= new ArrayList<Employee>();
		ar6.add(em);
		ar6.add(em1);
		ar6.add(em2);
		// Iterator to traverse the values.
		Iterator <Employee> it= ar6.iterator();// Interview: how to define user defined class arraylist
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		
			
		}
		//**********************************************************************************************************************
		
		//addAll method----to merge 2 array list.
		ArrayList<String> ar8= new ArrayList<String>();
		ar8.add("Pinkey");
		ar8.add("Kajal");
		
		ArrayList <String >ar9= new ArrayList<String>();
		ar9.add("Bikash");
		ar9.add("Kaju");
		
		ar8.addAll(ar9);// added all value from ar9 to ar8
		
		for (int i=0; i<ar8.size(); i++) {
			System.out.println(ar8.get(i));
			Collections.sort(ar8);
			System.out.println("****************");
			System.out.println(ar8.get(i));
		}
		
		
	}

}
