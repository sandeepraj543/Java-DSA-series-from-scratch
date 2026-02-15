import java.util.Scanner;

public class no_alphabet_pattern_triangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){  // bahar ke loop (i) me kisi v prakar ka cherchar nhi hota hai 
            for (int j=1; j<=i; j++){
                if (i%2==0){
                    System.out.print((char)(j+96)+ " ");
                }
                else{
                    System.out.print(j + " ");
                }                
            }
            System.out.println(" ");
        }
    }
}