   import java.util.*;
public class MainIV {  
int a, b;  
 MainIV(int x, int y) 
   { 
        a = x; 
        b = y; 
    }   
   
    void ChangeValue(MainIV obj) 
    { 
       int temp;
        temp=obj.a;
	obj.a=obj.b; 
        obj.b=temp; 
    }  
    public static void main(String[] args) 
    {   
         

   Scanner sc = new Scanner(System.in);
System.out.println("Enter the value to swap: ");;
int m,n;
m=sc.nextInt();
n=sc.nextInt();
        MainIV object = new MainIV(m, n); 
       System.out.println("Value of a: " + object.a + " & b: "+ object.b); 

        object.ChangeValue(object); 
 
        System.out.println("Value of a: "+ object.a + " & b: " + object.b); 
    } 
} 
