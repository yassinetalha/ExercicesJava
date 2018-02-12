package voitures;

public class Cars {
	
	private int Id;
	private String Marque;
	private double Vitesse;
	private int Puissance;
	
	public static int compteur=1;
	
	//////////// Constructeur//////////////
	
	/* N.B: le Id doit être auto incrément*/

	public Cars( String marque, double vitesse, int puissance) {
		Id=compteur++;
		Marque = marque;
		Vitesse = vitesse;
		Puissance = puissance;
	}
	
	///////////////// Les accesseurs/////////////////////
	
	public int getId() {
		return Id;
	}

	public String getMarque() {
		return Marque;
	}

	public double getVitesse() {
		return Vitesse;
	}

	public int getPuissance() {
		return Puissance;
	}
	
	/////////// Méthode////////////
	
	public String toString() {
		String ecran="";
		ecran="id="+this.getId()+", marque="+this.getMarque()+", vitesse="+this.getVitesse()+", puissance="+this.getPuissance();
		
		return ecran;
		
	}
	
	
	
public static void main(String[] args) {
	
	Cars voiture1= new Cars("BMW",220.0,8);
	Cars voiture2= new Cars("Audi",240.0,10);
	System.out.println(voiture1.toString());
	System.out.println(voiture2.toString());
	
		

	}


}
