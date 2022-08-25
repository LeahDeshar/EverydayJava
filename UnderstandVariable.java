public class UnderstandVariable {
    int a=10; //<--instance variable
    public static void main(String[] args)
    {
        UnderstandVariable res = new UnderstandVariable();
        System.out.println("The value is : " + res.a );
    }
}
//A variable which is declared inside the 
//body of the method or the method parameter called local variable
//syntax 
/*
 void function(int a)<-- local variable
 {
    int a;<-- local variable
 }
 */
//Instance variable is the variable which is declared inside the class  
//but outside of all the method 
//Instance variables can be accessed directly by calling the variable name inside the class. 
//However, within static methods,they should be called using the objetct.variable.

