package BASICS;

public class commLineargs{
    public static void main (String [] args) {
        int n = args.length ;
        System.out.println("The args are: ");
        for ( int i =0; i<n ; i++){
            System.out.println(args[i]);
        }
    }
}