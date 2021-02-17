package JavaQuestions;

public class StringsConcept {

	public static void main(String[] args) {
		String s= "Hello"; // 1st way-literal string
		String s1="Hello";// here of we create 2 diff object with same string "Hello", in memory only 1 Hello will be stored.
		// STring refernce varibale s1 will point to first strong value. so we go ahead withs second below approach of defining string
		String a = new String("Hello");//2nd way to create object of String
		
		String a1= new String("Hello");//
		String a2= new String("HHH");
		a1.concat("Pinkey");
		System.out.println(a1);// here output should be HelloPinkey, but o/p is only hello
		//that means string is immutable ie, we cannot alter the original string value. Like if we change a1 to HelloPinkey,
		//here a2 also points to a1 only and hnece a2 value will also change to HelloPinkey which is wrong.
		//So we can create new string value in this case.. like
		
		
		//String Buffer nad StringBuilder classes: these are mutable strings
		StringBuffer bf= new StringBuffer("Hello");
		bf.append("Noooo");
		System.out.println(bf);// now it prints HelloNooo as its mutable
		bf.insert(1, "Pinkey");
		System.out.println(bf);
		bf.reverse();
		System.out.println(bf);
		
		//STringBuffer is thread safe ie synchronised. suppose if multilple test cases are running parallely at a time, and if all test
		//cases are using the same string varibale, then this StrigBuffer will take care of it, it will first run one test case and 
		//then give control to other test case.
		
		System.out.println();
	}
	

}
