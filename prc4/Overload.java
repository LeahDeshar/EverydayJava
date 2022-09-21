//wap to perform arithmetic operation using method overloading

import java.util.Scanner;
public class Overload
{
	public double mul(int x,double y)
	{
	 return (x*y);
	}
	public double mul(double x,int y)
	{
	 return (x*y);
	}
	public static void main(String args[]) 
    	{ 
       		
			Overload obj =new Overload();
 		System.out.println(obj.mul(10.00, 20)); 
       		
    } 
}