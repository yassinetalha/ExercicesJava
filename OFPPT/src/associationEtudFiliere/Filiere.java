package associationEtudFiliere;

public class Filiere {

	private int id;
	private String code;
	private String libelle;
	
	public static int compteur=1;

	public Filiere(String code, String libelle) {
	
		this.id = compteur++;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}


	public String toString() {
		return "Filiere : " + libelle ;
	}
	
	
	
	
	
}
