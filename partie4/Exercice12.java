package partie4;

import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer une chaine : ");
        String texte = sc.nextLine().toLowerCase();

        int compteur = 0;

        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                compteur++;
            }
        }

        System.out.println("Nombre de voyelles = " + compteur);

        sc.close();
    }
}
