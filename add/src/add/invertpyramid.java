package add;

public class invertpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	    int number = 5;
	    int i, j;
	    for(i = number; i >= 1; i--)
	    {
	        for(j = i; j < number; j++)
	        {
	            System.out.print(" ");
	        }
	        for(j = 1; j <= (2 * i - 1); j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println("");
	    } 
	}
	}