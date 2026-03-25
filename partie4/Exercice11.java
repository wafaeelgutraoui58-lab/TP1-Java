package partie4;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer une chaine : ");
        String texte = sc.nextLine();

        int longueur = texte.length();

        System.out.println("La longueur de la chaine = " + longueur);

        sc.close();
    }
}
