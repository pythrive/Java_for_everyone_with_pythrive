
public class Main{
    // a field is a variable existing inside the class (global) but outside methods
    private static int i = 100;     // every field must be private 


    public static void main(String [] pythirve ){

        Example ex = new Example();
   
        String name = "Value";  // a variable is a named memory location
        // name = "PyThrive"; 
        // int i = 10;   // interger 
    
        float f = 3.6F; 
        double d = 1276.56;  // guite bigger than a float
        String s = "PyThrive"; // series of characters
        char c = '~'; // a single character 
        boolean b = true;   // True or False

        // System.out.println(name);
       // System.out.println("The value of b is :" + b);
       ex.collect();  // error 


       System.out.println("The value of num is actually "+ ex.getNum()); // iderectly accessing num using a getter
        
    }
}









