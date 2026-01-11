import java.util.Scanner;

public class sum_user_input{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First No: ");
        double first = sc.nextDouble();

        System.out.print("Enter Second No: ");
        double second = sc.nextDouble();

        System.out.print("Enter Third No: ");
        double third = sc.nextDouble();

        double sum = (first + second + third);
        System.out.print("Sum of the given no is: ");
        System.out.println(sum);
    }


}