// n factorial r = ncr

/*
import java.util.Scanner;

public class permutation_And_combination {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int nFact = 1;
        for (int i=1; i<=n; i++){
            nFact *= i;
        }

        int rFact = 1;
        for (int i=1; i<=r; i++){
            rFact *= i;
        }

        int nrFact = 1;
        for (int i=1; i<=n-r; i++){
            nrFact *= i;
        }

        int ncr = nFact/(rFact*nrFact);
        System.out.println(ncr);
    }    
}
*/


// esi permutation ke lea hm methode bnyege.

import java.util.Scanner;

public class permutation_And_combination {
    public static int fact(int x){
        int f = 1;
        for (int i=1; i<=x; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);

        int npr = fact(n)/fact(n-r);
        System.out.println(npr);

    }
}
