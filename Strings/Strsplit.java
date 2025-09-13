package Strings;

public class Strsplit {
    public static void main( String [] args){
        String str = "Pride and Prejudice" ;

        String s[] ;

        s = str.split(" ");

        for (int i =0; i< s.length; i++){
            System.out.println(s[i]);
        }
    }
}
