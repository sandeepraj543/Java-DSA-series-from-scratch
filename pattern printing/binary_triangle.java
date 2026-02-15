// write a java program to print binary triangle (using only o,1).

import java.util.Scanner;

public class binary_triangle {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Row/Column: ");
        int n = sc.nextInt();
        
        
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                // if (i==j || ((i+j)%2==0)){
                if ((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
}