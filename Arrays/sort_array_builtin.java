// sort = sort means to arrange ascending order or descending order.

import java.util.Arrays;

public class sort_array_builtin {

    public static void main(String[] args) {
        int[] arr = {-3, 5, 12, 25, 14, 26, 35, 10};
        call(arr); // sort krne se phle print kiya 
        Arrays.sort(arr);
        call(arr); // sort krne ke baad print kiya 

    }

    public static void call(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

}
