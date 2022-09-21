public class Sum { 
  
    // Overloaded sum(). This sum takes two int parameters 
    public int sum(int x, int y) 
    { 
        return (x + y); 
    }   
    // Overloaded sum(). This sum takes three int parameters 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
// Overloaded sum(). This sum takes two double parameters 
    public double sum(int x, double y) 
    { 
        return (x + y); 
    }   
    public double sum(double x, int y) 
    { 
        return (x + y); 
    }   
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10, 20.5)); 
    } 
} 
