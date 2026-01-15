import java.util.Scanner;

public class profit_loss1{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter cost price:");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price:");
        double sp = sc.nextDouble();

        double profit = sp -cp ;
        double loss = cp - sp ;

        double profit_percent = ((double) profit/cp )* 100;
        double loss_percent = ((double)loss/cp )* 100;

        if (sp > cp){
            System.out.println("profit");
            System.out.println("profit is: " + profit);
            System.out.println("profit percent is: " + profit_percent);
        }
        else if (sp < cp){
            System.out.println("loss");
            System.out.println("loss is: " + loss);
            System.out.println("loss percent is: " + loss_percent);
        }
        else{
            System.out.println("no profit no loss");
        }

    }
}