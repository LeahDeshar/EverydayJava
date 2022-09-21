//wap to print IT for IT
class one1 
{ 
    public void print_ss() 
    { 
        System.out.print("School IT"); 
    } 
}   
class two1 extends one1 
{ 
    public void print_for() 
    { 
        System.out.print(" for "); 
    } 
}   
class three extends two1 
{ 
public void print_ss() 
    { 
        System.out.print("IT"); 
    } 
}   
// Drived class 
public class Main
{ 
    public static void main(String[] args) 
    { 
        three g = new three(); 
        g.print_ss(); 
        g.print_for(); 
        g.print_ss();  
     } 
}
