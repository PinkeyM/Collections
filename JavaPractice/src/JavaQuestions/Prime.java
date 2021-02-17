//Easy one

package JavaQuestions;

public class Prime {

	public static void main(String[] args) {
		//Prime obj= new Prime();
		System.out.println("udsfs" +Prime(3));

	}

	
	public static boolean Prime(int num) {
		
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
}
