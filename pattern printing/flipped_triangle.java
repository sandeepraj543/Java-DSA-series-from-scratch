// write a java program to print number horizontally flip triangle
import java.util.Scanner;

public class flipped_triangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no:");
        int n = sc.nextInt();
        // this is for alphabet

        /*for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println(" ");
        }*/


        // this is for number

       /* for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }*/

        // this is for same alphabet in same line
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print((char)(i+64) + " "); // value ko nhi badhana hai tb i ko print krna hota hai
            }
            System.out.println(" ");
        } 
    }
}