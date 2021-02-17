package AbstractionConcept;

public class TestAbstraction {

	public static void main(String[] args) {
		HDFCBankAbstractSecondClass obj = new HDFCBankAbstractSecondClass();
		obj.credit();
		obj.debit();
		obj.loan();

	}

}





//Advantage of abstraction: the parent class will just create the method like loan method and will hide the logic/implementation because
//the body is not declared in abstract method. Here only the child class will use that method and define its own logic.