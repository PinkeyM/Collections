package OOPSPoly;

public class GetternSetter {
	private int i =10;//to hide data for security

	public static void main(String[] args) {
		
		GetternSetter obj = new GetternSetter();//if we dont create getter n setter the in this main method we cannot access that variable
		//even after creating object of that class.
		obj.setI(50);
		System.out.println(obj.getI());
		}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
//this whole process is call encapsulation