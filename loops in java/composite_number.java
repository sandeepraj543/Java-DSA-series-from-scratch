// print composite number: that number is composite if his factor is more than 2. 
// example: 4 = 1,2,4.
// example: 8 = 1,2,4,8. 
import java.util.Scanner;

public class composite_number {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        /*for (int i=2; i<=n-1; i++){
            if (n%i == 0){
                System.out.println(" composite number ");
                break;
            }            
        } */ // This code is only for composite number. 

        // This code is for prime no and composite no both find. 
        /*
        boolean flag = true;
        for (int i = 2; i<n-1; i++){
            if (n%i == 0){ 
                flag = false;
            break;
            }
        }
        if(n == 1) System.out.println("neither prime nor composite");
        else if(flag == false) System.out.println("composite number");
        else System.out.println("prime number"); 
        */

        // This is a better code for find composite number,prime number because it decrease the time complexity.

        boolean flag = true;
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n%i == 0){
                flag = false;
                break;
            }
        }
        if(n == 1) System.out.println("neither prime nor composite");
        else if(flag == false) System.out.println("composite number");
        else System.out.println("prime number"); 
      
    }
}