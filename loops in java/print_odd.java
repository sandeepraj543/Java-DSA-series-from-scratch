import java.util.Scanner;

public class print_odd{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

       /* for (int i=1; i<=n; i++){
            if (i%2==1){
                System.out.println(i);
            }
        }*/     //  ye v ek tarika hai lakin loop esme jyada times chlytae hai. this is not a good way.


        /*for (int i = n; i<=n*10; i=i+n){
            System.out.println(i);
        } */    // lakin es code me loop sirf 10 times hi chlege jyada nhi.this is a good way.


        for (int i = 1; i<=10; i = i+1){
            System.out.println(i*n);
        }       // this is a very good way to write a code of any table.


    }


}