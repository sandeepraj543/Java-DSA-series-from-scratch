// write a java program to print the product of the array element,elements are taken through user.

import java.util.Scanner;

public class product_of_element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of array element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter array elements: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("All array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        System.out.print("product of array elements are: " + product);
    }
}
