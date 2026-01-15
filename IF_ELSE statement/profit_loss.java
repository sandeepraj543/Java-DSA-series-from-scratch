import java.util.Scanner;

public class profit_loss{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter cost price (only int value): ");
        int cost_price = sc.nextInt();

        System.out.print("Enter selling price (Only int value): ");
        int selling_price = sc.nextInt();

        sc.close() // agar tumse eske baad input nhi lena hai toh sc.close likh skte ho, ye itna important/cumpulsory nhi hota hai.

        int profit = (selling_price - cost_price);
        int loss = (cost_price - selling_price);
        double profit_per = ((double)profit/cost_price) * 100;
        double loss_per = ((double)loss/cost_price) * 100;
       
        if(selling_price > cost_price){
            System.out.println("profit");
            System.out.println("profit is: " + profit);
            System.out.println("profit percent is: " + profit_per);
        }

        if(cost_price > selling_price){
            System.out.println("loss");
            System.out.println("loss is: " + loss);
            System.out.println("loss percent is: " + loss_per);
        }

        if(selling_price == cost_price){
            System.out.println("No profit & No loss.");
            System.out.println("value is: " + profit);
            
        } 

    }
}