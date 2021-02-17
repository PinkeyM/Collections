//structure of abstract class

package AbstractionConcept;
//through this abtsrcat methdo we are acheiving partial abstraction and not 100% abstraction********************/
//******//Advantage of abstraction: the parent class will just create the method like loan method and will hide the logic/implementation 
//because
//the body is not declared in abstract method. Here only the child class will use that method and define its own logic.

public abstract class AbstractionConcept {//so make the class as abstract we need to add abstract word
	//also to create an abstract class we must have a method declared with abstract method

	public abstract void loan();//body declaration is not allowed in abstract method, it will throw an error.
	
	//In absraction, we can have multiple abstract as well as non-abstract method, but atleast one abstract method is compulsory
	
	public void credit() {//this is non abstract as there is no absract keyword and also method body is declared.
		System.out.println("Bank credit");
		
	}
	public void debit() {
		System.out.println("debit bank");//this is non abstract method
	}
}
