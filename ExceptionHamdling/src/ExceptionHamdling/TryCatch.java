//this is used when some exception is coming and we need to report it.


package ExceptionHamdling;

public class TryCatch {

	public static void main(String[] args) {
		//int i=9/0;// we know that this line will give an error, we  write it in try block
		try{//try=keyword
			int i=9/0;//this code gives an exception so written inside try block
		}catch(Exception e) {// here instead of ArithmeticExceptionwe can also write error, throwable(super class of error.exception)
			//if we know that we will get which excpetion then we can write that particular exception, but if we dont know which
			//exception will come we can directly write exception, we need not to take care which exception will come.
			//here inside catch block we need to write the name of the exception
			e.printStackTrace();//when this particluar method is used, we will gt the output "ABC", but alon with that we will also
			// get this exception line that where exactly the execption is.
			System.out.println(e.getMessage());// this method gives what exactly is the error message.ie, / by zero
			
		}
		System.out.println("ABC");
		

	}

}
