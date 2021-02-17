package JavaQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
		//1567
		int num=1678;
		int rev=0;
		
		while(num>0) {
			int r=num%10;//7, 6 5
			rev=(rev*10)+r;//7,6
			num=num/10;//156, 15
			
			
		}
		System.out.println(rev);
		
	}

}
