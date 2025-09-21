class Person {
    private String name ;
    private int age ;

    public void talk() {
        System.out.println("Hello I am: " +name);
        System.out.println("My age is: "+age);
    }
}

public class encapsulation{
    public static void main(String [] args){
        talk();
    }
}