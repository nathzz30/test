package Problem3;

public class PairT {
	
	private String first;
	private String second;
	public PairT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PairT(String first, String second) {
		super();
		this.first = first;
		this.second = second;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	
	public boolean CompareIt (PairT p1) 
	{
		if(p1.getFirst().equalsIgnoreCase(first)  && p1.getSecond().equalsIgnoreCase(second) )
		{
			return true;
		}
		else {
			return false;
		}
	}
	

}
