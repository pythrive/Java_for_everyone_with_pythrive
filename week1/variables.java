public class Variables{     // everything within a class
    
    // named memmory location/container that can be used to store data
    /** TO KNOW
     * They have a type, name and a value
     * 
     */

     // 1.1 Declare Variables 

    static int age;     // be descriptive 
    String lastName;
    double salary;
    float wage;

     // 1. 2 Initializing a variable
     int age_1 = 10;
     String lastName_1 = "Siyabonga";
     double salary_1 = 15000.00;
     float wage_1 = 127.13f;

 // 1. 3  PRIMITIVE DATA TYPES
     byte one_twenty = 120;  // 8 bits -128 to 127
     short three_thousand = 32767; // 16 bits -332,768 to 32,767
     int large_number = 1121536132; // 32 bits 
     long very_large_number = 1325628566; // 64 bits number 
     float pi = 3.14f;  // 32-bit floating point-number 
     double price = 175000; //64-bits 
     char at = '@' ;  // 16 bits   - uses single qoutes and not double
     boolean yes = true;  // true or a false

// 1.4 NON-PRIMITIVE DATA TYPES
    
     //String , Array and Object 
     static String name_2 = "Rendani";
     static String name_3 = new String("Precious");

// 1.5 Variable naming 
/*
 * Must bigin with a letter, '$' ,or '_'
 * Cannot start with a digit
 * Case- sensetive  - 'age' and 'Age' are different 
 * cannot use reserved words - int, public, protected, clas, main
 */

 // 1.6 Best practices
 /* 
  * Always use meaningful name - age , salary, name, wage , price
  * Follow camel Casing - lastName , totalAmount 
  */

  // 1.7 Variable Scopes  

  /* Global and Local */

  /*Loacal : They exist withing a block or a method */
  public void myMethod(){
    String localVariable = "Local Variable" ; // only visible in the block
    System.out.println(localVariable);
  }

    // 1.8 Stastic variables 

    /* declared using static keyword 
     * belong to a class rather than an object instance  - they can be accessed without an object
     * shared amoung all the instances of a class 
     */

     // You may access a non static method in a non static method without using an object
     public void justAmethod(){
        salary = 500.0;
    }
     
double $_in_rand = 17.99d;
String _underscore = "_";




    public static void main(String[] strings){  // main method
        Variables sal = new Variables();
     
        System.err.println("Name type :"+ name_2.getClass());
        System.err.println("Name type :"+ name_3.getClass());
        System.out.print( age);  // accessed in a static way without an object instance
        System.out.print( sal.salary);
    }

}



    
