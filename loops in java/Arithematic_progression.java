
// for find nth term in AP = a+(n-1)*d where a = ? and n=? and d=?

import java.util.Scanner;

public class Arithematic_progression {
        public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter any number:");
        int n = sc.nextInt();
        
        // display this AP 2,5,8,11 ......up to n-ternms.

        /*for (int i=2; i<=3*n-1; i+=3){  // when i know the condition
            System.out.println(i);
        }*/

        // displaty this AP 4,8,12,16 ......up to n-ternms

        /*for (int i=4; i<=4*n; i=i+4){
            System.out.println(i);
        }*/

       // next other way to write code for same output.
       // this way are use when i know no_of_terms.

       // AP = 4,8,12,16,20.......

      /* int a = 4, d= 4; // a and d ko user input v le skte hai.
       for (int i=1; i<=n; i++){ // ye loop sirf n times tk chlane ke lea hai eska koi use nhi hai.
        System.out.println(a);
        a += d;      // same as a= a+d;
       } */    


    // question: print this series 99,95,91,87.... up to all terms which are positive.

        
       /* for (int i = 99; i >=103-4*n; i-=4) { // it use from user input and print no of terms you print in n
            System.out.println(i);
            
        }*/

        /*for (int i = 99; i>0; i-=4){  // it use without user input print till 0
            System.out.println(i);
        }*/

    }
}