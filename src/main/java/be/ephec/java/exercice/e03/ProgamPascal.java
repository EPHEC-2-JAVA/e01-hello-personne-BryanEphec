package be.ephec.java.exercice.e03;

import java.util.Scanner;

public class ProgamPascal {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int rows = scan.nextInt();
            int[][] triangle = TrianglePascal.triangle(rows);
            for (int[] row : triangle) {
                for (int number : row) {
                    System.out.format("%4d", number);
                }
                System.out.println();
            }
            scan.close();
        }
    }

