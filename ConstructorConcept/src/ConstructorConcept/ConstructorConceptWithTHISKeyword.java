package ConstructorConcept;

public class ConstructorConceptWithTHISKeyword {
	int num ;
	int age;
	
public ConstructorConceptWithTHISKeyword(int num, int age) {//this is a constructor with double parameters
	this.num=num;//here this.num =is class variable
	this.age=age;
	System.out.println("print" + num+age);
}
	

	public static void main(String[] args) {
		
		ConstructorConceptWithTHISKeyword obj = new ConstructorConceptWithTHISKeyword(23,45);//here after we call the constructor, 
		//the value 23 is assigned to int num and value 45 to int age of the constructor parameter and the not the class variables
		//which we have declared in the class. So to initialize those class vars. we need to use THIS keyword
		
	}

}
