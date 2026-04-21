// here passing array to methode/function
// whenever we pass are array to methodes the array is passed by reference.

public class passing_array_to_methode {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50,60};
        System.out.println(x.length);
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
                
    }
    // public static void change(int[] x){ // same as below code
    //     x[2] = 99;
    // }
    public static void change(int[] y){  // usi array ka naam 'x' ke jgha per 'y' ho jata hai koi alag array nhi banta hai 
        y[2] = 99;
    }   
}
    

