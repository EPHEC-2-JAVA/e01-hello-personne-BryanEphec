<<<<<<< HEAD
package be.ephec.java.exercice.e09;

import java.util.Random;

public class program {
    public static void main(String[] args) {
        Animal[] animal=new Animal[10];
        Random ran = new Random();
        Dog chien;
        Cat chat ;
        for (int i =0;i<animal.length;i++){
            int chance = ran.nextInt(2);
            if(chance ==0){
                animal[i]=new Dog();
            }else {
                animal[i]=new Cat();
            }
            animal[i].makeNoise();

        }
    }
}
=======
package be.ephec.java.exercice.e09;

import java.util.Random;

public class program {
    public static void main(String[] args) {
        Animal[] animal=new Animal[10];
        Random ran = new Random();
        Dog chien=new Dog();
        Cat chat = new Cat();
        for (int i =0;i<9;i++){
            int chance = ran.nextInt(2);
            if(chance ==0){
                animal[i]=new Dog();
            }else {
                animal[i]=new Cat();
            }
            animal[i].makeNoise();

        }
    }
}
>>>>>>> origin/master
