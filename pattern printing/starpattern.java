// write a java program to print star pattern.
 
// public class starpattern{
//     public static void main(String[] args){
//         int r = 5;
       
//         for (int i=1; i<=r; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print(" # ");
//             }
//             System.out.println(" ");
//         }
//     }
// }



public class starpattern{
    public static void main(String[] args){
        int r = 5;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r+1-i; j++){
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}
