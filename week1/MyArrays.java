import java.util.Arrays;
public class MyArrays{

    // Array Creation 
    private static String[] names;   // an array with names as reference and uninitialized
    static int[] numbers = {1, 2, 3, 4, 5}; // initializing an array
    private static int[] age = new int[]{18, 19, 18, 19, 23};
    private static double[] price = new double[3];

    
    // MUlTI-DIMENSIONAL ARRAYS 
    private static int[][] matrix ;
    private static String[][] strings = new String[3][3];

   
    public static void matrics(){
        matrix = new int[3][3];
    }

    public static void displayMatrics(){
        initiMatrics();
        System.out.println("Size of the Matrix: " + matrix.length);
        System.out.println(matrix[2][2]);
    }

    public static void displayAge(){
        System.err.println("Unsorted Array elements");
        System.err.println();
        System.out.println("Age at index 0: "+ age[0]);
        System.out.println("Age at index 1: "+ age[1]);
        System.out.println("Age at index 2: "+ age[2]);
        System.out.println("Age at index 3: "+ age[3]);

        System.out.println("___________________________________________");
        System.err.println("SortedArray elements");
        System.err.println();

        Arrays.sort(age);

        System.out.println("Age at index 0: "+ age[0]);
        System.out.println("Age at index 1: "+ age[1]);
        System.out.println("Age at index 2: "+ age[2]);
        System.out.println("Age at index 3: "+ age[3]);
        System.out.println(age[3]);
    }

    

    public static void initiMatrics(){
        matrix = new int[][]{
            {1, 2, 3},  // 0
            {4, 5, 6},  // 1
            {7, 8, 9}   // 2
        };
    }

    public static void main(String [] py){

       price = new double[]{1, 3, 5, 6, 5};
       
        
       // numbers[0] = 10;
        //System.out.println(numbers[0]);
       // System.err.println(" Number of elements in the array : "+ numbers.length);

        //names = new String[]{"Prosper", "Siyanda", "Siyabonga", "Bruno", "Rendi", "Precious", "Unathi", "Rivoningo"};
        

       // System.out.println("The value of the second index on an uninitialized array: "+ names[2]);
       // System.err.println(price[5]);

       displayAge();
    }
        

}