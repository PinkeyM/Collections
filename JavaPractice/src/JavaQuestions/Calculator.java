package JavaQuestions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("ENter the operator");
		 char op= sc.next().charAt(0);
		int res=0;
		switch(op) {
		case '+':
			res=num1+num2;
			break;
		case '-':
			res=num1-num2;
			break;
			default:
				System.out.println("hdvhjfg");
				break;
		}
		System.out.println(res);
		
	
	
	}
		
			}
		
		
				
		

	
