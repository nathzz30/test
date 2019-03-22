package Problem2;

import java.util.ArrayList;

public class Map {

	private ArrayList<CityT> cities =  new ArrayList<CityT>();

	public Map() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Map(ArrayList<CityT> cities) {
		super();
		this.cities = cities;
	}

	public ArrayList<CityT> getCities() {
		return cities;
	}

	public void setCities(ArrayList<CityT> cities) {
		this.cities = cities;
	}
	
	public void addCity (String name, int x, int y)
	{
		CityT city = new CityT();
		city.setName(name);
		PointT coordinates = new PointT();
		coordinates.setX(x);
		coordinates.setY(y);
		city.setCoordinates(coordinates);
		cities.add(city);
	}
	
	public void whatCityIs (String x, String y)
	{
//		PointT coordinates = new PointT();
//		coordinates.setX(Integer.parseInt(x));
//		coordinates.setY(Integer.parseInt(y));
		for (CityT city : cities)
		{
			//System.out.println("The Actual City is: " + city.getName());
			if (city.getCoordinates().getX() == Integer.parseInt(x) && city.getCoordinates().getY() == Integer.parseInt(y))
			{
				System.out.println("The City is: " + city.getName());
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new Map();
		map.addCity("Santiago", 5100 , 6000);
		map.addCity("Santo Domingo", 4389 , 8976);
		map.addCity("La vega", 5100 , 9000);
		map.addCity("Mao", 5100 , 8700);
		map.addCity("Moca", 3000 , 8000);
		map.addCity("La Romana", 3000 , 6000);
		map.addCity("Puerto Plata", 5300 , 6500);
		map.addCity("Jarabacoa", 5300 , 6000);
		map.addCity("Constanza", 2400 , 3300);
		map.addCity("Monte Cristi", 1100 , 2200);
		
		map.whatCityIs("5100", "8700");

	}
}
