package Listsconcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//it is similar to HashMap but it is synchronised.
		//stores value as key and value.
		//key is specified as an object-->each n every object has an HashCode--> value is stored.
		//HashCode-->whenever any object is created, java provides a particular HashCodenumber(which is 32 bit int) for that object.
		// When 2 object are same, then same HashCode number will be assigned to both object.
       //synchronised-->Thread safe-->as at a  time only 1 thread will access the object.
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Com");
		h1.put(3, "Rom");
		h1.put(4, "Mom");
		
		//How to create a known copy of hashtables---
		Hashtable h2 = new Hashtable();
		h2=(Hashtable)h1.clone();	
		
		System.out.println("The valuse from h1"+h1);
		System.out.println("The valuse from h2"+h2);
		
		//To clear value:
		h1.clear();
		System.out.println("The valuse from h1"+h1);
		System.out.println("The valuse from h2"+h2);
		
		//Contains value:
		Hashtable h3 = new Hashtable();
		h3.put("a", "Naveen");
		h3.put("b", "Manager");
		h3.put("c", "Varsha");
		
		if(h3.contains("Naveen")) {
			System.out.println("FOund");
			{
				
		//print all values from Hashtable using ---Enumeration--elements()
				Enumeration e=h3.elements();
				System.out.println("print values fro h3");
				while(e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}
				
				//get all values from Hashtable using entrySet()--
				System.out.println("enetry");
			    Set S=	h3.entrySet();	
			    System.out.println(S);
			    
			    //to check both hashtables are equal or not---so to do this create one more hashtable with same values--
			    Hashtable h4 = new Hashtable();
				h4.put("a", "Naveen");
				h4.put("b", "Manager");
				h4.put("c", "Varsha");// it prints only unique values, here it prints varsha once only
				h4.put("c", "Varsha");
				//no null key and null values.
				//h4.put(null, "Varsha");----gives NullPointerException---but in Hashmap it is possible
				//h4.put("d", null);----gives NullPointerException
				
				if(h3.equals(h4)) {
					System.out.println("equal");
					
					//get the value from a key--
					System.out.println(h4.get("a"));
					
					//get the hashcode of hashtable object---
					System.out.println("the hashcode value of h4 is :" +h4.hashCode());
//
					}
				}
		
				
			}
					
			
			}
		}
	

