package Searching & Sorting ;

import java.io.* ;
import java.util.Scanner ;

public class Bubblesort {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Bubble Sort Technique---");
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for ( int i=0 ; i<n ; i++){
            System.out.println("Enter an integer: ");
            arr[i] = sc.nextInt();
        }

        int limit = n-1 ;
        boolean val = false ;
        int temp ;

        for ( int i = 0; i<n ; i++){
            for (int j = 0 ; j<limit-i ; j++){
                if ( arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    val = true ;
                }
            }
            if ( val == false){
                break ;
            }
            else val = false ;
        }

        System.out.println("Sorted array: ");
        for ( int i = 0; i<n ; i++){
            System.out.println(arr[i]);
        }

    }
}