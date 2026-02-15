// write a java program to print a bridge like structure.
import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();

        for (int S=1; S<=2*n-1; S++){
                System.out.print(" S ");
            }
        System.out.println("  ");

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" * ");
            }
            for (int j=1; j<=((2*i)-1); j++){
                System.out.print("   ");
            }
            for (int j=1; j<=n-i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
