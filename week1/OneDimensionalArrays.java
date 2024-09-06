import java.util.*;

public class OneDimensionalArrays {

    /*  Array is an object that stores multiple elements 
    of the same data type. */
    
    // Syntax for declaring an Array

    // dataType[] arrayName;  - preffered way for creating an array

    String [] firstName ;   
    int [] age = new int[5];  // create and init in a single line - init with 0
    double[] salary;
    char [] characters = {'C', 'D', 'E', '*', '#'}; // initializing with direct values


    /* Sysntax for initializing an array
     * arrayName = new dataType[size]
     */

    public void MyArray(){
        firstName = new String[5];  // init with Null 
    }
    
    public void DisplayArray(){
        MyArray();
        System.err.println("Frist name at index 1 is :  "+ firstName[1]);
    }

    public void displayChars(){
        System.err.println("The character at index 3 is : " + characters[3]);
    }
     
    public static void main(String [] pyThrive){
        
        OneDimensionalArrays obj = new OneDimensionalArrays();
        obj.accessChars();
        System.err.println("__________________________________");
        System.err.println("");
        obj.DisplayArray();
        System.err.println("__________________________________");
        System.err.println("");
        obj.displayChars();
        System.err.println("__________________________________");
        System.err.println("");
        obj.displaySizeChars();
        System.err.println("__________________________________");
        System.err.println("");
        obj.displayAllChars();
        System.err.println("__________________________________");
        System.err.println("");
        obj.displayAllCharsUsingForEach();
        System.err.println("__________________________________");
        System.err.println("");
        obj.displayAgeAll();
        System.err.println("__________________________________");
        System.err.println("");
        System.err.println("Maximum value of marks is : "+ obj.maxMark());
        System.err.println("__________________________________");
        System.err.println(""); 
        obj.sumAvarageMark();
        System.err.println("__________________________________");
        System.err.println(""); 
        obj.displayNewMark();
        System.err.println("__________________________________");
        System.err.println(""); 
        obj.searchCharA();;


    }

    public void accessChars(){
        // reassigning individual elements 
        characters[0] = 'A';
        characters[1] = 'B';
        characters[2] = 'C';
        characters[3] = 'D';
        characters[4] = 'E';
    }

    public int sizeOfChars(){
         // arrayName.length
        return characters.length;
    }

    public void displaySizeChars(){
        System.err.println("The size of Characters is :" + sizeOfChars());
    }

    // Display all the ements in the array 

    /* Achieved through iteration or looping
     *   for loop or a for-each loop 
     * DRY - do not repeat yourself
     */  
    public void displayAllChars(){
        // for (control_var ; condition ; increment/decrement) { // logic}
        for (int x = 0 ; x < characters.length ; x++){
            System.out.println("The element at index "+ x + " Of characters is: " +characters[x]);
        }
    }

       /*for-each loop 
     * for (control_var : array ){// logic of the for-each}
    */

    public void displayAllCharsUsingForEach(){
        for (char charact : characters){
            System.out.println("One of the elements of Characters is :"+ charact);
        }
    }

    // method that uses the for loop to manipulate all elemnts of an array
   public void manipAge(){

        for (int i = 0 ; i < age.length ; i++){
            age[i] = 40;
        }
   }
   // another example of using a for each loop to display all the elements 
   public void displayAgeAll(){
        manipAge();
        for (int num : age){
            System.err.println("The element at one of the index " + " is :" + num);
        }
   }
   // Finidng the maximun / biggest value of the array
   private static int [] mark = {70, 90, 78, 89, 99};

   int max = mark[0];
   public int maxMark(){
                    // i < 5
   for (int i = 1 ; i < mark.length ; i++ ){
        if (mark[i] > max){
            max = mark[i];
        }
   }
   return max;

} 

    // finding the sum and averange of the elements in an array

    public void sumAvarageMark(){
        int sum = 0;
        for (int q : mark){
            sum += q;
        }

        double averange = (double)  sum / mark.length;
        System.err.println("The sum of all elements is :" + sum);
        System.err.println("The average of all elements is :" + averange);

    }

    public double aveMark(){
        int sum = 0;
        for (int q : mark){
            sum += q;
        }

        double average = (double)sum / mark.length;
        return average;
    }

    // copying an array  - copying the mark

    int[] newMark = new int[mark.length];

    public void createNew(){
        System.arraycopy(mark , 0 , newMark , 0 , mark.length);
    }
// displaying the new array which the copy of the mark array
    public void displayNewMark(){
        createNew();
        System.err.println("Here are the values of the new mark array");

        for (int num : newMark){
            System.err.print(num + ", ");
        }
    }

    // searching an element of an array 
    public void searchCharA(){
    char key = 'D';
    boolean found = false; 
    for (char charect: characters){
        if (key == charect){
            found = true;
            break;
        }
    }

    System.err.println(found ? "Element "+ key + " was found" : "Element "+ key + " was not found" );
    }
 
}

