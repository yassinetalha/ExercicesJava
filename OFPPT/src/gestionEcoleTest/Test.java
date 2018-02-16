package gestionEcoleTest;

import gestionEcole.Professeur;
import gestionEcole.Spécialite;

public class Test {

	public static void main(String[] args) {
		
		// Creation des professeurs
		Professeur prof1=new Professeur("SAFI","Amal","0622232425","safi.amal@gamail.com");
		Professeur prof2=new Professeur("ALAMI","Said","0622232425","alami.said@gamail.com");
		Professeur prof3=new Professeur("ALAOUI","Reda","0622232425","alaoui.reda@gamail.com");
		Professeur prof4=new Professeur("KAMALI","Imane","0622232425","kamali.imane@gamail.com");
		
		// Creation des spécialités
		
		Spécialite s1= new Spécialite("000", "JAVA/JEE");
		Spécialite s2= new Spécialite("001", ".Net");
		Spécialite s3= new Spécialite("010", "Gestion de Projet");
		Spécialite s4= new Spécialite("011", "CISCO");
		Spécialite s5= new Spécialite("101", "PHP");
		

	}

}
