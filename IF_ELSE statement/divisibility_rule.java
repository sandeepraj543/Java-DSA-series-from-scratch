/* question :- Take positive integer input and print 
if no is divisible by 5.
if no is divisible by 3.
if no is divisible by 5 & 3 both.
if no is not divisible by 5 or 3. */ 

// else if condition me priority set krni pdti hai, jhaha ka code run ho jata hai uske baad ka code nhi chlta hai.

import java.util.Scanner;

public class divisibility_rule{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter any integer number: ");
        int num1 = sc.nextInt();

        if (num1%5 == 0 && num1%3 == 0 ){
            System.out.println("The number is divisible by 5 and 3 both ");        
        }
        else if (num1 % 5 == 0){
            System.out.println("The number is divisible by 5 ");          
        }
        else if (num1 % 3 == 0){
            System.out.println("The number is divisible by 3 ");    
        }
        else{
            System.out.println("The number is not divisible by 5 and 3 ");
        }

    }
}