package OOPSPoly;

public class MethodOverridingDynamicPoly {//1st class
	
	public void show() {
		System.out.println("Show");
	}

	public static void main(String[] args) {
		SecondClassMethodOverridingDynamicPoly t= new SecondClassMethodOverridingDynamicPoly();
		t.show();

		
		MethodOverridingDynamicPoly t1= new MethodOverridingDynamicPoly();
		t1.show();
	}// so in both class we have same method with same arguments

}

 class SecondClassMethodOverridingDynamicPoly extends MethodOverridingDynamicPoly{//second class
	 // here we need to write extends so that properties of first class comes to second class
	 public void show() {
			System.out.println("Show2");
		}
}
