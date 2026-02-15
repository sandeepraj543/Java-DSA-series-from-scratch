import java.util.Scanner;

public class any_table{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number:");
        int n = sc.nextInt();

        for (int i=n; i<=n*10; i++ ){
            if (i%n == 0){
                System.out.println(i);
            }
        }
    }
}