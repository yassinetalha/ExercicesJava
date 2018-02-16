package gestionEcoleTest;

import gestionEcole.Professeur;
import gestionEcole.Spécialite;

public class Test {

	public static void main(String[] args) {
		
		// Creation des spécialités
				Spécialite[] specialites = new Spécialite[5];
				specialites [0]= new Spécialite("S1", "JAVA/JEE");
				specialites [1]= new Spécialite("S2", ".Net");
				specialites [2]= new Spécialite("S3", "Gestion de Projet");
				specialites [3]= new Spécialite("S4", "CISCO");
				specialites [4]= new Spécialite("S5", "PHP");
				
		Professeur[] professeurs = new Professeur[4];
		// Creation des professeurs
		professeurs [0]=new Professeur("SAFI","Amal","0622232425","safi.amal@gamail.com",specialites [0]);
		professeurs [1]=new Professeur("ALAMI","Said","0622232425","alami.said@gamail.com",specialites [0]);
		professeurs [2]=new Professeur("ALAOUI","Reda","0622232425","alaoui.reda@gamail.com",specialites [3]);
		professeurs [3]=new Professeur("KAMALI","Imane","0622232425","kamali.imane@gamail.com",specialites [3]);
		
		
		
		System.out.println("Professeur par spécialité :");
		
		for(Spécialite s: specialites) {
			System.out.println("\t"+ s);
			boolean flag=false;
			for(Professeur p: professeurs) {
				if(p.getSpecialite().getId()==s.getId()) {
					System.out.println("\t\t"+p);
					flag=true;
				}
			
			}
			
			if(flag==false) System.out.println("\t\tAucun professeur dans cette spécialité");
		}

	}

}
