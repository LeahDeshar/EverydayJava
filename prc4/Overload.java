//wap to perform arithmetic operation using method overloading

import java.util.Scanner;
public class Overload
{
	public int mul(int x,int y)
	{
	 return (x*y);
	}
	public int mul(int x,int z,int y)
	{
	 return (x*y*z);
	}
	public double mul(double m,double n)
	{
	 return (m*n);
	}
	public static void main(String args[]) 
    	{ 
       		 Overload obj = new Overload(); 
		int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of a and b and c: ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
		System.out.println(""); 
		System.out.println("The result is: "); 
       		 System.out.println(obj.mul(a, b)); 
       		 System.out.println(obj.mul(a, b, c)); 
		System.out.println(obj.mul(10.5,15.5)); 
    } 
}