package Problem8;

import java.util.ArrayList;

import Problem3.CartesianProduct;
import Problem3.PairT;


public class ListMnemonics {

	private String[] digitsMapped = {"0","1","ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"};
	
	public ListMnemonics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ListMnemonics (String s)
	{
		CartesianProduct carp = new CartesianProduct();
		//char[] num = s.toCharArray();
		ArrayList<String> results = new ArrayList<String>();
		//int columns = 3^(num.length-1);
		//int control = 1;
		//String [][] combinations = new String [3][columns];
		//ArrayList<String> combinations = new ArrayList<String>();
		ArrayList<String> letters = new ArrayList<String>();
		ArrayList<String> pair1 = new ArrayList<String>();
		ArrayList<String> pair2 = new ArrayList<String>();
		//String [] letters = new String [num.length];
		for (int i = 0; i < letters.size(); i++)
		{
			letters.add(digitsMapped[s.indexOf(i)]); 
		}
		
		for (int i = 1; i < letters.size(); i++)
		{
			if (i == 1)
			{
				char[] letter1 = letters.get(0).toCharArray();
				char[] letter2 = letters.get(1).toCharArray();
				for (int x = 0; x < letter1.length ; x++ )
				{
					String let = Character.toString(letter1[x]);
					String let2 = Character.toString(letter2[x]);
					pair1.add(let);
					pair2.add(let2);
				}
				carp.setSet1(pair1);
				carp.setSet2(pair2);
				carp.CartesianProductOfTwoPairs();
				for (PairT pairs : carp.getPairs())
				{
					results.add(pairs.getFirst()+pairs.getSecond());
				}
			}
			
			pair1.clear();
			pair2.clear();
			for (int x = 0; x < results.size() ; x++ )
			{
				pair1.add(results.get(x));
			}
			

			for (int x = 0; x < 3 ; x++ )
			{
				char[] letter1 = letters.get(i).toCharArray();
				String let = Character.toString(letter1[x]);
				pair2.add(let);
			}
			results.clear();
			carp.setSet1(pair1);
			carp.setSet2(pair2);
			carp.CartesianProductOfTwoPairs();
			for (PairT pairs : carp.getPairs())
			{
				results.add(pairs.getFirst()+pairs.getSecond());
			}
			

		}
		
		for (String combination : results)
		{
			System.out.println("-" + combination + "-");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListMnemonics list = new ListMnemonics();
		list.ListMnemonics("345");
		

	}
}


