import java.util.Scanner;

public class find_greater{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a==b && b==c){
            System.out.println("1st, 2nd, and third no is equal");
        }
        else if (a>=b && a>=c){
            System.out.println("first number: " + a + "is greater");
        }
        else if (b>=a && b>=c){
            System.out.println("second number: " + b + " is greater");
        }
        else{
            System.out.println("third number: " + c + " is greater");
        }
    }
}