import java.util.*;
class fibo
{
  	public static int fiboSeries(int a)
	{
	if(a==0 || a==1)
	{
	   return a;
	}
	else 
	{
		return fiboSeries(a-1)+fiboSeries(a-2);
	}

public staic void main(String[] args)
{
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the range: ");
int b=sc.nextInt();
for(int i=0;i<b;i++)
{
  System.out.println(fiboSeries(i));
}
}
}
