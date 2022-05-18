package add;

public class foreach {

	public static void main(String[] args) {
		// for loop to traverse integer array
		int s[] = {18,25,28,39,29};
		
		for(int i:s) {
			int a=i;
			System.out.print(a);
			System.out.print(" ");
		}
		System.out.println( "");
		// for loop to traverse character array
		char ch[]= {'B','H','A','R','A','T','H','I'};
		for(char ch1:ch) {
			char a=ch1;
			System.out.print(a);
			System.out.print(" ");
		}
		
		

	}

}
