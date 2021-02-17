package FinalFinallyFinalize;

public class Final {

	public static void main(String[] args) {
		int i=20;
		i=30;
		i=10;
				System.out.println(i);//so here the o/p will be 10 as anyone can change the value of i anytime, so to keep it constant
				//we use final keyword.see below example fot int j
				 final int j =10;
				// j=20; now here if write j=20 we get error as we have made the variable constant using final keyword.
				 System.out.println(j);
				 

	}

}
