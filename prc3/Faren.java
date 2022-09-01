//WAP to convert centigrade temperature to Fahrenheit and vice versa
import java.util.*;
public class Faren{
	public static void main(String[] args)
	{
	  int num;
	  double result;
          Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the centigrade: ");
	  num = sc.nextInt();
	  result = (num*1.8)+32;
	 System.out.println("The fahrenheit : " +result);
	  }
}