package Strings;

public class Strcompare {
    public static void main( String [] args){

        String s1= "hello", s2 = "Hello" ;

        if (s1 == s2){
            System.out.println("Both are same");
        }
        else{
        System.out.println("Both are not same");
    }
        s1 = s1+s2 ;
        System.out.println(s1);

    }
}
