// print all odd numbers which is divisible by 3 form n.

import java.util.Scanner;

public class divisibility_rule {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any number:");
        int n = sc.nextInt();

        for (int i = 3; i<=n; i=i+3){
            if(i%2==1){
            System.out.println(i);
            }
        }
        
    }
    
}