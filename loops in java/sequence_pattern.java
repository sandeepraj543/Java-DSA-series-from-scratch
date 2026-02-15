// write a java program to print to given sequence 1,n, 2,n-1, 3,n-2, 4,n-3 and so on ...
import java.util.Scanner;

public class sequence_pattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // this code is run till when n is equal to i
        /*for (int i=1; i<n; i++){
            System.out.println(i);
            n=n-1;
            System.out.println(n);
            
        } */
       
       // this code is run till when 1 to n and n to 1. 
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
            System.out.println((n - i + 1) + " ");
        }
    }
}



        

       
    