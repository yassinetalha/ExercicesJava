package gestionEcoleTest;


import java.util.Date;


import associationEtudFiliere.Etudiant;
import associationEtudFiliere.Filiere;

public class TestEtudFiliere {

	public static void main(String[] args) {
		
		Filiere [] filiere = new Filiere[3];
		filiere[0]=new Filiere("F1", "Informatique");
		filiere[1]=new Filiere("F2", "Techno de l'info et de la communication");
		filiere[2]=new Filiere("F3", "Génie Civil");
		
		System.out.println("La liste des filières de notre école ");
		for(Filiere f: filiere) {
			System.out.println("\t"+f);
		}
		
		Etudiant [] etudiant = new Etudiant[5];
		etudiant[0]=new Etudiant("Rashid", "Mohamed", new Date("1995/01/02"), filiere[0]);
		etudiant[1]=new Etudiant("Yves", "Chakib", new Date("1995/01/02"), filiere[0]);
		etudiant[2]=new Etudiant("Safi", "Meryem", new Date("1995/01/02"), filiere[2]);
		etudiant[3]=new Etudiant("Rami", "Mouad", new Date("1995/01/02"), filiere[2]);
		etudiant[4]=new Etudiant("Aloui", "Manal", new Date("1995/01/02"), filiere[1]);
		
		
		System.out.println("Liste des étudiants par filière :");
		for(Filiere f: filiere) {
			System.out.println("\t"+f);
			for(Etudiant e:etudiant) {
				if(e.getFiliere().getId()==f.getId()) System.out.println("\t\t"+e);
			}
			
		}
		
		
		
		
	}//fin de la void main

}//fin de la class
