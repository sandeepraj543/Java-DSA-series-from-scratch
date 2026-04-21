public class Argument {

    public static void sum (int a, int b){  // parameters
        System.out.println(a+b);
    } 

    public static void minus (int a, int b){
        System.out.println(a-b);
    }

    public static void mul(int a, int b, int c){
        System.out.println(a*b*c);
    }

    public static void max(int a, int b, int c ){
        if (a>=b && a>=c)  System.out.println(a);
        else if (b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
    }

    public static void main(String[] args){
        sum (5,6);   // arguments
        mul (5,6,4); // arguments
        max (5,8,9);
        minus (9,4);
    }
    

}
