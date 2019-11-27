/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuam_assoufi;

import java.util.Date;

/**
 *
 * @author Ibtissam
 */
public class Etudiant implements Comparable<Etudiant> {

    private String nom, prenom, email;
    private Date dateDeNaissance;
    private Civilite civilite;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String email, Date dateDeNaissance, Civilite civilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

    @Override
    public String toString() {
        return "{\n\t nom : " + nom + ",\n\t prenom : " + prenom + ",\n\t email : " + email + ",\n\t dateDeNaissance : " + dateDeNaissance + ",\n\t civilite : " + civilite + "\n}";
    }

//compare les dates de naissance des etudiants
    @Override
    public int compareTo(Etudiant etudiant) {
        return etudiant.getDateDeNaissance().compareTo(this.getDateDeNaissance());
    }

}
