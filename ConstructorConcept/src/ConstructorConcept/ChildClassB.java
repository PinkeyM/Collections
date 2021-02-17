package ConstructorConcept;

public class ChildClassB extends ParentClassA {// here if we dont extends the parent classA, and if only create the
												// object for child
	// class constructor, then only this method gets printed. But if we extnds, then
	// first the parent class method gets printed and
	// then child class.

	public ChildClassB() {
		super(20);// super keword is used to call parent class constructor. If we write super,
					// then the default cons of parent class is
		//  called.Super keword is always written inside the child class constructor.
		// If we do not pass any arg inside super, the deafult
		// constructor is called. It should be always the first statement in any
		// constructor. Two super can never be used.
		System.out.println("child class");
	}

	public static void main(String[] args) {
		ChildClassB obj = new ChildClassB();
	}
}
