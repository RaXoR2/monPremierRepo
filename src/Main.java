
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * application pour aprendre a faire des operations avec deux nombres
 * @author Patrice Lamontagne
 * ver. 1.1     addition et soustration
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // dcleration des variables
        int choix, nb1, nb2, resultat;
        Scanner scan = new Scanner(System.in);
        
        //interface menu pour choisir quel operation
        System.out.println("veuillez choisir l'operation désirez");
        System.out.println("1 addition");
        System.out.println("2 soustration");
        choix = scan.nextInt();
            
        // demande les nombres via interface et clavier
        System.out.println("quel est le premier nombre");
        nb1 = scan.nextInt();
        
        System.out.println("quel est le deuxieme nombre");
        nb2 = scan.nextInt();
        
        // si addition des deux nombres
        if (choix == 1){ resultat = nb1 + nb2; 
        }
        
        // si soustration des deux nombres
        if (choix ==2 ){ resultat = nb1 - nb2;
        System.out.println("le resultat est " + resultat);
        
    }
}
  
