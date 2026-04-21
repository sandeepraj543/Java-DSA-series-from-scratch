// shallow copy means = copy the 

import java.util.Arrays;
public class shallowcopydeepcopy {
    public static void main(String[] args) {
        /* 
        int a = 4; // 4 byte leta hai ye

        int[] arr = {10,20,30,40,50,60,70};  // 4*7 = 28 byte array lagatar(eksaath) space leta hai 
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100;

        System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println(arr);     // agar array ki location nhi btane per kuch v uske jgha print ho jata hai
        System.out.println(arr[6]);
        System.out.println(arr[7]);  // error show out of bound 
        */
       // how to creat deep copy 

       int[] arr = {10,20,30,40};
       int[] y =  Arrays.copyOf(arr,arr.length); //deep copy
       y[0] = 100;
       System.out.println(arr[0]);
       System.out.println(y[0]);       
    }
    
}
