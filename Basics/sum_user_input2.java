import java.util.Scanner;

public class sum_user_input2{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int n1, n2, n3, sum ;

        System.out.print("Enter first no: ");
        n1 = sc.nextInt();

        System.out.print("Enter second no: ");
        n2 = sc.nextInt();

        System.out.print("Enter third no: ");
        n3 = sc.nextInt();

        sum = (n1 + n2 + n3);

        System.out.println("Sum of these no: " + sum);

    }
}