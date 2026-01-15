import java.util.Scanner;

public class ternary_in_variable {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Any positive number:");
        int n = sc.nextInt();

       /* int sandeep ;
        if (n>=0) sandeep = 100;
        else sandeep = 0;

        System.out.println(sandeep);*/

        // using ternary operator

        int sandeep = (n>=0) ? 100 : 0 ;
        System.out.println(sandeep);
            
        
    }
}