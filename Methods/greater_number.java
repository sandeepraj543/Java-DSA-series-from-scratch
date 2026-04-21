// write a java program to print greatest of three number through user input.

/*import java.util.Scanner;

public class greater_number {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        System.out.println(Math.max(Math.max(a,b),c));
        
    }
}*/


// write a java program to print greatest of four number through user input.


/*import java.util.Scanner;

public class greater_number {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.print("Enter 4th number: ");
        int d = sc.nextInt();

        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
        
    }
}*/


// write a java program to print greatest of five number through user input.

import java.util.Scanner;

public class greater_number {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        System.out.print("Enter 4th number: ");
        int d = sc.nextInt();

        System.out.print("Enter 5th number: ");
        int e = sc.nextInt();


        System.out.println(Math.max(Math.max(Math.max(Math.max(a,b),c),d),e));  // similarly u can compare between more than 5 number also.
        
    }
}
