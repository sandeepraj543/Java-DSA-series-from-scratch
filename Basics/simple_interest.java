import java.util.Scanner;

public class simple_interest{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int p, t, r, si ;

        System.out.print(" Enter principle: ");
        p = sc.nextInt();

        System.out.print(" Enter time in years: ");
        t = sc.nextInt();

        System.out.print(" Enter rate of interest: ");
        r = sc.nextInt();

        si = ( (p * t * r)/100.0 );

        System.out.println(" Simple Interest is: " + si);

    }
}