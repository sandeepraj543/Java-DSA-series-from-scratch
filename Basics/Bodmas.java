public class Bodmas {
    public static void main(String[] args){

        int x = 10;
        System.out.println(x);
        // x = x + 6;
        x += 6;   // same as above write ( x = x + 6;)        
        System.out.println(x);
        x += 10;
        System.out.println(x);
        x -= 9;
        System.out.println(x);

        int y = 10;
        // y++ ;    same as below
        // ++y ;    increment in 1
        
        // y-- ;    same as below 
        --y ;       // decrement in 1
        System.out.println(y);

        int S = 10 ;
        int T = S++ ;
        
        System.out.println(S+ " " +T);

        // difference between x++ and ++x
        //  x++ means phle x print hota hai then +1 se bdhta hai.
        //  ++x means phle +1 se bdhta hai then print hota hai
        int R = ++S ; 
        System.out.println(S+ " "+R);        

    }
}