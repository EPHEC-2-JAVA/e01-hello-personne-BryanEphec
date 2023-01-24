package be.ephec.java.exercice.e01;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("prenom: ");
        String prenom=sc.nextLine();
        System.out.println("nom: ");
        String name=sc.nextLine();
        System.out.println("age: ");
        int age=sc.nextInt();
        System.out.println("prenom: "+prenom+" nom: "+name+" age: "+age+" ans.");

        Person p1=new Person();
        p1.age=27;
        p1.firstName="Galvao Coutinho";
        p1.lastName="Bryan";
        p1.yearOfBirth=1995;
        p1.display();

    }
}
