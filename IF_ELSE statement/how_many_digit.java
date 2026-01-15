// take user input and find how many digit in this number.
import java.util.Scanner;

public class how_many_digit{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if (num>0 && 10>num){ // 0<num<10 this is not allowed
            System.out.println("This is single digit number");
        }
        else if (num>10 && 100>num){
            System.out.println("This is double digit number");
        }
        else if (num>100 && 1000>num){
            System.out.println("This is three digit number");
        }
        else if (num>1000 && 10000>num){
            System.out.println("This is four digit number");
        }
        else if (num>10000 && 100000>num){
            System.out.println("This is five digit number");
        }
        else{
            System.out.println("This is nore than five digit number");
        }
    }
}