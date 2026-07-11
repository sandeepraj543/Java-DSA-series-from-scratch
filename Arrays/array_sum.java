// write a program to print sum of array element.
import java.util.Scanner;

public class array_sum {
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of array element: "); 
        int n = sc.nextInt(); // jitna elements ka array banani ho.

        int[] array = new int[n];  // user input se liye gye no ke equal array bna liye 

        for (int i=0; i<n; i++){   // savi element ko Enter kea array me 
            System.out.print("Enter elements of array:");
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i=0; i<n; i++){ // array ke savi elements ko print ker dea 
            System.out.print(array[i] + " ");            
        }
        System.out.println(" ");    // for break (next line)   

        int sum = 0;
        for (int i=0; i<n; i++){  
            sum += array[i];    // array ke savi element ka sum
        }  
        System.out.print("Sum of array elements are: " + sum);
        
        System.out.println(" ");

        int mul = 1;
        for (int i=0; i<n; i++){
            mul *= array[i];   // array ke savi element ka multiply
        }
        System.out.print("multiply of array elements are: " + mul);
    }    
}
