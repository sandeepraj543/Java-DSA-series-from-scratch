// write a decreasing flipped triangle using two for loop in one for loop.
import java.util.Scanner;

public class decrease_flipped_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){             
            for (int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for (int j=1; j<=n+1-i; j++){
                System.out.print(" * ");
            }                       
            System.out.println("  ");
        }
    }
}