package be.ephec.java.exercice.e03;

public class TrianglePascal {
        public static int[][] triangle(int n) {
            int[][] triangle = new int[n][];
            for (int i = 0; i < n; i++) {
                triangle[i] = new int[i + 1];
                triangle[i][0] = triangle[i][i] = 1;
                for (int j = 1; j < i; j++) {
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }
            return triangle;
        }
    }

