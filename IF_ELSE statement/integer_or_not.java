import java.util.Scanner;

public class integer_or_not{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Any double/int Value:");
        double n = sc.nextDouble();
        int x = (int)n;

        if(n-x > 0){
            System.out.println("It is not an integer");
            System.out.println("This no is: " + (n));
        }
        else{
            System.out.println("It is an integer");
            System.out.println("This no is: " + (x));
        }

    }
}