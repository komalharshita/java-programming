package Strings;

public class string {
    public static void main( String[] args){

        // creating strings

        String s ;
        s = "Hello" ;
        System.out.println(s);
        String hw = new String("Hello world!");
        System.out.println(hw);
        char arr[ ] = { 'c', 'h', 'a', 'i', 'r', 's'};
        System.out.println(arr);
        String ar = new String(arr, 2, 3);
        System.out.println(ar);

        // string class methods

        String s1 = "komal";
        String s2 = "harshita";
        String s3 = s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.length());
        System.out.println(s3.charAt(4));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s3));

        int n1 = s1.indexOf(s2);
        System.out.println(n1);
        int n2 = s1.lastIndexOf(s2);
        System.out.println(n2);

        System.out.println(s.replace('l', 'b'));
        System.out.println(s3.substring(5));
        System.out.println(s3.toLowerCase());

    }


}
