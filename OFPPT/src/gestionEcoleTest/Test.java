package gestionEcoleTest;

import gestionEcole.Professeur;
import gestionEcole.Sp�cialite;

public class Test {

	public static void main(String[] args) {
		
		// Creation des sp�cialit�s
				Sp�cialite[] specialites = new Sp�cialite[5];
				specialites [0]= new Sp�cialite("S1", "JAVA/JEE");
				specialites [1]= new Sp�cialite("S2", ".Net");
				specialites [2]= new Sp�cialite("S3", "Gestion de Projet");
				specialites [3]= new Sp�cialite("S4", "CISCO");
				specialites [4]= new Sp�cialite("S5", "PHP");
				
		Professeur[] professeurs = new Professeur[4];
		// Creation des professeurs
		professeurs [0]=new Professeur("SAFI","Amal","0622232425","safi.amal@gamail.com",specialites [0]);
		professeurs [1]=new Professeur("ALAMI","Said","0622232425","alami.said@gamail.com",specialites [0]);
		professeurs [2]=new Professeur("ALAOUI","Reda","0622232425","alaoui.reda@gamail.com",specialites [3]);
		professeurs [3]=new Professeur("KAMALI","Imane","0622232425","kamali.imane@gamail.com",specialites [3]);
		
		
		
		System.out.println("Professeur par sp�cialit� :");
		
		for(Sp�cialite s: specialites) {
			System.out.println("\t"+ s);
			boolean flag=false;
			for(Professeur p: professeurs) {
				if(p.getSpecialite().getId()==s.getId()) {
					System.out.println("\t\t"+p);
					flag=true;
				}
			
			}
			
			if(flag==false) System.out.println("\t\tAucun professeur dans cette sp�cialit�");
		}

	}

}
