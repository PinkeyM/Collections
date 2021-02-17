//Method Overloading

package OOPSPoly;

public class Polymorphism {
	
	 public void Pinkey() {
		System.out.println("1");
		
	}
	
    public void Pinkey(int i) {
		System.out.println("Test"+i);
	
	}

	public void Test() {
		System.out.println("Void");
	}
	public void Test(String k) {
		System.out.println("Test Strinhg"+ k);
		k="Varsha";
	}
	public static void main(String[] args) {
		//Polymorphism: Poly-many, morphism- forms, so a object which can be defined in many form is called polymorphism.
		//Like a human can be a writer, a doctor etc.
		//Types: Static: A plymorphism that is resolved during compile time. Method overloading is an example of this.
		//Method overloading: it allows an class to include two or more methods  to have same name and diff arguments/parameters list.
		//and Dynamic-run time polymorphism, we achiev this by overriding-done by JVM
		//Method overloading-same name, same class, diff arguments(no of arg, seq of arg and type of arg)
		//Method overriding: same name, diff class , same arguments(no of arg, seq of arg and type of arg)
     
		Polymorphism obj = new Polymorphism();
		obj.Pinkey(20);
		//now here compiler will not come to know which Pinkey method to call so we have written int i in second Pinkey
	}// so here method Pinkey is same but with diff argument, is called method overloading as Punkey is overloaded
	
}

