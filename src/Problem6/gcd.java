package Problem6;

public class gcd {
	
	

	public gcd() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int GreatestCommonDivisor (int x, int y)
	{
		if(x % y == 0)
		{
			return y;
		}
		else
		{
			
			return GreatestCommonDivisor(y, (x % y));

		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gcd gcd = new gcd();
		int a = 2520;
		int b = 1760;
		System.out.println("The Greatest Common Divisor for " + a + " and " + b + " is: " + gcd.GreatestCommonDivisor(a, b) );
		//System.out.println();

		

	}
}
