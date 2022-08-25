// Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
 
import java.util.*;
class test {
     public static void main(String[] args){
        //Everything about the string operation
     String s = " hello";
     System.out.println("s.length()-->to get the length of the string: " + s.length());
     System.out.println("s.contains " + s.contains("he"));
     System.out.println("s.isEmpty()" + s.isEmpty());
     System.out.println("s.toUpperCase()" + s.toUpperCase());
     System.out.println("s.startsWith('h')" + s.startsWith("h"));
     System.out.println("s.endsWith(' ')" + s.endsWith(" "));
     System.out.println("s.replace('ll','LL')" + s.replace("ll","LL"));
     System.out.println("s.trim()" + s.trim());
     System.out.println("s.strip()" + s.strip());
     System.out.println("s.substring(beginIndex,endIndex)" + s.substring(0,6));
     System.out.println("Arrays.toString(s.toCharArray()))"+Arrays.toString(s.toCharArray()));
     //get the arrays of a character then can access specific character from it using charAt
     System.out.println("s.charAt(1): "+ s.charAt(1));
     System.out.println("Arrays.toString(s.split('e')): " +Arrays.toString(s.split("e")));
     System.out.println(s);
     
     String s2 = " hello ";
     System.out.println("s == s2 " + (s == s2));

     String s3 = new String(" hello ");
     System.out.println("s == s3: " + (s == s3));

     System.out.println("s.equals(s3):" + s.equals(s3));

     System.out.println("s == s3.intern(): " + (s == s3.intern()));

     String firstName1 = "Leah";
     String firstName2 = "leah";
     System.out.println("firstName1.equals(firstName2): " + firstName1.equals(firstName2));
     System.out.println("firstName1.equalsIgnoreCase(firstName2): " + firstName1.equalsIgnoreCase(firstName2));
     
     char[] charArr = new char[] {'h', 'e', 'l', 'l', 'o'};
    
     System.out.println("String of Char Array: " + String.valueOf(charArr));
     System.out.println("String of Char Array: " + Arrays.toString(charArr));



    }
}