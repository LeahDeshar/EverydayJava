public class AI
{
private int a;
  public int get()
{
return a;
}
public void set(int x)
{
a=x;
}
void display()
{
System.out.println("The result is " + a);
}
public static void main(String[] args)
{
  AI obj = new AI();
obj.a=20;
obj.display();
}
}
