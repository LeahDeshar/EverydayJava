//wap to find if number is odd or even

import java.util.Scanner;

public class Evenorodd{

private int num;

public void setX(int a)
{
this.num =a;
}
public int getX()
{
return num;
}
public void display()
{
if(num%2==0)
{
System.out.println("The number" + num + " is even");
}
else
{
System.out.println("The number" + num + " is odd");
}
}
public static void main(String[] args)
{
 Evenorodd obj = new Evenorodd();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of number: ");
int n = sc.nextInt();
obj.num = n;
obj.display();
}
}