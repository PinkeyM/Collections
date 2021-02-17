package JavaQuestions;

public class Try {
	
	public static void main(String[] args) {
		String name= "Pinkey";
		int len= name.length();
	
		
		for(int i=len-1; i>=0;i--) {
			System.err.print(name.charAt(i));
		}
	}

}
