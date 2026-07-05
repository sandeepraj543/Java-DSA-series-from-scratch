// array is a linear data structure.
// indexing starting from 0.

public class array_basic {
    public static void main(String[] args){
       /*
        int[] x = {1,2,3,4,5,6,7,8,9,10,12,15,16};

        // indexing 
        System.out.println(x);  // ek ajib si value print hogi 

        System.out.println(x[0]); // access of element
        System.out.println(x[5]);

        // updating element - mutability 

        x[0] = 140;
        x[5] = 190;
        System.out.println(x[0]);
        System.out.println(x[5]);
       */

      // initialisation and indexing 
      int[] arr = new int[4]; // 4 size ka array 0 to 3, new way to initialize an array
      arr[0] = 10;
      arr[1] = 20;
      arr[2] = 130;
      arr[3] = -40;
            
      System.out.println(arr[2]);
      System.out.println(arr[3]);
      
    // System.out.println(arr[-1]);  // this is out of bound error   
    // System.out.println(arr[4]); // this is out of bound error 
    
             
    }
}