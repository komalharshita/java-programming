package BASICS;

import java.util.Scanner ;

public class employeeDetails {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your id: ");
        int id = sc.nextInt();
        System.out.println("Enter your gender: ");
        String gender = sc.next();
        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("----Employee Details----");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Gender: "+gender);
    }
}
