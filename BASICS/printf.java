package BASICS;

/*
%s = string
%c = char
%d = decimal integer
%f = float number
%o = octal number
%b, %B = boolean
%x , %X = hexadecimal character
%e, %E = number in scientific notation
%s = newline character
 */

public class printf {

    public static void main( String [] args){
        String s1 = "hello";
        int n = 43 ;
        float f = 15.34f ;

        System.out.printf("String = %s", s1);
        System.out.printf("Integer = %d", n);
        System.out.printf("String = %f", f);
    }
}
