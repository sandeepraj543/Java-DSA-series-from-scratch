// print the GP 1,2,3,4,.....up to n-terms. 
import java.util.Scanner;

public class geometric_progression{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        int a = 2;
        int r = 3; 
        for (int i=1; i<=n; i++){
            System.out.println(a);
            a *= r;
        }
        
    }
}
