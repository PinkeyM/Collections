package Listsconcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList <String> ll= new LinkedList<String>();
		ll.add("Pinkey");
		ll.add("Kajal");
		ll.add("Key");
		ll.add("chcek");
		ll.add("man");
		//print
		System.out.println("print all" + ll);
		
		//addfirst:
		ll.addFirst("Start");
		ll.addLast("Last");
		System.out.println("print all" + ll);
		
		//get the value:
		System.out.println(ll.get(0));
		System.out.println(ll.get(3));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		//set the value:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		//how to print all values of linked list-
		//1. for loop
		System.out.println("Using for loop");
		for (int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		//2. Advance for loop
		System.out.println("Using for advanced loop");
		for(String str : ll) {
			System.out.println(str);
		}
		
		//3. Iterator
		System.out.println("Using for Iterator loop");
		Iterator <String> it = ll.iterator() ;
		while (it.hasNext());
		System.out.println(it.next());
			
		}
		//4. While loop
	    
		
		//*********************************************
		
		
	}


