// write a java program to search an array elements.
// apko diye hue array me se kisi number ko(number will be given) search krke batana hai.
// ye ek leetcode problum hai.

// es code ki problum ye hai ki , jitni baar target meet krega utni baar ye print krega , lakin mughe ek hi baar print kewana hai.
// second problum ki agar target nhi milega tb ye code kuch v print nhi krega , hm chtae hai "target not exist " likha aaye 
/*
public class searchinarray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 24, 56, 98, 26, 45, 24};

        int target = 24;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target exist in this array");
                System.out.print("target exist in index: " + i);
                System.out.println("  ");

            }
        }
    }
}
 */

 /*
// es code me agar target nhi milta hai toh "target miss message" print krega.
public class searchinarray {

    public static void main(String[] args) {

        int[] arr = {12, 24, 15, 16, 19, 25, 26, 28, 32, 25};

        int target = 16;

        boolean flag = false; // false means target array me nhi hai
        // boolean found = flase; es trah se aap flag ke jgha kuch v likh skte hai flag ek naam hai bus
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;  // true means target mil gya.
                break;
            }
        }
        // if (flag == true) {
        //     System.out.print("target exist");
        // }
        // if (flag == false) {
        //     System.out.print("target miss");
        // }

        if (flag) {
            System.out.println("target exist"); // hm simply es code ko itna v likh skte hai
        } else {
            System.out.println("target miss");
        }
    }
}
 */
// other way to write this code
public class searchinarray {

    public static void main(String[] args) {

        int[] arr = {10, 12, 15, 20, 26, 28, 13, 16, 23};

        int target = 28;

        int found = -1;  // -1 means target array me nhi hai

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i; // agar target mil jata hai toh found ka value change ker denge 
                break;
            }
        }

        if (found != -1) {
            System.out.println("element exist in array at index " + found);
        } else {
            System.out.println("element miss");
        }
    }
}
