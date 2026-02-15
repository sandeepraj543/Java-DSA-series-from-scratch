// write a java program to print pyramid like diagram.
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();
        
    // first way 

       /* for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){  // only for space
                System.out.print("   ");
            }
            for (int j=1; j<=2*i-1; j++){  // only for star
                System.out.print(" * ");
                
            }
            System.out.println(" ");
        } */


    // second way 
    //(nsp nst methode) espe math nhi lgegi.

   /* int nsp = n-1 , nst = 1; 
     for (int i=1; i<=n; i++){
            for (int j=1; j<=nsp; j++){  // only for space
                System.out.print("   ");
            }
            for (int j=1; j<=nst; j++){  // only for star
                System.out.print(" * ");                
            }
            nsp--;
            nst +=2;
            System.out.println(" ");
        }*/

     
// this is a triangle shape.
   /* int nsp = n-1 , nst = 1; 
     for (int i=1; i<=n; i++){
            for (int j=1; j<=nsp; j++){  // only for space
                System.out.print("   ");
            }
            for (int j=1; j<=nst; j++){  // only for star
                System.out.print(" S ");                
            }
            nsp--;
            nst +=1;
            System.out.println(" ");
        }  */

// this is a pyramid shape as well as below pyramid shape
     int nsp = n-1 , nst = 1; 
     for (int i=1; i<=n; i++){
            for (int j=1; j<=nsp; j++){  // only for space
                System.out.print("   ");
            }
            for (int j=1; j<=nst; j++){  // only for star
                System.out.print(" * ");                
            }
            nsp--;
            nst +=2;
            System.out.println(" ");
        }
     nsp = 1; 
     nst = 2*n-3; 
     for (int i=1; i<=n-1; i++){
            for (int j=1; j<=nsp; j++){  // only for space
                System.out.print("   ");
            }
            for (int j=1; j<=nst; j++){  // only for star
                System.out.print(" * ");                
            }
            nsp++;
            nst -=2;
            System.out.println(" ");
        }
    }
}