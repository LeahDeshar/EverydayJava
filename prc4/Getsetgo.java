public class Getsetgo{
	private int a,b;
	public void setValueA(int a)
	{
	 this.a =a;
	}
	public void setValueB(int b)
	{
	 this.b =b;
	}
        public int getValueA()
	{
	 return a;
	}
	public int getValueB()
	{
	 return b;
	}
	public int add()
	{	
	 return (a+b);
        }
	public int sub()
	{	
	 return (a-b);
        }
	public int div()
	{	
	 return (a/b);
        }
	public int mul()
	{	
	 return (a*b);
        }

	public static void main(String[]args)
	{
		 Getsetgo op=new Getsetgo();
		 op.a=50;
		 op.b=30;

		System.out.println("The addition is: " +op.add());
		System.out.println("The subtraction is: " +op.sub());
		System.out.println("The multiplication is: " +op.mul());
		System.out.println("The division is: " +op.div());
	}  
}
	