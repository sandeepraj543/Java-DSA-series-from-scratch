/*
import java.util.Scanner;

public class swap_numbers {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println("a & b is: " + a + "  " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping the number: a & b is:" + a + "  " + b);
    }
}
 */

// without using third variable swap two numbers

/*
import java.util.Scanner;

public class swap_numbers {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println("a & b is: " + a + "  " + b);

         a = a+b;
         b = a-b;
         a = a-b;

        System.out.println("After swaping a & b is: " + a + "  " + b);
    }
}
*/

// swap two number using function call without using third variable.

import java.util.Scanner;

public class swap_numbers {

    public static void swap(int a , int b){
         a = a+b;
         b = a-b;
         a = a-b;

        System.out.println(a + "  " + b);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println("a & b is: " + a + "  " + b);
        swap(a,b);     
    }
}