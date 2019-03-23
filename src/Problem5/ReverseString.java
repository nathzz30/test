package Problem5;
import java.time.Instant;
import java.util.concurrent.TimeUnit;



public class ReverseString {

	
	
	public ReverseString() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String ReverseStringIteration (String s)
	{
		String result = "";
		long startTime = System.nanoTime();

		for (int i = (s.length()-1); i >= 0 ; i--)
		{
			result = result + s.charAt(i);
		}

		long endTime = System.nanoTime();

		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in milliseconds: " + timeElapsed);

		return result;
	}
	
	public String ReverseStringRecursive (String s)
	{
		String result = "";
		long startTime = System.nanoTime();

		if(result.length() < s.length())
		{
			return result = result + s.substring(s.length()-1) + ReverseStringRecursive(s.substring(0, s.length()-1));
		}

		long endTime = System.nanoTime();

		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in milliseconds: " + timeElapsed);

		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ReverseString reverse = new ReverseString ();
		
		System.out.println("The Reverse String Using Iteration is: " + reverse.ReverseStringIteration("Hola mundo nathaly"));
		System.out.println("The Reverse String Using Recursivity is: " + reverse.ReverseStringRecursive("Hola mundo nathaly"));

		

	}
}



