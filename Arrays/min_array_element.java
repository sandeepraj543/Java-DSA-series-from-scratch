// write a java program to print mininum element of the array, element taken from user input.

import java.util.Scanner;

public class min_array_element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of array elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter array elements: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("all array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("  ");

        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum array elements are: " + min);
    }
}
