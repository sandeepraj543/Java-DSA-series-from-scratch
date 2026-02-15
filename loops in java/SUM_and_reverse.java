// print sum, of numbers and its reverse
// Eg - 1234 -- 4321 -- =ans (1234 + 4321)
import java.util.Scanner;

public class SUM_and_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter min two or more digit number: ");
        int n = sc.nextInt();

        int r = 0;

        while (n != 0){
            r *= 10;
            r += (n%10);
            n /= 10;
        }
        System.out.println(r);
        // int sum = n+r;
        System.out.println(n+r);
    }
}