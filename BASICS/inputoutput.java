package BASICS;

import java.io.* ;
import java.util.Scanner;

public class inputoutput {
        public static void main (String args[] ) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Your name:" + name);

            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Your age:" + age);

            System.out.println("Enter a floating number: ");
            float n = sc.nextFloat();
            System.out.println("You entered the number:" + n);

            System.out.println("Enter a double number: ");
            double num = sc.nextDouble();
            System.out.println("You entered:" + num);

            byte n1 = sc.nextByte();
            short n2 = sc.nextShort();
            long n3 = sc.nextLong();
            boolean n4 = sc.nextBoolean();



    }

}
