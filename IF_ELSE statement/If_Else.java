import java.util.Scanner;

public class If_Else{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any +ve interger number:");
        int n = sc.nextInt();
        if (n%5 == 0){
            System.out.println("The enter number is: " + n);
            System.out.println("The given no is divisible by 5");  
        }
        else{
            System.out.println("The enter number is: " + n);
            System.out.println("The given no is not divisible by 5");    
        }
    }
}