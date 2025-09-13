package BASICS;

public class operators {

    public static void main( String [] args) {
         // arithmetic operators

        int a = 13, b = 5, c = 27 ;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        String s1 = "wel" ;
        String s2 = "come" ;
        String s3 = s1 + s2 ;
        System.out.println(s3);

        // unary operators

        int x = 9;
        System.out.println(x);
        System.out.println(-x);
        System.out.println(-(-x));
        System.out.println(x--);
        int y = 100 ;
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y++);

        // assignment operators

        int z = 10 ;
        x = y ;
        x = y+ 4 ;
        y = y + 10 ;
        double num = 90 ;
        num = num * 5.5 ;

        // relational operators

        if ( a > b) System.out.println(a);
        if ( a == 100) System.out.println("a value equals to 100");

        // logical operators

        if ( a == 1 || b == 1 || c == 1) System.out.println("Yes");
        if ( x>y && y<z) System.out.println("Hello");
        if ( !(s1.equals(s2))) System.out.println("Not equal");

        // bitwise operators

        byte n1, n2 ;
        n1 = 10 ;
        n2 = 11 ;

        System.out.println("~n1 =" + (~n1));
        System.out.println("n1&n2 = "+ (n1&n2));
        System.out.println("n1 | n2 =" + (n1|n2));
        System.out.println("n1^n2= " +(n1^n2));
        System.out.println("n1<<2 ="+ (n1<<2));
        System.out.println("n2>>>2= " +(n2>>>2));

        // conditional operator

        int max ;
        max = (a>b) ? a : b ;
        System.out.println("max= "+ max);

    }
}
