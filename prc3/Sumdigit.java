// WAP to enter four digit number and find sum of digits.
import java.util.*;

public class Sumdigit{
	public static void main(String[] args)
	 {
	   int num,temp,sum=0;
         
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the four digit number: ");
		num =sc.nextInt();
		while(num!=0)
		{
		 temp = num%10;
   		 sum+=temp;
		 num/=10;
		}
	System.out.println("The sum of four digit number: " + sum);
	}
}