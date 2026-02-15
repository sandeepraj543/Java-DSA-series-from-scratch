// print sum of digit of a number.
import java.util.Scanner;

public class sum_of_digit {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // if (n<0){
        //     n = -n;
        // } // ye methode v apply ker skte hai negative no ko positive no bnane ke lea

        int sum = 0; 
        while(n != 0){
            sum += (n%10);
            n /= 10;
        }
        // System.out.println(sum); 
        System.out.println(sum > 0 ? sum : -sum); // use turnury operator because if num inter negative then for output positive       
    }
}