interface one{
public void displayI();
}
interface two{
public void displayI();
}
interface three extends one,two{
public void displayIII();
}
class child implements three
{
public void displayI()
{
System.out.println("This ");
}

public void displayI()
{
System.out.println("is");
}
public void displayI()
{
System.out.println("Example ");
}
}

class MainIIV{
