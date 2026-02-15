// write a program for floyd's triangle.
import java.util.Scanner;

public class Floyds_triangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row/Column any odd number: ");
        int n = sc.nextInt();

        int a = 1;

        for (int i=1; i<=n; i++ ){
            for (int j=1; j<=i; j++){
                System.out.print(a++ + "  ");
                // a++;                              
            }
            System.out.println("  ");
        }        
    }
}