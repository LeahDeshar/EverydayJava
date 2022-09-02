import java.util.Scanner;

//package to access the Scanner class

public class Palindrome{

//main method

  	public static void main(String[] args)
	{
		int num,temp,sum=0,original;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		original=num;
		while(num!=0)
		{
		   temp=num%10;	
		    sum=sum*10+temp;
		   num/=10;
		}
		if(original== sum)
		{
		  System.out.println(original + " is a palindrome.");
		}
		else
		{
		  System.out.println(original + " is not a palindrome.");
		}

	}
}


