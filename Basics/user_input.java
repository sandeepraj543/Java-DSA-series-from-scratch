import java.util.Scanner;  // if user input then import

public class user_input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // for user input then write

        System.out.print("Enter your radius: "); // to show input message
        double r = sc.nextDouble();   // to take user input

        double a = 3.141592 * r * r;  // calculation

        System.out.print("Area of circle is: "); 
        System.out.println(a);        // print area

    }
}