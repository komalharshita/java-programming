package LOOPS;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();

        int res = 1;

        for (int i = 0; i < exp; i++) {
            res *= base;

        }

        System.out.println(res);
    }
}
