package ARRAYS;

import java.util.Scanner ;

public class studentResult {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------Student marks Calculator------");
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n] ;

        for ( int i = 0 ; i<n ; i++){
            System.out.println("Enter marks: ");
            marks[i] = sc.nextInt();
        }

        int total = 0 ;
        for ( int i = 0; i<n ; i++){
            total +=marks[i];
        }

        System.out.println("Total Marks: " +total);

        float per = (float)total / n;
        System.out.println("Percentage: "+per);

    }
}