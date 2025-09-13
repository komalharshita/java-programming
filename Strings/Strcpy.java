package Strings;

public class Strcpy {
    public static void main( String [] args){
        String str = "Hello, my name is Komal Harshita" ;
        char arr[] = new char[20];

        str.getChars(2,13,arr,0);

        System.out.println(arr);
    }
}
