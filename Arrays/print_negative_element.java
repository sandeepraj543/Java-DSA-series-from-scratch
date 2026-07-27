// write a java program to print only negative no of an given array

import java.util.Scanner;

public class print_negative_element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter array element +ve, -ve: ");
            array[i] = sc.nextInt();
        }
        System.out.println("  ");

        System.out.print("all array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("   ");

        System.out.println("all negative array elements are: ");
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("   ");

        System.out.println("all positive array elements are: ");
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }

    }
}
