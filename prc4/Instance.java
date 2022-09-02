////WAP to perform arithmetic operation using instance method

import java.util.Scanner;
//this is package to access the Scanner class

public class Instance{
	//static main method

	public static void main(String[] args)
	{ 	
		int x,y,choice;
		Scanner sc = new Scanner(System.in);
		
		//To perform user based operation

		System.out.print("Enter your choice from 1-4:");
		choice = sc.nextInt();
		
		System.out.println("Enter the two number: ");
		x=sc.nextInt();
		y=sc.nextInt();
		Instance obj = new Instance();
			
		//based on user's choice one of the 
		//case will be executed

		switch(choice)
		{
		  case 1: 
		    obj.add(x,y);
		     break;
		  case 2: 
		    obj.sub(x,y);
		     break;
		  case 3:
		    obj.mul(x,y);
		     break;
		  case 4:
        	   obj.div(x,y);
		   break;
		  default:
		   System.out.print("Invalid choice");
		}
	      }


	//instance methods are written inside the class
	//without static keyword

	void add(int a,int b)
	{
	  System.out.println("The addition is: " + (a+b));
	}
        void sub(int a,int b)
	{
	  System.out.println("The subtraction is: " + (a-b));
	}
	void mul(int a,int b)
	{
	  System.out.println("The multiplication is: " + (a*b));
	}
        void div(int a,int b)
	{
	  System.out.println("The division is: " + (a/b));
	}
}