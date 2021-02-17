//Constructor: is a class entity used to define some class features while creating objects.
//it looks like a function but its not a function, it does not return any value.
//name should be same of class name

package ConstructorConcept;

public class ConstructorConcept {
	
	public ConstructorConcept() {//constructor, no void nothing. this is called default constructor as zero parameter is passed
		//constructor as no parameters are passed.
		System.out.println("default constructor");
		}
	
	public ConstructorConcept(int i) {
		System.out.println("Single parameter"+ i);
		//interview: Can we overload a constructor---Answer--yes we can.
		//interview: if there is no constructor, default constructor will always be called when we create an object.
	}
	
	public ConstructorConcept(int i, int j) {//
		System.out.println("double parameter"+ i);
	
		System.out.println("double parameter"+ j);
	}
	public static void main(String[] args) {
		//constructor is called immediately when we create the object
		ConstructorConcept obj= new  ConstructorConcept();//if we run this, the default constructor is being called.
		ConstructorConcept obj1= new  ConstructorConcept(10);//this calls the single parameter constructor
		ConstructorConcept obj2= new  ConstructorConcept(10,20);//this calls the single parameter constructor
	}

}
