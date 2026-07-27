// shallow copy means = A new object is created, but the objects inside it are shared with the original object.
// Deep copy means = A new object is Created, and all the objects inside it are also copied.

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
        // int[] arr = {10, 20, 30, 40};
        // int[] y = Arrays.copyOf(arr, arr.length); //deep copy
        // y[0] = 100;
        // System.out.println(arr[0]);
        // System.out.println(y[0]);
        // other way to create Deep copy.
        int[] arr = {10, 20, 30, 40};

        int[] brr = new int[arr.length]; // brr is a deep copy

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        System.out.print(brr[0]);
    }
}
