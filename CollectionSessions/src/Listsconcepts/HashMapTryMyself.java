package Listsconcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTryMyself {

	public static void main(String[] args) {
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		hm.put(0, true);
		hm.put(1, false);
		hm.put(2, false);
		hm.put(3, true);
		System.out.println(hm.get(1));
		for(int i=0; i<hm.size(); i++) {
			System.out.println(hm);
			
			System.out.println("************");
			
			for(Entry m : hm.entrySet()) { 
			System.out.println(m.getKey() + " " + m.getValue());	
			}
			System.out.println("*********");	
			Employee e = new Employee("Pinkey", 26, "ECE") ;
			Employee e1 = new Employee("Kajal", 26, "ECE") ;	
			
			HashMap<Integer, Employee> hm1 = new HashMap();
			hm1.put(1, e);
			hm1.put(2, e1);
			for( Entry <Integer, Employee> k: hm1.entrySet()) {
				int n=k.getKey();
				Employee m = k.getValue();
				System.out.println(n + "info");
				System.out.println(e.name + " "+ e.age + " " + e.dept);
				
				
			
				
			}
		}
		
	}

}
