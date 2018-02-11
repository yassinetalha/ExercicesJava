package geometrie;

public class Rectangle {
	
	private double Longueur;
	private double Largeur;
	
	
	// Constructeur
	public Rectangle(double longueur, double largeur) {
		super();
		Longueur = longueur;
		Largeur = largeur;
	}

		

	public double getLongueur() {
		return Longueur;
	}


	public void setLongueur(double longueur) {
		Longueur = longueur;
	}


	public double getLargeur() {
		return Largeur;
	}




	public void setLargeur(double largeur) {
		Largeur = largeur;
	}


////////////////////////// M�thodes//////////////////////////////
	
	public double perimetre() {
		double perimetre=2*(this.getLongueur()+this.getLargeur());
		return perimetre;
	}
	
	public double aire() {
		double aire=this.getLongueur()*this.getLargeur();
		return aire;
	}
	
	public boolean isCarre() {
		if(this.getLargeur()==this.getLongueur())		return true;
		else return false;
	}
	
	public String toString() {
		String r;
		if(this.isCarre()) 
			r=("Longueur :"+ this.getLongueur()+ " - Largeur :"+ this.getLargeur() +" - P�rim�tre :"+ this.perimetre() +" - Aire :"+ this.aire()+ " - C'est un carr�");
		else
			r=("Longueur :"+ this.getLongueur()+ " - Largeur :"+ this.getLargeur() +" - P�rim�tre :"+ this.perimetre() +" - Aire :"+ this.aire()+ " - Cr n'est pas un carr�");
		
		return r;
	}
	
	

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle (5.0,5.0);
		
		System.out.println(r1.toString());
			

	}

}
