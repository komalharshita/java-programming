package LOOPS;

import java.util.Scanner ;
public class fibonacci {

    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count = 3;
        long f1 = 0 ;
        long f2 = 1;
        long f = f1+f2 ;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f);

        while ( count < num){
            f1 = f2 ;
            f2 = f ;
            f = f1 + f2 ;
            System.out.println(f);
            count++ ;
        }

    }
}
