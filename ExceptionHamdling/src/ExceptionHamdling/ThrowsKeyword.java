//here also it is used for exception handling but unlike try catch, here we cant report it.
// when suppose there are 100lines of codes then if we use try catch it will just take uncessary lines of codes so in that case we can
//use throws method.
//throws keyword cannot handle it as JVM handles it so it will terminate.

package ExceptionHamdling;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException{// as it is calling test, now who will take the exception? JVM
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.test();
	}

	public void test() throws ArithmeticException {
		div();
		
	}
	public void div() throws ArithmeticException {// here div method throws an exception but who will catch it? div() as test is calling div
		int j=8/0;
	}
	
}
