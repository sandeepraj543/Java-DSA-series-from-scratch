public class return_type2 {
    public static int home(int a) {
        System.out.println("home number");

        if (a>0)  return 5;    // pass multiple return statement, return only which satisfy the condition
        else return 10;
    }

    public static void main(String[] args){
        home(5);

        System.out.println("  "); // for space
        System.out.println(home(2));

        System.out.println("  "); // for space
        System.out.println(home(-6));
    }
    
}
