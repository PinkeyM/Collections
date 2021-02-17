package AbstractionConcept;

public class HDFCBankAbstractSecondClass extends AbstractionConcept {//we get an error here because the child class is trying to
	//extend the parent class which is abstract in nature as it contains a method loan() that is abstract method

	//so we have to declare the same loan abstract method in child class ie, we are overriding the loan method and declare the body-
	public void loan() {
}
	
	// so this feature we will create a class "TestAbstraction"
}