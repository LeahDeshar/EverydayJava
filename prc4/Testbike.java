//Abstract

class Honda extends Bike{
	void run()
	{
		System.out.println("Running safely");
	}
}

public class Testbike{
	public static void main(String[] args)
	{
	Bike obj = new Honda();
	obj.run();
	}
}
abstract class Bike{
  abstract void run();
}