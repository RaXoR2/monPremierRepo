
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * application pour aprendre a faire des operations avec deux nombres
 * @author Patrice Lamontagne
 * ver. 1.0     addition seulement
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // dcleration des variables
        int nb1, nb2, resultat;
        Scanner scan = new Scanner(System.in);
        
        // demande les nombres via interface et clavier
        System.out.println("quel est le premier nombre");
        nb1 = scan.nextInt();
        
        System.out.println("quel est le deuxieme nombre");
        nb2 = scan.nextInt();
        
        // addition des deux nombres
        resultat = nb1 + nb2;
        System.out.println("le resultat est " + resultat);
        
    }
}
  
