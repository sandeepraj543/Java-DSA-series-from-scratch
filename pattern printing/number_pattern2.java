// write a program where print same no of in row and same no in column.
import java.util.Scanner;
public class number_pattern2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}