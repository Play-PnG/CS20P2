package skillbuilder;

public class Student 
{
	private String firstName;
	private String lastName;
	private String address;
	private int stuID;
	
	public Student() //Constructor
	{
		firstName ="";
		lastName ="";
		address ="####";
		stuID = 0000;
	}
	public Student(String f, String l, String ad, int id)// overload contractor
	{
	
		firstName = f;
		lastName =l;
		address = ad;
		stuID = id;
		
	}
		//Accessed method
		public String getFirstName()
		{
			return firstName;
			
		}
		
		public void setFirstName(String f)
		{
			firstName = f;
		}
	
		public String toString()
		{
			return("First name:" + firstName
					+"\nlast name: "+ lastName
					+"\n Address: " + address
					+"\n Student ID"+ stuID);
		}


}