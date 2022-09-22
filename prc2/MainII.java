public class A
{
 void show(int a,char b)
{
System.out.println("king");
}
 void show(char a,int b)
{
System.out.println("king");
}
public static void main(String[] args)
{
A obj =new A();
obj.show("B",10);
}
}
