public class methode_program {

    public static void main(String[] args){
        riyanashi();
    } 
    // code sirf main class ka hi chlta hai 
    // java me code main class ke upper or lower side esd
    public static void sharwan(){
        karan();
        System.out.println("hii sharwan");        
    }

    public static void karan(){
        System.out.println("hii karan");
    } 
    
    public static void riyanashi(){
        karan();
        sharwan();
        System.out.println("hii riyanshi");
        sharwan();
    }    
}
