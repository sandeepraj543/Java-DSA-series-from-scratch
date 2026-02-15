/*public class rectangle_pattern {
    public static void main (String[] args){
        System.out.println(" * * * * ");
        System.out.println(" * * * * ");
        System.out.println(" * * * * ");
        // this is not a legal way / right way to print any any pattern.
        // mughe apne input ke anusar output print krna hota hai.
    }
}*/


/*public class rectangle_pattern {
    public static void main (String[] args){
        for (int i = 1; i<=3; i++){
            System.out.println(" * * * * ");
        }       
        // this is not a legal way / right way to print any any pattern.
        
    }
}*/


// nested loop 
import java.util.Scanner;

public class rectangle_pattern {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no of row: ");
        int R = sc.nextInt();
        System.out.print("Enter no of colume: ");
        int C = sc.nextInt();

        for (int i = 1; i<=R; i++){  // kitni row hogi bus ye batata hai 
            for (int j = 1; j<=C; j++){  // dea gye row me kitna *,# print hoga
                System.out.print(" * ");
            }
        System.out.println("  ");           
        }              
    }
}


