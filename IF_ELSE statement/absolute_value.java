import java.util.Scanner;

public class absolute_value{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    /* System.out.print("Enter any number: ");
    int n = sc.nextInt();
    if(n >= 0){
        System.out.println("The no: "+ n + " is positive interger no ");
    }
    else{
        System.out.println("The no: " + (n) + " is negative interger no ");
        System.out.println("And it is converted into positive sign." + (-n) );
    } */ 
    
    // if you want to convert any negative no into positive no in one line then simply do this.
    System.out.print("Enter any negative number: ");
    int n = sc.nextInt();
    if(n < 0){
        n = -n ;
    }
    System.out.println("The positive no is: " + n);

   
    }

    
}