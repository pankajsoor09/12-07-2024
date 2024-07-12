
public class RectangleTest 
{
	
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setLength(9);
		rectangle1.setBreadth(5);
		
		System.out.println("1st Rectangle Details");
		System.out.println("Length : "+rectangle1.getLength());
		System.out.println("Breadth : "+rectangle1.getBreadth());
		
		System.out.println();
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setLength(12);
		rectangle2.setBreadth(8);
		
		System.out.println("2nd Rectangle Details");
		System.out.println("Length : "+rectangle2.getLength());
		System.out.println("Breadth : "+rectangle2.getBreadth());
		
	}

}
