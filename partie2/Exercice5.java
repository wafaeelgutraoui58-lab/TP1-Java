package partie2;

import java.util.Scanner;

public class Exercice5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Donner N : ");
        int N = sc.nextInt();

        int[] tab = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }

        System.out.println("Les elements sont :");

        for (int i = 0; i < N; i++) {
            System.out.println(tab[i]);
        }

        sc.close();
    }
}
