// WAP to ask user to enter marks of 5 subject calculate average marks.
import java.util.*;
public class Main{

  public static void main(String[] args)
	{
	  int i,sum=0;
	double average;
          int[] result = new int[5];
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the marks of 5 subject: ");
	   for(i=0;i<5;i++)
	   {
		result[i]=sc.nextInt();
	   }
 	System.out.println("Display ");
        System.out.println("The marks of 5 subject: ");
	   for(i=0;i<5;i++)
	   {
		System.out.println(result[i]);
		sum+=result[i];
	   }
		average =sum/5;
		System.out.println("The average marks: " + average );
	}
}
//for loop
//scanner