import java.util.Scanner;
class Print
{
	int mul(int x)
	{
	 return x;
	}
	String mul(String n)
	{
	 return n;
	}
}
public class MainPrint{
	public static void main(String args[]) 
    	{ 
       		
		Scanner sc = new Scanner(System.in);
                Print obj =new Print();
		String a;
		int b;
		System.out.println("Enter the name and number: ");
		a=sc.nextLine();
		b=sc.nextInt();
 		System.out.println("The name is " + obj.mul(a) + " number is " + obj.mul(b));        	
    } 
}
//without return type