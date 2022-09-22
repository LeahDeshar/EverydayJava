//static inner class

public class Test{
  
static class inner
{
void print()
{
System.out.println("Happy Learning");
}
}
}
public class Main{
  public static void main(String[] args)
{
  Test.inner obj = new Test.inner();
   obj.print();
}
}