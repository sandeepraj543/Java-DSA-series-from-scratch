import java.util.Scanner;

public class area_of_rectangle{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter bredth of rectangle: ");
        int b = sc.nextInt();

        int area = l * b ;
        int perimeter = 2 *( l + b) ;
        System.out.println("Area of rectangle is: " + area); 
        System.out.println("Perimeter of rectangle is: " + perimeter);

        if (area>perimeter){
            System.out.println("area of rectangle is more than perimeter of rectangle ");
        }
        else{
            System.out.println("area of rectangle is less than perimeter of rectangle");
        }

    }
}