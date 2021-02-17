package JavaQuestions;

public class Pallindrome {

	public static void main(String[] args) {
		// 151, 161, 78987 examples
		pallindrome(151);
		pallindrome(152);
	}
	
	public static void pallindrome(int num) {
		int r=0;
		int sum=0;
		//int t;
		int t=num;
		
		while(num>0) {//num=151, **now num=15 which is >0****1>0
			r=num%10;//151%10=1*** now r=15%10=5***1%10=1
			sum= (sum*10)+r;// sum=0*10 +1=1  ***sum=1*10 +5=15***sum=15*10+1=151
			num=num/10;//151/10=15***15/10=1*****1/10=0
			
		}
		if(t==sum) {
			System.out.println("pall");
			
		}else {
			System.out.println("not");
		}
		
		
	}

}
