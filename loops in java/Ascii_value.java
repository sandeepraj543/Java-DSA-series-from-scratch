// write a program to print ascii value of A to Z.

public class Ascii_value{
    public static void main(String[] args){

        for (int i = 65; i<=89; i++){
            System.out.print((char)i + " " + i);
        }

        for (int j = 97; j<=122; j++){
            System.out.println((char)j + " " + j);
        }
    }
}