// write a program to print odd number triangle.

//  1st type

// import java.util.Scanner;
// public class odd_number_triangle {
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter no of row: ");
//         int n = sc.nextInt();

       
//         for (int i=1; i<=n; i++){ // ye sirf no of row batata hai 
//             for (int j=1; j<=i; j++){ // jitne no of column hai utne chltae hai
//                 System.out.print((2*j -1) + " ");
//                 }
//                 System.out.println(" ");
//             }            
//     }
// }



// 2nd way

// import java.util.Scanner;
// public class odd_number_triangle {
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter no of row: ");
//         int n = sc.nextInt();

//         int a = 1;
//         for (int i=1; i<=n; i++){ // ye sirf no of row batata hai 
//             for (int j=1; j<=a; j++){ // jitne no of column hai utne chltae hai
//                 System.out.print(j++  + " ");
//                 }
//                 a+=2;
//                  System.out.println(" ");
//             }            
//     }
// }





// 3rd way 

import java.util.Scanner;

public class odd_number_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no of row: ");
        int n = sc.nextInt();

        
        for (int i=1; i<=n; i++){ // ye sirf no of row batata hai ye print nhi krta hai 
        int a = 1;
            for (int j=1; j<=i; j++){ // jitne no of column hai utne chltae hai
                System.out.print(a + " "); // print yha ka data ho rha hai 
                a+=2;
                }                
                System.out.println(" ");
        }            
    }
}

