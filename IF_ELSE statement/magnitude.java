// take user input and tell if its magnitude(mod/absolute value) is smaller than 69 or not.
import java.util.Scanner;

public class magnitude{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any +ve or -ve integer which is smaller than 69: ");
        int num = sc.nextInt();
        int num1 = (-num);
      
        
        if (num<0){
            System.out.println("The given number is: " + num);
            System.out.println("magnitude is: " + num1 );
        }
        else if (num>0 && 69>=num){
            System.out.println("The given number is: " + num);
            System.out.println("magnitude is: " + num );
            
        }
        else{
            System.out.println("The number is given more than 69");
        }
    }
}