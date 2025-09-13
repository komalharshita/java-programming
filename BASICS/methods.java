package BASICS;

public class methods {

    static void hello() {
        System.out.println("Hello World!");
    }

    static void myMethod() {
        System.out.println("I love Java");
    }

    public static void sum(int n1, int n2) {
        int res = 0 ;
        res = n1 + n2 ;
        System.out.println(res);
    }
    public static int cube(int num) {
        return num*num*num ;
    }

    public static void isOld(int age) {

        if ( age > 60){
            System.out.println("Old!");
        } else {
            System.out.println("Not old...");
        }
        // Write code here
    }

    public static int getBiggest(int n1, int n2, int n3) {
        if ( n1> n2 && n1> n3){
            return n1;
        } else if ( n2>n1 && n2>n3){
            return n2;
        } else {
            return n3 ;
        }
        // Write code here
    }

    public static int roundFloat(float num) {
        if (num % 1 > 0.5) {
            return ((int) num) + 1;
        } else {
            return (int) num;
        }
    }

    public static int calcFibo(int n) {
        if (n==1) return 0;
        if (n==2) return 1;
        int a = 0 ;
        int b = 1;
        for (int i = 0; i<n-2 ; i++){
            int t = a + b ;
            a = b;
            b = t;
        }

        return b ;
    }

    public static void main( String [] args){

        hello();
        myMethod();
        isOld(33);
        roundFloat(5.35f);
        calcFibo(4);
        cube(9);
        sum(6,11);
        getBiggest(3,2,7);

        }
    }
