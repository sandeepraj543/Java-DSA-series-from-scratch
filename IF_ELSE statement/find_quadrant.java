import java.util.Scanner;

public class find_quadrant{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter x quadrant: ");
        double x = sc.nextDouble();

        System.out.print("Enter y quadrant: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("passes through origin ");
        }
        else if (x>=1 && y == 0){
            System.out.println("passes through x - axis ");
        }
        else if (x == 0 && y>=1){
            System.out.println("passes through y - axis ");
        }
        else if (x>=1 && y>=1 ){
            System.out.println("lies in the 1st quadrant ");
        }
        else if (x<0 && y>=1){
            System.out.println("lies in the 2nd quadrant ");
        }
        else if (x<0 && y<0){
            System.out.println("lies in the 3rd quadrant ");
        }
        else{
            System.out.println("lies in the 4th quadrant ");
        }

    }
}