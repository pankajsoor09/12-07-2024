
public class LaptopTest
{
  public static void main(String[] args)
  {
	Laptop laptop1 = new Laptop();
	laptop1.setBrand("HP");
	laptop1.setPrice(38990.50f);
	laptop1.setColor("Silver");
	laptop1.setProcessor("AMD Ryzen 5  Hexa-core");//six independent processing core on a single chip
	  
	System.out.println("1st Laptop Details");
	System.out.println("Brand : "+laptop1.getBrand());
	System.out.println("Price : "+laptop1.getPrice());
	System.out.println("Color : "+laptop1.getColor());
	System.out.println("Processor : "+laptop1.getProcessor());
	
	System.out.println();
	
	 Laptop laptop2 = new Laptop();
	 laptop2.setBrand("Dell");
	 laptop2.setPrice(60000.00f);
	 laptop2.setColor("Black");
	 laptop2.setProcessor("Intel core i5  Octa-core");
	 
	 System.out.println("2nd Laptop Details");
	 System.out.println("Brand : "+laptop2.getBrand());
	 System.out.println("Price : "+laptop2.getPrice());
	 System.out.println("Color : "+laptop2.getColor());
	 System.out.println("Processor :"+laptop2.getProcessor());
	 
  }
}
