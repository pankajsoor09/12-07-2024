
public class Employee 
	{
	  private int id;
	  private float salary;
	  private String name;

	  public int getId() // no parameter 
	  {
	  return id;
	  }
	  public void setId(int i)//same int as above
	  {
	  id = i;
	  }
	  public float getSalary()
	  {
	  return salary;
	  }
	  public void setSalary(float s)
	  {
	  salary = s;
	  }
	  public String getName()
	  {
	  return name;
	  }
	  public void setName(String n)
	  {
	  name = n;
	  }
	  
	  public static void main(String[] args)
	  {
	   Employee emp = new Employee();
	   emp.setId(101);
	   emp.setName("Pankaj");
	   emp.setSalary(1000000.00f);


	   System.out.println("Employee Details : ");
	   System.out.println("ID : "+emp.getId());
	   System.out.println("Name : "+emp.getName()); 
	   System.out.println("Salary : "+emp.getSalary());  


	  }

	}









