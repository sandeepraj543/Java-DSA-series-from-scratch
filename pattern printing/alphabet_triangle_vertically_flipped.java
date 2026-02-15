// write a java program show a flipped triangle output in alphabet
import java.util.Scanner;

public class alphabet_triangle_vertically_flipped {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();

// used in capital letter
        /*for (int i=1; i<=n; i++){  
            for (int j=1; j<=n-i; j++){  // here use in triangle with white space
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){  // here use in triangle 
                System.out.print((char)(j + 64));
            }
            System.out.println(" ");
        } */

// used in small letter
     /*  for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print((char)(j + 96));
            }
            System.out.println(" ");
        } */

// represent in single line alphabet in small letter
       /*for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print((char)(i + 96));
            }
            System.out.println(" ");*/



// represent in single line alphabet in capital letter
      /* for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print((char)(i + 64));
            }
            System.out.println(" "); */


// represent in alternate line alphabet in small letter
       for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                if (i%2==0){
                    System.out.print((char)(i + 96));
                }
                else {
                    System.out.print(i);
                }                
            }
            System.out.println(" ");
        }
    }
}
