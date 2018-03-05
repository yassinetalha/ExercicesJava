package associationEtudFiliere;

import java.util.Date;

import java.text.SimpleDateFormat;

public class Etudiant {
	private int id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private Filiere filiere;
	
	public static int compteur=1;
	
////////////////////// Constructeur ////////////////////////////
	
	public Etudiant(String nom, String prenom, Date dateNaissance, Filiere filiere) {
	
		this.id = compteur++;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.filiere=filiere;
	}
	
////////////////////// Accesseurs ////////////////////////////

	public Filiere getFiliere() {
		return filiere;
	}
	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}
	
	
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		return "Je suis l'étudiant " + nom + " " +prenom + " ma date de naissance est : " + sdf.format(this.dateNaissance) ;
	}
	
	
	
	
	
	
	
	
}
