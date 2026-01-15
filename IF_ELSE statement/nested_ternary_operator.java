/* take 3 positive integer input and print the greatest of them,without using double condition like && or ||. */
// in this condition use if_else_ladder approach.
// the if_else_ladder approach use in ternary operator.
import java.util.Scanner;

public class nested_ternary_operator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("enter first number:");
        int a = sc.nextInt();
        System.out.print("enter second number:");
        int b = sc.nextInt();
        System.out.print("enter third number:");
        int c = sc.nextInt();

       /* if (a>=b){
            if (a>=c) System.out.println("a is greater");
            else {
                System.out.println("c is greater");
            }       
        }
        else {
            if (b>=c) System.out.println("b is greater");
            else{
                System.out.println(c);
            }
                 
        } */

        String value = (a>b) ? ((a>c) ? "a is greater" : "c is greater") : ((b>c) ? " b is greater" : "c is greater");
        System.out.println(value);
    }
}

