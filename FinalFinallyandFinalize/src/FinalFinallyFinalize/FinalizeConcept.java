package FinalFinallyFinalize;

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("finalize");// so we can see that this finalize method is not called in the main method below, still it is
		//able to call this and destroy the balnk objects.
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1= new FinalizeConcept();
		FinalizeConcept f2= new FinalizeConcept();
		 f1=null;// when we write f1=null or f2=null, it means ther are 2 blank objects store in java memory without any reference
		 f2=null;//so garbage collector will come and destroy all those objects which dont have any refernce, ie, no one is referring
		 //those objects to free some space in memory
		 //so finalize keyword is called for clean up.
		 System.gc();
	}

}
