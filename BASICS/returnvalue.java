package BASICS;

public class returnvalue {

    static int mymethod (int num){
        return num*num ;
    }

    public static void main(String [] args){
        int res = returnvalue.mymethod(9);
        System.out.println("9");
        System.out.println("Result = "+res);
    }
}
