package gestionEcole;

public class Spécialite {
 
	private int id;
	private String code;
	private String libelle;
	
	/// Variable statique pour incrémenter le Id automatiquement 
		public static int compteur =1;
		
	/////////Constructeur//////////
	
	public Spécialite(String code, String libelle) {
		this.id = compteur++;
		this.code = code;
		this.libelle = libelle;
	}

    ///////Accesseurs/////////////
	public int getId() {
		return id;
	}


	public String getCode() {
		return code;
	}


	public String getLibelle() {
		return libelle;
	}

	//////// Méthode toString/////////
	public String toString() {
		return "Spécialite "  + libelle ;
	}
	
	
	
	
}
