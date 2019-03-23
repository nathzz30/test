package Problem4;

public class Cannonball {

	public Cannonball() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int howManyCannonballsAre (int height) 
	{
		int result = 0;
		if (height == 1)
		{
			return result = result + 1;
		}
		else 
		{
			return result = result + (height * height) + howManyCannonballsAre( (height-1) ); 	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cannonball cannonball = new Cannonball();
		System.out.println("The Pyramid has: " + cannonball.howManyCannonballsAre(7) + " Cannonballs");

		

	}
	
}
