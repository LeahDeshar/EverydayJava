import java.util.*;
public class Simple{
public static void main(String[] args)
{
int p,t,r;
double result;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of p,t,r");
p=sc.nextInt();
t=sc.nextInt();
r=sc.nextInt();
result = (p*t*r)/100;
System.out.println("The simple interest: " + result);
}
}