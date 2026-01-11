import java.util.Scanner;  // for user input then import

public class input_squareno{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);  // for user input then write 
        
        System.out.print("Enter number: ");  // print only not println
        int n = sc.nextInt();   // Int (first letter capital)

        int square = n * n ;

        System.out.print("Square of the given number is: ");
        System.out.println(square);
        
    }

}