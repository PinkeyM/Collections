package Listsconcepts;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HaspMap is a class that implements Map Interface
		//it inherits/extends abstract class
		//it contains only unique elements.
		//stores value in format of key and value pair/
		//it may have one null key and store multiple null values.
		//it maintains no order.
		//Hashmap is not synchronised- not thread safe***************************
		
		HashMap <Integer, String> hm= new HashMap<Integer, String>();
		hm.put(20, "Pinkey");
		hm.put(21, "Kajal");
		hm.put(23, "Varsha");
		hm.put(24, "RFT");
		
		System.out.println(hm.get(21));
	    System.out.println(hm.get(0));//this gives null output as hasmap doesnt store value in indexes.
	    
	    for(Entry m : hm.entrySet()) {
	    	System.out.println(m.getKey()+ " " + m.getValue());
	    }
	    //remove
	    System.out.println("***********" +hm);
	    hm.remove(20);// remove does not shift the index .
	    System.out.println(hm);
	    
	    // how to create Hashmap using emplyee class em
	    System.out.println("***********" +"Using eployeeeeee");
	    Employee em1= new Employee("Pinkey", 26, "ECE");
	    Employee em2= new Employee("Rinkey", 27, "ECE");
	    Employee em3= new Employee("Vinkey", 28, "ECE");
	    HashMap <Integer, Employee > hm1 = new HashMap<Integer, Employee>();
	    hm1.put(1, em1);
	    hm1.put(2, em2);
	    hm1.put(3, em3);
	    //System.out.println(hm1);
	    for(Entry <Integer, Employee> m: hm1.entrySet()) {
	    	//System.out.println(m);
	    	int key= m.getKey();
	    	Employee e=m.getValue();
	    	
	    	System.out.println(key + "info");
	    	System.out.println(e.name + " "+ e.age + " " + e.dept);   	
	    	
	    	
	    }
	  //Hasmap is not synchronised- not thread safe*
	    //Disadvantage of HashMap:What is concurrent modification exception:called fail fast condition
	    //when one thread is adding/removing a value and at same time concurrently thread T1 and T2 is also trying to access that 
	    //particular value, but that particular value is gone from the object. it will give this above error.
	    
	//    Difference between Hashtable and Hashmap:
	    	//Hasmap is not synchronised-whereas Hashtable is synchhronised
	    
	}

}
