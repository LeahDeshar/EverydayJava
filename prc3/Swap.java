//WAP to ask user to enter two numbers and display after swapping of numbers.


import java.util.*;

public class Swap{
	 public static void main(String[] args)
	 {
	  int a,b;
	  Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a and b: ");
		a= sc.nextInt();
	        b= sc.nextInt();
		System.out.println("The value of a and b before swapping: ");
		System.out.println("a= " + a + " b=" + b);
		SwapNum(a,b);
		 
         }
	public static void SwapNum(int x,int y)
	{
		int temp;
		temp=x;
		 x=y;
		 y=temp;
		System.out.println("The value of a and b after swapping: ");
 		System.out.println("a= " + x + " b=" + y);
	}
}