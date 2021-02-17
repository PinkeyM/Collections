//we have created a parent class with a method start() and a child class with same method start(), we have inherited parent class in
//child class using extends .

package FinalFinallyFinalize;

//public final class ParentClass {//now if we write final keyword in parent class we will get an error in child class
  public class ParentClass {

	public void start() {//similarly if we write final keyword in start method of parent class we will get error in child class method
		System.out.println("start parent method");

	}

}
//so we use final keyword to:
  //prevent inheritance
  //and to prevent method overriding
  //and to keep variables constant