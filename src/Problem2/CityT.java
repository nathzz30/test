package Problem2;

public class CityT {

	private String name;
	private PointT coordinates = new PointT();
	public CityT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CityT(String name, PointT coordinates) {
		super();
		this.name = name;
		this.coordinates = coordinates;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PointT getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(PointT coordinates) {
		this.coordinates = coordinates;
	}

	
}
