package Problem7;

import java.util.ArrayList;



public class Measurable {

	public Measurable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int Sum (ArrayList <Integer> weights)
	{
		int sum = 0 ;
		for (int i = 0 ; i < weights.size() ; i++)
		{
			sum = sum + weights.get(i);
		}
		return sum;
	}

	public boolean IsMeasurable (int target, ArrayList <Integer> weights) 
	{
		int sumWeights = Sum(weights);

		if (target == sumWeights )
		{
			return true;
		}
		else
		{
			if(target < sumWeights)
			{
				if(target == weights.get(0))
				{
					return true;
				}
				else 
				{
					for (int i = 1; i < weights.size() ; i++)
					{
						if (target == weights.get(i))
						{
							return true;
						}
						else
						{
							if(target == (weights.get(0) + weights.get(i)))
							{
								return true;
							}
							if(target == (weights.get(i) - weights.get(0)))
							{
								return true;
							}
						}
					}
				}
				weights.remove(0);
				return IsMeasurable(target, weights);
			}
			else
			{
				return false;
			}			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> weights = new ArrayList<Integer>();
		weights.add(2);
		weights.add(5);
		weights.add(7);
		//weights.add(5);
		//weights.add(7);
		
		Measurable m = new Measurable();
		if(m.IsMeasurable(14, weights))
		{
			System.out.println("Is Measurable");
		}
		else 
		{
			System.out.println("Is not Measurable");
		}
		
		
		

	}
}
