// writw a java program to display star rhombus (here use in triangle and squeare)
import java.util.Scanner;
public class star_rhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();

// using triangle + square make in rhombus
// way1
      /*  for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){ // here print flipped triangle
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){ // here use square
                System.out.print("#");
            }
            System.out.println(" ");
        }*/


// way1
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){ // here print flipped triangle
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){ // here use square
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}
