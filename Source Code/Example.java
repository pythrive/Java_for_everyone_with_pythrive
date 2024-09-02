import java.util.Scanner;

public class Example {

    // private static String field;
    private static int num;
    private static String name;
    
    // num = 0;  // error - cant reference outside a method

    // setter is a method used to set a value to a fields
    public void setNum(int n){
        num = n;
    }

    public void setName(String nam){
        name = nam;
    }

    // getter is a method used to get a value of a field

    public int getNum(){
        return num;
    }

    public String getName(){
        return name;
    }

    public void  collect(){
        Scanner fetch = new Scanner(System.in); // add a scanner

        System.out.println("Enter a number: ");
        num = fetch.nextInt();          // take in an interger

        System.out.println("You entered a "+ num);
        fetch.close();  // close scanner after use

        setNum(num);
    } 


}
