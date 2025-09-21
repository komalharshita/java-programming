class Bank {
    private int accno ;
    private String name ;
    private float balance ;
    private float profit ;
    private float loan ;

    public void dsiplay(){
        System.out.println("Accno: " +accno);
        System.out.println("Name: " +name);
        System.out.println("Balance: " +balance);

    }
}

public class abstraction{
    public static void main(String [] args){
        dsiplay();
    }
}