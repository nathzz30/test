package Problem3;

import java.util.ArrayList;

public class CartesianProduct {
	
	private ArrayList <String> set1 = new ArrayList<String>();
	private ArrayList <String> set2 = new ArrayList<String>();
	private ArrayList <PairT> pairs = new ArrayList<PairT>();

	public CartesianProduct() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CartesianProduct(ArrayList<String> set1, ArrayList<String> set2, ArrayList<PairT> pairs) {
		super();
		this.set1 = set1;
		this.set2 = set2;
		this.pairs = pairs;
	}



	public ArrayList<String> getSet1() {
		return set1;
	}



	public void setSet1(ArrayList<String> set1) {
		this.set1 = set1;
	}



	public ArrayList<String> getSet2() {
		return set2;
	}



	public void setSet2(ArrayList<String> set2) {
		this.set2 = set2;
	}



	public ArrayList<PairT> getPairs() {
		return pairs;
	}



	public void setPairs(ArrayList<PairT> pair) {
		this.pairs = pair;
	}

	public void addStringToSet1 (String s) 
	{
		set1.add(s);
	}
	
	public void addStringToSet2 (String s) 
	{
		set2.add(s);
	}
	
	public void ThisPairBelongsToTheSets (PairT p2)
	{
		int x = 0;
		for (PairT p : pairs)
		{
			if(p.CompareIt(p2))
			{
				System.out.println("This pair belongs to the Sets");
				x=1;
			}

		}
		
		if (x == 0)
		{
			System.out.println("This pair doesn't belongs to the Sets");
		}
	}

	
	public void CartesianProductOfTwoPairs () 
	{
		
		for (String set : set1) 
		{
			for (String set2 : set2)
			{
				PairT pair = new PairT();
				pair.setFirst(set);
				pair.setSecond(set2);
				pairs.add(pair);
			}
		}
		
	}
	
	public void ShowCartesianProduct ()
	{
		CartesianProductOfTwoPairs();
		for (PairT p : pairs)
		{
			System.out.println("The one of the pair of the Cartesian Product is:" + p.getFirst() + "-" + p.getSecond());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CartesianProduct carp = new CartesianProduct();
		carp.addStringToSet1("A");
		carp.addStringToSet1("B");
		carp.addStringToSet1("C");
		carp.addStringToSet2("X");
		carp.addStringToSet2("Y");
		carp.CartesianProductOfTwoPairs();
		
		//carp.ShowCartesianProduct();
		
		PairT p = new PairT();
		p.setFirst("a");
		p.setSecond("x");
		
		PairT p1 = new PairT();
		p1.setFirst("a");
		p1.setSecond("b");
		
		carp.ThisPairBelongsToTheSets(p);
		carp.ThisPairBelongsToTheSets(p1);
		
	}

}
