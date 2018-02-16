package gestionEcole;

public class Professeur {
	
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private Spécialite specialite;
	 
	/// Variable statique pour incrémenter le Id automatiquement 
	public static int compteur =1;
	//////////// Constructeur//////////////
	
	public Professeur(String nom, String prenom, String telephone, String email, Spécialite specialite) {
		this.id = compteur++;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.specialite= specialite;
	}
	
	////////// Accesseurs//////////////////
	
	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getEmail() {
		return email;
	}
	
	public Spécialite getSpecialite() {
		return specialite;
	}


   /////////// Méthode toString ///////////
	public String toString() {
		return "- " + nom +" "+ prenom +" "+ email ;
	}

	
	
	
	
	

	

	

}
