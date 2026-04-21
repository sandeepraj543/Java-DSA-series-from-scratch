// input output in array
import java.util.Scanner;

public class output_input_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int[] arr = {15,18,20,25,16,39,58}; // length of array = 6

        // using while loop

        /* 
        int i=0;
        while (i<=6){
            System.out.println(arr[i]);
            // System.out.print(arr[i] + " ");
            i++;
        }
        */
        
        // for(int i=0; i<=6; i++){    // if you know length of array
        //     System.out.println(arr[i]);
        // }


        // for (int i=0; i<=(arr.length); i++){ // if you don't know length of array 
        //     System.out.println(arr[i]);
        // }


        // int n = (arr.length);  // store length of array in a variable (n) // index = 0 to n-1
        // for (int i=0; i<n; i++){
        //     System.out.println(arr[i]);
        // }

        // int[] array = new int[7];  // means eske savi element ka value 0 hota hai jb tk value diya nhi jata hai (default values)
        // for (int i = 0; i<=7; i++){
        //     System.out.print(array[i] + " ");
        // }    
        
        // array ke savi element ko user se input lena chtae hai 

        int[] sandeep =  new int[7];  // creat an blank array where length of array is 6
        
        for (int i=0; i<7; i++){   // for input an array element 
            System.out.print("Enter array element:");            
            sandeep[i] = sc.nextInt();
        }

        System.out.print("Array elements are: "); 
        for (int i=0; i<7; i++){  // for output of array element 
            System.out.print(sandeep[i] + " ");
        }
        System.out.println(" "); // for next line 

        System.out.println("multiply with 2 in given array");
        for (int i=0; i<7; i++){  // for output of array element with multiplication of 2
            System.out.print(2*sandeep[i] + " ");
        }
    }    
}
