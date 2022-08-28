public class AreaShapes{
 	
	public static void main(String[] args)
	{
	  AreaShapes operation = new AreaShapes();
          operation.circle();
 	  operation.rectangle();
	  operation.triangle();
	}
	public void circle()
	{
 	  int radius=5;
           double pi=3.1415;
	  double circle = pi * radius * radius;
	  System.out.println("The area of circle is : " + circle);
	}
	public void rectangle()
	{
	  int length=2,width=5;
	   int rectangle = length * width;
		 System.out.println("The area of rectangle is : " + rectangle );
	}
	public void triangle()
	{
           int base=15, height=10;
	   double triangle =(1/2) * (base* height);
		 System.out.println("The area of triangle is : " + triangle );
	}
}