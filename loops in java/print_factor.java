// Take a number inputs and prints all of its factor.
// import java.util.Scanner;
// public class print_factor{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int n = sc.nextInt();

//         for (int i = 1; i<=Math.sqrt(n); i++){
//             if (n%i==0){
//                 System.out.print( i + " " );
//                 System.out.print( n/i + " , " );
//             }          
//         }
//     }
// }

// this is also a same code with minor changes
import java.util.Scanner;

public class print_factor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                if (i == n / i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + (n / i) + " ");
                }
            }
        }
    }
}

