// write a java program to print a number spiral (zoom).
import java.util.Scanner;

public class number_spiral{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no:");
        int n = sc.nextInt();

// this code is only for 1/4 part

      /*  for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                // System.out.print(Math.min(i,j));  // this is also a way to write these code
                if (i<j){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(j+" ");
                }
                // System.out.print((i<j ? i : j)+" "); // this is also a way to write these code           
            }
            System.out.println(" "); */

// this is whole code  ## based on fake values         

        for (int i=1; i<=((2*n)-1); i++){
            for (int j=1; j<=((2*n)-1); j++){

                int a = i;
                int b = j;
                if (i>n) a = 2*n-i;
                if (j>n) b = 2*n-j;
              
                System.out.print((Math.min(a,b)+" "));                       
            }
            System.out.println(" ");
        }
    }
}
