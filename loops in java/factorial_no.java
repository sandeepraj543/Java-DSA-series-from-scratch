// find factorial of any number
/*import java.util.Scanner;

public class factorial_no {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any +ve number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact *= i;
            
        }
        System.out.println(fact);
    }
}*/


// in this code print all factorial number step by step.
import java.util.Scanner;

public class factorial_no {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any +ve number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact *= i;
            System.out.println(fact);
        }
    }
}
