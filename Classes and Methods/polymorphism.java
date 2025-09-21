class One {
    void calculate( int x){
        System.out.println("Square value: " + (x*x));
    }
}

class Two extend One {
    void calculate ( int x){
        System.out.println("Cube value: " +(x*x*x));
    }
}

public class polymorphism{
    public static void main(String [] args){
        calculate(2);
    }
}