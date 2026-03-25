package partie3;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrice = new int[3][3];
        int[][] transpose = new int[3][3];

        System.out.println("Entrer la matrice :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrice[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrice[i][j];
            }
        }

        System.out.println("La matrice transposee :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
