package Problem1;

import java.util.ArrayList;

public class words {

	 private ArrayList <String> words = new ArrayList<String>();
	
	
	
	public words() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getWords() {
		return words;
	}

	public void setWords(ArrayList<String> words) {
		this.words = words;
	}

	public void addString (String s)
	{
		words.add(s);
	}



	public void exist (String w)
	{
		for(String word : words)
		{
			if(word.equalsIgnoreCase(w))
			{
				System.out.println(w + " is equal to this word: " + word );
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		words w = new words();
		w.addString("word");
		w.addString("Word");
		w.addString("Car");
		w.addString("Wood");
		w.addString("WaTer");
		w.addString("Cat");
		w.addString("kittie");
		
		w.exist("KitTie");
		
	

	}
}
