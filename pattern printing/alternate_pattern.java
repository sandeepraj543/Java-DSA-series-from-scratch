// write a java program to print alternate patten in a then B in second line
import java.util.Scanner;

public class alternate_pattern{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char)(i+96)+ " ");                               
            }
            System.out.println(" ");            
        }
    }
}
