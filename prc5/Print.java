import java.util.Scanner;
class Print
{
	public void mul(int x,String y)
	{
	 System.out.println("The value is " + x + " and String is " + y );
	}
	public void mul(String x,int y)
	{
	 System.out.println("The value is " + x + " and String is " + y );
	}
}
public class MainPrint{
	public static void main(String args[]) 
    	{ 
       		
		
		Scanner sc = new Scanner(System.in);
                Print obj =new Print();
		String a;
		int b;
		a=sc.nextLine();
		b=nextInt();
 		obj.mul(a,b); 
       		
    } 
}