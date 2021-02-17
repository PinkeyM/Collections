package JavaQuestions;

public class PrimeNumbers {

	public static void main(String[] args) {
		// 2 is the lowest prime number, next is 3
	//prime number is those number which is divided by itself or 0.example, 13,17 etc	

		PrimeNumbers obj= new PrimeNumbers();
		System.out.println("1 Number is" +isPrimeNumber(2));
		System.out.println("17 Number is" +isPrimeNumber(17));
		System.out.println("-17 Number is" +isPrimeNumber(-17));
		
	}
	
	public static  boolean isPrimeNumber (int num) {// method 
		if(num<2) {
			return false;
			
		}
		for( int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
				
			}
		}
		return true;
		
		
	}
	
	
	}


 