package gestionEcoleTest;

import gestionEcole.Professeur;
import gestionEcole.Sp�cialite;

public class Test {

	public static void main(String[] args) {
		
		// Creation des professeurs
		Professeur prof1=new Professeur("SAFI","Amal","0622232425","safi.amal@gamail.com");
		Professeur prof2=new Professeur("ALAMI","Said","0622232425","alami.said@gamail.com");
		Professeur prof3=new Professeur("ALAOUI","Reda","0622232425","alaoui.reda@gamail.com");
		Professeur prof4=new Professeur("KAMALI","Imane","0622232425","kamali.imane@gamail.com");
		
		// Creation des sp�cialit�s
		
		Sp�cialite s1= new Sp�cialite("000", "JAVA/JEE");
		Sp�cialite s2= new Sp�cialite("001", ".Net");
		Sp�cialite s3= new Sp�cialite("010", "Gestion de Projet");
		Sp�cialite s4= new Sp�cialite("011", "CISCO");
		Sp�cialite s5= new Sp�cialite("101", "PHP");
		

	}

}
