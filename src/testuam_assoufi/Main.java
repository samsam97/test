/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuam_assoufi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static testuam_assoufi.Test.listEtudiants;

/**
 *
 * @author Ibtissam
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Test test = new Test();
        Scanner scanner = new Scanner(System.in);
        int choix;
        //on a ajouté ces etudiants pour voir les effets des operations suivantes
        Etudiant etudiant = new Etudiant("Assoufi", "ibtissam", "assoufi@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("31/10/1997"), Civilite.MADAME);
        Etudiant etudiant1 = new Etudiant("Z", "z", "z@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("1/11/1997"), Civilite.MADAME);
        Etudiant etudiant2 = new Etudiant("C", "c", "c@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("2/11/1997"), Civilite.MADAME);
        Test.listEtudiants.add(etudiant);
        Test.listEtudiants.add(etudiant1);
        Test.listEtudiants.add(etudiant2);

        do {
            System.out.println("Tappez :\n1 pour créer un nouvel étudiant et le stocker dans la liste \n"
                    + "2 pour afficher la liste complète des étudiants dans la console\n"
                    + "3 pour Supprimer un étudiant par nom \n"
                    + "4 pour trier la liste des étudiants par nom ascendant\n"
                    + "5 pour trier la liste des étudiants par date de naissance descendant\n"
                    + "autre chiffre pour sortir du programme\n");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    test.ajoutEtudiant();
                    break;
                case 2:
                    System.out.println("List des etudiants :");
                    test.afficherListEtudiants();
                    break;
                case 3:
                    System.out.println("Donner un nom");
                    String nom = scanner.next();
                    test.supprimerEtudiant(nom);
                    break;
                case 4:
                    test.triDeNoms();
                    break;
                case 5:
                    test.triDeDateDeNaissance();
                    break;
                default:
                    break;
            }
        } while ((choix == 1) || (choix == 2) || (choix == 3) || (choix == 4) || (choix == 5));
    }

}
