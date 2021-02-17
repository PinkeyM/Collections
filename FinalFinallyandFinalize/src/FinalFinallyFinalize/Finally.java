package FinalFinallyFinalize;

public class Finally {

	public static void main(String[] args) {
		//start();
		start2();
	

	}
	public static void start() {
		try {
			System.out.println("start inside try");
			throw new Exception("ttt");
		}
		catch(Exception e) {
			System.out.println("catch");
			
		}
		finally// so finally keyword is always used with try catch block and it says that whatever the code we have written in finally
		//it will get executed and it will always execute after try catch block. doesnt matter any exception is there or not
		{
			System.out.println("finally");
		}
		}
	
	//2nd way
	
	public static void start2() {
		try {
			System.out.println("start");
		}
		
		finally {// so here it does not matter that any exception is there or not the finally will get executed.
			System.out.println("finally");
		}
	}


	
	
	
	
	
	

}
