package JavaQuestions;

import java.util.Scanner;

public class PallindromeSTring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string name");
		String str= sc.next();
		String nt=str;
		String rev="";
		int ln=nt.length();//if RADAR then length =5 and index is 0,1,2,3,4
		for(int i=ln-1;i>=0;i--) {//i=ln-1=5-1=4
			rev=rev+str.charAt(i);//0+4=4
		}
		if(nt.equals(rev)) {
			System.out.println("paaliind");
		}else {
			System.out.println("not pall");
		}
	}

}
