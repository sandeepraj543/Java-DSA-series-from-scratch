public class return_is_mandentory {
    public static int num(int a){
        if (a > 5){  // agar condition false hua toh error a jayega
            return a;  
        }
        else return 3;   // agar condition false hua uske lea else part dena jaruri hai
    }

    public static void main(String[] args){
        System.out.println(num(4));
    }
    
}
