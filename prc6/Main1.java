import java.util.Scanner;

class Outer
{
	int a,b;
  	private class Inner
	{
	   void print()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of a and b: ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("This is a number " + a +" " + b);
		};
	}
       
     void passPrint()
	{
	  Inner obj =new Inner();
	  obj.print();
	}
}
class Main1
{
 public static void main(String[] args)
{
Outer obj1 =new Outer();
  obj1.passPrint();
}
}
	 