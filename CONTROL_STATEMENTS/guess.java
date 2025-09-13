package CONTROL_STATEMENTS;

import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randNum = scanner.nextInt(); // Input for random number
        int guess = scanner.nextInt();    // Input for user's guess

        if (guess > randNum) {
            System.out.println("Too high");
        }
        if (guess < randNum) {
            System.out.println("Too low");
        }
        if (guess == randNum) {
            System.out.println("You are right!");
        }
    }
}
