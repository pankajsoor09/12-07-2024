public class PersonTest 
	{
	  public static void main (String[] args)
	  {
	  Person person1 = new Person();
	   person1.setName("Pankaj");
	   person1.setAddress("Yavatmal");
	   person1.setDob("27th Sept");

	   System.out.println("1st Person Details : ");
	   System.out.println("Name : "+person1.getName());
	   System.out.println("Address :"+person1.getAddress());
	   System.out.println("Dob :"+person1.getDob());

	   System.out.println("-----------------------------------");

	   Person person2 = new Person();
	   person2.setName("Aditya");
	   person2.setAddress("Yavatmal");
	   person2.setDob("13th Feb");

	   System.out.println("2nd Person Details : ");
	   System.out.println("Name : "+person2.getName());
	   System.out.println("Address :"+person2.getAddress());
	   System.out.println("Dob :"+person2.getDob());

	 }

	}


