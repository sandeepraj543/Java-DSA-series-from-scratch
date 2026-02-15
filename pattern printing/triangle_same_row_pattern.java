// write a triangle pattern program where same no of row in same no print  .
import java.util.Scanner;
public class triangle_same_row_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no of row: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){ // ye sirf no of row batata hai 
            for (int j=1; j<=i; j++){ // jitne no of column hai utne chltae hai
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}