// write a java program to print star triangle vertically flipped
import java.util.Scanner;


public class vertically_flipped_triangle {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Row/Column: ");
        int n = sc.nextInt();

        // 1st way (this is not working for me)
       /* for (int i=1; i<=n; i++ ){
            for (int j=1; j<=n; j++){
                if (i+j > n){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }                                                               
            }
            System.out.println(" "); */ 

            // 2nd type (this is for effective)
            for (int i=1; i<=n; i++){ // this loop for no of lines 
                for (int j=1; j<=n-i; j++){   // this is for space
                    System.out.print("   ");
                }
                for (int k=1; k<=i; k++){   // this is for star
                    System.out.print(" * ");
                }
                System.out.println(" "); // this is for next line 
            }                   
        }        
    }
