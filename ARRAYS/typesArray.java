package ARRAYS;

import java.util.Scanner ;

public class typesArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // single dimensional array

        int single1[] = {1, 2, 3, 4, 5};
        int single2[];
        single2 = new int[5];

        float salary[] = {5530f, 3233f, 5454f, 2323f};
        char ch[] = {'z', 'y', 'd'};
        String names[] = {"komal", "durga", "vijay", "nitin"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // multi dimensional array

        int marks[][] = {
                {30, 24, 25, 28},
                {23, 27, 29, 21},
                {12, 20, 19, 15}
        };

        int m[][];
        m = new int[3][5];

        float x[][] = {
                {1.1f, 1.2f, 1.3f, 1.4f},
                {534.34f, 4343.2f, 323.32f}
        };
        double d[][] = {
                {20.2, -5.5},
                {15.5, 30.331}
        };
        byte b[][] = new byte[20][50];
        String str[][] = new String[10][20];

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter elements of the matrix: ");
        for ( int i = 0; i<r ; i++){
            for (int j =0 ; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose Matrix::  ");
        for ( int i = 0; i<c ; i++){
            for ( int j = 0; j<r ; j++){
                System.out.println(arr[j][i] + " ");
            }
            System.out.println();
        }

        int array[] = new int[10];
        array[0] = 50; array[1] = 34; array[2] = 32 ;

        //jagged arrays

        int u[][] = new int[2][];
        u[0] = new int[2];
        u[1] = new int[3];

        u[0][0] = 10;
        u[0][1] = 11;
        u[1][0] = 12;
        u[1][1] = 13;
        u[1][2] = 14;

        for ( int i = 0; i<2; i++){
            System.out.print(u[0][i]+ ",");
        }System.out.println();

        for ( int i =0; i<3 ; i++){
            System.out.print(u[1][i]+ ",");
        }

    }
}
