// syntax in java
// code is true but why error occur i dont know.
public class Test {

    public static void name(){
        System.out.print("sandeep" + " ");
        for (int i=0; i<=5; i++){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){  // main methode/function run first , es main function ko hm khahi v rkh skte hai 
        System.out.println("hii");
        
        name();   // this is function/methode call
        age();      // this is function/methode call        
    }
    public static void age(){
        System.out.println("20");
    }
}