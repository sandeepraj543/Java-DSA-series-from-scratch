// Write a java program to print a hollow reactangle where only side print * and mid blank . 
/*import java.util.Scanner;

public class hollow_rectangle {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no of row: ");
        int R = sc.nextInt();
        System.out.print("Enter no of colume: ");
        int C = sc.nextInt();

        for (int i = 1; i<=R; i++){  // kitni row hogi bus ye batata hai 
            for (int j = 1; j<=C; j++){ 
                if (i == 1 || i == R || j == 1 || j == C ){
                    System.out.print(" * ");
                }else{
                    System.out.print(" # ");
                }                 
            }
        System.out.println("  ");           
        }              
    }
}*/

// fill the mid value also 
import java.util.Scanner;

public class hollow_rectangle {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no of row: ");
        int R = sc.nextInt();
        System.out.print("Enter no of colume: ");
        int C = sc.nextInt();

        for (int i = 1; i<=R; i++){  // kitni row hogi bus ye batata hai 
            for (int j = 1; j<=C; j++){ 
                if (i == 1 || i == R || j == 1 || j == C ){
                    System.out.print(" R ");
                }else{
                    System.out.print("   ");
                }                 
            }
        System.out.println("  ");           
        }              
    }
}
