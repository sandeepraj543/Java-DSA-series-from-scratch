// print a raise to the power b.
// ex = 2 raise 6 means = 2*2*2*2*2*2
import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter base number:");
        int a = sc.nextInt();
        System.out.print("Enter power number:");
        int b = sc.nextInt(); 

        int base = 1 ;
        for (int i=1; i<=b; i++){
            base *= a;
        }
        System.out.println(a + " raise to the power " + b + " is :  " + base);
    }
}