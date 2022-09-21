//Base Class
class A
{
 public void fooA()
 {
 System.out.println("Hello");
 }
}

//Derived Class
class B extends A
{
 public void fooB()
 {
 System.out.println("this is");
 }
}

//Derived Class
class C extends A
{
 public void fooC()
 {
 System.out.println("a tutorial");
 }
}

//Derived Class
public class Main
{
 public static void main(String[] args)
 {
 C obj = new C();
B obj1 =new B();
  obj.fooA();
obj1.fooB();
obj.fooC();
 }
}