package gestionEcole;

public class Sp�cialite {
 
	private int id;
	private String code;
	private String libelle;
	
	/// Variable statique pour incr�menter le Id automatiquement 
		public static int compteur =1;
		
	/////////Constructeur//////////
	
	public Sp�cialite(String code, String libelle) {
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

	//////// M�thode toString/////////
	public String toString() {
		return "Sp�cialite "  + libelle ;
	}
	
	
	
	
}
