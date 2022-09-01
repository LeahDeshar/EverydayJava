//WAP to ask user to enter time in hours and calculate minutes and seconds.
import java.util.*;
public class Time
{
	public static void main(String[] args)
	{
	  int hour,min,sec;
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the hour: ");
	  hour = sc.nextInt();
	  min = hour * 60;
	  sec = min * 60;
	  System.out.println("Minute= " + min + " Seconds= " +sec);
	 }
}