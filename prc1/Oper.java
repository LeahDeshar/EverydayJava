import java.util.*;
public class Oper {
	public static void main(String[] args)
	{
	int a,b,choice;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your choice(1-4): ");
	choice = sc.nextInt();
	  System.out.println("Enter value of a and b: ");
		  a=sc.nextInt();
		  b=sc.nextInt();
	switch(choice)
	{
    	  case 1:
		 System.out.println("Addition:" + (a+b));
		 break;
	  case 2:
		if(a>b)
		{
		 System.out.println("Subtraction:" + (a-b));
		}
		else
		{
		 System.out.println("Subtraction:" + (b-a));
		}
		 break;
	 case 3:
	 System.out.println("Division:" + (a/b));
	 break;
	 case 4:
	 System.out.println("Multiplication:" + (a*b));
	 break;
	 default:
	 System.out.println("Invalid");
	}
}}