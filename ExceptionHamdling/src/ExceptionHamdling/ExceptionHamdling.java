package ExceptionHamdling;

public class ExceptionHamdling {
	int i=10;

	public static void main(String[] args) {
		//SO calles***uncaught exception
	
		//int i=9/0;//compliler cannot catch this, only when we run then we come to know. 
		//System.out.println(i);
		//caught exception::
		//Thread.sleep(1000);//thread=class, sleep=method//example of caught exception
		//int j=10;
		ExceptionHamdling obj =new ExceptionHamdling();
		obj=null;
		System.out.println(obj.i);//so here output we will get as null because even though the object is pointed by vars i, but we have
		//declared the obj =null.
		
	}

}
//Types of exception:
//try-catch block
