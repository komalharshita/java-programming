package LOOPS;

public class display10 {

    public static void main (String [] args){
        int x = 1 ;

        do{
            System.out.println(x);
            x++ ;
        } while (x<=10);

        int y = 1;

        while(y<=10){
            System.out.println(y);
            y++ ;
        }

        for ( int i = 1; i<= 10 ; i++){
            System.out.println(i);
        }

        int j = 1 ;
        int k = 5 ;

        for (; j <= 5; j++ ,k--){
            System.out.println(j+"\t"+k);

        }

        for ( int h = 10 ; h>= 1; h--){
                System.out.println(h+" ");
        }

    }
}
