//write a java program to print a in same row to n user input.
import java.util.Scanner;

public class single_alphabet_pattern2{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char)(i+96) + " ");
            }
            System.out.println(" ");
        }
    }
} 