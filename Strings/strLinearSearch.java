package Strings;

import java.util.Scanner;

public class strLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many strings? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a string: ");
            str[i] = sc.nextLine();
        }

        System.out.println("Enter a string to search: ");
        String search = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (search.equalsIgnoreCase(str[i])) {
                System.out.println("Found at position: " + (i + 1));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found!");
        }

        sc.close();
    }
}
