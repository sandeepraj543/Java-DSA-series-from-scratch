// write a flip triangle pattern .

import java.util.Scanner;

public class horizontially_flipped_triangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no:");
        int n = sc.nextInt();
        
        // this is a good code 
        // for (int i=1; i<=n; i++){
        //     for (int j=1; j<=n+1-i; j++){   // sirf changing j me krna hota hai               
        //             System.out.print(" * ");                               
        //     }
        //     System.out.println(" ");
        // }

        // 2nd way to solve this problum
       /* for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){ // sirf changing j me krna hota hai.
                System.out.print(" * ");
            }
            System.out.println(" ");
        }*/

       // 3rd way to solve this problum
        
       int a = n;  // no of star printed in each line 
       for (int i=1; i<=n; i++){
        for (int j=1; j<=a; j++){
            System.out.print(" * ");
        }
        a--;
        System.out.println(" ");
       }
    }
}