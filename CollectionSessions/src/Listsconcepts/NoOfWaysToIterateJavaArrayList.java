package Listsconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NoOfWaysToIterateJavaArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>();
		
      ar.add("Game od thrones");
      ar.add("Game od Hones");
      ar.add("Game od Mones");
      ar.add("Game od Tones");
      ar.add("Game od Dones");
      //1stway to iterate-using java 8 with for each loop and lambda expression
      ar.forEach(shows ->{
      System.out.println(shows);
      });
      System.out.println("***********************");
      
      //2nd way: using simple iterator
      Iterator <String> it=ar.iterator();
      while(it.hasNext()) {
    	  String st =it.next();
    	  System.out.println(st);
      }
      System.out.println("*********************");
      
      //3rd way: using iterator and java 8 forEachremaining() method-
      it=ar.iterator();
      it.forEachRemaining(show ->{
    	  System.out.println(show);
      });
      
      //using for each loop--
      System.out.println("*******for each loop**************");
      for(String s : ar) {
    	  System.out.println(s);
      }
      //using for loop with order/index--
      System.out.println("*******for loop with index**************");
      for(int i=0; i<ar.size();i++) {
    	  System.out.println(ar.get(i));
      }
      
      //using ListIterator() to traverse in both the direction--
      System.out.println("*******ListIterator**************");
      ListIterator<String> TvSeries =ar.listIterator(ar.size());
      
      
      
      

}}