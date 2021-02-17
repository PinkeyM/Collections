package Listsconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		samplecons obj1= new samplecons(10, 20,"Pinkey");
		samplecons obj2= new samplecons(10, 20,"Pinkey");
		samplecons obj3= new samplecons(10, 20,"Pinkey");

		ArrayList <samplecons> ar1 = new ArrayList<samplecons>();
		ar1.add(obj1);
		ar1.add(obj2);
		ar1.add(obj3);
		
		Iterator<samplecons> it = ar1.iterator();
		while(it.hasNext()) {
			samplecons sa =it.next();
			System.out.println(sa.num);
			System.out.println(sa.age);
			System.out.println(sa.name);
		}
		
		
	}

}
