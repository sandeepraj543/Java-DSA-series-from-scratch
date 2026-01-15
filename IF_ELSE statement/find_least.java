import java.util.Scanner;

public class find_least {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.print("Enter third number:");
        int c = sc.nextInt();

        if (a==b && b==c && c==a){
            System.out.println("please enter different digit");
        }
        else if (a == b || b == c || c == a){
            System.out.println("two digit are same");
        }
        else if (a<=b && a<=c){
            System.out.println("a=" + a + " is smaller");
        }
        else if (b<=a && b<=c){
            System.out.println("b=" + b + " is smaller");
        }
        else {
            System.out.println("c=" + c + " is smaller");
        }
        
    }
}
