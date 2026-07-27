// write a program to print maximum element in the array and minimum element in the array

import java.util.Scanner;

public class max_element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of array element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter array elements: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("  ");

        int max = arr[0];
        // int max = Integer.MIN_VALUE;   // hum minimum value aise v rkh skte hai  
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum element of the array are: " + max);

        // int min = arr[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("minimum element of the array are: " + min);
    }
}
