public class return_type {

    public static int name() {
        System.out.println("sandeep");
        System.out.println("kumar verma");
        return 5; //  return ka matlab = (1) function ki value store krta hai 
                  // (2) khatam, tata, byby, goodbye
        // System.out.println("hiii dost");  // return jaise hi hitt hota hai function khtm ho jata hai eslea ye line run nhi hoga
    }

    public static void main(String[] args){
        name();

        System.out.println("   "); // for space 
        System.out.println(name());

        System.out.println("   "); // for space 
        System.out.println(5+name());

        System.out.println("   "); // for space 
        int x = name();
        System.out.println(x);  // also write in this way
    }
    
}
