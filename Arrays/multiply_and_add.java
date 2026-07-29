// write a java program to print (question- multiply odd indexed element by 2 and add 10 to even indexed element)

// public class multiply_and_add {
//     public static void main(String[] args) {
//         int[] arr = {13, 20, 15, 14, 26, 12};
//         for (int i = 0; i < arr.length; i++) {
//             if (i % 2 == 0) {
//                 System.out.print((arr[i] + 10) + " ");
//             } else {
//                 System.out.print((arr[i] * 2) + " ");
//             }
//         }
//     }
// }
// 2nd way to write same code through function call 
public class multiply_and_add {

    public static void main(String[] args) {

        int[] arr = {13, 20, 15, 14, 26, 12};

        function_call(arr);  // yha function call sirt ek naam hai 

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print((arr[i] + 10) + "  ");
            } else {
                System.out.print((arr[i] * 2) + "  ");
            }
        }
        System.out.println("  ");

    }

    public static void function_call(int[] arr) { // yha function call naam ka ek methode bna hai
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(" ");
    }
}
