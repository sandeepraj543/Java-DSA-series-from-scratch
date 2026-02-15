// Here the code of continue statement.
// example = 1
/*
public class continue_statement {
    public static void main(String[] args){
        for( int i = 1; i<=50; i++){
            if(i%2 == 0) continue;
            else{
                System.out.print(i + " ");
            }
        }
    }
}
*/

// example = 2
public class continue_statement {
    public static void main(String[] args){
        for (int i = 1; i<=20; i++){
            System.out.println(i);
            if (i==13){
                continue;
            }
            else{
                System.out.println("Good morning");
            }
        }
    }
}
