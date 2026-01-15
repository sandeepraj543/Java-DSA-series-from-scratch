import java.util.Scanner;

public class Oddeven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any +ve Integer Number:-");
        int n = sc.nextInt(); // The concept of even or odd is only for natural number not for dubble or any decimal number. 
        if(n%2 == 0){
            System.out.println("The number is:- " + n);
            System.out.println("Even number");   
        }
        else{
            System.out.println("The number is:- " + n);
            System.out.println("odd number");   
        }      
    }
}