// ternary operator is shortcut or if_else.
// in ternary operator if_else looking cool😊.
/* question : using ternary operator take positive integer input and print odd or even.*/

import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Any positive number:");
        int n = sc.nextInt();

        /* if (n%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        } */

       // using ternary operator 
       // condition ? such : jhooth 

       System.out.println((n%2==0) ? "even" : "odd" ); // in single line 
      
       System.out.println(n + " is "+ ((n%2==0) ? "even" : "odd" ));
       


        
    }
}
