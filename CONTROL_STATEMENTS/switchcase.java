package CONTROL_STATEMENTS;

public class switchcase {

    public static void main( String [] args){

        char color = 'g' ;
        switch(color){
            case 'r' :
                System.out.println("Red");
                break ;
            case 'g' :
                System.out.println("Green");
                break ;
            case 'y' :
                System.out.println("Yellow");
                break ;
            case 'v':
                System.out.println("Violet");
                break ;
            default :
                System.out.println("Invalid value!");
        }
    }
}
