package be.ephec.java.exercice.e02;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int base,number;
        do {
            System.out.print("Enter the base and number (0 0 to quit): ");
            base = input.nextInt();
            number = input.nextInt();

            if (base != 0 && number != 0) {
                String numberString = Integer.toString(number);
                int result = Integer.parseInt(numberString, base);
                System.out.println("The number in base"+ base + " is: " + result);
            }
        } while (base != 0 && number != 0);

    }
}
