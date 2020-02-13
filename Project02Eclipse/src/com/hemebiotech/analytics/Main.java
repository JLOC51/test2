package com.hemebiotech.analytics;

import java.util.List;
//import java.util.Set;


public class Main extends AnalyticsCounter{
	
	static List<String> monFichierSortie;
	
	static String fichierSymptomTexte = "C:/Users/JeanLuc/eclipse-workspace/MonPremierProjetJava/src/symptoms.txt";
	
	public static void main(String args[]) throws Exception {
		
		//J'instancie ma classe AnalyticsCounter
		AnalyticsCounter monFichierSymptom = new AnalyticsCounter();
		
		//Je joins le chemin de mon fichier symptom en utilisant ma méthode ReadSymptomDataFromFile
		monFichierSymptom.ReadSymptomDataFromFile(fichierSymptomTexte);
		
		monFichierSortie=monFichierSymptom.GetSymptoms();
		
		System.out.println(monFichierSortie);
		System.out.println("Fichier généré");
		
		
	}
	
	

}
