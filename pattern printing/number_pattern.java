// write a java program to print pattern where number starting form 1 to n same as row and column both.

import java.util.Scanner;

public class number_pattern {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");

        }
    }
}




