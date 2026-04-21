// write a program to print product of array element.
import java.util.Scanner;

public class array_product {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no of array:");
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println(" ");

        int product = 1;
        for (int i=0; i<n; i++){
            product *= array[i];
        } 
        System.out.print("product of array elements are:" + product);       
    }    
}
