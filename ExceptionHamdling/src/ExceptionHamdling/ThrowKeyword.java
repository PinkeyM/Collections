// throw extends object**************throw keyword is used when want to throw exception deliberately. 

package ExceptionHamdling;

public class ThrowKeyword {

	public static void main(String[] args) {
		System.out.println("ABC");
		
		
		try {
			throw new Exception("Pinkey Xecption");
		} catch (Exception e) {
			
			e.printStackTrace();
		}// here we have thrown an exception, now to catch we need to surround with try catch
		
		System.out.println("ABC");

		
		
	}

}
