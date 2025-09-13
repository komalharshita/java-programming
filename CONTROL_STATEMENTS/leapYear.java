package CONTROL_STATEMENTS;

import java.util.Scanner ;
public class leapYear {

    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if ( year % 100 == 0 && year % 400 == 0) {
            System.out.println("It is a leap year!");
        }
        else if ( year % 100 != 0 && year % 4 == 0){
            System.out.println("It is a leap year!");
        }
        else {
            System.out.println("Not a leap year....");
        }

    }
}
