class Person {

    private String name ;
    private int age ;


    //default constructor
    Person (){
        name = "komal";
        age = 19 ;
    }

    // parameterized constructor
    Person( String s, int i){
        name = s;
        age = i ; 
    }

    void show (){
        System.out.println(name);
        System.out.println(age);
    }
}

class constructors {
    public static void main ( String [] args){

        Person riya = new Person();
        riya.show();

        Person kia = new Person();
        kia.show();

        Person mia = new Person( "mia", 18);
        mia.show();
    }
}