import java.util.Scanner;
public class Oper
{  
private int x,y;    

public int getX()    //accessor method  
{  
return x;  
}  
public int getY()    //accessor method  
{  
return y;  
}  
public void setX(int a) //mutator method  
{  
this.x = a;  
}  
public void setY(int b)   
{  
this.y = b;  
}  
public void display()  
{  

System.out.println("The addition of two numbers are: " +(x+y));  

System.out.println("The subtraction of two numbers are: " +(x-y)); 

System.out.println("The multiplication of two numbers are: " +(x*y));   

System.out.println("The division of two numbers are: " +(x/y));  

}  
public static void main(String[]args)
{
Oper obj = new Oper();
Scanner sc = new Scanner(System.in);

System.out.println("Enter the value of x and y:");
int value1 =sc.nextInt();
int value2 =sc.nextInt();

obj.x=value1 ;
obj.y=value2;
obj.display();
}  
}
