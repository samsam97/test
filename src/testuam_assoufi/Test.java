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
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ibtissam
 */
public class Test {

    static List<Etudiant> listEtudiants = new ArrayList<>(); //list des etudiants

    //Ajout d'un etudiant
    void ajoutEtudiant() throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.println("Donner le nom");
        String nom = s.nextLine();
        System.out.println("Donner le prenom");
        String prenom = s.nextLine();
        String email;
        do {
            System.out.println("Donner un email correct");
            email = s.nextLine();
        } while (email.indexOf('@') < 0);//vérifie que l'email est correct s'il contient @
        System.out.println("Donner la date de naissance sous la forme dd/MM/yyyy");
        String date = s.nextLine();
        Date dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println("Donner la civilite Madame ou Monsieur");
        Civilite civilite = Civilite.valueOf(s.next().toUpperCase());
        Etudiant etudiant = new Etudiant(nom, prenom, email, dateNaissance, civilite);
        listEtudiants.add(etudiant);//ajouter l'etudiant a la liste des etudiants
    }

    //pour afficher la liste des etudiants
    void afficherListEtudiants() {
        int i = 1;
        for (Etudiant etudiant : listEtudiants) {
            System.out.println("Etudiant " + i + ":" + etudiant);
        }
    }

    //pour supprimer un etudiant
    void supprimerEtudiant(String nom) {
        for (Etudiant etudiant : listEtudiants) {
            if (etudiant.getNom().equals(nom)) {
                listEtudiants.remove(etudiant);
                System.out.println("etudiant supprimé");
                break;
            }

        }
    }

    //tri croissant des noms des etudiants
    void triParNoms() {
        listEtudiants.sort(Comparator.comparing(Etudiant::getNom));

    }

    //tri decroissant des noms des etudiants
    void triParDateDeNaissance() {
        listEtudiants.sort(Comparator.comparing(Etudiant::getDateDeNaissance).reversed());

    }

}
