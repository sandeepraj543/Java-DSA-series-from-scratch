// AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE
//  maximum 128 are character, 
//  and all character have a ASCII value.
// ex- 1,2,3,4----,a,b,c,d,e,---,A,B,C,D,E,----@,#,$,---
/* a = 97  @IMPORTANT          
 b = 98
 c = 99

 z = 122 */

 /* A = 65   @IMPORTANT
 B = 66
 C = 67
 D = 68 
  
Z = 90 */

/* 0 = 48    @IMPORTANT
1 = 49 
2 = 50 
3 = 51 
 
9 = 57 */

//  typecasting = data type is conversion between one data type to another data type.

public class asciivalue{
    public static void main(String[] args){
        char ch = 'A';
        int x = ch;         // implicit typecasting
        System.out.println(x);

        char ch1 = 'a';
        int y = ch1;
        System.out.println(y);
        
        char ch2 = '#';
        int z = ch2;
        System.out.println(z);

        char ch0 = ' ';  // ascii value of space is 32.
        int B = ch0;
        System.out.println(B);

        char sandeep = 'a';
        int R = (int)sandeep;  // explicit typecasting.
        System.out.println(R); 

        char ch3 = 'b';
        System.out.println(ch3 + 0);  // shortcut
        // kisi v character ki ascii value find krni ho toh 0 add ker dena hota hai.
        System.out.println(ch3+ch3);

        // can i convert integer to character.
        int x1 = 65;
        char ch4 = (char)x1;
        System.out.println(ch4);

        int x2 = 66;   // for character (32) space , no any number show.
        char ch5 = (char)x2;
        System.out.println(ch5);
        
        
    }


}



