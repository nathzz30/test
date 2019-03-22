package Problem1;

import java.util.ArrayList;

public class addressBook {

	
	private ArrayList <entryT> persons = new ArrayList <entryT>();
	
	public addressBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<entryT> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<entryT> persons) {
		this.persons = persons;
	}

	public void getEntries ()
	{
		for (int i=0; i < persons.size(); i++)
		{
			System.out.println("LastName: "+ persons.get(i).getLastName() + " FirstName: " + persons.get(i).getFirstName() + " PhoneNumber: " + persons.get(i).getPhoneNumber() );
			
		}
	}
	
	public boolean exist (entryT entry)
	{
		for (entryT person : persons)
		{
			if (person.getFirstName().equals(entry.getFirstName()) && person.getLastName().equals(entry.getLastName()))
			{
				return true;

			}
		}
		return false;
	}

	public void newEntry (String firstName, String lastName, String phoneNumber)
	{
		entryT p = new entryT (firstName,lastName,phoneNumber);
		//int size = persons.size();
		if (persons.size()==0)
		{
			
			persons.add(p);
			System.out.println("Person added correctly to the Address Book.");
			
		}
		else 
		{

			if (exist(p))
			{
				System.out.println("Information Duplicate it, the person already exist.");

			}
			else 
			{
				persons.add(p);
				System.out.println("Person added correctly to the Address Book.");
			}

		}		
		
		
	}
}
