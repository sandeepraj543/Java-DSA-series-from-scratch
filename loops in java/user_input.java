import java.util.Scanner;

public class user_input{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
        
    }
}