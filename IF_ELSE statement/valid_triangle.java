import java.util.Scanner;

public class valid_triangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st triangle side: ");
        int A = sc.nextInt();
        System.out.print("Enter 2nd triangle side: ");
        int B = sc.nextInt();
        System.out.print("Enter 3rd triangle side: ");
        int C = sc.nextInt();

        if(A+B>C && B+C>A && C+A>B){
            System.out.println("This is a valid triangle");
        }
        else{
            System.out.println("This is invalid triangle");
        }
    }
}